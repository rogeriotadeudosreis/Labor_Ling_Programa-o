package Lista_estrut_repeticao_URI;


import java.util.Scanner;

public class Exercicio_1065_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont = 0;
		int n = 5;
		int valor;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o valor de n:");
			valor = teclado.nextInt();
			if (valor % 2 == 0) {
				cont++;
			}

		}
		System.out.printf("%d valores pares\n", cont);

		teclado.close();
	}

	
}
