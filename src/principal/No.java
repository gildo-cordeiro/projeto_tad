package principal;

public class No {
	private Integer data;
	private No next;

	public No(Integer d){
	    this.data = d;
	    this.next = null;
	}

	public Integer getData() {
	    return data;
	}

	public void setData(Integer data) {
	    this.data = data;
	}

	public No getNext() {
	    return next;
	}

	public void setNext(No next) {
	    this.next = next;
	}
}
