package Estrutura_Condicional_2_Uri;

import java.util.Scanner;

public class Exercicio_1043_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double A, B, C;
		double area = 0;
		double perimetro = 0;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		if (A < B + C && B < A + C && C < A + B) {
			perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);

		} else {
			area = ((A + B) / 2) * C;
			System.out.printf("Area = %.1f\n", area);
		}

		teclado.close();
	}
}
