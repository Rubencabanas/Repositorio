package operar_arrays;

public class Rellenar_array {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (20 - 1) + 1);
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}
}
