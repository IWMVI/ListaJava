package modularizacao;

import java.util.Scanner;

/*  Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3. */
public class Exerc24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[2];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            vect[i] = sc.nextInt();
        }

        verificacao(vect);

        sc.close();
    }

    static void verificacao(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0 && vect[i] % 3 == 0) {
                System.out.println("O número: " + vect[i] + " é divisível por 2 e por 3");
            } else if (vect[i] % 2 == 0 && vect[i] % 3 != 0) {
                System.out.println("O número: " + vect[i] + " é divisível apenas por 2");
            } else if (vect[i] % 2 != 0 && vect[i] % 3 == 0) {
                System.out.println("O número: " + vect[i] + " é divisível apenas por 3");
            } else {
                System.out.println("O número: " + vect[i] + " não é divisível por 2 ou por 3");
            }
        }
    }
}
