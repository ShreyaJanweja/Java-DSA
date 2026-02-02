// //Check if an array is sorted or not using recursion
// import java.util.Scanner;
// public class ArrayRecursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         System.out.println(isSorted(arr,0));

//     }
//     public static boolean isSorted(int arr[], int index){
//         if(index==arr.length-1) return true;
//         return arr[index]<arr[index+1] && isSorted(arr, index+1);
//     }
// }



//search an element in an array using recursion
import java.util.*;
public class ArrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(search(arr,target,0));
        System.out.println(findIndex(arr,target,0));
    }
    public static boolean search(int arr[],int target , int index){
        if(index==arr.length) return false;
        return arr[index]==target || search(arr, target, index+1);
    }
    public static int findIndex(int arr[],int target,int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        else return findIndex(arr, target, idx+1);
    }
}