public class Question5 {
    public static void main(String[] args) {
        System.out.println("5.	How to find all pairs on integer array whose sum is equal to given number?");
        int arr[] = { 1, 2, 3, 4, 5, 7, 87, 45, 34 };
        int sum = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");
                }
            }
        }
    }
}
