package lista;

import java.util.Scanner;

/*  Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
 *   quantos anos terá daqui a 17 anos.
 *
 *   Wallace Martins Vieira
 */

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeDaqui17Anos = idade + 17;

        System.out.println("A idade é: " + idade);
        System.out.println("A idade daqui a 17 anos é: " + idadeDaqui17Anos);

        sc.close();
    }
}
