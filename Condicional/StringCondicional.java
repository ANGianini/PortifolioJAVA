/*Algoritmo que pede para o usuário digitar bom dia, boa tarde ou boa noite.
 * Está sendo usado .equalsIgnoreCase, assim este algoritmo mostra um exemplo 
 * desta sintaxe, que é utilizado na condicional String. 
 * */
import java.util.Scanner;

public class StringCondicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite bom dia, boa tarde ou boa noite: ");
		String valor = sc.nextLine();

		// Exemplo do igualdade (==) na variável String java para estrutura condicinal
		// É utilizado .equals ("x")
		// Para desconsiderar entrada maiúscula ou minúscula .equalsIgnoreCase ("x")
		if (valor.equalsIgnoreCase("boa tarde")) {
			System.out.println("Boa tarde!");
		} else if (valor.equalsIgnoreCase("bom dia")) {
			System.out.println("Bom dia!");
		} else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}
}