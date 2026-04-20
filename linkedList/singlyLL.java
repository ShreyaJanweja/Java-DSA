package linkedList;

// //SINGLY LINKED LIST 
// //1. insertion au the end
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// class LinkedList{
//     Node head;
//     void add(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//         }
//         else{
//             Node temp = head;
//             while(temp.next!=null){
//                 temp=temp.next;
                
//             }
//             temp.next = newNode;
//         }
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
// }
// public class Main
// {
// 	public static void main (String[] args)
// 	{
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	    LinkedList list = new LinkedList();
// 	    for(int i=0; i<n; i++){
// 	        int num = sc.nextInt();
// 	        list.add(num);
// 	    }
// 	    list.display();
// 	    sc.close();
// 	}
// }





// //insert at beginning
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//         void add(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//         }
//         else{
//             Node temp = head;
//             while(temp.next!=null){
//                 temp=temp.next;
                
//             }
//             temp.next = newNode;
//         }
//     }
//        void insertAtBegin(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next = head;
//         head=newNode;
//         return;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
    
// }
// class Main
// {
// 	public static void main (String[] args)
// 	{
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	    LinkedList list = new LinkedList();
// 	    for(int i=0; i<n; i++){
// 	        int num = sc.nextInt();
// 	        list.add(num);
// 	    }
// 	    System.out.println("before insertAtBegin: ");
// 	     list.display();
// 	    int newNum=sc.nextInt();
// 	    list.insertAtBegin(newNum);
// 	    System.out.println("after insertAtBegin: ");
// 	    list.display();
// 	    sc.close();
// 	}
// }




// //insert at specific position
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
    
    
//     void insertAtPosition(int data,int pos){
//         Node newNode = new Node(data);
//         //pos == 0 - in the beginning
//         if(pos==0){
//             newNode.next=head;
//             head=newNode;
//         }
//         //at specific position
//         Node temp = head;
//         for(int i=0; i<pos-1; i++){
//             if(temp==null){
//                 return;
//             }
//             temp=temp.next;
//         }
//         if(temp==null){
//             return;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
    
    
//         void add(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//         }
//         else{
//             Node temp = head;
//             while(temp.next!=null){
//                 temp=temp.next;
                
//             }
//             temp.next = newNode;
//         }
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
    
// }
// class Main
// {
// 	public static void main (String[] args)
// 	{
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	    LinkedList list = new LinkedList();
// 	    for(int i=0; i<n; i++){
// 	        int num = sc.nextInt();
// 	        list.add(num);
// 	    }
// 	    System.out.println("before : ");
// 	     list.display();
// 	    int newNum=sc.nextInt();
// 	    int pos = sc.nextInt();
// 	    System.out.println("after : ");
// 	    list.insertAtPosition(newNum,pos);
// 	    list.display();
// 	    sc.close();
// 	}
// }

