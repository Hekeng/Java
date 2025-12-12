package practice;

public class SafeDivider {

	public static double strictDivide(double a, double b) throws NegativeTenException {
		if (b == -10) {
			throw new NegativeTenException("Divisor -10 is forbidden!");
		}
		return a / b;
	}


	public static double safeDivide(double a, double b) {

		try {
			return strictDivide(a, b);

		} catch (NegativeTenException e) {
			System.out.println("Caught: " + e.getMessage());
			System.out.println("Fixing divisor to 10...");
			return a / 10;
		}
	}
}