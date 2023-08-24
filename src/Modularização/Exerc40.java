import java.util.Scanner;

/*	
 * Receba 2 números inteiros. Verifique e mostre todos os números primos. 
 */

public class Exerc40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o 1º número: ");
		int num1 = sc.nextInt();

		System.out.print("Informe o 2º número: ");
		int num2 = sc.nextInt();

		System.out.println("Os números primos entre " + num1 + " e " + num2 + " são: \n");
		int cont = 1;
		for (int i = num1; i <= num2; i++) {
			if (isPrimo(i)) {
				System.out.println(cont + "º número " + i + " ");
				cont++;
			}
		}

		sc.close();
	}

	public static boolean isPrimo(int num) {

		if (num <= 1) {
			return false;
		} else if (num == 2 || num == 3) {
			return true;
		} else if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
