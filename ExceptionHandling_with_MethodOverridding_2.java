class parentTwo{
    static void m2() throws ArithmeticException{
        System.out.println(2/0);
    }
}
public class ExceptionHandling_with_MethodOverridding_2 extends parentTwo{

    public static void main(String[] args) {
        try {
            m2();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
