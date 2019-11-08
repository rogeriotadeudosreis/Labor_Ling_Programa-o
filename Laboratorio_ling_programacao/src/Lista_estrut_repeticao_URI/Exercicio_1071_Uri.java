package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1071_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y;
		int soma = 0;

		x = teclado.nextInt();
		y = teclado.nextInt();

		if (x < y) {

			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}

			}
		} else {
			for (int i = x -1 ; i > y; i--) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		System.out.printf("%d\n", soma);

		teclado.close();
	}
}
