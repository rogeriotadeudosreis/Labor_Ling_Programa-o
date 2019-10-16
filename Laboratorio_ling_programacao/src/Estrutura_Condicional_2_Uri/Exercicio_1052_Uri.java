package Estrutura_Condicional_2_Uri;

import java.util.Scanner;

public class Exercicio_1052_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;

		num = teclado.nextInt();
		if (num > 0 && num <= 12) {

			if (num == 1) {
				System.out.printf("January\n");
			} else if (num == 2) {
				System.out.printf("February\n");
			} else if (num == 3) {
				System.out.printf("March\n");
			} else if (num == 4) {
				System.out.printf("April\n");
			} else if (num == 5) {
				System.out.printf("May\n");
			} else if (num == 6) {
				System.out.printf("June\n");
			} else if (num == 7) {
				System.out.printf("July\n");
			} else if (num == 8) {
				System.out.printf("August\n");
			} else if (num == 9) {
				System.out.printf("September\n");
			} else if (num == 10) {
				System.out.printf("October\n");
			} else if (num == 11) {
				System.out.printf("November\n");
			} else {
				System.out.printf("December\n");
			}
		} else {
			System.out.printf("Mês inválido");
		}
		teclado.close();

	}
}
