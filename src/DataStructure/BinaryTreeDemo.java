package DataStructure;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Demo class to execute tree Apis
 * @author Gaurav M
 *
 */
public class BinaryTreeDemo {

	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<>(1);

		TreeNode<Integer> two = new TreeNode<>(2);
		TreeNode<Integer> three = new TreeNode<>(3);
		TreeNode<Integer> four = new TreeNode<>(4);
		TreeNode<Integer> five = new TreeNode<>(5);
		TreeNode<Integer> six = new TreeNode<>(6);
		TreeNode<Integer> seven = new TreeNode<>(7);

		two.setLeft(four);
		two.setRight(five);

		three.setLeft(six);
		three.setRight(seven);

		root.setLeft(two);
		root.setRight(three);

		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		tree.inOrderTraversal(root);
		tree.preOrderTraversal(root);
		tree.postOrderTraversal(root);
		tree.levelOrderTraversal(root);

	}

}

/**
 * A sort of utility class having different tree traversal apis.
 * @author Gaurav M
 *
 * @param <T>
 */
class BinaryTree<T> {
	public void preOrderTraversal(TreeNode<T> root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void inOrderTraversal(TreeNode<T> root) {
		if (root == null) {
			return;
		} else {
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}

	public void postOrderTraversal(TreeNode<T> root) {
		if (root == null) {
			return;
		} else {
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}

	public void levelOrderTraversal(TreeNode<T> root) {
		if (root == null) {
			return;
		} else {

			Queue<TreeNode> treeQueue = new LinkedList<>();
			treeQueue.offer(root);

			while (!treeQueue.isEmpty()) {
				TreeNode<Integer> temp = treeQueue.poll();

				System.out.println(temp.getData());

				if (temp.getLeft() != null) {
					treeQueue.offer(temp.getLeft());
				}

				if (temp.getRight() != null) {
					treeQueue.offer(temp.getRight());
				}
			}
		}
	}
}

/**
 * Tree Node Class.
 * @author Gaurav M
 *
 * @param <T>
 */
class TreeNode<T> {

	private TreeNode<T> left;
	private TreeNode<T> right;
	private T data;

	TreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}