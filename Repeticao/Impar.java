
/*Um valor inteiro X (1 >= x <= 1000). Em seguida mostre os
ímpares de 1 até X, valor por linha, inclusive o X se for o caso.*/
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("Digite até que número você deseja saber os ímpares: ");
		x = sc.nextInt();

		if (x >= 1 && x <= 1000) {
			System.out.print("Os ímpares são: ");
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.print("Erro. Reinecie e digite um número entre 1 e 1000!");
		}
		sc.close();
	}

}
