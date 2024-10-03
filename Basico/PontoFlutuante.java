/*Um programa que leia três valores com ponto flutuante: A, B e C. Em seguida, calcule e mostre:
 * a) A área do triângulo retângulo que tem A por base e C por altura. (Área do triângulo = (A*C)/2)).
 * 
 * b) A área do círculo de raio C. Pi = 3.14159. (Área do círculo = Pi*(C*C)).
 * 
 * c) A área do trapézio que tem A e B por bases e C por altura. (Área do trapézio = (A+B)*C/2)).
 * 
 * d) A área do quadrado que tem lado B. (Área do quadrado = B*B).
 * 
 * e) A área do retângulo que tem lados A e B. (Área do retângulo = A*B).
*/

import java.util.Scanner;
public class Exe_PontoFlutuante_Andressa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b , c;
		
		System.out.println("Informe o valor de A, B e C.");
		System.out.print("A: ");
		a = scanner.nextDouble();
		
		System.out.print("B: ");
		b = scanner.nextDouble();
		
		System.out.print("C: ");
		c = scanner.nextDouble();
		
		System.out.printf("\nTriângulo = %.3f%n", ((a*c)/2));
		System.out.printf("Circulo = %.3f%n", (3.14159*(c*c)));
		System.out.printf("Trapézio = %.3f%n", ((a+b)*c/2));
		System.out.printf("Quadrado = %.3f%n", (b*b));
		System.out.printf("Retângulo = %.3f%n", (a*b));
	
	}

}
