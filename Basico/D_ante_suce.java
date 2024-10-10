/*Exercício D - Desenvolva um algoritmo em Java que leia um número inteiro e imprima
o seu antecessor e seu sucessor.
*/

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		int sucessor = num + 1;
		int antecessor = num - 1;

		System.out.print("\nO número: " + num + "\nSeu antecessor: " + antecessor + "\nSeu sucessor: " + sucessor);

		sc.close();
	}

}
