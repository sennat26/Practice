import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1 -> 5 
 * 2 -> 5 
 * 3 -> 5 
 * 4 -> 5 
 * 5 -> 1 
 */

enum Color{
	BLACK,GREY,WHITE;
}
public class Graph {
	public Color color;
	public int neighbor;
	public int nodeId;
	public Graph(int nodeId,int neighbor){
		this.nodeId = nodeId; 
		this.neighbor = neighbor;
		this.color = Color.WHITE;
	}
	static int count;
	static ArrayList<Graph> nodes = new ArrayList<Graph>();
	
	public static void DFS(int nodeId){
		Graph g = nodes.get(nodeId);
		if (g.color != Color.WHITE)
			return ;
		g.color = Color.GREY;
		if(g.nodeId == 0 && g.neighbor == 0){
			g.color = Color.BLACK;
			return;
		}
		if(g.neighbor != 0 && (g.neighbor == g.nodeId|| nodes.get(g.neighbor).color == Color.GREY)){
			count++;
		}else if(g.neighbor == 0) {
			return;
		}else if(nodes.get(g.neighbor).color == Color.BLACK )
			return;
		DFS(g.neighbor);
		g.color = Color.BLACK;
		
	}
	public static void main(String[] args) {
		
		String g = "abc";
		System.out.println(g.toCharArray().length);
		if ('e' < 'd') {
			System.out.println("equal");
		}
		System.out.println(Math.floor(4.1));
		double a = 1.2;
		int b1 = (int)a;
		System.out.println(b1);
		String s = "";
		s.toCharArray();
		s.toLowerCase();
		
		boolean[][] b = new boolean[3][2];
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		Scanner in = new Scanner(System.in);
		int noOfNodes = in.nextInt();
		int i=0;
		while(i < noOfNodes){
			int destination = in.nextInt();
			nodes.add(new Graph(i,destination-1));
			++i;
		}
		i = 0;
		while(i<noOfNodes){
			DFS(i);
			++i;
		}
		System.out.println(count);
	}
}