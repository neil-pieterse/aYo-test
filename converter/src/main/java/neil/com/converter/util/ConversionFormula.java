package neil.com.converter.util;

import java.util.function.Function;

public class ConversionFormula {
	
	public static final Function<Double, Double> F2C = f -> (f - 32) * 5 / 9;
	public static final Function<Double, Double> C2F = c -> c * 9 / 5 + 32;
	
	public static final Function<Double, Double> K2M = k -> k * 0.621371;
	public static final Function<Double, Double> M2K = m -> m / 1.621371;
	
	public static final Function<Double, Double> SK2A = sk-> sk * 247.105;
	public static final Function<Double, Double> A2SK = a-> a / 247;
	
	public static final Function<Double, Double> L2G = l -> l / 3.785;
	public static final Function<Double, Double> G2L = g -> g * 3.785;
	
	public static final Function<Double, Double> K2P = k -> k * 2.205;
	public static final Function<Double, Double> P2K = p -> p / 2.205;
}