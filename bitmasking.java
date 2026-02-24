// //ques - to check even odd using bitmasking
// import java.util.*;
// public class bitmasking {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         if((n & 1) == 1) System.out.println("odd");
//         else System.out.println("even");
//     }
// }


//ques- implemention of operations of bit masking
/*class Main
{
	public static void main(String[] args) {
		int n1=5;
		int n2=3;
		System.out.println(5 & 3); //And operation
		System.out.println(5 | 3); //or operation
		System.out.println(5 ^ 3); //Xor operation
		System.out.println(~5); //Not operation
		System.out.println(5<<1); //left - multiply by 2
		System.out.println(5>>1);//right - divide by 2
	}
}*/


// //ques - applications of bitmasking
// //check ith bit
// import java.util.*;
// public class bitmasking {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i=sc.nextInt();
//         sc.close();
//         n=n|(1<<i);
// 		System.out.println(n);

//     }
// }


// //clear ith bit
// import java.util.*;
// public class bitmasking {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i=sc.nextInt();
//         sc.close();
//         n=n & ~(1<<i);
// 		System.out.println(n);

//     }
// }


// //toggle ith bit
// import java.util.*;
// public class bitmasking {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i=sc.nextInt();
//         sc.close();
//         n=n^(1<<i);
// 		System.out.println(n);

//     }
// }


// //find unique element in an array
// public class bitmasking {
//     public static void main(String[] args) {
//        int[] arr={1,2,3,4,3,5,2,5,1};
// 	   int ans = 0;
// 	   for(int i=0; i<arr.length; i++){
// 			ans ^= arr[i];
// 	   }
// 	   System.out.println(ans);

//     }
// }