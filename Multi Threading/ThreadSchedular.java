public class ThreadSchedular extends Thread{
    public void run(){

        for (int i=0;i<=10;i++){

            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println(i+"Hello");


        }
    }

    public static void main(String[] args) {
        ThreadSchedular threadSchedular=new ThreadSchedular();
        threadSchedular.start();
        for (int i=0;i<=10;i++){
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(i+"worlld");
        }
    }
}
