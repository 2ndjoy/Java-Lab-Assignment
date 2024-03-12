public class PriorityOfThread extends Thread{
    public void run(){
        System.out.println("ThreadName is: "+Thread.currentThread().getName());
        System.out.println("Thread priority is: "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityOfThread priorityOfThread=new PriorityOfThread();
        PriorityOfThread priorityOfThread2=new PriorityOfThread();
        priorityOfThread.setPriority(Thread.MIN_PRIORITY);
        priorityOfThread2.setPriority(Thread.MAX_PRIORITY);

        priorityOfThread.start();
        priorityOfThread2.start();


    }
}
