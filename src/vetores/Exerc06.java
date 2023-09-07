package vetores;

import java.util.Random;

/*  Criar e coletar em um vetor [20] com números aleatórios.
    Classificar este vetor em ordem crescente e mostre os dados. */

public class Exerc06 {
    public static void main(String[] args) {
        int[] vet = new int[20];
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(41);
        }

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vet[j] > vet[i]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for (int valores : vet) {
            System.out.print(valores + " ");
        }
    }
}
