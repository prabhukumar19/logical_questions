import java.util.HashSet;
import java.util.Iterator;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("6.	Write a program to find intersection of two sorted arrays in Java?");
        int ar1[] = { 1, 2, 3, 4, 5, 6, 2, 3, 12,7 };
		int ar2[] = { 3, 4, 23, 45, 7, 6 };
		int count = 0;
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					set.add(ar1[i]);
                    count++;
				}
			}
		}
		System.out.print("Intersection of two arrays is = ");
		Iterator<Integer> it = set.iterator();
		System.out.print("{");
		while (it.hasNext()) {
			System.out.print( it.next() + " ");
		}
		System.out.print("}");
        System.out.println();

        System.out.println("Count of Elements :- "+(count-1));

    }
}
