public class MultiThreadJoin extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i+"Hello");
        }
    }

    public static void main(String[] args)throws Exception {
        MultiThreadJoin multiThreadJoin=new MultiThreadJoin();
        multiThreadJoin.start();
        multiThreadJoin.join();
        System.out.println("Bye");
    }
}
