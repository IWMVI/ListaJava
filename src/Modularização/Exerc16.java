package Modularização;

import java.util.Scanner;

/* Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
 * de desconto e o número de descendentes. Calcule o salário que serão as
 * horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
 * Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
 * Líquido. Exiba o salário a receber.
 * 
 * Wallace Martins Vieira
 */

public class Exerc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double desconto = sc.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        double dependentes = sc.nextDouble();

        double salarioBruto = salarioBruto(horasTrabalhadas, valorHora);
        double salarioLiquido = salarioLiquido(salarioBruto, desconto);
        salarioLiquido += dependentes * 100;

        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("O salário a receber é: " + salarioLiquido);

        sc.close();
    }

    public static double salarioBruto(double horasTrabalhadas, double valorHora) {
        return horasTrabalhadas * valorHora;
    }

    public static double salarioLiquido(double salarioBruto, double desconto) {
        return salarioBruto - desconto;
    }
}
