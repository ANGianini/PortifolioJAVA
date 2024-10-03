/*Um valor inteiro N. Este valor será a quantidade de valores
inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão
dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
informações conforme exemplo (use a palavra “dentro” e “fora”).*/
import java.util.Scanner;
public class Exe_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x, dentro = 0, fora = 0, cont = 1;
		
		System.out.print("Digite a quantidade de números que serão ligos em seguida: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Digite " + cont++  + "º valor inteiro: ");
			x = sc.nextInt();
		
			if(x >= 10 && x <= 20) {
				dentro++;
			}else {
				fora++;
			}
		}
	
		System.out.print(dentro + " dentro\n" + fora + " fora");

		sc.close();
	}

}
