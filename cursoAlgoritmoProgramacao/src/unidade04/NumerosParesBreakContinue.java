package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesBreakContinue {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declara��o de vari�veis!
		int a;
		int b;
		
		
		System.out.print("Por favor informar o n�mero a:");
		a = sc.nextInt();
		
		System.out.print("Por favor informar o n�mero b:");
		b = sc.nextInt();
		
		for (int i = a + 1; i < b; i = i + 1) 
		{
			if ( i % 2 == 0) // � par!
				System.out.println("o n�mero " + i + " � par!");
		}
		
		
		
		
		
		sc.close();
	}

}
