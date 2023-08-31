package modularizacao;

/*	Calcule e mostre o quadrado dos números entre 10 e 150. */

public class Exerc31 {
	public static void main(String[] args) {

		int cont = 10;
		while (cont < 151) {
			System.out.println("Número: " + cont + "\nRaiz Quadrada: " + Math.pow(cont, 2) + "\n");
			cont++;
		}
	}
}
