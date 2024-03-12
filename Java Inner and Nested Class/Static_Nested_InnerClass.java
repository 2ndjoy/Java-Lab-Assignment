public class Static_Nested_InnerClass {
    static class Inner{
        Inner(){
            System.out.println("A static class inside a class");
        }
        void msg(){
            System.out.println("is a static nested class");
        }
    }

    public static void main(String[] args) {
      Static_Nested_InnerClass.Inner inner=new Static_Nested_InnerClass.Inner();
      inner.msg();

    }
}
