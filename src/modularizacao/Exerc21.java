package modularizacao;

import java.util.Scanner;

/*  Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
    Mostre a mensagem de acordo com a média:
    
    a. Se a média for >= 6,0 exibir “APROVADO”;
    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c. Se a média for < 3,0 exibir “RETIDO”. 

    Wallace Martins Vieira
*/

public class Exerc21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            vetor[i] = sc.nextInt();
        }

        double media = media(vetor);

        if (media >= 6) {
            System.out.println("APROVADO");
        } else if (media >= 3 && media < 6) {
            System.out.println("EXAME");
        } else {
            System.out.println("RETIDO");
        }

        sc.close();
    }

    public static double media(int[] vetor) {
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media /= vetor.length;
        return media;
    }
}
