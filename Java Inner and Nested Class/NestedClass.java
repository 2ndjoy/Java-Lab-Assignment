public class NestedClass {
    static class A{
        A(){
            System.out.println("Inside a");
        }

    }
    public static void main(String[] args) {
        A a=new A();

    }
}