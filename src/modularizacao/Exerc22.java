package modularizacao;

import java.util.Scanner;

/*  Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem 
    crescente 

    Wallace Martins Vieira
*/

public class Exerc22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[2];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        int[] crescente = crescente(vetor);

        System.out.println("Ordem crescente: " + crescente[0] + ", " + crescente[1]);

        sc.close();
    }

    public static int[] crescente(int[] vetor) {
        int[] crescente = new int[2];
        if (vetor[0] > vetor[1]) {
            crescente[0] = vetor[1];
            crescente[1] = vetor[0];
        } else {
            crescente[0] = vetor[0];
            crescente[1] = vetor[1];
        }
        return crescente;
    }
}
