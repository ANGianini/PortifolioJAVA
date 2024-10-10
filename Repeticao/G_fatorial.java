/*Exercício G - Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
número. Fatorial de N é representado por N! e calculado da seguinte maneira: N! = N ∗ (N − 1) ∗ (N − 2) ∗. . .∗
3 ∗ 2 ∗ 1 Utilize o laço que lhe for mais conveniente.
 * */

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro maior que 0: ");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.print("\nErro! Este número é menor ou igual a 0.");
			System.out.print("\nDigite um número inteiro maior que 0: ");
			num = sc.nextInt();
		}
		
		int fatorial = 1;
		
		System.out.print("\nCálculo do Fatorial de " + num);
		for (int i = 1; i <= num; i++) {

			fatorial *= i;

			System.out.print("\n" + i + "! = " + fatorial);
		}
			
		sc.close();
	}

}
