package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1145_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		int x, y;

		System.out.printf("Digite o valor de x:");
		x = teclado.nextInt();
		System.out.printf("Digite o valor de y:");
		y = teclado.nextInt();

		for (int i = 1; i <= y; i++) {
			System.out.print(i);

			if (i % x == 0)System.out.println("");

				
			else System.out.print(" ");
		}

		teclado.close();
	}
}
