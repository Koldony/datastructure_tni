public class BSTApp1 {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println();
		System.out.println("Minimum node is " + tree.findMinimum(tree.getRoot()));
		System.out.println("Maximum node is " + tree.findMaximum(tree.getRoot()));
		
		int target = 15;
		System.out.println("The " + target + " in BST => " + tree.findSpecifData(target));
		
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		
		System.out.println();
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
	}
}