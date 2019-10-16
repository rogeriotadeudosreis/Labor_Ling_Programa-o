package Estrutura_Condicional_2_Uri;

import java.util.Scanner;

public class Exercicio_1051_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salario;
		double aliquota1 = 0.08;
		double aliquota2 = 0.18;
		double aliquota3 = 0.28;
		double imposto = 0;
		double diferen�a;

		salario = teclado.nextDouble();

		if (salario <= 2000) {
			imposto = 0;

		} else if (salario > 2000 && salario <= 3000) { // aqui o contribuinte paga 8% de imposto sobre a diferen�a
			diferen�a = (salario - 2000);
			imposto = diferen�a * aliquota1;
		} else if (salario > 3000 && salario <= 4500) {// aqui ele paga 8 % nos primeiros 1000,00 + 18% de imposto sobre
														// a diferen�a
			imposto = 1000 * aliquota1;
			diferen�a = (salario - 3000);
			imposto = imposto + (diferen�a * aliquota2);

		} else {
			imposto = (1000 * aliquota1) + (1500 * aliquota2); // aqui ele paga 8% nos primeiros 1000,00, 18% sobre
																// 1500,00 + 28 sobre diferen�a
			diferen�a = salario - 4500;
			imposto = imposto + (diferen�a * aliquota3);
		}
		if (imposto <= 0) {
			System.out.printf("Isento\n", imposto);
		} else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		teclado.close();
	}
}
