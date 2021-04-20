package principal;

import java.util.ArrayList;
import java.util.List;

import utils.FuncoesCalculo;
import utils.GeneralException;

public class Execute {
	
	static Integer arrayInstancias[] = {1000,2000, 3000, 4000, 5000};
	
	
	public static void main(String[] args) {
		PilhaDinamica pilhaDinamica = new PilhaDinamica();
		ListaEncadeadaDinamica listaEncadeadaDinamica = new ListaEncadeadaDinamica();
		
		List<Long> mediasLista = new ArrayList<Long>();
		List<Long> mediasPilha = new ArrayList<Long>();
		
		try {
			for (int i = 0; i < arrayInstancias.length; i++) {
				mediasLista.add(FuncoesCalculo.escolherInstanciaLista(arrayInstancias[i], listaEncadeadaDinamica));
				mediasPilha.add(FuncoesCalculo.escolherInstanciaPilha(arrayInstancias[i], pilhaDinamica));
			}
		} catch (GeneralException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < mediasLista.size(); i++) {
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da lista, resulta em: "+ mediasLista.get(i)+ " nanosegundos");
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da pilha, resulta em: "+ mediasPilha.get(i)+ " nanosegundos");
			System.out.println("--------------------------------------------");
		}
	}
}
