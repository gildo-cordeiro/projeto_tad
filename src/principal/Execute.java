package principal;

import java.util.ArrayList;
import java.util.List;

import utils.FuncoesCalculoLista;
import utils.FuncoesCalculoPilha;
import utils.GeneralException;

public class Execute {
	
	static Integer arrayInstancias[] = {1000, 2000, 3000, 4000, 5000, 6000};
	
	
	public static void main(String[] args) {
		PilhaDinamica pilhaDinamica = new PilhaDinamica();
		ListaEncadeadaDinamica listaEncadeadaDinamica = new ListaEncadeadaDinamica();
		
		List<Long> mediasLista = new ArrayList<Long>();
		List<Long> mediasPilha = new ArrayList<Long>();
		
		try {
			for (int i = 1; i < arrayInstancias.length; i++) {
				mediasLista.add(FuncoesCalculoLista.escolherInstanciaLista(arrayInstancias[i], listaEncadeadaDinamica));
				mediasPilha.add(FuncoesCalculoPilha.escolherInstanciaPilha(arrayInstancias[i], pilhaDinamica));
			}
		} catch (GeneralException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i < mediasLista.size(); i++) {
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da lista, resulta em: "+ mediasLista.get(i)+ " nanosegundos");
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da pilha, resulta em: "+ mediasPilha.get(i)+ " nanosegundos");
			System.out.println("--------------------------------------------");
		}
	}
}
