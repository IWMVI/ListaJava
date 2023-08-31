package modularizacao;

import java.util.Scanner;

/*	Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
	mostre o resultado da somatória dos números ímpares entre esses valores. */

public class Exerc35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vect = new int[2];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			vect[i] = sc.nextInt();
		}

		diferenca(vect);
		somatoria(vect);

		sc.close();
	}

	public static void diferenca(int[] vect) {

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vect[j] > vect[i]) {
					int aux = vect[i];
					vect[i] = vect[j];
					vect[j] = aux;
				}
			}
		}

		int dif = vect[1] - vect[0];

		System.out.println("\nDiferença entre os valores: " + dif);
	}

	public static void somatoria(int[] vect) {

		int impar = 0;
		for (int i = vect[0]; i < vect[1]; i++) {
			if (i % 2 != 0) {
				impar += i;
			}
		}

		System.out.println("Somatória dos números ímpares: " + impar);
	}
}
