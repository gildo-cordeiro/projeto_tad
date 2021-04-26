package principal;

import utils.GeneralException;

public class PilhaDinamica {
    
    private Node head;
    private int size = 0;
    
    @SuppressWarnings("unused")
	public void push(Integer element) throws GeneralException{
        if (element > 0 || element!=null){
            Node no = new Node(element);
            
            no.setNext(head);
            head = no;
            setSize(getSize() + 1);
        } else {
			throw new GeneralException("ERRO: Elemento Invalido!");
		}
    }

    // LIFO - Last In First Out
    public void pop() throws GeneralException{
        if (head!=null){
            head = head.getNext();
            setSize(getSize() - 1);
        }else{
           throw new GeneralException("ERRO: Pilha Vazia!");
        }
        
    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
    
}