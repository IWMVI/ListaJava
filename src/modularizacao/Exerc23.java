package modularizacao;

/*  Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
    necessariamente em ordem. Mostre os 4 números em ordem crescente. */

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[4];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vect[i] = sc.nextInt();
            if (i > 0 && i < 3) {
                if (vect[i] < vect[i - 1]) {
                    System.out.print("Informe um número maior para manter a ordem: " + (vect[i - 1]));
                }
            }
        }

        ordenacao(vect);

        sc.close();
    }

    static void ordenacao(int[] vect) {

        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect.length; j++) {
                if (vect[i] < vect[j]) {
                    int aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;
                }
            }
        }

        for (int val : vect) {
            System.out.println(val);
        }
    }
}