package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1064_repeticao {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		int n = 6;
		int cont = 0;
		double media = 0, soma = 0, valor;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um valor:");
			valor = imput.nextDouble();
			if (valor > 0) {
				cont++;
				soma += valor;

			}

		}
		media = soma / cont;
		System.out.printf("%d valores positivos\n", cont);
		System.out.printf("%.1f\n", media);

		imput.close();
	}
}
