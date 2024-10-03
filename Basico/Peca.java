/*Desenvolivido por: Andressa e Felipe
 *Exercício D - Fazer um programa para ler o código da peça1, a quantidade que está levando desta peça1, 
 o valor unitário da peça1, o código de uma peça 2, a quantidade que está levando desta peças2 e o valor unitário de cada peça 2. 
Calcule e mostre o valor a ser pago.
*/
import java.util.Scanner;
public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite o código da primeira peça: ");
		int peca1 = sc.nextInt();

		System.out.print("Digite a quantidade que está levando da primeira peça: ");
		int quant1 = sc.nextInt();
		
		System.out.print("Digite o valor unitário da primeira peça: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Digite o código da segunda peça: ");
		int peca2 = sc.nextInt();

		System.out.print("Digite a quantidade que está levando da segunda peça: ");
		int quant2 = sc.nextInt();
		
		System.out.print("Digite o valor unitário da segunda peça: ");
		double valor2 = sc.nextDouble();

		// Processamento de dados e saída de dados
		System.out.printf("Valor total a pagar: R$%.2f", ((quant1 * valor1)+(quant2 * valor2)));

		sc.close();
	}
	
}
