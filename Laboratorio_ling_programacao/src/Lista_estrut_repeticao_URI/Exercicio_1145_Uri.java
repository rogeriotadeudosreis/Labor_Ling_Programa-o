package Lista_estrut_repeticao_URI;

import java.util.Scanner;

public class Exercicio_1145_Uri {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x, y;

		x = teclado.nextInt();
		y = teclado.nextInt();

		if (x > 1 && x < 20 && y > x && y < 100000) {

			for (int i = 1; i < y; ) {
				
				for (int j = 0; j < x; j++) {
					
					System.out.printf("%d ", i);
					i++;
				}
				System.out.println();
			}
			
			
		}
		teclado.close();
	}
}
