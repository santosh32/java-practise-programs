package ds.singlelinkedlist.first;

/**
 * Singly LinkedList class
 */
class LinkedListFirst {
	private Node first; // ref to first link on list

	public LinkedListFirst() {
		first = null;
	}

	/**
	 * Insert New Node at first position in Singly LinkedList
	 */
	public void insertFirst(int data) {
		Node newNode = new Node(data); // Creation of New Node.
		newNode.next = first; // newLink ---> old first
		first = newNode; // first ---> newNode
	}

	/**
	 * Deletes first Node of Singly LinkedList
	 */
	public Node deleteFirst() {
		if (first == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node deleteNode = first; // save reference to first Node in tempNode- so
								// that we could return saved reference.
		first = first.next; // delete first Node (make first point to second
							// node)
		return deleteNode; // return tempNode (i.e. deleted Node)
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

public class SinglyLinkedListInsertDeleteFirstEx {
	public static void main(String[] args) {
		LinkedListFirst linkedList = new LinkedListFirst(); // creation of Linked List

		linkedList.insertFirst(11);
		linkedList.insertFirst(21);
		linkedList.insertFirst(59);
		linkedList.insertFirst(14);
		linkedList.insertFirst(39);

		linkedList.displayLinkedList(); // display LinkedList

		System.out.print("Deleted Nodes: ");
		Node deletedNode = linkedList.deleteFirst(); // delete Node
		deletedNode.displayNode(); // display deleted Node.
		deletedNode = linkedList.deleteFirst(); // delete Node.
		deletedNode.displayNode(); // display deleted Node.

		System.out.println();// sysout used to format output
		linkedList.displayLinkedList(); // Again display LinkedList

	}
}

/*
 * OUTPUT
 * 
 * Displaying LinkedList [first--->last]: 39 14 59 21 11 Deleted Nodes: 39 14
 * Displaying LinkedList [first--->last]: 59 21 11
 * 
 */