import java.util.Scanner;

public class NestedTryBlock {
    public static void main(String[] args) {

        int []marks=new int[3];
        marks[0]=7;
        marks[1]=17;
        marks[2]=27;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index number;");
        int index=sc.nextInt();

        try {
            try {
                System.out.println(marks[index]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("Exception in inner level");
            }
        }
        catch (Exception e) {
            System.out.println("Exception in outer level");
        }
    }
}
