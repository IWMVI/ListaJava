package vetores;

import java.util.Random;

//  Criar e coletar um vetor [50] inteiro. 
//  Calcular e exibir: 
//  a. A média dos valores entre 10 e 200; 
//  b. A soma dos números ímpares.

public class Exerc01 {
    public static void main(String[] args) {
        int[] vet = new int[50];
        Random rand = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(1001);
        }

        double media = media(vet);
        int soma = soma(vet);

        System.out.printf("A média dos valores é: %.2f\n", media);
        System.out.println("A somatória dos números ímpares é: " + soma);
    }

    public static double media(int[] vet) {
        double media = 0;
        for (int valores : vet) {
            if (valores >= 10 && valores <= 200) {
                media += valores;
            }
        }
        media /= vet.length;
        return media;
    }

    public static int soma(int[] vet) {

        int soma = 0;

        for (int valores : vet) {
            if (valores / 2 != 0) {
                soma += valores;
            }
        }

        return soma;
    }
}
