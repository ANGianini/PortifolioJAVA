/*Algorismo que calcula o IMC, e basiado nele a saída é pelo Laço de Repetição if..else
 * */
import java.util.Scanner;
public class Calc_IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura, peso, imc;
		char sexo;
		
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		
		System.out.print("Informe seu sexo F(em maiusculo) para feminino ou M(em maiusculo) para masculino: ");
		sexo  = scanner.next().charAt(0);
		
		System.out.print("Informe seu peso: ");
		peso = scanner.nextDouble();
		
		System.out.print("Informe sua altura: ");
		altura  = scanner.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.printf("Bem Vindo! " + nome + "\nSeu IMC é: %.2f\nSua classificação: ", imc);
		
		if(imc < 18.5) {System.out.print("abaixo do peso.");}
		else if(imc >= 18.5 && imc <= 24.9) {System.out.print("peso ideal(parabéns).");}
		else if(imc >= 25.0 && imc <= 29.9) {System.out.print("levemente acima do peso.");}
		else if(imc >= 30.0 && imc <= 34.9) {System.out.print("obesidade grau I.");}
		else if(imc >= 35.0 && imc <= 39.9) {System.out.print("obesidade grau II(severa).");}
		else {System.out.print("obesidade grau III(mórbida).");}
		
		scanner.close();
	}

}
