package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1094_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = 10, somaCobaia = 0, qtdeCobaia = 0, qtdeCoelhos = 0, qtdeRatos = 0, qtdeSapos = 0;
		char tipo;
		double percCoelho = 0, percRato = 0, percSapo = 0;
		
		System.out.printf("Digite o valor de n:");
		n = teclado.nextInt();

		for (int i = 0; i < n; i++) {
			do {
				qtdeCobaia = teclado.nextInt();

				if (qtdeCobaia < 1 || qtdeCobaia > 15) {
					System.out.println("Quantidade inválida");
				}
			}while (qtdeCobaia < 1 || qtdeCobaia > 15);

			tipo = teclado.next().charAt(0);

			if (tipo == 'C' || tipo == 'c') {
				qtdeCoelhos += qtdeCobaia;

			} else if (tipo == 'R' || tipo == 'r') {
				qtdeRatos += qtdeCobaia;
			} else {
				qtdeSapos += qtdeCobaia;
			}

			
			somaCobaia += qtdeCobaia;
		}
		
		percCoelho = ((qtdeCoelhos / (double)somaCobaia) * 100);
		percRato = ((qtdeRatos / (double)somaCobaia) * 100);
		percSapo = ((qtdeSapos / (double)somaCobaia) * 100);

		System.out.printf("Total: %d cobaias\n", somaCobaia);
		System.out.printf("Total de coelhos: %d\n", qtdeCoelhos);
		System.out.printf("Total de ratos: %d\n", qtdeRatos);
		System.out.printf("Total de sapos: %d\n", qtdeSapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percCoelho);
		System.out.printf("Percentual de ratos: %.2f %%\n", percRato);
		System.out.printf("Percentual de sapos: %.2f %%\n", percSapo);

		teclado.close();
	}

}
/*
 * Total: 92 cobaias Total de coelhos: 29 Total de ratos: 40 Total de sapos: 23
 * Percentual de coelhos: 31.52 % Percentual de ratos: 43.48 % Percentual de
 * sapos: 25.00 %
 */
