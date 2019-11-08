package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1113_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x, y;

		do {
			x = teclado.nextInt();
			y = teclado.nextInt();

			if (x > y) {

				System.out.print("Decrescente\n");
			} else if (x < y) {
				System.out.print("Crescente\n");
			}

		} while (x != y);

		teclado.close();
	}
}
