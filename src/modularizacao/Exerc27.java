package modularizacao;

import java.util.Scanner;

/*	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
 *  Calcule e mostre a velocidade média em km/h.*/

public class Exerc27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de voltas: ");
		int numVoltas = sc.nextInt();

		System.out.print("Informe a extensão da pista: ");
		int ext = sc.nextInt();

		System.out.print("Informe a duração: ");
		int duracao = sc.nextInt();

		velMedia(numVoltas, ext, duracao);

		sc.close();
	}

	public static void velMedia(int numVoltas, int ext, int duracao) {

		float espaco = (float) (numVoltas * ext);
		float velMedia =(float) (espaco / (duracao * 60));

		System.out.printf("\nA velocidade média é de %.2f Km/h", velMedia * 3.6);
	}
}
