package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMediaRepita {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor informar um valor");
		int valor = sc.nextInt();
		
		int cont = 0;
		int somaValor = 0;
		
		do  
		{
			if (valor != -1)
			{	
			somaValor = somaValor + valor;
			cont = cont + 1; // cont ++!
			
			System.out.println("Por favor informar um valor");
			valor = sc.nextInt();
			}
			
		} while (valor != - 1);
		
		if (cont != 0)
		System.out.println("Média = " + somaValor / cont);
		
		sc.close();
	}

}
