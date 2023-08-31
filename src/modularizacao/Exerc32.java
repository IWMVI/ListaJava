package modularizacao;

import java.util.Scanner;

/*	Receba um número inteiro. Calcule e mostre o seu fatorial. */

public class Exerc32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int valor = sc.nextInt();

		System.out.println("O resultado do fatorial de " + valor + " é: " + fat(valor));

		sc.close();
	}

	public static int fat(int valor) {

		if (valor == 1) {
			return 1;
		} else {
			return valor * fat(valor - 1);
		}
	}
}
