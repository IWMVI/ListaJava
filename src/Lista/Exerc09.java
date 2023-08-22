package Lista;

import java.util.Scanner;

/*  Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * 
 *  Wallace Martins Vieira
 */

public class Exerc09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = (num1 * num1) + (num2 * num2);

        System.out.println("A soma dos quadrados é: " + soma);

        sc.close();
    }
}
