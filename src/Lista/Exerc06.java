package Lista;

import java.util.Scanner;

/*  Receba os valores de x e y. Efetua a troca de seus valores e mostre seus
 *  conteúdos. 
 *
 *  Wallace Martins Vieira
 */

public class Exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        double aux = x;
        x = y;
        y = aux;

        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de y é: " + y);

        sc.close();
    }
}
