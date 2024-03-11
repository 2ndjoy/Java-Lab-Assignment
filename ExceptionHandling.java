public class ExceptionHandling {
    public static void main(String[] args) {

//        arithemetic exception with try catch finally
        int a=9;
       int b=0;

       try {
           int result=a/b;
       }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }

        finally {
           System.out.println("Finally");
       }


// .ArrayIndexOutOfBoundsException

        int []arr={1,2,3,4};

     try {
         for (int i=0;i<6;i++){
             System.out.println(arr[i]);
         }
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
         System.out.println(e.getMessage());
     }
//     NullPointerException
        String str = null;

        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

    }
}
