/*Exercício B - Criar um programa que calcule a média de salários de uma empresa,
 *pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 * */

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de funcionários: ");
		int quant = sc.nextInt();

		double[] salario = new double[quant];
		double soma = 0;

		for (int i = 0; i < quant; i++) {
			System.out.print("Digite o " + (i + 1) + "º salário: ");
			salario[i] = sc.nextDouble();
			soma += salario[i];
		}
		double media = soma / salario.length;

		System.out.printf("\nMédia salarial: %.2f", media);

		sc.close();
	}

}
