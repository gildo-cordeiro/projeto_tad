package principal;

public class Pilha {
    
    private Node head;
    
	public void push(Integer value){
        if (value > 0 || value!=null){
            Node no = new Node();
            
            no.setNext(head);
            head = no;
        }
    }

    // LIFO - Last In First Out
    public void pop(){
        if (head!=null)
            head = head.getNext();      
    }    
}