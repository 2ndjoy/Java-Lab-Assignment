public class MultiCatchBlock {
    public static void main(String[] args) {

        int []arr={1,2,3,4,51};
        int x=0;

        try {
            System.out.println(arr[8]/x);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }



    }



}
