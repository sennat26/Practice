import java.util.ArrayList;
import java.util.List;

class Node {
	int x;
	Node next;
}
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		ListExample example = new ListExample();
		Node head1 = example.createList(list);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		Node head2 = example.createList(list2);
		Node first = head1;
		Node temp1 = null;
		Node temp2 = null;
		
		while (head1 != null && head2 != null) {
			temp1 = head1.next;
			temp2 = head2.next;
			head1.next = head2;
			head2.next = temp1;
			head1 = temp1;
			head2 = temp2;
		}
		printList(first);
	}
	
	
	private static void printList(Node head1) {
		// TODO Auto-generated method stub
		Node n = head1;
		while (n != null) {
			System.out.println(n.x);
			n = n.next;
		}
	}


	public Node createList(List<Integer> list) {
		Node head = null;
		Node next = null;
		 for (int i = list.size() - 1; i >= 0; i--) {
			Node n = new Node();
			n.x = list.get(i);
			n.next = next;
			next = n;
		}
		 head = next;
		
		return head;
	}

}
