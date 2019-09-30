package Estrutura_Condicional_Uri;

import java.util.Scanner;

public class Exercicio_1038_lanche {

	public static void main(String[] args) {

		int codigo, quant;
		double total;

		Scanner teclado = new Scanner(System.in);
		codigo = teclado.nextInt();
		quant = teclado.nextInt();

		if (codigo == 1) {
			total = quant * 4.00;
			System.out.printf("Total: R$ %4.2f\n", total);
		} else if (codigo == 2) {
			total = quant * 4.50;
			System.out.printf("Total: R$ %4.2f\n", total);
		} else if (codigo == 3) {
			total = quant * 5.00;
			System.out.printf("Total: R$ %4.2f\n", total);
		} else if (codigo == 4) {
			total = quant * 2.00;
			System.out.printf("Total: R$ %4.2f\n", total);
		} else {
			total = quant * 1.50;

			System.out.printf("Total: R$ %4.2f\n", total);
		}

		teclado.close();
	}
}
