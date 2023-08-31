package modularizacao;

import java.util.Scanner;

/*	Receba um número. Calcule e mostre os resultados da tabuada desse número */

public class Exerc34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int valor = sc.nextInt();

		tabuada(valor);
		sc.close();
	}

	public static void tabuada(int valor) {
		for (int i = 0; i < 11; i++) {
			int res = valor * i;
			System.out.println("O resultado de " + valor + " x " + i + " é: " + res);
		}
	}
}
