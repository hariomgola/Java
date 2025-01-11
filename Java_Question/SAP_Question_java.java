package Java_Question;

public class SAP_Question_java {
	static int maxValue = 0;

	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			super();
			this.data = data;
		}
	}

	private static TreeNode createNewNode(int data) {
		return new TreeNode(data);
	}

	public static void main(String[] args) {
		// creating the tree
		TreeNode root = createNewNode(1);
		TreeNode rootA = createNewNode(2);
		TreeNode rootB = createNewNode(3);
		TreeNode rootC = createNewNode(4);
		TreeNode rootD = createNewNode(18);
		TreeNode rootE = createNewNode(9);
		TreeNode rootF = createNewNode(10);
		TreeNode rootG = createNewNode(6);

		// mapping the node
		root.left = rootA;
		root.right = rootB;

		rootA.left = rootC;
		rootA.right = rootD;

		rootB.left = rootE;
		rootB.right = rootF;

		rootF.right = rootG;
		// call
		checkForMaxValue(root);
	}

	public static void checkForMaxValue(TreeNode node) {
		if (node == null) {
			return;
		}
		if (node.data > maxValue) {
			maxValue = node.data;
		}
		checkForMaxValue(node.left);
		checkForMaxValue(node.right);

	}
}
