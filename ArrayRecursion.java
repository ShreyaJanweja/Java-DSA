//Check if an array is sorted or not using recursion
import java.util.Scanner;
public class ArrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int arr[], int index){
        if(index==arr.length-1) return true;
        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }
}
