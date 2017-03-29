package HR18thDec;

public class BSTDemo {


	boolean checkBST(Node root) {
		boolean isBST = false;
		
		
			
		
		return isBST;
		
        
    }

}

class BinaryTree {
	Node root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public boolean isEmpty () {
		return root == null;
	}
	
	public void insertData(int data) {
		root = insert(root, data);
	}
	
	public boolean search(int value) {
		
		return isDuplicate(root, value, 0);
	}
	
	private boolean isDuplicate(Node root, int value, int valuePresentCount) {
		if (root.getData() == value) {
			valuePresentCount++;
		} 
		
		if (root.getLeft() != null) {
			isDuplicate(root.getLeft(), value, valuePresentCount);
		} 
		
		if (root.getRight() != null) {
			isDuplicate(root.getRight(), value, valuePresentCount);
		} 
		return valuePresentCount > 1;
	}
	
	public Node insert(Node node, int data) {
		if (node == null) {
			return new Node(data);
		} else {
				if (node.getRight() == null) {
					node.right = insert(node.right, data);
				} else {
					node.left = insert(node.left, data);
				}
				
				return node;
		}
	}
	
	public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

}


//The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
        
        Node() {
        	
        }
        
        Node(final int data) {
        	new Node(null, null, data);
        }
        
        Node(final Node left, final Node right, final int data) {
        	this.left = left;
        	this.right = right;
        	this.data = data;
        }

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
        
        
        
     }