
/*Algortimo que converte bits para byte, mostra a quantidade de bytes e bits na saída
 */
import java.util.Scanner;

public class ConversorByte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long bits, bytes = 0;// Declaração de variável do tipo long 

		// Entrada de dados para a variável bits
		System.out.println(" === CONVERSOR BYTE ===");
		System.out.print("\nDigite a quantidade de bits que deseja converter: ");
		bits = sc.nextLong(); // entrada

		/* Processamento de dados que divide o valor de bits por 8, pois 
		   byte é igual a 8 bits */
		bytes = bits / 8;

		/* Saída de dados do resultado de bytes e processamento com saída do 
		   resto de divisão de bits por 8 */
		System.out.print("Isto resulta em " + bytes + " bytes e " + bits % 8 + " bits.");

		sc.close();
	}

}
