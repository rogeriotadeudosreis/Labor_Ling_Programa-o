package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1078_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, tabuada = 0;

		n = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {

			tabuada = i * n;

			System.out.printf("%d x %d = %d\n", i, n, tabuada);

		}

		teclado.close();
	}
}
