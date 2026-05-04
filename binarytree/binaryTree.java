// package binarytree;
// import java.util.*;

//preorder = root, left, right
// class Node{
//     int data;
//     Node left;
//     Node right;
    
//     Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// public class binaryTree{
//     static int idx = -1;
//     public static Node buildTree(int[] nodes){
//         idx++;
//         if(nodes[idx]==-1) return null;
//         Node newNode = new Node(nodes[idx]);
//         newNode.left = buildTree(nodes);
//         newNode.right = buildTree(nodes);
//         return newNode;
//     }
//     public static void preorder(Node root){
//         if(root == null){
//             System.out.print("-1 ");
//             return;
//         }
//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void main(String args[]){
//         // - for user input
//         // Scanner sc = new Scanner(System.in);
//         // int n=sc.nextInt();
//         // int[] nodes = new int[n];
//         // for(int i=0; i<n; i++){
//         //     nodes[i]=sc.nextInt();
//         // }
//         int[] nodes = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
//         Node root = buildTree(nodes);
//         preorder(root);
//     }
// }




// //inorder = left, root, right
// import java.util.*;

// class Node{
//     int data;
//     Node left;
//     Node right;
    
//     Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// class BinaryTree{
//     static int idx = -1;
//     public static Node buildTree(int[] nodes){
//         idx++;
//         if(nodes[idx]==-1) return null;
//         Node newNode = new Node(nodes[idx]);
//         newNode.left = buildTree(nodes);
//         newNode.right = buildTree(nodes);
//         return newNode;
//     }
//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }
//     public static void main(String args[]){
//         int[] nodes = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
//         Node root = buildTree(nodes);
//         inorder(root);
//     }
// }




// //postorder = left, right, root
// import java.util.*;

// class Node{
//     int data;
//     Node left;
//     Node right;
    
//     Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }
// class BinaryTree{
//     static int idx = -1;
//     public static Node buildTree(int[] nodes){
//         idx++;
//         if(nodes[idx]==-1) return null;
//         Node newNode = new Node(nodes[idx]);
//         newNode.left = buildTree(nodes);
//         newNode.right = buildTree(nodes);
//         return newNode;
//     }
//     public static void postorder(Node root){
//         if(root == null){
//             return;
//         }
//         postorder(root.left);
//         System.out.print(root.data+" ");
//         postorder(root.right);
//     }
//     public static void main(String args[]){
//         int[] nodes = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
//         Node root = buildTree(nodes);
//         postorder(root);
//     }
// }