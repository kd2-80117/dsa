
public class A5_Q4_Main {
	public static void main(String[] args) {
		BSTree bst = new BSTree();

		bst.addNodes(8);
		bst.addNodes(3);
		bst.addNodes(10);
		bst.addNodes(1);
		bst.addNodes(6);
		bst.recursiveAddNode(14);
		bst.recursiveAddNode(4);
		bst.recursiveAddNode(7);
		bst.recursiveAddNode(13);
		System.out.println("PreOrder : ");
		bst.preOrder();
		System.out.println();
		System.out.println("Inorder : ");
		bst.inOrder();
		System.out.println();
		System.out.println("PostOrder : ");
		bst.postOrder();

		// bst.DFSTraversal();
		// bst.BFSTraversal();

		/*
		 * BSTree.Node ret = bst.binarySearch(15); if(ret != null)
		 * System.out.println("Key is found"); else
		 * System.out.println("Key is not found");
		 */
		// bst.inOrder();
		// bst.deleteNode(8);
		// bst.inOrder();

		// System.out.println("Height : " + bst.height());
	}
}
