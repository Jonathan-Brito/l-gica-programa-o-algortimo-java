package unidade02;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final double numero_avaliacoes = 4; // Constante
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("Por favor informar a nota 1");
		nota1 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 2");
		nota2 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 3");
		nota3 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 4");
		nota4 = teclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / numero_avaliacoes;
		
		System.out.println("A média aritmética é " + media);
		
		
		
		
		
		teclado.close();
	}

}
