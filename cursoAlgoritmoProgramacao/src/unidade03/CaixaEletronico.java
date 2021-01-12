package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis
		
		int saque;
		double notas100;
		double notas50;
		double notas10;
		int resto;
		
		System.out.println("Digite o valor do saque por favor");
		saque = sc.nextInt();
		
		if (saque % 10 == 0) {
			notas100 = Math.floor((saque / 100));
			resto = saque % 100;
			
			notas50 = Math.floor((saque / 50));
			resto = saque % 50;
			
			notas10 = Math.floor((saque / 10));
			resto = saque % 10;
			
			if (notas100 > 0) {
				System.out.println("O número de notas de cem= R$" + notas100 + " Reais");
			}
			
			if (notas50 > 0) {
				System.out.println("O número de notas de cinquenta= R$" + notas50 + " Reais");
			}
			
			if (notas10 > 0) {
				System.out.println("O número de notas de dez= R$" + notas10 + " Reais");
			}
		}
		else {
			System.out.println("O valor informado do saque R$= " + saque + " está incorreto !");
		}
		
		
		
		
		sc.close();
	}

}
