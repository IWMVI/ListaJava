package modularizacao;

/*	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225 */

public class Exerc45 {
	public static void main(String[] args) {

		int n = 1;
		double res = 0;

		while (n < 16) {
			res += (n / Math.pow(n, 2));
			n++;
		}
		
		System.out.println("O resultado da sequência é: " + res);
	}
}
