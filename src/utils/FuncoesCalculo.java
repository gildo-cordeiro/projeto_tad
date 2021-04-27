package utils;

import java.util.Random;

import principal.ListaEncadeada;
import principal.Pilha;
public class FuncoesCalculo {
	
	private Random gerador;
	
	public long calcularInstanciasAdd(Integer instancia, ListaEncadeada obj) {
		long media = 0;
		gerador = new Random();
		
		for (int i = 0; i < instancia; i++) {
			
			Integer numero = gerador.nextInt(instancia);

			long tempoInicial = System.nanoTime();
			obj.add(numero);
			long tempoFinal = System.nanoTime();
			
			media += tempoFinal - tempoInicial;
			
		}

		//System.out.println("Lista: "+media+"\n");
		return media/instancia;
	}
	
	public long calcularInstanciasBuscar(Integer instancia, ListaEncadeada obj){
		long media = 0;
		
		gerador = new Random();
		
		for (int i = 0; i < instancia; i++) {
			
			Integer numero = gerador.nextInt(instancia);

			long tempoInicial = System.nanoTime();
			obj.buscar(numero);
			long tempoFinal = System.nanoTime();
			
			media += tempoFinal - tempoInicial;
			
		}

		//System.out.println("Lista: "+media+"\n");
		return media/instancia;
	}

	 
	public long calcularInstanciasPush(Integer instancia, Pilha obj){
		long media = 0;
		
		gerador = new Random();
		
		for (int i = 0; i < instancia; i++) {
			
			Integer numero = gerador.nextInt(instancia);

			long tempoInicial = System.nanoTime();
			//pilha.push(i);
			obj.push(numero);
			long tempoFinal = System.nanoTime();
			
			media += tempoFinal - tempoInicial;
			
		}
		//System.out.println("Pilha: "+media+"\n");
		return media/instancia;
	}
	
	public long calcularInstanciasPop(Integer instancia, Pilha obj){
		long media = 0;
		
		for (int i = 1; i < instancia; i++) {

			long tempoInicial = System.nanoTime();
			//pilha.pop();
			obj.pop();
			long tempoFinal = System.nanoTime();
			
			media += tempoFinal - tempoInicial;
			
		}
		//System.out.println("Pilha: "+media+"\n");
		return media/instancia;
	}
}
