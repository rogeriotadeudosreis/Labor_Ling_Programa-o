package Estrutura_Condicional_Uri;

import java.util.Scanner;

public class Exercicio_1044_multiplos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a, b;

		a = entrada.nextInt();
		b = entrada.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else  {
			System.out.println("Nao sao Multiplos");
		}
		entrada.close();
	}
}
