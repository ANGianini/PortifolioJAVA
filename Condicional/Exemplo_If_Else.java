/*Algoritmo que apresenta um exemplo da utilização correta do .equals 
 * na condicional String.
 * O algoritmo pergunta se está matriculado ou não, baseado se a resposta 
 * for 'sim' a saída é 'Matriculado', ou 'nao' a saída é 'Não matriculado',
 * caso for digitada algo além a saída é 'Erro. Informação inválida'.
 * */
import java.util.Scanner;
public class Exemplo_If_Else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sim para matriculado e nao para nao " + "matriculado: ");
		String input = scanner.nextLine();
		//Método equals = usado para comparar o conteúdo de dois objetos para verificar se eles são iguais
		//No exmplo input.equals("sim") verifica se o valor da String input é igual a Sring
		
		if(input.equals("sim")) {
			System.out.println("Matriculado.");
		}
		else if(input.equals("nao")) {
			System.out.println("Não matriculado.");
		}
		else {
			System.out.println("Erro. Informação inválida.");
		}
		scanner.close();
	}
}