/*Exercício H - Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. 
 * Utilize o laço que lhe for mais conveniente.
 * */

public class H {

	public static void main(String[] args) {

		int quant_par = 0, soma = 0;

		for (int i = 13; i <= 73; i++) {
			if (i % 2 == 0) {
				quant_par++;
				soma += i;
			}
		}

		System.out.print("Soma total dos números pares: " + soma + "\nQuantidade de números pares: " + quant_par
				+ "\nMédia aritimética dos números: " + soma / quant_par);

	}

}
