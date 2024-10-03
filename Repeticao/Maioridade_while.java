// Mostra se o usuario é menor ou maior de idade

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Insira a sua idade: ");
		int idade = sc.nextInt();

		while (idade <= 0 || idade >= 105) {
			System.out.printf("\nBem vindo, %s", nome + "\nA sua informação de idade está inválida!");
			System.out.print("\nInsira a sua idade: ");
			idade = sc.nextInt();

		}
		if (idade >= 18) {
			System.out.printf("\nBem vindo, %s", nome + "\nVocê é maior de idade.");
		} else {
			System.out.printf("\nBem vindo, %s", nome + "\nVocê é menor de idade.");
		}

		sc.close();
	}

}
