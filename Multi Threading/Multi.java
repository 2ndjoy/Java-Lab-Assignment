class Multi extends Thread{
    int i=0;
    public void run(){
        while (i<10){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {

        Multi t1=new Multi();
        t1.start();

        int i=0;
        while (i<10){
            System.out.println(i+"world");
            i++;
        }
    }
}