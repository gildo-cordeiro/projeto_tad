package principal;

import java.util.ArrayList;
import java.util.List;

import utils.FuncoesCalculo;

public class Execute {
	
	static Integer arrayInstancias[] = {10000, 20000, 30000, 40000, 50000};
	
	
	public static void main(String[] args) {
		FuncoesCalculo fc = new FuncoesCalculo();
		Pilha pilhaDinamica = new Pilha();
		ListaEncadeada listaEncadeadaDinamica = new ListaEncadeada();
		
		List<Long> mediasListaAdd = new ArrayList<Long>();
		List<Long> mediasPilhaPush = new ArrayList<Long>();
		
		List<Long> mediasListaBuscar = new ArrayList<Long>();
		List<Long> mediasPilhaPop = new ArrayList<Long>();
		
		for (int i = 0; i < arrayInstancias.length; i++) {
			mediasPilhaPush.add(fc.calcularInstanciasPush(arrayInstancias[i], pilhaDinamica));
			mediasPilhaPop.add(fc.calcularInstanciasPop(arrayInstancias[i], pilhaDinamica));

			mediasListaAdd.add(fc.calcularInstanciasAdd(arrayInstancias[i], listaEncadeadaDinamica));
			mediasListaBuscar.add(fc.calcularInstanciasBuscar(arrayInstancias[i], listaEncadeadaDinamica));
		}
		
		System.out.println("#### FUNÇÃO PUSH/POP ###\n");
		for (int i = 0; i < arrayInstancias.length; i++) {
			System.out.println("resulta em: "+ mediasPilhaPush.get(i)+ " nanosegundos");
			System.out.println("resulta em: "+ mediasPilhaPop.get(i)+ " nanosegundos");

			System.out.println("--------------------------------------------");
		}
		
		System.out.println("\n#### FUNÇÃO ADD/BUSCAR ###\n");
		for (int i = 0; i < arrayInstancias.length; i++) {
			System.out.println("resulta em: "+ mediasListaAdd.get(i)+ " nanosegundos");
			System.out.println("resulta em: "+ mediasListaBuscar.get(i)+ " nanosegundos");
			System.out.println("--------------------------------------------");
		}
	}
}
