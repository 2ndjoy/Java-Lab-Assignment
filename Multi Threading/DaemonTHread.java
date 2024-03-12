class MyThread extends Thread{
        public void run() {
        for (int i=1;i<11;i++){
            System.out.println(i+"Daemon thread");

            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

class DaemonTHread {

    public static void main(String[] args) throws Exception{
        MyThread myThread=new MyThread();
        myThread.setDaemon(false);
        myThread.start();

        for (int i=1;i<=5;i++){
            System.out.println(i+"Main thread");
            Thread.sleep(500);
        }

    }
}