package Vetores;

import java.util.Scanner;

public class Exercicio_1171_Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont = 0;
		int tamanhoVetor = teclado.nextInt();
		int[] frequencia = new int[tamanhoVetor];
		int valor = 0;

		// Primeiro for para preencher o vetor frequencia[i] pelo scanner;
		for (int i = 0; i < tamanhoVetor; i++) {
			valor = teclado.nextInt();
			if (valor >= 1 && valor <= 2000) {
				frequencia[i] = valor;
			}
		}

		// Ordenar
		for (int i = 0; i < frequencia.length - 1; i++) {
			int aux = 0;
			for (int j = i + 1; j < frequencia.length; j++) {
				if (frequencia[i] > frequencia[j]) {
					aux = frequencia[i];
					frequencia[i] = frequencia[j];
					frequencia[j] = aux;
				}
			}
		}

		int j;
		for (int i = 0; i < frequencia.length; i = j) {
			cont = 1;
			j = i + 1;
			while ( j <frequencia.length && frequencia[i] == frequencia[j]) {
				cont++;
				j++;

			}
			System.out.printf("%d aparece %d vez(es)\n", frequencia[i], cont);
		}
		teclado.close();
	}
}
