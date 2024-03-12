public class ImplementingRunnable implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<10){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ImplementingRunnable implementingRunnable=new ImplementingRunnable();
        Thread t1=new Thread(implementingRunnable);
        t1.start();
        int i=0;
        while (i<10){
            System.out.println(i+"World");
            i++;
        }
    }
}
