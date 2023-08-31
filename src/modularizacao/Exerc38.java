package modularizacao;

import java.util.Random;

/*	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor
	valor. Obs.: somente valores positivos. */

public class Exerc38 {
	public static void main(String[] args) {

		Random rand = new Random();
		int[] vect = new int[100];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = rand.nextInt();
			while (vect[i] < 0) {
				vect[i] = rand.nextInt();
			}
		}

		int maior = 0, menor = 0;
		for (int i = 0; i < vect.length; i++) {
			if (i == 0) {
				maior = vect[i];
				menor = vect[i];
			}
			if (vect[i] > maior) {
				maior = vect[i];
			}
			if (vect[i] < menor) {
				menor = vect[i];
			}
		}

		System.out.println("O maior número foi: " + maior);
		System.out.println("O menor núemero foi: " + menor);
	}
}
