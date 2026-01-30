//recursion by Kunal 

// //print no. from 1 to n
// import java.util.*;
// public class recursion {
//     public static void print1toN(int n){
//     if(n==0) return;
//     print1toN(n-1);
//     System.out.print(n+" ");
// }
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        print1toN(n);
//        sc.close();
//     }
// }



// //fibonaaci no. 
// import java.util.*;
// public class recursion {
//     public static int fibo(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fibo(n-1)+fibo(n-2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.print(fibo(n));
//         sc.close();
//     }
// }


// //fibo. series 
// import java.util.*;
// public class recursion {
//     public static int fiboSeries(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fiboSeries(n-1)+fiboSeries(n-2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0; i<n; i++){
//             System.out.print(fiboSeries(i)+" ");
//         }
//         sc.close();
//     }
// }