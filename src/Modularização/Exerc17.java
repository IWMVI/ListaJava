package Modularização;

import java.util.Scanner;

/*  Calcule a quantidade de litros gastos em uma viagem, sabendo que o
 *  automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * 
 *  Wallace Martins Vieira
 */

public class Exerc17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo de percurso: ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade média: ");
        double velocidade = sc.nextDouble();

        double litros = litrosGastos(tempo, velocidade);

        System.out.println("A quantidade de litros gastos é: " + litros);

        sc.close();
    }

    public static double litrosGastos(double tempo, double velocidade) {
        double distancia = tempo * velocidade;
        double litros = distancia / 12;

        return litros;
    }
}
