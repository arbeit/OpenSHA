package org.opensha.sha.imr.attenRelImpl.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opensha.commons.param.ParameterAPI;
import org.opensha.commons.param.event.ParameterChangeWarningEvent;
import org.opensha.commons.param.event.ParameterChangeWarningListener;
import org.opensha.sha.imr.attenRelImpl.Campbell_2003_AttenRel;
import org.opensha.sha.imr.param.IntensityMeasureParams.PeriodParam;
import org.opensha.sha.imr.param.OtherParams.StdDevTypeParam;
import org.opensha.commons.param.event.ParameterChangeListener;

/**
 * Class providing methods for testing {@link Campbell_2003_AttenRel}. Tables
 * provided by the original authors.
 */
public class Campbell_2003_test implements ParameterChangeWarningListener {

	/** Campbell_2003_AttenRel GMPE (attenuation relationship) */
	private Campbell_2003_AttenRel ca03AttenRel = null;

	/**
	 * Table for total standard deviation validation.
	 */
	private static final String SIGMA_TOTAL_HARD_ROCK_TABLE = "Ca03_SIGMcorr.txt";

	/**
	 * Table for median ground motion validation. Hard rock median.
	 */
	private static final String MEDIAN_HARD_ROCK_TABLE = "Ca03_MEDIAN.OUT";

	/** Header for meadian tables. */
	private static String[] TABLE_HEADER_MEDIAN = new String[1];

	/** Header for standard deviation tables. */
	private static String[] TABLE_HEADER_STD = new String[1];

	/** Number of columns in test tables for standard deviation. */
	private static final int TABLE_NUM_COL_STD = 19;

	/** Number of columns in test tables for median ground motion value. */
	private static final int TABLE_NUM_COL_MEDIAN = 19;

	/** Number of rows in interface test table. */
	private static final int TABLE_NUM_ROWS = 63;

	/** Inter event standard deviation verification table. */
	private static double[][] stdTotalTable = null;

	/** Median ground motion verification table. Normal event on rock. */
	private static double[][] medianHardRockTable = null;

	private static final double TOLERANCE = 1e-3;

	/**
	 * Set up attenuation relationship object, and tables for tests.
	 * 
	 * @throws Exception
	 */
	@Before
	public final void setUp() throws Exception {
		ca03AttenRel = new Campbell_2003_AttenRel(this);
		ca03AttenRel.setParamDefaults();

		stdTotalTable = new double[TABLE_NUM_ROWS][TABLE_NUM_COL_STD];
		AttenRelTestHelper.readNumericTableWithHeader(new File(ClassLoader
				.getSystemResource(SIGMA_TOTAL_HARD_ROCK_TABLE).toURI()),
				stdTotalTable, TABLE_HEADER_STD);
		medianHardRockTable = new double[TABLE_NUM_ROWS][TABLE_NUM_COL_MEDIAN];
		AttenRelTestHelper.readNumericTableWithHeader(new File(ClassLoader
				.getSystemResource(MEDIAN_HARD_ROCK_TABLE).toURI()),
				medianHardRockTable, TABLE_HEADER_MEDIAN);

	}

	/**
	 * Clean up.
	 */
	@After
	public final void tearDown() {
		ca03AttenRel = null;
		stdTotalTable = null;
		medianHardRockTable = null;
	}

	@Test
	public void checkStdTotal() {
		validateStdDev(StdDevTypeParam.STD_DEV_TYPE_TOTAL, stdTotalTable);
	}

	@Test
	public void checkMedianEventOnHardRock() {
		validateMedian(medianHardRockTable);
	}

	private void validateMedian(double[][] table) {
		String[] columnDescr = TABLE_HEADER_MEDIAN[0].trim().split("\\s+");
		// check for SA
		for (int i = 3; i < columnDescr.length - 1; i++) {
			System.out.println(columnDescr.length);
			for (int j = 0; j < table.length; j++) {
				int iper = i - 2;
				double mag = table[j][0];
				double rJB = table[j][1];
				double expectedMedian = table[j][i];
				double computedMedian = Math.exp(ca03AttenRel.getMean(iper,
						mag, rJB));
				assertEquals(expectedMedian, computedMedian, TOLERANCE);
			}
		}
		// check for PGA
		for (int j = 0; j < table.length; j++) {
			double mag = table[j][0];
			double rJB = table[j][1];
			double expectedMedian = table[j][columnDescr.length - 1];
			double computedMedian = Math.exp(ca03AttenRel.getMean(0, mag, rJB));
			assertEquals(expectedMedian, computedMedian, TOLERANCE);
		}
	}

	private void validateStdDev(String stdDevType, double[][] table) {
		String[] columnDescr = TABLE_HEADER_STD[0].trim().split("\\s+");
		// check for SA
		for (int i = 3; i < columnDescr.length - 1; i++) {
			for (int j = 0; j < table.length; j++) {
				double mag = table[j][0];
				double expectedStd = table[j][i];
				double computedStd = ca03AttenRel.getStdDev(i - 2, mag,
						stdDevType);
				assertEquals(expectedStd, computedStd, TOLERANCE);
			}
		}
		// check for PGA
		for (int j = 0; j < table.length; j++) {
			double mag = table[j][0];
			double expectedStd = table[j][columnDescr.length - 1];
			double computedStd = ca03AttenRel.getStdDev(0, mag, stdDevType);
			assertEquals(expectedStd, computedStd, TOLERANCE);
		}
	}

	@Override
	public void parameterChangeWarning(ParameterChangeWarningEvent event) {
	}

	/**
	 * See https://bugs.launchpad.net/openquake/+bug/931453.
	 * 
	 * Tests that the SA Period Parameter's change listener is set properly.
	 */
	@Test
	public void testResetSaPeriodParamEventListener() {
	    ca03AttenRel.resetParameterEventListeners();
	    ParameterAPI param = ca03AttenRel.getParameter(PeriodParam.NAME);
	    List<ParameterChangeListener> listeners = param.getChangeListeners();
	    assertEquals(1, listeners.size());
	    assertEquals(ca03AttenRel, listeners.get(0));
	}
}
