package Stack;
// import java.util.*;
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 	    Scanner sc = new Scanner(System.in);
// 	    int n=sc.nextInt();
// 	    Stack<Integer> st = new Stack<>();
// 	    for(int i=0; i<n; i++){
// 	        int x = sc.nextInt();
// 	        st.push(x);
// 	    }
//         sc.close();
// 	    System.out.println(st);
// 	    System.out.println(st.push(90));
// 	    System.out.println(st.peek());
// 	    System.out.println(st.pop());
// 	    System.out.println(st.size());
// 	    System.out.println(st.isEmpty());
// 	}
// }




// //ques1.) copy contents of one stack to another stack in same order
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//             int x=sc.nextInt();
//             st.push(x);
//         }
//         sc.close();
//         System.out.println("Original Stack : "+st);
//         Stack<Integer> revSt = new Stack<>();
//         while(st.size()>0){
//             revSt.push(st.pop());
//         }
//         Stack<Integer> copySt = new Stack<>();
//         while(revSt.size()>0){
//             copySt.push(revSt.pop());
//         }
//         System.out.println("copied stack : "+copySt);
//     }
// }



// //2.) insert at bottom of the stack 
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//             int x = sc.nextInt();
//             st.push(x);
//         }
//         System.out.println("original stack : "+st);
//         int num = sc.nextInt();
//         sc.close();
//         Stack<Integer> helperSt = new Stack<>();
//         while(st.size()>0){
//             helperSt.push(st.pop());
//         }
//         st.push(num);
//         while(helperSt.size()>0){
//             st.push(helperSt.pop());
//         }
//         System.out.println("new stack : "+st);
//     }
// }



// //3.) insert at any index of stack 
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//             int x=sc.nextInt();
//             st.push(x);
//         }
//         sc.close();
//         System.out.println("original stack : "+st);
//         int num = sc.nextInt();
//         int idx = sc.nextInt();
//         Stack<Integer> helperSt = new Stack<>();
//         while(st.size()>idx){
//             helperSt.push(st.pop());
//         }
//         st.push(num);
//         while(helperSt.size()>0){
//             st.push(helperSt.pop());
//         }
//         System.out.println("new stack : "+st);
//     }
// }




// //4.) reverse stack 
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//             int x=sc.nextInt();
//             st.push(x);
//         }
//         sc.close();
//         System.out.println("Original Stack : "+st);
//         Stack<Integer> revSt = new Stack<>();
//         while(st.size()>0){
//             revSt.push(st.pop());
//         }
//         System.out.println("reverse stack : "+revSt);
//     }
// }