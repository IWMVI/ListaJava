package modularizacao;

import java.util.Scanner;

/*  Receba 2 valores reais. Calcule e mostre o maior deles.
 * 
 *  Wallace Martins Vieira
 */

public class Exerc19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        double verificacao = verificacao(valor1, valor2);

        System.out.println("O maior valor é: " + verificacao);
        sc.close();
    }

    public static double verificacao(double valor1, double valor2) {

        double maior = valor1 > valor2 ? valor1 : valor2;
        
        /* ^^^^^^^^^^^^^^^^^^^ Método alternativo ^^^^^^^^^^^^^^^^^^^ *
         *                                                            * 
         * if(valor1 > valor2) {                                      *
         *      maior = valor1;                                       *
         * } else {                                                   *
         *      maior = valor2;                                       *
         * }                                                          *
                                                                      */
        return maior;
    }
}
