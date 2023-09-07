package vetores;

import java.util.Random;

/*  Criar e coletar em um vetor [30] real e calcular e exibir:
    a. A média do grupo;
    b. A quantidade de notas acima do grupo; 
    c. As posições dos valores abaixo da média do grupo.*/

public class Exerc04 {
    public static void main(String[] args) {
        float[] vet = new float[30];
        Random rand = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextFloat() * 10;
        }

        float media = media(vet);
        int qtd = notasAcima(media, vet);

        System.out.printf("A média das notas é: %.2f\n", media);
        System.out.println("A quantidade de notas acima da média é: " + qtd + "\n");
        abaixo(media, vet);
    }

    public static float media(float[] vet) {
        float media = 0;

        for (int i = 0; i < vet.length; i++) {
            media += vet[i];
        }

        return media / vet.length;
    }

    public static int notasAcima(float media, float[] vet) {
        int cont = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                cont++;
            }
        }
        return cont;
    }

    public static void abaixo(float media, float[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.printf("A posição %d está abaixo da média: %.2f\n", i, vet[i]);
            }
        }
    }
}
