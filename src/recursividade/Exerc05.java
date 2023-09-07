package recursividade;

import java.util.Scanner;

// Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!

public class Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.println("O resultado da sequência é: " + seq(valor));
        sc.close();
    }

    public static int seq(int valor) {
        if (valor == 1) {
            return valor;
        } else {
            return fatorial(valor) + seq(valor - 1);
        }
    }

    public static int fatorial(int valor) {
        if (valor == 1) {
            return valor;
        } else {
            return valor * fatorial(valor - 1);
        }
    }
}
