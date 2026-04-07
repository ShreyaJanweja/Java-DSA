package exceptionHandling;

class AgeNotValidException extends Exception{
    public AgeNotValidException(String message){
        super(message);
    }
}

public class customException {
    public static void checkAge(int age) throws AgeNotValidException{
        if(age < 18){
            throw new AgeNotValidException("Not Eligible");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(AgeNotValidException e){
            // e.printStackTrace(); // it will print the complete stack trace of the exception, including the line number where the exception occurred and the sequence of method calls that led to the exception.
            System.out.println(e); // it will print the name of the exception class along with the message provided when the exception was thrown.
            System.out.println(e.getMessage()); // it will print only the message provided when the exception was thrown, without the name of the exception class.
        }
    }
}
