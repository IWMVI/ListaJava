package recursividade;

// Serie2 = (N) + (N-1) + (N-2) + ... + (1) 

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();
        System.out.println("O resultado da sequência é: " + seq(valor));
        sc.close();
    }

    public static int seq(int valor) {
        if (valor <= 0) {
            return valor;
        } else {
            return valor + seq(valor - 1);
        }
    }
}
