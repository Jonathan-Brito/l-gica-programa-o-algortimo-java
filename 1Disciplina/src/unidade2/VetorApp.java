package unidade2;

import java.util.Locale;

public class VetorApp {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Vetor tipo primitivo
		int fibo[] = new int[20];
		
		fibo[0] = 1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0];
		
		for (int i = 3; i < 20; i ++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int f : fibo) {
			System.out.print(f + " ,");
		}
		
		// Vetor de objetos
		String vetor[] = new String[10];
		vetor[0] = new String("Junior");
		vetor[1] = new String("Brito");
		
		for (String z : vetor) {
			System.out.println(z + " ,");
		}
	}

}
