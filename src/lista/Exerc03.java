package lista;

import java.util.Scanner;

/*  Receba a base e a altura de um triângulo. Calcule e mostre sua área. 
 * 
 *  Wallace Martins Vieira
 */

public class Exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        sc.close();
    }
}
