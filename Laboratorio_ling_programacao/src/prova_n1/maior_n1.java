package prova_n1;

/*Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:*/

import java.util.Scanner;

public class maior_n1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int A, B, C;
		int maior = 0;
		// int maior_C = 0;

		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();

		maior = (A + B + Math.abs(A - B)) / 2;
		maior = (maior + C + Math.abs(maior - C)) / 2;

		System.out.printf("%d eh o maior\n",maior);

		teclado.close();
	}

}
