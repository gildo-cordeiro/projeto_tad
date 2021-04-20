package principal;

import utils.GeneralException;

public class ListaEncadeadaDinamica {
	private No head, tail;
    private int size=1;
    
    public ListaEncadeadaDinamica(){}
    
    
    @SuppressWarnings("unused")
	public void add(Integer element, int position) throws GeneralException {
        if (element > 0 || element!=null){
            
            No no = new No(element);
        
            if (head==null)
                head = tail = no;
            else{
                switch (position){
                    case -1:
                        tail.setNext(no);
                        tail = no;
                        break;
                    
                    case 0:
                        no.setNext(head);
                        head = no;
                        break;
                    
                    default:
                        if (position>size){
                            add(element, -1);
                        }
                        else{
                            No previous = head;
                            for (int i=1;i<position-1;i++){
                                previous = previous.getNext();
                            }
                            No next = previous.getNext();
                            no.setNext(next);
                            previous.setNext(no);
                            previous = next = null;
                        }
                        break;
                }
                size++;
            }
        }else{
            throw new GeneralException("ERRO: Elemento Nulo!");
        }
        
        
    }

    public void remove(int position) throws GeneralException {        
    	if (!isEmpty()){
            No previous = head;
            switch (position){
                case -1:
                    while (previous.getNext()!=tail){
                        previous = previous.getNext();
                    }
                    previous.setNext(null);
                    tail = previous;
                    break;
                
                case 0:
                    head = head.getNext();
                    break;
                
                default:
                    if (position>size)
                        remove(-1);
                    else{
                        for (int i=1;i<position-1;i++){
                            previous = previous.getNext();
                        }
                        No next = previous.getNext().getNext();
                        previous.setNext(next);
                    }
                    break;
            }
            size--;
        }
        else{
            throw new GeneralException("ERRO: Lista Vazia!");
        }
        
    }

    public boolean isEmpty() {
       if (head==null)
           return true;
       return false;
    }

    public int size() {
        return this.size;
    }

//    public Integer show(int position) throws GeneralException {
//        if (!isEmpty() && position<=size){
//            No temp = head;
//            for (int i=1;i<=position;i++){
//                if (i!=position)
//                    temp = temp.getNext();
//            }
//            return temp.getData();
//        
//        }
//        else if (position>size){
//            throw new GeneralException("Posição invalida!");
//        }
//        else 
//        	throw new GeneralException("Lista Vazia!");
//    }
//    
//    public void print(){
//        No d = head;
//        int count = 1;
//        while(d!=null){
//            System.out.println("Posição " + count + " - Valor: " + d.getData());
//            d=d.getNext();
//            count++;
//        }
//    }
}
