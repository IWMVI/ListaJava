package vetores;

import java.util.Random;

/*  A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e 
    verificar a sua existência no vetor (utilizar pesquisa binária). */

public class Exerc07 {
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

        System.out.print("\nInforme um valor: ");
        int valor = Integer.parseInt(System.console().readLine());

        int inicio = 0, fim = vet.length - 1, meio = 0;
        boolean achou = false;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vet[meio] == valor) {
                achou = true;
                break;
            } else if (vet[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (achou) {
            System.out.println("O valor " + valor + " foi encontrado na posição " + meio);
        } else {
            System.out.println("O valor " + valor + " não foi encontrado");
        }
    }
}
