package modularizacao;

/*	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 */

public class Exerc42 {
	public static void main(String[] args) {

		double res = 0.0;

		int c = 1;
		double b = 1.0;

		while (c <= 50) {
			res += (c / b);
			c++;
			b += (double) 2;
		}

		System.out.printf("O resultado da sequência é: %.3f", res);
	}
}
