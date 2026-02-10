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


// //method - 2 (morre optimized and better than method-1)
// import java.util.*;
// public class StringsRecursion {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str = sc.nextLine();
//         sc.close();
//         System.out.println(extractA(str));
//     }
//     public static String extractA(String str){
//         if(str.length()==0) return "";
//         char ch = str.charAt(0);
//         if(ch=='a') return extractA(str.substring(1));
//         else return ch+extractA(str.substring(1));
//     }
// }




//ques2.) remove an entire string from the sentence using recursion
import java.util.*;
public class StringsRecursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        sc.close();
        System.out.println(extractString(str,word));
    }
    public static String extractString(String str, String word){
        if(str.length()==0) return "";
        if(str.startsWith(word)) return extractString(str.substring(word.length()), word);
        else return str.charAt(0) + extractString(str.substring(1),word);
    }
}

