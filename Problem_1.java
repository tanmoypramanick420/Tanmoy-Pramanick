class Problem_1 {
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

	public static void main(String[] args) {
		System.out.println(calculate(2, 5, "add")); // 7.0
		System.out.println(calculate(5, 2, "sub")); // 3.0
		System.out.println(calculate(2, 5, "mul")); // 10.0
		System.out.println(calculate(5, 2, "div")); // 2.5
		System.out.println(calculate(0, 5, "div")); // 0.0
		System.out.println(calculate(5, 0, "div")); // NaN
		System.out.println(calculate(5, 0, "xc")); // NaN
	}
}
