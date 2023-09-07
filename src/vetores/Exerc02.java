package vetores;

import java.util.Random;

/*  Criar e coletar um vetor [100] inteiro e exibir:
    a. O maior e o menor valor;
    b. A média dos valores. */

public class Exerc02 {
    public static void main(String[] args) {
        int[] vet = new int[100];
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(10001);
        }

        int[] maiorMenor = maiorMenor(vet);
        System.out.println("O maior número foi: " + maiorMenor[0]);
        System.out.println("O menor número foi: " + maiorMenor[1]);

        double media = media(vet);
        System.out.printf("A média dos valores é: %.2f", media);
    }

    public static double media(int[] vet) {
        double media = 0;
        for (int valores : vet) {
            media += valores;
        }
        return media / vet.length;
    }

    public static int[] maiorMenor(int[] vet) {

        int[] res = new int[2];
        int maior = vet[0], menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        res[0] = maior;
        res[1] = menor;

        return res;
    }
}
