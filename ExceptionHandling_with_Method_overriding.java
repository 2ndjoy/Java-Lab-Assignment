//If parent class doesn't have any exception

class Parent{
    public static void m1(){
        System.out.println(1/0);
    }
}

public class ExceptionHandling_with_Method_overriding extends Parent{
    public static void main(String[] args) throws ArithmeticException{
        m1();
    }

}




