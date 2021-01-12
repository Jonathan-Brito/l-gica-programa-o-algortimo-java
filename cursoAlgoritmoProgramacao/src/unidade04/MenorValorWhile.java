package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class MenorValorWhile {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int menor;
		int maior;
		
		
		System.out.println("Por favor informar um valor: ");
		valor = sc.nextInt();
		
		menor = valor;
		maior = valor;
		
		while (valor != 0) 
		{
			if (valor < menor) 
				menor = valor;
			
			else if (valor > maior)
				maior = valor;
			
			System.out.println("Por favor informar o próximo valor: ");
			valor = sc.nextInt();
			
		}
		
		System.out.println("o menor valor = " + menor);
		System.out.println("o maior valor = " + maior);
		
		
		sc.close();
	}

}
