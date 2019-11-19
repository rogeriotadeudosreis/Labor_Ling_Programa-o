package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1079_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, quantNota = 1;
		double soma = 0, somaPeso = 10;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		double nota;
		double media1 = 0, media2 = 0, media3 = 0, mediaFinal = 0;

		n = teclado.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < quantNota; j++) {
				System.out.printf("Digite a nota:");
				nota = teclado.nextDouble();
				media1 = nota * peso1;
				for (int j2 = 0; j2 < quantNota; j2++) {
					nota = teclado.nextDouble();
					media2 = nota * peso2;
					for (int k = 0; k < quantNota; k++) {
						nota = teclado.nextDouble();
						media3 = nota * peso3;
					}
				}
				soma = media1 + media2 + media3;
			}
			mediaFinal = soma / somaPeso;
			System.out.printf("%.1f\n", mediaFinal);
		}

		teclado.close();

	}

}
