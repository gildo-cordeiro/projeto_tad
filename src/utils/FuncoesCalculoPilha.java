package utils;

import java.util.Random;

import principal.PilhaDinamica;

public class FuncoesCalculoPilha {

	public static long escolherInstanciaPilha(Integer instancia, PilhaDinamica obj) throws GeneralException {
		Random gerador = new Random();
		long media = 0;
		
		for (int i = 0; i < instancia; i++) {
			
			Integer numero = gerador.nextInt(instancia);

			long tempoInicial = System.nanoTime();
			obj.push(numero);
			long tempoFinal = System.nanoTime();
			
			media += (tempoFinal - tempoInicial)/instancia;
			
		}
		
		return media;
	}
}
