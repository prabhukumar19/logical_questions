public class Question3 {
    public static void main(String[] args) {
        System.out.println("3.\tHow to check if array contains a number in Java? ");
        int arr[] = {1,3,68,9,10};
        int element=3;
        
        boolean isPresent=false;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==element){
                isPresent=true;

            }
        }
        if(isPresent){
            System.out.println("Element is Present");
        }else {
            System.out.println("Element is not present");
        }
    }

}
