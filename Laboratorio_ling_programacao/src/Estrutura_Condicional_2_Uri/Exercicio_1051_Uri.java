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
		double diferenša;

		salario = teclado.nextDouble();

		if (salario <= 2000) {
			imposto = 0;

		}
		else if (salario > 2000 && salario <= 3000) { // aqui o contribuinte paga 8% de imposto sobre a diferenša
			diferenša = (salario - 2000);
			imposto = diferenša * aliquota1;//8%
					}
		else if (salario > 3000 && salario <= 4500) {// aqui ele paga 8 % nos primeiros 1000,00 + 18% de imposto sobre
														// a diferenša
			imposto = 1000 * aliquota1;//8%
			diferenša = (salario - 3000);
			imposto = imposto + (diferenša * aliquota2);//18%

		}
		else {
			
			imposto = (1000 * aliquota1) + (1500 * aliquota2); // aqui ele paga 8% nos primeiros 1000,00, 18% sobre
			 										// 1500,00 + 28 sobre diferenša
			diferenša = salario - 4500;
			imposto = imposto + (diferenša * aliquota3);
		}
		if (imposto <= 0) {
			System.out.printf("Isento\n", imposto);
		} else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		teclado.close();
	}
}
