package lista;

import java.util.Scanner;

/*  Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
 *  a hipotenusa. 
 * 
 *  Wallace Martins Vieira
 */

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º cateto do triângulo: ");
        double cateto1 = sc.nextDouble();

        System.out.print("Digite o 2º cateto do triângulo: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);

        sc.close();
    }
}
