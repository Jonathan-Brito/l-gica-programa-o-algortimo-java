package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class NumeroParOuImpar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Por favor didite um n�mero");
		numero = teclado.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("N�mero = " + numero + " � par");
		}
		else {
			System.out.println("N�mero = " + numero + " � impar");
		}
		
		
		
		
		teclado.close();
	}

}
