package modularizacao;

/*	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
	resultado 7. */

public class Exerc41 {
	public static void main(String[] args) {

		int cont = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i + j == 7) {
					System.out.println("Posição do 1º dado: " + i);
					System.out.println("Posição do 2º dado: " + j + "\n");
					cont++;
				}
			}
		}

		System.out.println("O total de possibilidades é: " + cont);
	}
}
