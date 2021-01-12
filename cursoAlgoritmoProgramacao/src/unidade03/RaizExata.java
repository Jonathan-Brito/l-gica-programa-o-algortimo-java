package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class RaizExata {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		double raizExata;
		double maiorValor;
		
		System.out.println("Por favor digite um n�mero:");
		numero = teclado.nextInt();
		
		raizExata = (Math.sqrt(numero));
		maiorValor = (Math.round(raizExata));
		
		if (raizExata == maiorValor) {
			System.out.println("Existe raiz exata para o n�mero " + numero);
		}
		else {
			System.out.println("N�o exite raiz exata para o n�mero " + numero);
		}
		
		
		
		teclado.close();
		
	}

}
