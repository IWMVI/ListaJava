package lista;

import java.util.Scanner;

/*  Receba o valor do lado de um quadrado. Calcule e mostre sua área.
 * 
 *  Wallace Martins Vieira
 */

public class Exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        sc.close();
    }
}