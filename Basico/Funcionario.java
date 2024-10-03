/*Desenvolivido por: Andressa e Felipe
 *Exercício E - Fazer um programa que leia o número de um funcionário, 
 *seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
*/
import java.util.Scanner;
public class E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite o número do funcionário: ");
		int numFuncionario = sc.nextInt();

		System.out.print("Digite a quantidade de horas trabalhadas do funcionário: ");
		int quantHora = sc.nextInt();
		
		System.out.print("Digite o valor do salário por hora do funcionário: ");
		double salarioHora = sc.nextDouble();

		// Processamento de dados e saída de dados
		System.out.printf("\nNúmero do funcionário: " + numFuncionario + "\nSalário do funcionário: R$%.2f", (quantHora*salarioHora));

		sc.close();
	}
}
