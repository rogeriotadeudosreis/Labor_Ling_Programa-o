package Estrutura_Condicional_Uri;

/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final,

 *  mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.*/
import java.util.Scanner;

public class Exercicio_1042_Uri {
	public static void main(String[] args) {

		int a, b, c, aux, A, B, C;

		Scanner entrada = new Scanner(System.in);
		// System.out.println("Digite o valor da A:");

		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		A = a;
		B = b;
		C = c;

		if (b < a) {

			aux = a;
			a = b;
			b = aux;
		}
		if (c < a) {

			aux = a;
			a = c;
			c = aux;
		}
		if (c < b) {

			aux = b;
			b = c;
			c = aux;
		}
		System.out.printf("%d\n%d\n%d\n\n", a,b,c);
		System.out.printf("%d\n%d\n%d\n", A,B,C);
	

		entrada.close();
	}

}
