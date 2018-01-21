package ds.singlelinkedlist.first;

class LinkedListDeleteSpecificNode {
	private Node first; // ref to first link on list

	/**
	 * LinkedList constructor
	 */
	public LinkedListDeleteSpecificNode() {
		first = null;
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
	 * Method deletes specific Node from Singly LinkedList in java.
	 */
	public Node deleteSpecificNode(int deleteKey) {

		// Case1: when there is no element in LinkedList
		if (first == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}

		// Case2: when there is only one element in LinkedList- check whether we
		// have to delete that Node or not.
		if (first.data == deleteKey) { // means LinkedList consists of only one
										// element, delete that.
			Node tempNode = first; // save reference to first Node in tempNode-
									// so that we could return saved reference.
			first = first.next;
			System.out.println("Node with data=" + tempNode.data + " was found on first and has been deleted.");
			return tempNode; // return deleted Node.
		}

		// Case3: when there are atLeast two elements in LinkedList
		Node previous = null;
		Node current = first;
		while (current != null) {
			if (current.data == deleteKey) {
				System.out.println("Node with data=" + current.data + " has been deleted.");
				previous.next = current.next; // make previous node's next point
												// to current node's next.
				return current; // return deleted Node.
			} else {
				if (current.next == null) { // Means Node wasn't found.
					System.out.println("Node with data=" + deleteKey + " wasn't found for deletion.");
					return null;
				}
				previous = current;
				current = current.next; // move to next node.
			}
		}
		return null;
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

public class SinglyLinkedListDeleteNodeEx {
	public static void main(String[] args) {
		LinkedListDeleteSpecificNode linkedList = new LinkedListDeleteSpecificNode(); // creation
																						// of
																						// Linked
																						// List

		linkedList.insertFirst(92);
		linkedList.insertFirst(20);
		linkedList.insertFirst(19);
		linkedList.insertFirst(29);
		linkedList.displayLinkedList(); // display LinkedList

		linkedList.deleteSpecificNode(29);
		linkedList.deleteSpecificNode(11);
		linkedList.displayLinkedList(); // Again display LinkedList

	}
}

/*OUTPUT

Displaying LinkedList [first--->last]: 29 19 20 92
Node with data=92 has been deleted.
Node with data=11 wasn't found for deletion.
Displaying LinkedList [first--->last]: 29 19 20
 
*/