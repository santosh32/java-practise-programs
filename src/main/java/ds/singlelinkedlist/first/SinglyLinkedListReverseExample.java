package ds.singlelinkedlist.first;

class LinkedList {
	private Node first; // ref to first link on list

	/**
	 * Singly LinkedList constructor
	 */
	public LinkedList() {
		first = null;
	}

	/**
	 * REVERSE linkedList.
	 */
	public void reverseLinkedList() {
		// Using 3 pointers for reversing LinkedList.
		Node previousNode = null;
		Node currentNode = first;
		Node nextNode = first;

		while (nextNode != null) {
			nextNode = nextNode.next; // make nextNode point to next node.
			currentNode.next = previousNode; // make current node's next point
												// to previous node.
			previousNode = currentNode; // make previousNode point to
										// currentNode.
			currentNode = nextNode; // make currentNode point to nextNode.
		}
		// by this stage of program all the nodes are pointing to previous
		// nodes(which has helped us generating reverse of LinkedList.)
		first = previousNode; // now make first point to previous node(i.e. last
								// node).

		System.out.println("LinkedList has been reversed successfully.");
	}

	/**
	 * Insert New Node at first position
	 */
	public void insertFirst(int data) {
		Node newNode = new Node(data); // Creation of New Node.
		newNode.next = first; // newLink ---> old first
		first = newNode; // first ---> newNode
	}

	/**
	 * Display Singly LinkedList
	 */
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList [first--->last]: ");
		Node tempDisplay = first; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

	}

}

public class SinglyLinkedListReverseExample {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.insertFirst(4);
		linkedList.insertFirst(3);
		linkedList.insertFirst(2);
		linkedList.insertFirst(1);

		linkedList.displayLinkedList();
		linkedList.reverseLinkedList(); // REVERSE LinkedList
		linkedList.displayLinkedList();

	}
}
/*OUTPUT

Displaying LinkedList [first--->last]: 1 2 3 4
LinkedList has been reversed successfully.
Displaying LinkedList [first--->last]: 4 3 2 1
 
*/