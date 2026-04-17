// import java.util.*;
// //1. Write a Java program that reads two integers base and exp and computes base^exp using recursion.
// class Codechef
// {
//     public static long powerBase(long base,long exp){
//         if(exp<0) return -1;
//         if(exp==0) return 1;
//         long half = powerBase(base,exp/2);
//         if(exp%2==0) return half * half;
//         else return half*half*base;
//     }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 	   Scanner sc = new Scanner(System.in);
// 	   long base = sc.nextInt();
// 	   long exp = sc.nextInt();
// 	   System.out.println(powerBase(base,exp));

// 	}
// }




// //Q.2) Write a Java program that finds the unique element in an array where every other element appears exactly two time
// import java.util.*;
// class Main{
//     public static int unique(int arr[],int n){
//         int ans = 0;
//         for(int i=0; i<n; i++){
//             ans ^= arr[i];
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(unique(arr,n));
//     }
// }



// //Q.3 ) Write a Java program that determines if there is a celebrity in the group using a stack-based approach. [ The Celebrity Problem ]

// class Solution {
//     public int celebrity(int mat[][]) {
//         int n=mat.length;
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//             st.push(i);
//         }
//         while(st.size()>1){
//             int a=st.pop();
//             int b=st.pop();
//             if(mat[a][b]==1){
//                 st.push(b);
//             }
//             else{
//                 st.push(a);
//             }
//         }
//         int candidate = st.pop();
//         for(int i=0; i<n; i++){
//             if(i!=candidate){
//                 if(mat[candidate][i]==1 || mat[i][candidate]==0){
//                     return -1;
//                 }
//             }
//         }
//         return candidate;
//     }
// }




// // Q.4) Write a Java program that reads an integer n and calculates its factorial using recursion.
// import java.util.*;
// class Main{
//     public static int factorial(int n){
//         if(n==0) return 1;
//         return n*factorial(n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(factorial(n));
//     }
// }



// //Q.5) Write a Java program that generates the power set (all possible subsets) of a given array of integers.

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0; i<(1<<n); i++){
//             List<Integer> subset = new ArrayList<>();
//             for(int j=0; j<n; j++){
//                 if((i & (1<<j)) != 0){
//                     subset.add(nums[j]);
//                 }
//             }
//             result.add(subset);
//         }
//         return result;
//     }
// }



// //6. Q.6) Write a Java program that finds the Next Greater Element for each element in an array
// class Result{
//   static void printNextGreaterElement(int arr[],int n){
//       Stack<Integer> st = new Stack<>();
//       int result[] = new int[n];
//       for(int i=n-1; i>=0; i--){
//           while(!st.isEmpty() && st.peek()<=arr[i]){
//               st.pop();
//           }
//           if(st.isEmpty()) result[i]=-1;
//           else result[i]=st.peek();
//           st.push(arr[i]);
//       }
//       for(int i=0; i<n; i++){
//           System.out.print(result[i]+" ");
//       }
//   }
// }



// //Q.7) Write a Java program that reads an integer n and prints the nᵗʰ Fibonacci number using recursion. and Fibonacci series as well
// import java.util.*;
// class Main{
//     public static int Fibonacci(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return Fibonacci(n-1)+Fibonacci(n-2);
//     }
//     public static void fiboSeries(int n,int a,int b){
//         if(n==0) return;
//         System.out.println(a+" ");
//         fiboSeries(n-1,b,a+b);
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(Fibonacci(n));
//         fiboSeries(n,0,1);
//     }
// }



// //Q.13) Write a Java program to implement Min Stack
// /* 
// int stackArray[maxSize], top = -1,maxSize;
// int isFull();
// int isEmpty();

// Above variables are used for Stack, maxSize and top. Also above two functions are provided. */
// int minArray[] = new int[100];
// int minTop = -1;
// public void push(int j) // put item on top of stack
// {
//     if(isFull()) return;
//     stackArray[++top]=j;
//     if(minTop==-1||j<=minArray[minTop]){
//         minArray[++minTop]=j;
//     }
// }

// public int pop() // take item from top of stack
// {
//     if(isEmpty()) return -1;
//     int val = stackArray[top--];
//     if(val == minArray[minTop]){
//         minTop--;
//     }
//     return val;
// }

// public int getMin()
// {
//     if(isEmpty() || minTop==-1){
//         return -1;
//     }
//     return minArray[minTop];
// }



// //Q.11 ) Write a Java program to solve the Stock Span Problem using stack.
// class StockSpanner {
//     Stack<int[]> st;
//     public StockSpanner() {
//         st = new Stack<>();
//     }
    
//     public int next(int price) {
//         int span=1;
//         while(!st.isEmpty() && st.peek()[0]<=price){
//             span += st.pop()[1];
//         }
//         st.push(new int[]{price,span});
//         return span;
//     }
// }

// /**
//  * Your StockSpanner object will be instantiated and called as such:
//  * StockSpanner obj = new StockSpanner();
//  * int param_1 = obj.next(price);
//  */



// //Q.8) Write a Java program that finds all unique combinations of numbers that sum up to a given target. [ Combination Sum ]
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> res = new ArrayList<>();
//         solve(candidates,0,target,new ArrayList<>(),res);
//         return res;
//     }
//     public void solve(int[]nums,int index,int target,List<Integer> temp, List<List<Integer>> res){
//         //base case
//         if(target==0){
//             res.add(new ArrayList<>(temp));
//             return;
//         }
//         //out of bound
//         if(index==nums.length || target < 0) return;
//         //include
//         temp.add(nums[index]);
//         solve(nums,index,target-nums[index],temp,res);
//         temp.remove(temp.size()-1);

//         //exclude
//         solve(nums,index+1,target,temp,res);
//     }
// }