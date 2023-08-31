package lista;

import java.util.Scanner;

/*  Receba o valor de um depósito em poupança. Calcule e mostre o valor
 *  após 1 mês de aplicação sabendo que rende 1,3% a. m.
 *
 *  Wallace Martins Vieira
 */

public class Exerc08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();

        double rendimento = deposito * 0.013;
        double saldo = deposito + rendimento;

        System.out.println("O saldo após 1 mês de aplicação é: " + saldo);

        sc.close();
    }
}
