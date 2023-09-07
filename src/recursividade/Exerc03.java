package recursividade;

import java.util.Scanner;

// (1/1) + (1/2) + (1/3) + ....+ (1/N) 

public class Exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.printf("O resultado da sequência é: %.2f", seq(valor));

        sc.close();
    }

    public static double seq(double valor) {
        if (valor == 1) {
            return valor;
        } else {
            return 1.0 / valor + seq(valor - 1);
        }
    }
}
