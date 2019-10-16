package Estrutura_Condicional_2_Uri;

import java.util.Scanner;

public class Exercicio_2313_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String aux = "Invalido";
		int A, B, C;
		double retangulo = 0;

		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();

		if (A > 0 && B > 0 && C > 0) {

			if (A >= B + C || B >= A + C || C >= A + B) {

				System.out.printf("Invalido\n", aux);

			} else {

				if (A == B && B == C) {
					System.out.println("Valido-Equilatero");

				} else if (A != B && B != C && C != A) {
					System.out.println("Valido-Escaleno");

				} else if (A == B && A != C || A == C && A != B || B == C && B != A) {
					System.out.println("Valido-Isoceles");

				}

				if (Math.pow(A, 2.0) == Math.pow(B, 2.0) + Math.pow(C, 2.0)
						|| Math.pow(B, 2.0) == Math.pow(A, 2.0) + Math.pow(C, 2.0)
						|| Math.pow(C, 2.0) == Math.pow(B, 2.0) + Math.pow(A, 2.0)) {
					System.out.println("Retangulo: S");
				} else {
					System.out.println("Retangulo: N");
				}
			}
		}

		teclado.close();
	}
}
