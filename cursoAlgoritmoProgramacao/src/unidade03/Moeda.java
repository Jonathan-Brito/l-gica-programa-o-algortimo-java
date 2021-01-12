package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class Moeda {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor, valorConvertido;
		System.out.println("Favor informar o valor a ser a ser convertido");
		valor = sc.nextDouble();
		
		System.out.println("Favor informar o tipo  de moeda [1-Libra] [2-Dólar] [3-Euro]");
		int tipoMoeda = sc.nextInt();
		
		switch (tipoMoeda) 
		{
		case 1: // Libra 
			{
				valorConvertido = valor / 5;
				System.out.println("O valor convertido em Libras é de " + valorConvertido);
				break;
			}
						
		case 2: // Dólar
			{
				valorConvertido = valor / 4;
				System.out.println("O valor convertido em Dólar é de " + valorConvertido);
				break;
			}
			
		case 3: // Euro	
			{
				valorConvertido = valor / 4.4;
				System.out.println("O valor convertido em Euro é de " + valorConvertido);
				break;
			}
		
		default:
			System.out.println("O valor informado é inválido !");
			
		}
		
		sc.close();
	}

}
