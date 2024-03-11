class NegativeDirectionException extends Exception{
    public String toString(){
            return "Dimension cannot be negative";
    }
}

public class ExceptionHandlingWithThrow_and_Throws {
    static int area(int l, int b) throws NegativeDirectionException{
        if (l<0 || b<0)
            throw new NegativeDirectionException();
        return l*b;
    }
    static void display() throws NegativeDirectionException{
        try {
            System.out.println("Area is : "+area(-10,5));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws NegativeDirectionException{
        display();
    }
}
