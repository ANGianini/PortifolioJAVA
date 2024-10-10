/*Exercício E - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a
senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.
 * */

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 2002, cont = 3, senha_digitada = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite a senha: ");
			senha_digitada = sc.nextInt();

			cont -= 1;
			
			if (senha_digitada != senha)
				if (cont != 0)
					System.out.print("\nAcesso negado, você te mais " + cont + " tentativa.\n");
			if (senha_digitada == senha)
				break;
		}

		if (senha_digitada == senha)
			System.out.print("\nAcesso Liberado!");
		if (senha_digitada != senha)
			System.out.print("\nAcesso Bloqueado! Tente novamente mais tarde.");

		sc.close();
	}

}
