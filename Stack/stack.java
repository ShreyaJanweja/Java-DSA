package Stack;
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    Stack<Integer> st = new Stack<>();
	    for(int i=0; i<n; i++){
	        int x = sc.nextInt();
	        st.push(x);
	    }
        sc.close();
	    System.out.println(st);
	    System.out.println(st.push(90));
	    System.out.println(st.peek());
	    System.out.println(st.pop());
	    System.out.println(st.size());
	    System.out.println(st.isEmpty());
	}
}
