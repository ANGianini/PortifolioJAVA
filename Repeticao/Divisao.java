/*Exercício 3 – Fazer um programa para ler um número N. Depois leia N pares de
números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
zero, mostrar a mensagem &quot;divisao impossivel&quot;.*/
import java.util.Scanner;
public class Exe_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double num1, num2, num3 = 0;
		
		System.out.print("Digite a quantidade de divisões: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Digite o númerador: ");
			num1 = sc.nextDouble();
			
			System.out.print("Digite o denominador: ");
			num2 = sc.nextDouble();
			
			if(num2 == 0) {
				System.out.println("divisão impossível.");
			}else {
				num3 = num1 / num2;
				System.out.printf("Resultado da divisão: %.2f\n", num3);
			}
			
		}
		
		
		sc.close();

	}

}
