package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class NumeroEstrelasRepeticao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i;
		int numeroLinhas;
		String estrela = " * ";
		
		System.out.println("por favor informar o número de linhas:");
		numeroLinhas = sc.nextInt();
		
		for ( i = 1; i <= numeroLinhas; i = i + 1) 
		{
			System.out.println(estrela);
			estrela = estrela + " * ";
		}
		
		
		
		
		sc.close();
	}

}
