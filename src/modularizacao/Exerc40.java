package modularizacao;

/*  Receba 2 números inteiros. Verifique e mostre todos os números primos */

import java.util.Scanner;

public class Exerc40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Os números primos entre " + num1 + " e " + num2 + " são: ");
        for (int i = num1; i <= num2; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
