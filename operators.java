// // bitwise operators
// public class operators {
//     public static void main(String args[]){
//         int p=9,q=10;
//         System.out.println(p|q); //11
//         System.out.println(p&q); //8
//         System.out.println(p^q); //3
//         System.out.println(~p); //-10

//         System.out.println(p<<1); //18
//         System.out.println(p<<2); //36

//         System.out.println(q>>1); //5
//         System.out.println(q>>2); //2

//     }
// }



// //number system conversion
// //1. binary to decimal
// import java.util.*;
// public class operators {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String binary = sc.next();
//         int decimal=Integer.parseInt(binary,2);
//         System.out.print(decimal);
//         sc.close();
//     }
// }


// //2. decimal to binary
// import java.util.*;
// public class operators {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int decimal=sc.nextInt();
//         int ans=0;
//         int pw=1;
//         while (decimal>0) {
//             int parity = decimal%2;
//             ans += parity*pw;
//             pw *= 10;
//             decimal = decimal/2;
//         }
//         System.out.print(ans);
//         sc.close();
//     }
// }
