package Estrutura_Condicional_2_Uri;

import java.util.Scanner;

public class Exercicio_2057_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int saida;
		int tempo;
		int fuso;
		int chegada = 0;

		
		saida = teclado.nextInt();
		
		tempo = teclado.nextInt();
		
		fuso = teclado.nextInt();

		chegada = saida + tempo + fuso;
		
		if (chegada >= 24)
			chegada = chegada - 24;

		else if (chegada < 0) {
			chegada = chegada + 24;
		}

		System.out.printf("%d\n", chegada);

	}
}
