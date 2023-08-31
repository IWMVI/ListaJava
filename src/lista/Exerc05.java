package lista;

import java.util.Scanner;

/*  Receba os valores do comprimento, largura e altura de um paralelepípedo.
 *  Calcule e mostre seu volume. 
 *
 *  Wallace Martins Vieira
 */

public class Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("As raízes reais da equação são: " + x1 + " e " + x2);

        sc.close();
    }
}
