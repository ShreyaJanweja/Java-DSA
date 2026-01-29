// //ARRAYS BASICS
// //1. calculate sum of elements in an array
// import java.util.*;
// public class arrays {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0; i<n; i++){
//             sum=sum+arr[i];
//         }
//         System.out.print(sum);
//         sc.close();
//     }
// }


// //2. find maximum element in an array
// import java.util.*;
// public class arrays {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0; i<n; i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.print(max);
//         sc.close();
//     }
// }



// //3.Search for an element in an array
// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int target = sc.nextInt();
//          sc.close();
//         for(int i=0; i<n; i++){
//             if(arr[i]==target){
//                 System.out.print(i);
//                 return;
//             }
//         }
//         System.out.print(-1);
//     }
// }



// //4. count the number of occurrences of an element in an array
// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         int count=0;
//         for(int i=0; i<n; i++){
//             if(arr[i]==target){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }



// //5. count the number of elements strictly greater than value x
// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         int count=0;
//         for(int i=0; i<n; i++){
//             if(arr[i]>x){
//                 count++;
//             }
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }


// //6. check if an array is sorted in ascending order
// //O(n^2) approach
// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         boolean isSorted = true;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i]>arr[j]){
//                     isSorted=false;
//                 }
//             }
//         }
//         if(isSorted){
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Not sorted");
//         }
//     }
// } 


// //O(n) approach
// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();
//         boolean isSorted = true;
//         for(int i=0; i<n-1; i++){
//             if(arr[i]>arr[i+1]){
//                 isSorted=false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Not sorted");
//         }
//     }
// } 



//7. Given an array , return a new array that contains the smallest and largest elements from the original array.
import java.util.*;
public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int newarr[] = new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        newarr[0]=min;
        newarr[1]=max;
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}