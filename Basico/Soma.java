
/*Um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
 * desses números com uma mensagem explicativa, conforme exemplos.
*/
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();

		System.out.print("Digite outro número inteiro: ");
		int num2 = sc.nextInt();

		// Processamento de dados e saída de dados
		System.out.print("A soma destes números inteiros é igual a: " + (num1 + num2));

		sc.close();
	}
}
