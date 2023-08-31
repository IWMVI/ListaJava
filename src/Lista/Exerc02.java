package lista;

import java.util.Scanner;

/*  Receba o salário de um funcionário e mostre o novo salário com reajuste de
 *  15%. 
 * 
 *  Wallace Martins Vieira
 */

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.println("O novo salário do funcionário é: " + novoSalario);

        sc.close();
    }
}
