package principal;

public class ListaEncadeada {
	private Node first = null, last = null; 
	
	//Busca exaustiva
	public void buscar(int value)	{
		Node n = first;
		
		while ((n != null) && (n.getData() != value)){
			n = n.getNext();
		}
	}
   
	
	public void add(Integer value){
		//declaramos e instanciamos a variavel newNode do tipo Node. seu anterior vai ser 
		//o fim pois estamos inserindo depois do fim
		Node newNode = new Node(value);
		
		if (first==null)
			first = last = newNode;
		else{
			//seta prox do Node do fim para receber newNode
			last.setNext(newNode);
			last = newNode;
		}
	}
}
