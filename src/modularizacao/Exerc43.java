package modularizacao;

import java.util.Scanner;

/*	Calcule e mostre quantos anos serão necessários para que Ana seja maior que
	Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
	e cresce 2 cm ao ano. */

public class Exerc43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ana = 1.10, maria = 1.50;

		int anos = crescimento(ana, maria);

		System.out.println("Para passar Maria, Ana demorará: " + anos + " anos");
		sc.close();
	}

	public static int crescimento(double ana, double maria) {

		int anos = 0;

		while (maria >= ana) {
			ana += 0.03;
			maria += 0.02;
			anos++;
		}

		return anos;
	}
}
