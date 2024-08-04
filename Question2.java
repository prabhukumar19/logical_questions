public class Question2 {
	public static void main(String[] args) {
		int ar1[] = { 1, 3, 2, 5, 4, 2, 67, 45, 76, 3, 2, 1, 67, 8, 9, 5, 0 };
		for (int i = 0; i < ar1.length; i++) {
			for (int j = i + 1; j < ar1.length; j++) {
				if (ar1[i] > ar1[j]) {
					int r = ar1[i];
					ar1[i] = ar1[j];
					ar1[j] = r;
				}
			}
		}
		int result[] = new int[ar1.length];
		int pre = ar1[0];
		result[0] = pre;
		int j = 1;
        
		for (int i = 1; i < ar1.length; i++) {
			int ch = ar1[i];
			if (pre != ch) {
				result[j] = ch;
				j++;
			}
			pre = ch;
		}
		System.out.println("Without duplicates = ");
		for (int i = 0; i < j; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
