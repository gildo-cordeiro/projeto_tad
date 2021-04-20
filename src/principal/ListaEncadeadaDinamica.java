package principal;

import utils.GeneralException;

public class ListaEncadeadaDinamica {
	private Node first = null, last = null;   
	
	public boolean Procura(Integer value){
      Node aux = getfirst();      
      while(aux != null){
         if(value.equals(aux.getData())){
            return true;
         }
         aux = aux.getNext();
      }
      return false;
	}
   
	public void add(Integer value) throws GeneralException{
		Node newNode = new Node(value);    
	      
		if(last == null){  
			newNode.setData(value);
            first = newNode;
            last = newNode;         
         }else{
            last.setNext(newNode);
            newNode.setData(value);
            last = newNode;
        }
	}
	

	public void setfirst(Node first) {
		this.first = first;
	}
	
	public Node getfirst() {
		return first;
	}
	
	public void setlast(Node last) {
		this.last = last;
	}
	
	public Node getlast() {
		return last;
	}
}
