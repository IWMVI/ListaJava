package Modularização;

import java.util.Scanner;

/*  Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
    maior pelo menor valor. 

    Wallace Martins Vieira
*/

public class Exerc18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[2];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("A diferença entre o maior e o menor é: " + verificacao(vet));
        sc.close();
    }

    public static int verificacao(int vet[]) {
        int maior = vet[0];
        int menor = vet[0];

        for (int i = 0; i < vet.length; i++) {
            maior = vet[i] > maior ? vet[i] : maior;
            menor = vet[i] < menor ? vet[i] : menor;
        }

        return maior - menor;
    }
}
