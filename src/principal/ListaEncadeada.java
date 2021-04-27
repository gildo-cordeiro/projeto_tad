package principal;

public class ListaEncadeada {
	private Node first = null, last = null; 
	
	public void buscar(int value)	{
		Node n = first;
		
		while ((n != null) && (n.getData() != value)){
			n = n.getNext();
		}
	}
   
	
	public void add(Integer value){
		Node newNode = new Node(value);
		
		if (first==null)
			first = last = newNode;
		else{
			last.setNext(newNode);
			last = newNode;
		}
	}
}
