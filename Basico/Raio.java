
/*Um programa para ler o valor do raio de um círculo, e depois mostrar 
o valor da área deste círculo com quatro casas decimais conforme exemplos. 
Fórmula da área: area = π . raio²
Considere o valor de π = 3.14159
*/
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Digite o raio do círculo: ");
		Double raio = sc.nextDouble();

		// Processamento de dados e saída de dados
		System.out.printf("Área do circulo: %.4f%n", (3.14159 * (raio * raio)));

		sc.close();
	}
}
