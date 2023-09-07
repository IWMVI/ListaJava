package vetores;

/*  Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
    Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
    VT1| 1| 2| 3| 
    VT2| 4| 5| 6| 
    VT3| 1| 2| 3| 4| 5| 6 */

public class Exerc03 {
    public static void main(String[] args) {
        int[] vet1 = { 1, 2, 3 };
        int[] vet2 = { 4, 5, 6 };
        int[] vet3 = new int[vet1.length + vet2.length];

        for (int i = 0; i < vet3.length; i++) {
            if (i < vet1.length) {
                vet3[i] = vet1[i];
            } else {
                vet3[i] = vet2[i - vet1.length];
            }
        }

        for (int valores : vet3) {
            System.out.print(valores + " ");
        }
    }
}
