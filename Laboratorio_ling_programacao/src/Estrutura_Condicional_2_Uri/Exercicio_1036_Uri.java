package Estrutura_Condicional_2_Uri;

//fórmula de bhaskara

import java.util.Scanner;

public class Exercicio_1036_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double A, B, C;
		double delta;
		double raiz1 = 0;
		double raiz2 = 0;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		delta = (Math.pow(B, 2.0)) - (4 * A * C);

		if (delta < 0 || A == 0) {

			System.out.println("Impossivel calcular");
		} else {
			raiz1 = (-B + (Math.sqrt(delta))) / (2 * A);
			raiz2 = (-B - (Math.sqrt(delta))) / (2 * A);
			System.out.printf("R1 = %.5f\n", raiz1);
			System.out.printf("R2 = %.5f\n", raiz2);

		}

		teclado.close();
	}
}
