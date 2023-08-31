package lista;

import java.util.Scanner;

/*  Receba 2 números reais. Calcule e mostre a diferença desses valores. 
 *
 *  Wallace Martins Vieira
 */

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double diferenca = num1 - num2;

        System.out.println("A diferença entre os números é: " + diferenca);

        sc.close();
    }
}
