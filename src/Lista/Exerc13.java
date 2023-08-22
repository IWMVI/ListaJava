package Lista;

import java.util.Scanner;

/*  Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
 *  durará esse alimento sabendo que a pessoa consome 50g ao dia.
 *
 *  Wallace Martins Vieira
 */

public class Exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alimento em quilos: ");
        double alimento = sc.nextDouble();

        double dias = (alimento * 1000) / 50;

        System.out.println("O alimento durará " + dias + " dias.");

        sc.close();
    }
}
