//Um número inteiro N e calcular todos os seus divisores.
import java.util.Scanner;
public class Exe_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número inteiro para calcular os seus divisores: ");
		n = sc.nextInt();
		
		System.out.print("Os divisores de " + n + " são: ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
			System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
