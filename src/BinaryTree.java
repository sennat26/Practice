import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Tree {
	int data;
	Tree left;
	Tree right;
}


public class BinaryTree {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("binary.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = bufferedReader.readLine();
		
		
		int[] inorder = createArray(line);
		line = bufferedReader.readLine();
		int[] postorder = createArray(line);
		
//		int[] inorder = {4,2,7,5,8,1,3,9,6,11,10};
//		int[] postorder = {4,7,8,5,2,9,11,10,6,3,1};
		
		
		Tree root = contructTree(inorder, postorder,0,inorder.length-1,0,postorder.length-1);
		Queue<Tree> bfs = new LinkedList<Tree>();
		bfs.add(root);
		while (!bfs.isEmpty()) {
			Tree temp = bfs.poll();
			if (temp!=null) {
			System.out.print(temp.data + ",");
			bfs.add(temp.left);
			bfs.add(temp.right);
			}
		}
		
	}

	private static int[] createArray(String line) {
		// TODO Auto-generated method stub
		String[] split = line.split(",");
		int[] arr = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		return arr;
	}

	private static Tree contructTree(int[] inorder, int[] postorder, int instart, int inend,
			int poststart, int postend) {
		// TODO Auto-generated method stub
		
		if (instart <= inend || poststart <= postend) {
		int data = postorder[postend];
		Tree root = createNode(data);
		//System.out.println(data + ",");
		
		int index = findIndex(inorder, data);
		
		root.left = contructTree(inorder, postorder, instart, index-1, poststart, poststart+index-instart-1);
		//System.out.println(root.left.data + ",");
		root.right = contructTree(inorder, postorder, index+1, inend, poststart+index-instart, postend-1);
//		System.out.println(root.right.data + ",");
		return root;
		}
		return null;
	}

	private static int findIndex(int[] inorder, int data) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == data) {
				return i;
			}
		}
		
		return -1;
	}

	private static Tree createNode(int data) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.data = data;
		return tree;
	}
	
	


}
