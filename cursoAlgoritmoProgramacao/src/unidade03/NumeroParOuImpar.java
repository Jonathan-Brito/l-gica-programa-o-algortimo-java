package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class NumeroParOuImpar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Por favor didite um número");
		numero = teclado.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("Número = " + numero + " é par");
		}
		else {
			System.out.println("Número = " + numero + " é impar");
		}
		
		
		
		
		teclado.close();
	}

}
