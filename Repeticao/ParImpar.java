// Quais numeros são impares ou pares até 50

public class ParImpar {
	public static void main(String[] args) {

		int par, impar;

		System.out.print("Pares: ");
		for (par = 1; par <= 50; par++) {
			if (par % 2 == 0) {
				System.out.printf("%d ", par);
			}
		}

		System.out.print("\nÍmpares: ");
		for (impar = 1; impar <= 50; impar++) {
			if (impar % 2 != 0) {
				System.out.printf("%d ", impar);
			}
		}

	}

}
