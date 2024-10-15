/*Exercício I - Crie um programa que armazene 10 números inteiros e então determine
 *e exiba o maior e o menor número digitado.
 * */

import java.util.Scanner;

public class exemplo_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int maior, menor;
		
		System.out.print("Digite o 3  número: ");
		for(int i = 0; i < 3; i++) {
			
			num[i] = sc.nextInt();
		}
		
		maior = menor = num[0];
		
		for(int numeros : num) {
			if(numeros > maior) maior = numeros;
			if(numeros < menor) menor = numeros;
		}
		System.out.println("Maior número digitado: " + maior + "\nMenor número digitado: " + menor);
		
		sc.close();
	}

}
