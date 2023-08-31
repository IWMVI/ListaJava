package lista;

import java.util.Scanner;

/*  Receba o raio de uma circunferência. Calcule e mostre o comprimento da
 *  circunferência. 
 *
 *  Wallace Martins Vieira
 */

public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = sc.nextDouble();

        double comprimento = 2 * Math.PI * raio;

        System.out.printf("O comprimento da circunferência é: %.2f ", comprimento);

        sc.close();
    }    
}
