public class Local_Inner_class {
    void method(){
        class MethodClass{
            MethodClass(){
                System.out.println("Class inside a method is local inner class");
            }

        }
        MethodClass methodClass=new MethodClass();

    }

    public static void main(String[] args) {
        Local_Inner_class localInnerClass=new Local_Inner_class();
        localInnerClass.method();
    }
}