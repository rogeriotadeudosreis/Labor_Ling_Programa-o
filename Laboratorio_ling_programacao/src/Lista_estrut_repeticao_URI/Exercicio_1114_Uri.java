package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1114_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int senhaSistema = 2002;
		int senhaInformada;

		do {
			System.out.printf("Informe sua senha:");
			senhaInformada = teclado.nextInt();
			if (senhaInformada != senhaSistema) {
				System.out.println("Senha Invalida");
			}

		} while (senhaInformada != senhaSistema);
		System.out.println("Acesso Permitido");

		teclado.close();
	}
}
