//ques.1) Extract all a's from a string using recursion
//input: abccad , output: bccd

import java.util.Scanner;
public class StringsRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        sc.close();
        System.out.println(extractA(Str,0));
    }
    public static String ans = "";
    public static String extractA(String str, int idx){
        if (idx == str.length()) return "";

        if(str.charAt(idx)!='a') {
            ans=ans+str.charAt(idx);
            extractA(str,idx+1);
        }
        else {
            extractA(str,idx+1);
        }

        return ans;
    }
}