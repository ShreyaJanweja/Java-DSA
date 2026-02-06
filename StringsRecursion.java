// //ques.1) Extract all a's from a string using recursion
// //input: abccad , output: bccd
// //method-1 ) tried myself
// import java.util.Scanner;
// public class StringsRecursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         String Str = sc.nextLine();
//         sc.close();
//         System.out.println(extractA(Str,0));
//     }
//     public static String ans = "";
//     public static String extractA(String str, int idx){
//         if (idx == str.length()) return "";

//         if(str.charAt(idx)!='a') {
//             ans=ans+str.charAt(idx);
//             extractA(str,idx+1);
//         }
//         else {
//             extractA(str,idx+1);
//         }

//         return ans;
//     }
// }



// //method-2) by kunal
// import java.util.*;
// public class StringsRecursion {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         sc.close();
//         skip("", str);

//     }
//     public static void skip(String ans, String str){
//         if(str.isEmpty()){
//             System.out.println(ans);
//             return;
//         }
//         char ch = str.charAt(0);
//         if(ch=='a'){
//             skip(ans , str.substring(1));
//         }
//         else{
//             skip(ans+ch , str.substring(1));
//         }
//     }
// }



