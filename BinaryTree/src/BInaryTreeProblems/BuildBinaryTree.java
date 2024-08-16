package BInaryTreeProblems;

public class BuildBinaryTree {

	static class Node {
	       int data;
	       Node left;
	       Node right;
	 
	       Node(int data) {
	           this.data = data;
	           this.left = null;
	           this.right = null;
	       }
	}
	 
	   static class BinaryTree {
	       static int idx = -1;
	       public static Node buildTree(int nodes[]) {
	           idx++;
	           if(nodes[idx] == -1) {
	               return null;
	           }
	           Node newNode = new Node(nodes[idx]); 
	           newNode.left = buildTree(nodes);
	           newNode.right = buildTree(nodes);
	           return newNode;
	       }
	      
	   }
	   public static void main(String args[]) {
	       int nodes[] = {1 , 3 , 5 , 6 , -1 , -1 , 7 , -1 , -1 , 4 , -1 , -1, 2 , -1 , -1};
	       BinaryTree tree = new BinaryTree();
	
	       Node root = tree.buildTree(nodes);
	      // System.out.println(root.left.left.data);
	       preorder(root);
	       System.out.println();
	       inorder(root);
	       System.out.println();
	       postorder(root);
	       System.out.println();
	       System.out.println(countNode(root));
	       System.out.println(countsum(root));
	       System.out.println(height(root));
	       System.out.println(diameter(root));
	       System.out.println(diameter1(root));
	       System.out.println(IsBalnced(root));
	       
	   }
	   public static void postorder(Node root) {
	       if(root == null) {
	          
	           return;
	       }
	       
	       preorder(root.left);
	       preorder(root.right);
	       System.out.print(root.data+" ");
	   }
	   public static void inorder(Node root) {
	       if(root == null) {
	          
	           return;
	       }
	       
	       preorder(root.left);
	       System.out.print(root.data+" ");
	       preorder(root.right);
	   }
	   public static void preorder(Node root) {
	       if(root == null) {
	          
	           return;
	       }
	       System.out.print(root.data+" ");
	       preorder(root.left);
	       preorder(root.right);
	   }
	   public static int countNode(Node root) {
		  
		   if(root == null) return 0;
		   
		   int left = countNode(root.left);
		   int right = countNode(root.right);
		   
		   int count = (left+right)+1;
		return count;
	   }
	   public static int countsum(Node root) {
			  
		   if(root == null) return 0;
		   
		   int left = countsum(root.left);
		   int right = countsum(root.right);
		   
		   int sum = left+right+root.data;
		return sum;
	   }
	   public static int height(Node root) {
		   
		   if(root == null)return 0;
		   
		   int left = height(root.left);
		   int  right = height(root.right);
		   
		   return Math.max(left, right)+1;
		  
	   }
	   public static int diameter(Node root) {
		   // take time complexity o(n2)
		   if(root == null)return 0;
		   
		   int dia1 = diameter(root.left); // finding diam by considering root also
		   int dia2 = diameter(root.right);
		   
		   int dia3 = height(root.left)+height(root.right)+1;
		   
		   return Math.max(Math.max(dia1, dia2), dia3);
		   
	   }
	   public static int diameter1(Node root) {
		   // take o(n) complexity solve using leetcode approach without considering root
		   int diameter[] = new int [1];
		   
		   dia(root, diameter);
		   return diameter[0];
	   }
	private static int dia(Node root, int[] diameter) {
		if(root == null) return 0;
		
		int left = dia(root.left, diameter);
		
		int right = dia(root.right, diameter);
		
		diameter[0] = Math.max(diameter[0],left+right);
		
		return Math.max(left, right)+1;
		
	}
	public static boolean IsBalnced(Node root) {
		return dfs(root) != -1;
	}
	private static int dfs(Node root) {

		if(root == null)return 0;
		
		int left = dfs(root.left);
		if(left == -1) return -1;
		
		int right = dfs(root.right);
		if (right == -1) return -1;
		
		if(Math.abs(left-right)>1) {
			return-1;
		}
		return Math.max(left, right)+1;
	}
	  
}
