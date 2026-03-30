package exceptionHandling;

//try - catch block - to handle exceptions

// //arithematic exception - when we try to divide a number by zero
// public class Exceptions {
//     public static void main(String[] args) {
//         int a=10,b=0,c;
//         // c=a/b; // this will throw an exception because we cannot divide by zero
//         // System.out.println(c);
//         try{
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//         }
//     }
// }


// // null pointer exception - when we try to access a null object
// public class Exceptions {

//     public static void main(String[] args) {
//         String str = null;
//         // System.out.println(str.length()); // this will throw an exception because we cannot access a null object
//         try{
//             System.out.println(str.toUpperCase());
//         }
//         catch(NullPointerException e){
//             System.out.println("null pointer cannnot be casted");
//         }
//     }
// }



// //Number format exception - when we try to convert a string to a number and the string is not a valid number
// public class Exceptions {

//     public static void main(String[] args) {
//         String str = "ankit";
//         //int num = Integer.parseInt(str); // this will throw an exception because we cannot convert a string to a number
//         try{
//              int num = Integer.parseInt(str);
//             System.out.println(num);
//         }
//         catch(NumberFormatException e){
//             System.out.println("String "+str+" cannot be converted to a number");
//         }
//     }
// }




// //try-catch-finally block - to handle exceptions and execute some code regardless of whether an exception is thrown or not
// public class Exceptions {

//     public static void main(String[] args) {
//         int a=10,b=0,c;
//         try{
//             c=a/b;
//             System.out.println(c);
//             System.out.println("like share");
//         }
//         catch(ArithmeticException e){
//             System.out.println("can't divide be zero");
//         }
//         finally{
//             System.out.println("subscribe");
//         }
//         System.out.println("main method ended");
//     }
// }



// //multiple catch block - to handle multiple exceptions
// public class Exceptions {

//     public static void main(String[] args) {
//         try{
//             int a=10,b=0,c;
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException a){
//             System.out.println("can't divide by zero");
//         }

//         try{
//             int arr[] = {10,20,30,40};
//             System.out.println(arr[5]);
//         }
//         catch(ArrayIndexOutOfBoundsException b){
//             System.out.println("beyond the array limit");
//         }
//         System.out.println("main method ended");
//     }
// }