abstract class Person{
    abstract void eat();
}
public class TestAnonymousInnerClass {
    public static void main(String[] args) {
        Person person=new Person() {
            @Override
            void eat() {
                System.out.println("Eating");
            }
        };
        person.eat();
    }
}
