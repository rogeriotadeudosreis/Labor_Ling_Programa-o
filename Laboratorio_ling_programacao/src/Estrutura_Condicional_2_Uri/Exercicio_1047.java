package Estrutura_Condicional_2_Uri;

/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.*/

import java.util.Scanner;

public class Exercicio_1047 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hi, mi, hf, mf, timin, tfmin, dif, dh, dm, dia = 1440;

		hi = teclado.nextInt();
		mi = teclado.nextInt();
		hf = teclado.nextInt();
		mf = teclado.nextInt();

		timin = hi * 60 + mi;
		tfmin = hf * 60 + mf;
		dif = tfmin - timin;

		if (dif <= 0) {
			dif = dia + dif;
		}
		dh = dif / 60;
		dm = dif % 60;
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dh, dm);

	}
}
