package modularizacao;

/*	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
	Casa: 1 2 3 4 ... 64
	Qte:  1 2 4 8 ... N */

public class Exerc39 {
	public static void main(String[] args) {

		double graos = 0;

		for (int i = 0; i < 65; i++) {
			if (i == 0) {
				graos += Math.pow(graos, i);
			} else {
				graos += graos;
			}
		}
		System.out.println(graos);
	}
}
