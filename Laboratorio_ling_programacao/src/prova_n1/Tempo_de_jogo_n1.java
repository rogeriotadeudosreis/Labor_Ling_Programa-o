package prova_n1;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.*/

import java.util.Scanner;

public class Tempo_de_jogo_n1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int horainicial;
		int horafinal;
		int duracao = 0;

		System.out.printf("Digite o hor�rio de in�cio do jogo:");
		horainicial = teclado.nextInt();
		System.out.printf("Digite o hor�rio de t�rmino do jogo:");
		horafinal = teclado.nextInt();

		duracao = horafinal - horainicial;
		
		if (duracao <= 0) {
			duracao = duracao + 24;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

		teclado.close();
	}
}
