package Lista;

import java.util.Scanner;

/*  Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. 
 * 
 *  Wallace Martins Vieira
 */
public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º ângulo do triângulo: ");
        double angulo1 = sc.nextDouble();

        System.out.print("Digite o 2º ângulo do triângulo: ");
        double angulo2 = sc.nextDouble();

        double angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("O 3º ângulo do triângulo é: " + angulo3);

        sc.close();
    }
}
