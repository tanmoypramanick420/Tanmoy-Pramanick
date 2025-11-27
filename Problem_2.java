class Problem_2 {
	public static void m(int a) {
		int num = 1;
		for (int i = 1; i <= a; i++) {
			if (i == a) {
				System.out.print(num);
			} else {
				System.out.print(num + ", ");
			}
			num += 2;
		}
	}

	public static void main(String[] args) {
		m(1);
		System.out.println();
		m(2);
		System.out.println();
		m(3);
		System.out.println();
		m(4);
		System.out.println();
		m(5);
		System.out.println();
		m(6);

	}
}
