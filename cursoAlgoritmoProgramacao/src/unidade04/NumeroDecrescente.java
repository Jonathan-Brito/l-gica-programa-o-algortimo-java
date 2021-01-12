package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class NumeroDecrescente {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Por favor digite um número:");
		numero = sc.nextInt();
		
		for (int i = numero; i >= 1; i = i - 1) {
			
			
			System.out.println("Número = " + i);
		}
		
		
		
		
		sc.close();
	}

}
