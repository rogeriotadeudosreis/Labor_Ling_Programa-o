package Estrutura_Condicional_Uri;

import java.util.Scanner;

public class Exercicio_1040_media {

	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4, media, notaExame, mediaFinal;

		Scanner teclado = new Scanner(System.in);

		nota1 = teclado.nextFloat();
		nota2 = teclado.nextFloat();
		nota3 = teclado.nextFloat();
		nota4 = teclado.nextFloat();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

		if (media >= 7) {
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5) {
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno reprovado.\n");
		} else {
			notaExame = teclado.nextFloat();
			mediaFinal = (media + notaExame) / 2;
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno em exame.\n");
			System.out.printf("Nota do exame: %.1f\n", notaExame);

			if (mediaFinal >= 5) {

				System.out.printf("Aluno aprovado.\n");

			} else {

				System.out.printf("Aluno reprovado.\n");

			}
			System.out.printf("Media final: %.1f\n", mediaFinal);
		}
		teclado.close();
	}
}
