package exceptionHandling;
// //throw keyword .
// public class ThrowException {
//     public static void main(String[] args) {
//         int age = 16;
//         if(age < 18){
//             throw new ArithmeticException("Not eligible to vote");
//         }
//         System.out.println("Eligible to vote");
//     }
// }


//throws keyword
public class ThrowException {
    static void validate(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        validate(16);
    }
}