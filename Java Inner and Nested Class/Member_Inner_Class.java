public class Member_Inner_Class {
    private int data=30;

    class Inner{
        void msg(){
            System.out.println("Data: "+data);
        }
    }

    public static void main(String[] args) {
        Member_Inner_Class memberInnerClass=new Member_Inner_Class();
        Member_Inner_Class.Inner inner=memberInnerClass.new Inner();
        inner.msg();
    }
}