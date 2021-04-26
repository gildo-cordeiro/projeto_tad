package principal;

import java.util.ArrayList;
import java.util.List;

import utils.FuncoesCalculo;
import utils.GeneralException;

public class Execute {
	
	static Integer arrayInstancias[] = {10000, 20000, 30000, 40000, 50000};
	
	
	public static void main(String[] args) {
		FuncoesCalculo fc = new FuncoesCalculo();
		PilhaDinamica pilhaDinamica = new PilhaDinamica();
		ListaEncadeadaDinamica listaEncadeadaDinamica = new ListaEncadeadaDinamica();
		
		List<Long> mediasListaAdd = new ArrayList<Long>();
		List<Long> mediasPilhaPush = new ArrayList<Long>();
		
		List<Long> mediasListaBuscar = new ArrayList<Long>();
		List<Long> mediasPilhaPop = new ArrayList<Long>();
		
		try {
			for (int i = 0; i < arrayInstancias.length; i++) {
				mediasListaAdd.add(fc.calcularInstanciasAdd(arrayInstancias[i], listaEncadeadaDinamica));
				mediasPilhaPush.add(fc.calcularInstanciasPush(arrayInstancias[i], pilhaDinamica));
			
				mediasListaBuscar.add(fc.calcularInstanciasBuscar(arrayInstancias[i], listaEncadeadaDinamica));
				mediasPilhaPop.add(fc.calcularInstanciasPop(arrayInstancias[i], pilhaDinamica));
			}
		} catch (GeneralException e) {
			e.printStackTrace();
		}
		
		System.out.println("#### FUNÇÃO ADD/PUSH ###\n");
		for (int i = 0; i < arrayInstancias.length; i++) {
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da lista, resulta em: "+ mediasListaAdd.get(i)+ " nanosegundos");
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da pilha, resulta em: "+ mediasPilhaPush.get(i)+ " nanosegundos");
			System.out.println("--------------------------------------------");
		}
		
		System.out.println("\n#### FUNÇÃO BUSCAR/POP ###\n");
		for (int i = 0; i < arrayInstancias.length; i++) {
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da lista, resulta em: "+ mediasListaBuscar.get(i)+ " nanosegundos");
			System.out.println("Média de instacias x = "+ arrayInstancias[i] +" da pilha, resulta em: "+ mediasPilhaPop.get(i)+ " nanosegundos");
			System.out.println("--------------------------------------------");
		}
	}
}
