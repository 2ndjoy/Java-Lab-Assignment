
public class ExceptionPropagation {

    static void m1(){
        int a=1/0;
        System.out.println(a);
    }


    static void m2(){
        m1();
    }


    public static void main(String[] args) {
        try {
            m2();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
