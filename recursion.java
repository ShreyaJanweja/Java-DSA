//recursion by Kunal 

//print no. from 1 to n
import java.util.*;
public class recursion {
    public static void print1toN(int n){
    if(n==0) return;
    print1toN(n-1);
    System.out.print(n+" ");
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       print1toN(n);
       sc.close();
    }
}
