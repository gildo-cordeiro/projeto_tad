package utils;

import java.util.Random;

import principal.ListaEncadeadaDinamica;
public class FuncoesCalculoLista {
	
	public static long escolherInstanciaLista(Integer instancia, ListaEncadeadaDinamica obj) throws GeneralException {
		Random gerador = new Random();
		long media = 0;
		
		for (int i = 0; i < instancia; i++) {
			
			Integer numero = gerador.nextInt(instancia);

			long tempoInicial = System.nanoTime();
			obj.add(numero);
			long tempoFinal = System.nanoTime();
			
			media += (tempoFinal - tempoInicial)/instancia;
			
		}
		
		return media;
	}
}
