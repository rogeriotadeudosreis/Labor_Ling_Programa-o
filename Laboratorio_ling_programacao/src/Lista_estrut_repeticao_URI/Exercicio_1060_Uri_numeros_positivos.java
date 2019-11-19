package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1060_Uri_numeros_positivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, positivos = 0;
		double numero;

		for (i = 0; i < 6; i++) {
			System.out.printf("Digite um número:");
			numero = teclado.nextDouble();
			do {
				if (numero == 0) {
					System.out.println("Número inválido, digite novamente:");
					numero = teclado.nextDouble();
				}

			} while (numero == 0);

			if (numero > 0) {
				positivos++;
				
			}
			
		}
		System.out.printf("%d valores positivos\n", positivos);
		

		teclado.close();
	}

}
