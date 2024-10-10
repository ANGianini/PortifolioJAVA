//Exercício C - Informar um saldo e imprimir o saldo com reajuste de 1%

import java.util.Scanner; /* 'import' importa a classe 'Scanner' para ler
a entrada do usuário e a instância com 'new Scanner(System.in):'.
  'java.util.Scanner' é uma classe dentro do pacote 'java.util' da biblioteca padrão no java.
 */
public class C { // classe publica

	public static void main(String[] args) { /* declaração que define o método principal de um 
	programa permitindo que ele seja acessado por qualquer classe dentro e fora do projeto.*/
		Scanner sc = new Scanner(System.in); // abertura do 'Scanner' para entrada de dados.

		System.out.print("Digite o seu saldo: "); // saída de impressão de texto. 
		double saldo = sc.nextDouble(); /* entrada para armazenar na variável 'saldo' que é do tipo
		double, pois contêm casas decimais.*/ 

		double reajuste = saldo + (saldo * 0.01); /* cálculo que acrescenta 1% no salário e armazena 
		o resultado na variável 'reajuste'.*/

		System.out.printf("Novo salário: %.2f", reajuste); /* saída de impressão de texto, e saída da
		variável 'reajuste'.*/

		sc.close(); // fechamento da entrada de dados. 
	}

}
