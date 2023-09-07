package recursividade;

import java.util.Scanner;

// (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 

public class Exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = sc.nextInt();
        double aux = 1;

        System.out.printf("O resultado da sequência é: %.2f", seq(valor, aux));
        sc.close();
    }

    public static double seq(double valor, double aux) {
        if (valor == 0) {
            return valor;
        } else {
            return valor / aux + seq(valor - 1.0, aux + 1.0);
        }
    }
}
