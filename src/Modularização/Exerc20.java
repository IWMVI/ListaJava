package Modularização;

import java.util.Scanner;

/*
 *  Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
 *  AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
 *  exista, calcule e mostre.
 * 
 *  Wallace Martins Vieira
 */

public class Exerc20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double c = sc.nextDouble();

        double delta = delta(a, b, c);

        System.out.println("1ª Raiz: " + raiz1(a, b, delta));
        System.out.println("2ª Raiz: " + raiz2(a, b, delta));

        sc.close();
    }

    public static double delta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public static double raiz1(double a, double b, double delta) {
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        return raiz1;
    }

    public static double raiz2(double a, double b, double delta) {
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        return raiz2;
    }
}
