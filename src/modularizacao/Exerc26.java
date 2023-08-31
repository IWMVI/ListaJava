package modularizacao;

import java.util.Scanner;

/*	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor. */

public class Exerc26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vect = new int[2];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextInt();
		}

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vect[j] < vect[i]) {
					int aux = vect[j];
					vect[j] = vect[i];
					vect[i] = aux;
				}
			}
		}

		if (vect[0] % vect[1] != 0) {
			System.out.println("\nO número " + vect[0] + " não é divisível por " + vect[1]);
		} else {
			System.out.println("\nO número " + vect[0] + " é divisível por " + vect[1]);
		}
		
		sc.close();
	}
}
