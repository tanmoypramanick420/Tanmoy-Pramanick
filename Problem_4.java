import java.util.HashMap;

class Problem_4 {
	public static void m(int[] arr) {
		int[] dictionary = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int size = arr.length;
		int dicSize = dictionary.length;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(1, size);
		for (int i = 1; i < dicSize; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (arr[j] % dictionary[i] == 0) {
					count++;
				}
			}
			h.put(dictionary[i], count);
		}
		System.out.println(h);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
		m(arr);
	}
}
