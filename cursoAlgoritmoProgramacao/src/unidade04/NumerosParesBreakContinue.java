package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesBreakContinue {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis!
		int a;
		int b;
		
		
		System.out.print("Por favor informar o número a:");
		a = sc.nextInt();
		
		System.out.print("Por favor informar o número b:");
		b = sc.nextInt();
		
		for (int i = a + 1; i < b; i = i + 1) 
		{
			if ( i % 2 == 0) // É par!
				System.out.println("o número " + i + " é par!");
		}
		
		
		
		
		
		sc.close();
	}

}
