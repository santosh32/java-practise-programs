package ds.singlelinkedlist.first;

public class Node {
	public int data; // data in Node.
	public Node next; // points to next Node in list.

	public Node(int data) {
		this.data = data;
	}

	public void displayNode() {
		System.out.print(data + " ");
	}
}