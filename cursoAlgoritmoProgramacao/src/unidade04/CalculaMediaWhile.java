package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMediaWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor informar um valor");
		int valor = sc.nextInt();
		
		int cont = 0;
		int somaValor = 0;
		
		while (valor != - 1) 
		{
			somaValor = somaValor + valor;
			cont = cont + 1; // cont ++!
			
			System.out.println("Por favor informar um valor");
			valor = sc.nextInt();
			
		}
		
		System.out.println("Média = " + somaValor / cont);
		
		
		
		
		
		sc.close();
	}

}
