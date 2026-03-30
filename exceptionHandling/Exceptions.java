package exceptionHandling;
//arithematic exception - when we try to divide a number by zero
public class Exceptions {
    public static void main(String[] args) {
        int a=10,b=0,c;
        // c=a/b; // this will throw an exception because we cannot divide by zero
        // System.out.println(c);
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
