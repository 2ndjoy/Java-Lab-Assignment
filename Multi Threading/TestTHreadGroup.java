 class ThreadGroupp implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName()+ "Running");
    try{
        Thread.sleep(1000);
    }
    catch (Exception e){
        e.printStackTrace();
    }

    }

}

public class TestTHreadGroup{
    public static void main(String[] args) {
        ThreadGroup myThreadGroup=new ThreadGroup("tg1");

        Thread thread1 = new Thread(myThreadGroup, new ThreadGroupp(), "Thread1");
        Thread thread2 = new Thread(myThreadGroup, new ThreadGroupp(), "Thread2");
        Thread thread3 = new Thread(myThreadGroup, new ThreadGroupp(), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        myThreadGroup.list();

    }
}