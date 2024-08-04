
public class Question1 {
    public static void main(String[] args) {
        System.err.println("Question 1. How to find the missing number in integer array of 1 to 100?");

        int arr[] = new int [100];
        for(int i=1; i<=100; i++){
            if(i==45) continue;
            arr[i-1]=i;
        }

        int num=(100*(100+1))/2;
        int sum=0;
        for(int i=0; i<100; i++){
            sum+=arr[i];
        }

        int ans=num-sum;

        System.out.println("Missing Number is :- "+ans);

    }
}