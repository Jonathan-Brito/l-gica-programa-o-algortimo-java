package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class MenorMaiorMediaRepeticao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		double menor;
		double maior;
		double media = 0;
		int cont = 1;
		
		
		System.out.println("Por favor informe o valor: ");
		valor = sc.nextDouble();
		
		menor = valor;
		maior = valor;
		
		while (valor != 0) 
		{
			cont = cont + 1; // cont ++!
			if (valor < menor) {
				menor = valor;
			}
			else if (valor > maior) {
				maior = valor;
			}
			
			media = media + valor;
			
			System.out.println("Favor informar o valor: ");
			valor = sc.nextDouble();
			
		}
		
		media = media / cont;
		
		System.out.println("O menor valor é: " + menor);
		System.out.println("O maior valor é: " + maior);
		System.out.println("A média dos valores é: " + media);
		
		
		
		
		
		
		sc.close();
	}

}
