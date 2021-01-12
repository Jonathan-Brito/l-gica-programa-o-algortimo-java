package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class FatorialWhile {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis!
		double fatorial = 1;
		int numero;
		int i;
		
		System.out.println("Por favor digite um número: ");
		numero = sc.nextInt();
		
		i = numero;
		
		while (i >= 1) 
		{
			fatorial = fatorial * i;
			i = i - 1; // i -- = (Decremento)!
		}
		
		System.out.println("O fatorial do número: " + numero + " = " + fatorial);
		
		sc.close();
	}

}
