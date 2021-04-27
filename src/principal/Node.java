package principal;

public class Node {
	private Integer data;
	private Node next, previous;

	public Node(Integer d){
	    this.data = d;
	    this.next = null;
	}
	
	public Node() {}

	public Integer getData() {
	    return data;
	}

	public void setData(Integer data) {
	    this.data = data;
	}

	public Node getNext() {
	    return next;
	}

	public void setNext(Node next) {
	    this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
