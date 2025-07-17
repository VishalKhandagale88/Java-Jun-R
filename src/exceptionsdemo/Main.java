package exceptionsdemo;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,45};
            for (int i=0;i<10;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception exception){
            String message = exception.getMessage();
            System.out.println(message);
        }


    }

}
