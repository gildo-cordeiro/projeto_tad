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
            size++;
        } else {
			throw new GeneralException("ERRO: Elemento Invalido!");
		}
    }

    // LIFO - Last In First Out
    public void pop() throws GeneralException{
        if (!isEmpty()){
            head = head.getNext();
            size--;
        }else{
           throw new GeneralException("ERRO: Pilha Vazia!");
        }
        
    }

    public boolean isEmpty() {
        if (head==null)
            return true;
        return false;
    }

    public int size() {
        return size;
    }

    public Integer top() throws GeneralException{
        if (isEmpty())
            throw new GeneralException("ERRO: Pilha Vazia!");
        return head.getData();
    }
    
    public void print(){
        Node temp = head;
        int count = 1;
        while(temp!=null){
            System.out.println("Posição " + count + " - Valor: " + temp.getData());
            temp=temp.getNext();
            count++;
        }

    }
    
}