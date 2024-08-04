public class Question8 {
    public static void main(String[] args) {
        System.out.println("8.	Write a program to check given number is Armstrong ?");
        int number=153;
        int ans=0;
        int n=number;
        while(number!=0){
            int digit=number%10;
             ans=ans+(digit*digit*digit);
            number=number/10;
        }
        if(ans==n) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a armstrong");
		}

    }
}
