/*Exercício I - Crie um programa que armazene 10 números inteiros e então determine
 *e exiba o maior e o menor número digitado.
 * */

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		int maior = 0, menor = 99999;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();

			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("\nMaior número digitado: " + maior + "\nMenor número digitado: " + menor);

		sc.close();
	}

}
