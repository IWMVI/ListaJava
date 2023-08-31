package lista;

import java.util.Scanner;

/*  Receba a temperatura em graus Celsius. Calcule e mostre a sua
 *   temperatura convertida em fahrenheit F = (9*C+160) /5.
 *
 *   Wallace Martins Vieira
 */

public class Exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
