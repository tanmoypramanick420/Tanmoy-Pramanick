package problem_1;

public class Calculator {
	public static double calculate(double a, double b, String operationType) {
		if (operationType.equals("add")) {
			return a + b;
		} else if (operationType.equals("sub")) {
			return a - b;
		} else if (operationType.equals("mul")) {
			return a * b;
		} else if (operationType.equals("div")) {
			if (b == 0) {
				return Double.NaN;
			}
			return a / b;
		}
		return Double.NaN;
	}
}
