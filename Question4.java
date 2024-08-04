public class Question4 {
    public static void main(String[] args) {
        System.out.println("How to find largest and smallest number in unsorted array? ");

        int arr[] = { 1, 4, 10, 5, 3, 15, 9, 11 };
        int arr1[] = { 1, 3, 4, -45, 67, -100, 567, -5678, 56789, -123456 };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        for (int n : arr1) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }

        }
        System.out.println("Largest Value is :- " + largest);
        System.out.println("Smallest Value is :- " + smallest);
    }
}
