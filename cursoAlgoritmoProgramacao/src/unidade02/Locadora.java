package unidade02;

import java.util.Locale;
import java.util.Scanner;

public class Locadora {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String tituloFilme;
		int duracaoFilmeHoras; 
		int duracaoFilmeMinutos;
		int novaDuracaoFilme;
		
		System.out.println("Favor informar o título do filme");
		tituloFilme = teclado.nextLine();
		
		System.out.println("Favor informar o numero de horas do filme");
		duracaoFilmeHoras = teclado.nextInt();
		
		System.out.println("Favor informar o numero de minutos do filme");
		duracaoFilmeMinutos = teclado.nextInt();
		
		novaDuracaoFilme = (duracaoFilmeHoras * 60) + duracaoFilmeMinutos;
		
		System.out.println("A duração final do filme em minutos é de " + novaDuracaoFilme);
		
		
		
		
		
		
		
		teclado.close();
	}

}
