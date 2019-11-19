package prova_n1;

import java.util.Scanner;

public class aumento_salario_n1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salario;
		double novosalario = 0;
		double reajuste = 0;
		double percentual = 0;

		System.out.printf("Digite o salário:");
		salario = teclado.nextDouble();

		if (salario > 0.00 && salario <= 400.00) {
			novosalario = salario + salario * 0.15;
			reajuste = salario * 0.15;
			percentual = 15;
		} else if (salario > 400.00 && salario <= 800.00) {
			novosalario = salario + salario * 0.12;
			reajuste = salario * 0.12;
			percentual = 12;
		} else if (salario > 800.00 && salario <= 1200.00) {
			novosalario = salario + salario * 0.10;
			reajuste = salario * 0.10;
			percentual = 10;
		} else if (salario > 1200.00 && salario <= 2000.00) {
			novosalario = salario + salario * 0.07;
			reajuste = salario * 0.07;
			percentual = 7;
		} else if (salario > 2000.00) {
			novosalario = salario + salario * 0.04;
			reajuste = salario * 0.04;
			percentual = 4;
		}

		System.out.printf("Novo salario: %.2f\n", novosalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %.0f %%\n", percentual);

		teclado.close();
	}

}
/*
 * 0 - 400.00 15 400.01 - 800.00 12 800.01 - 1200.00 10 1200.01 - 2000.00 7
 * Acima de 2000.00 4
 * 
 * 15% 12% 10% 7% 4%
 */