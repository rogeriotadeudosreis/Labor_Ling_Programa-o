package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1153_Uri_Fatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, fatorial = 0, aux = 0;

		n = teclado.nextInt();
		aux = n;

		if (n > 0 && n < 13) {
			for (int i = 1; i < aux; i++) {

				n = n * (aux - i);

				fatorial = n;

			}

			System.out.printf("%d\n", fatorial);
		}
		teclado.close();
	}
}
