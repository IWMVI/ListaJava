package modularizacao;

import java.util.Scanner;

/*	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N. */

public class Exerc33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int valor = sc.nextInt();

		System.out.printf("O resultado da série é: %.2f", serie(valor));

		sc.close();
	}

	public static double serie(int valor) {

		double resultado = 0;
		int n = 1;

		while (n <= valor) {
			resultado += (double) (1.0 / n);
			n++;
		}

		return resultado;
	}
}
