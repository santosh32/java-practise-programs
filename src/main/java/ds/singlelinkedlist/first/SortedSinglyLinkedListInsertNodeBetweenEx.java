package ds.singlelinkedlist.first;

class LinkedListBetween {
	private Node first; // ref to first link on list

	public LinkedListBetween() {
		first = null;
	}

	/**
	 * Insert Node in Sorted LinkedList (in between of other Nodes). Note:-
	 * Sorted LinkedList is arranged in ascending order.
	 */
	public void insertNodeInSortedLinkedList(int data) {

		Node newNode = new Node(data);

		// Case1: when there is no element in LinkedList
		if (first == null) { // means LinkedList is empty, make first point to
								// new Node.
			first = newNode; // first ---> newNode
			System.out.println("Node with data=" + newNode.data + " inserted at first.");
			return;
		}

		// Case2: when newNode should be placed at first.
		if (first.data >= newNode.data) {
			newNode.next = first;
			first = newNode; // first ---> newNode
			System.out.println("Node with data=" + newNode.data + " inserted at first Node, beacuse newNode is smallest of existing Nodes.");
			return;
		}

		// Case3: when newNode should be at some position other than first.
		Node current = first;
		Node previous = null;

		while (current != null) {
			if (current.data < newNode.data) {
				if (current.next == null) { // means current is last node,
											// insert new node after current.
					current.next = newNode;
					System.out.println("Node with data=" + newNode.data + " inserted successfully at last of LinkedList.");
					return;
				}
				previous = current;
				current = current.next; // move to next node.
			} else {
				newNode.next = previous.next; // make new node's next point to
												// previous node's next
				previous.next = newNode; // make previous nodes' next point to
											// new node.
				System.out.println("Node with data=" + newNode.data + " inserted successfully in middle of LinkedList.");
				return;
			}
		}
	}

	/**
	 * Display Sorted Singly LinkedList
	 */
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList (first--->last): ");
		Node tempDisplay = first; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of
										// list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; // move to next Node
		}
		System.out.println();

	}

}

public class SortedSinglyLinkedListInsertNodeBetweenEx {
	public static void main(String[] args) {
		LinkedListBetween linkedList = new LinkedListBetween(); // creation of
																// Linked List

		linkedList.displayLinkedList(); // display LinkedList
		linkedList.insertNodeInSortedLinkedList(92);
		linkedList.insertNodeInSortedLinkedList(20);
		linkedList.insertNodeInSortedLinkedList(19);
		linkedList.insertNodeInSortedLinkedList(29);
		linkedList.insertNodeInSortedLinkedList(99);
		linkedList.displayLinkedList(); // Again display LinkedList

	}
}

/*
 * OUTPUT
Displaying LinkedList (first--->last):
Node with data=92 inserted at first.
Node with data=20 inserted at first Node, beacuse newNode is smallest of existing Nodes.
Node with data=19 inserted at first Node, beacuse newNode is smallest of existing Nodes.
Node with data=29 inserted successfully in middle of LinkedList.
Node with data=99 inserted successfully at last of LinkedList.
Displaying LinkedList (first--->last): 19 20 29 92 99
 */