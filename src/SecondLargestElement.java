


public class SecondLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode();
		SecondLargestElement obj = new SecondLargestElement();
		if (root != null)
			System.out.println(obj.getSecondLargestElement(root));

	}
	
	
	private int getSecondLargestElement(TreeNode root) {
		
		int secondMax = 0;
		TreeNode curr = root;
		TreeNode prev = root;
		while (curr.right != null) {
			
			prev = curr;
			curr = curr.right;
			
		} 
		
		if (curr.left != null) {
			curr = curr.left;
			while(curr.right != null) {
				curr = curr.right;
			}
			secondMax = curr.x;	
		} else {
			if (root.left == null && root.right == null) {
				System.out.println("Their is only one element");
			}
		}
		
		
		return secondMax;
	}

}
class TreeNode {
	int x;
	TreeNode left;
	TreeNode right;
}