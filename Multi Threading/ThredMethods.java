public class ThredMethods extends Thread{
    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        ThredMethods thredMethods=new ThredMethods();
        thredMethods.start();
        thredMethods.setName("ThreadJack");
        System.out.println(thredMethods.getName());
        System.out.println(thredMethods.getId());
        System.out.println(thredMethods.getPriority());
        System.out.println(thredMethods.isAlive());
    }
}
