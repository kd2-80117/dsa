
public class BSTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			root = nn;
		else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = nn;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = nn;
						break;
					} else
						trav = trav.right;

				}
			}

		}
	}

	public void addNodes(int value) {
		addNode(value);
	}

	private void recursiveAddNode(int value, Node trav) {
		Node nn = new Node(value);
		if (root == null)
			root = nn;
		else {
			
			if (trav.data > value) {
				if (trav.left == null) {
					trav.left = nn;
					return;
				}

				recursiveAddNode(value, trav.left);
			} else {
				if (trav.right == null) {
					trav.right = nn;
					return;
				}

				recursiveAddNode(value, trav.right);
			}
		}
	}

	public void recursiveAddNode(int value) {
		recursiveAddNode(value, root);
	}

	private void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" "+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void preOrder() {
		preOrder(root);
	}

	private void postOrder(Node trav) {
		if (isEmpty())
			return;

		preOrder(trav.left);
		preOrder(trav.right);
		System.out.print(" "+trav.data);
	}

	public void postOrder() {
		postOrder(root);
	}

	private void inOrder(Node trav) {
		if (trav==null)
			return;

		preOrder(trav.left);
		System.out.print(" "+trav.data);
		preOrder(trav.right);
	}

	public void inOrder() {
		inOrder(root);
	}

}
