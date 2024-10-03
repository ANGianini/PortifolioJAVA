/*Desenvolivido por: Andressa e Felipe
 * Exercício C - Fazer um programa para ler quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).
*/
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();

		System.out.print("Digite o valor de B: ");
		int b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int c = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
		int d = sc.nextInt();

		// Processamento de dados e saída de dados
		System.out.print("A diferença é igual a: " + ((a*b)-(c*d)));

		sc.close();
	}

}
