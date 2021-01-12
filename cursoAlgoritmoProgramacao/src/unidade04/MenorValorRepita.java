package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class MenorValorRepita {
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
		
		do 
		{
			if (valor < menor) 
				menor = valor;
			
			else if (valor > maior)
				maior = valor;
			
			System.out.println("Por favor informar o próximo valor: ");
			valor = sc.nextInt();
			
		}
		while (valor != 0);
		
		System.out.println("o menor valor = " + menor);
		System.out.println("o maior valor = " + maior);
		
		
		sc.close();
	}

}
