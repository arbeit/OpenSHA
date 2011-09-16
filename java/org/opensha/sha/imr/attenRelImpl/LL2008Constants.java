package org.opensha.sha.imr.attenRelImpl;

public class LL2008Constants {

	/**
	 * Supported period values (s).
	 */
	public static final double[] PERIOD = {
	    0.00000,0.01000,0.02000,0.03000,0.04000,0.05000,0.06000,0.09000,0.10000,0.12000,
        0.15000,0.17000,0.20000,0.24000,0.30000,0.36000,0.40000,0.46000,0.50000,0.60000,
        0.75000,0.85000,1.00000,1.50000,2.0000,3.0000,4.0000,5.0000};
	/**
	 * Rock c1 coefficients.
	 */
//	public static final double[] rock_C1 = {-5.47000,
//	    -2.50000,-2.50000,-2.49000,-2.28000,-2.00000,-1.90000,-1.72500,-1.26500,-1.22000,-1.47000,
//		-1.67500,-1.84600,-2.17000,-2.58500,-3.61500,-4.16000,-4.59500,-5.02000,-5.47000,-6.09500,
//		-6.67500,-7.32000,-8.00000,-9.24000,-10.2000,-11.4700,-12.5500,-13.3900};
	
	public static final double[] rock_C1 = {
	    -2.50000,-2.50000,-2.49000,-2.28000,-2.00000,-1.90000,-1.72497,-1.26496,-1.21994,-1.46994,
	    -1.67494,-1.84594,-2.16994,-2.58494,-3.61494,-4.15994,-4.59494,-5.02001,-5.47000,-6.09500,
	    -6.67501,-7.32001,-8.00001,-9.24001,-10.20001,-11.47001,-12.55000,-13.20000};
	/**
	 * Rock c2 coefficients.
	 */
	public static final double[] rock_C2 = { 
		1.20500,1.20500,1.20000,1.15500,1.10000,1.09000,1.06500,1.02000,1.00000,1.04000,
		1.04500,1.06500,1.08500,1.10500,1.21500,1.25500,1.28500,1.32500,1.36500,1.42000,
		1.46500,1.54500,1.62000,1.70500,1.7700,1.8300,1.8450,1.8050};
	/**
	 * Rock c3 coefficients.
	 */
//	public static final double[] rock_C3 = {-1.46500, 
//		-1.90500,-1.89500,-1.88000,-1.87500,-1.86000,-1.85500,-1.84000,-1.81500,-1.79500,-1.77000,
//		-1.73000,-1.71000,-1.67500,-1.63000,-1.57000,-1.53500,-1.50000,-1.49500,-1.46500,-1.45500,
//		-1.45000,-1.45000,-1.45000,-1.44000,-1.4300,-1.3700,-1.2600,-1.1350};
	
	public static final double[] rock_C3 = {
		     -1.90499,-1.89500,-1.88000,-1.87500,-1.86000,-1.85500,-1.84000,-1.81500,-1.79500,-1.77000,
		     -1.73000,-1.71000,-1.67500,-1.63000,-1.57000,-1.53500,-1.50000,-1.49500,-1.46500,-1.45500,
			 -1.45000,-1.45000,-1.45000,-1.44000,-1.43000,-1.37000,-1.26000,-1.13500};

	/**
	 * Rock c4 coefficients.
	 */
	public static final double[] rock_C4 = { 
		0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,
		0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,0.51552,
		0.51552,0.51552,0.51552,0.51552,0.5155,0.5155,0.5155,0.5155};
	/**
	 * Rock c5 coefficients.
	 */
	public static final double[] rock_C5 = { 
		0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,
		0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,0.63255,
		0.63255,0.63255,0.63255,0.63255,0.6326,0.6326,0.6326,0.6326};
	/**
	 * Rock c6 coefficients.
	 */
	public static final double[] rock_C6 = {0.00750,
		0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,
		0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,0.00750,
		0.00750,0.00750,0.00750,0.00750,0.0075,0.0075,0.0075,0.0075};
	/**
	 * Rock c7 coefficients.
	 */
	public static final double[] rock_C7 ={
		0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,
		0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,0.27500,
		0.27500,0.27500,0.27500,0.27500,0.2750,0.2750,0.2750,0.2750};
	/**
	 * Rock total standard deviation.
	 */
//	public static final double[] ROCK_TOTAL_STD = {0.71450, 
//		0.52680,0.52180,0.51890,0.52350,0.53520,0.53700,0.55440,0.58180,0.58060,0.57480,
//		0.58170,0.59060,0.60590,0.63150,0.66560,0.70100,0.71050,0.71480,0.71450,0.71770,
//		0.76890,0.77870,0.79830,0.84110,0.8766,0.8590,0.8055,0.7654};
   /**
    * From 
    * */
   public static final double[]ROCK_TOTAL_STD = {
         .52680,.52280,.51990,.52450,.53630,.53800,.55550,.58300,.58180,.57590,.58280,.59180,.60710,.63280,
	     .66690,.70240,.71190,.71620,.71590,.71910,.77040,.78030,.79990,.84280,.87840,.86070,.80710,.79130};

	/**
	 * Soil c1 coefficients.
	 */
//	public static final double[] soil_C1 ={-5.22000, 
//		-0.90000,-2.20000,-2.29000,-2.34000,-2.21500,-1.89500,-1.11000,-0.21000,-0.05500,-0.05500,
//		-0.04000,-0.34000,-0.80000,-1.57500,-3.01000,-3.68000,-4.25000,-4.72000,-5.22000,-5.70000,
//		-6.45000,-7.25000,-8.15000,-10.3000,-11.6200,-12.6300,-13.4200,-13.7500};
	public static final double[] soil_C1 =   {
		 -.90000, -2.20000, -2.29000, -2.34000, -2.21498, -1.89500, -1.11000, -.20990, -.05489, .05512,
		 -.03987, -.33986, -.7998600, -1.57486, -3.00986, -3.68000, -4.25000, -4.72000,-5.22000,-5.70000,
		 -6.45000,-7.35000,-8.15000,-10.30002,-11.62002,-12.63000,-13.42001,-13.75001};
	/**
	 * Soil c2 coefficients.
	 */
//	public static final double[] soil_C2 = {1.45500,
//		1.00000,1.08500,1.08500,1.09500,1.09000,1.05500,1.01000,0.94500,0.92000,0.93500,
//		0.95500,1.02000,1.04500,1.12000,1.31500,1.38000,1.41500,1.43000,1.45500,1.47000,
//		1.50000,1.56500,1.60500,1.8000,1.8600,1.8900,1.8700,1.8350};
	public static final double[] soil_C2 ={
		1.00000,1.08500,1.08500,1.09500,1.09000,1.05500,1.01000,.94500,.92000,.93500,
		.95500,1.02000,1.04500,1.12000,1.31500,1.38000,	1.41500,1.43000,1.45500,1.47000,
		1.50000,1.56500,1.60500,1.80001,1.86002,1.89002,1.87001,1.83501};
	/**
	 * Soil c3 coefficients.
	 */
	public static final double[] soil_C3 = {
		-1.90000,-1.75000,-1.73000,-1.72000,-1.73000,-1.75500,-1.83500,-1.89000,-1.88000,-1.89500,
		-1.88000,-1.88500,-1.82000,-1.75500,-1.69500,-1.66000,-1.60000,-1.54500,-1.49000,-1.44500,
		-1.38000,-1.32500,-1.23500,-1.1650,-1.0700,-1.0600,-0.9900,-0.9750};
	/**
	 * Soil c4 coefficients.
	 */
	public static final double[] soil_C4 = {
		0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,
		0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,0.99178,
		0.99178,0.99178,0.99178,0.9918,0.9918,0.9918,0.9918,0.9918};;
	/**
	 * Soil c5 coefficients.
	 */
	public static final double[] soil_C5 = {
		0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,
		0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,0.52632,
		0.52632,0.52632,0.52632,0.5263,0.5263,0.5263,0.5263,0.5263};
	/**
	 * Soil c6 coefficients.
	 */
	public static final double[] soil_C6 = {
		0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,
		0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,0.00400,
		0.00400,0.00400,0.00400,0.0040,0.0040,0.0040,0.0040,0.0040};
	/**
	 * Soil c7 coefficients.
	 */
	public static final double[] soil_C7 = {
		0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,
		0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,0.31000,
		0.31000,0.31000,0.31000,0.3100,0.3100,0.3100,0.3100,0.3100};
	/**
	 * Soil total standard deviation.
	 */
//	public static final double[] soil_TOTAL_STD = {0.71220,
//		0.62770,0.58000,0.57300,0.57740,0.58080,0.59370,0.61230,0.64810,0.65350,0.65850,
//		0.65950,0.66800,0.65650,0.64650,0.66610,0.68760,0.70020,0.70920,0.71220,0.72800,
//		0.77520,0.79310,0.81580,0.8356,0.8474,0.8367,0.7937,0.7468};
	
	public static final double[] soil_TOTAL_STD ={
		.48763,.57200,.56720,.57246,.57663,.59221,.59351,.62718,.63322,.64289,.65238,.66732,.65718,.64040,
		.64856,.67233,.67986,.67889,.68034,.67322,.70085,.71854,.72217,.72945,.74782,.73083,.70625,.65593};
	/**
	 * log10 to natural log conversion factor.
	 */
	public static final double LOG10_2_LN = Math.log(10.0);
	/**
	 * Minimum magnitude.
	 */
	public static final Double MAG_WARN_MIN = new Double(4.1);
	/**
	 * Maximum magnitude.
	 */
	public static final Double MAG_WARN_MAX = new Double(8.1);

	/**
	 * Minimum rupture distance.
	 */
	public static final Double DISTANCE_HYPO_WARN_MIN = new Double(15.0);
	/**
	 * Maximum rupture distance.
	 */
	public static final Double DISTANCE_HYPO_WARN_MAX = new Double(630.0);
	/**
	 * Minimum hypocentral depth.
	 */
	public static final Double DEPTH_HYPO_WARN_MIN = new Double(4.0);
	/**
	 * Maximum hypocentral depth.
	 */
	public static final Double DEPTH_HYPO_WARN_MAX = new Double(161.0);
	
	/**
	 * Class (B+C) Vs30 >= 360 
	 * Class (D+E) Vs30 < 360 
	 */
	public static final double SOIL_TYPE_SOFT_UPPER_BOUND = 360.0; 
	/**
	 * cm/s/s to g conversion factor.
	 */
	public static final double CMS_TO_G_CONVERSION_FACTOR = 1.0/981.0;
	/**
	 * g to cm/s/s conversion factor for SA(0.5) to PGV
	 */
	public static final double SA_g_to_PGV_cms_CONVERSION_FACTOR = 981.0/20;
	public static void main(String[] args) {
		System.out.println(PERIOD.length);
		System.out.println(rock_C1.length);
		System.out.println(rock_C2.length);
		System.out.println(rock_C3.length);
		System.out.println(rock_C4.length);
		System.out.println(rock_C5.length);
		System.out.println(rock_C6.length);
		System.out.println(rock_C7.length);
		System.out.println(ROCK_TOTAL_STD.length);

		
		System.out.println(soil_C1.length);
		System.out.println(soil_C2.length);
		System.out.println(soil_C3.length);
		System.out.println(soil_C4.length);
		System.out.println(soil_C5.length);
		System.out.println(soil_C6.length);
		System.out.println(soil_C7.length);
		System.out.println(soil_TOTAL_STD.length);
		
	}

}
