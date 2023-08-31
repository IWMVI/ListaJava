package modularizacao;

import java.util.Scanner;

/*	Receba o número da base e do expoente. Calcule e mostre o valor da
	potência. */

public class Exerc44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a base: ");
		double base = sc.nextDouble();
		System.out.print("Informe o expoente: ");
		double exp = sc.nextDouble();

		System.out.println("O resultado é: " + Math.pow(base, exp));

		sc.close();
	}
}
