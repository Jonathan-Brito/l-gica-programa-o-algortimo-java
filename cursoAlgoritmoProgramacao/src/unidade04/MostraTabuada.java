package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class MostraTabuada {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i;
		int numero;
		int total = 1;
		
		System.out.println("Por favor digite um número");
		numero = sc.nextInt();
		
		
		
		for (i = 1; i <= 10; i = i + 1) {
			total = numero * i;
			
			System.out.println("Número " + numero + " x " + i + " = " + total);
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
