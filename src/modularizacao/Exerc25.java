package modularizacao;

import java.util.Scanner;

/*  Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
    tempo máximo é de 24 horas e pode começar num dia e terminar noutro. */

public class Exerc25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tempo = new int[2];

		System.out.print("Informe o horário de início: ");
		int horaInicio = sc.nextInt();
		System.out.print("Informe o minuto inicial: ");
		int minutoInicial = sc.nextInt();

		if (horaInicio > 23 || minutoInicial > 59) {
			System.out.print("Informe o horário de início: ");
			horaInicio = sc.nextInt();
			System.out.print("Informe o minuto inicial: ");
			minutoInicial = sc.nextInt();
		}

		System.out.print("Informe o horário de término: ");
		int horaTermino = sc.nextInt();
		System.out.print("Informe o minuto final: ");
		int minutoFinal = sc.nextInt();

		if (horaTermino > 23 || minutoFinal > 59) {
			System.out.print("\nInforme o horário de término: ");
			horaTermino = sc.nextInt();
			System.out.print("Informe o minuto final: ");
			minutoFinal = sc.nextInt();
		}

		tempo = calculoHora(horaInicio, minutoInicial, horaTermino, minutoFinal);

		if (tempo[1] > 9) {
			System.out.println("\nTempo de jogo: " + tempo[0] + "h" + " e " + tempo[1] + "min");
		} else {
			System.out.println("\nTempo de jogo: " + tempo[0] + "h" + " e 0" + tempo[1] + "min");
		}
		
		sc.close();
	}

	static int[] calculoHora(int horaInicio, int minutoInicial, int horaTermino, int minutoFinal) {

		int[] tempo = new int[2];
		int hora = horaTermino - horaInicio;
		int min = minutoFinal - minutoInicial;

		if (min < 0) {
			min += 60;
			hora--;
		}

		if (hora < 0) {
			hora += 24;
		}

		tempo[0] = hora;
		tempo[1] = min;

		return tempo;
	}
}
