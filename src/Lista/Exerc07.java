package Lista;

import java.util.Scanner;

/*  Receba os valores do comprimento, largura e altura de um paralelepípedo.
 *  Calcule e mostre seu volume. 
 *   
 *  Wallace Martins Vieira
 */

public class Exerc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do paralelepípedo: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura do paralelepípedo: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura do paralelepípedo: ");
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("O volume do paralelepípedo é: " + volume);

        sc.close();
    }
}
