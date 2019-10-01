package Estrutura_Condicional_Uri;

import java.util.Scanner;

public class Exercicio_1041_coordenadas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double x, y;
		x = entrada.nextDouble();
		y = entrada.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");

		} else if ((x > 0 || x < 0) && (y == 0)) {
			System.out.println("Eixo X");
		} else if ((y > 0 || y < 0) && (x == 0)) {
			System.out.println("Eixo Y");
		} else {
			System.out.println("Origem");
		}

		entrada.close();
	}
}
