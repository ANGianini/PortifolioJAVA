/*Exercício A - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba
em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C +
273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
 * */

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em °C: ");
		double celsius = sc.nextDouble();

		double kelvin = celsius + 273.15;
		double reaumur = celsius * 0.8;
		double rankine = celsius * 1.8 + 32 + 459.67;
		double fahrenheit = celsius * 1.8 + 32;

		System.out.printf("\nEssa temperatura em Kelvin: %.2f", kelvin);
		System.out.printf("\nEssa temperatura em Réaumur:%.2f", reaumur);
		System.out.printf("\nEssa temperatura em Rankine: %.2f", rankine);
		System.out.printf("\nEssa temperatura em Fahrenheit: %.2f", fahrenheit);

		sc.close();
	}

}
