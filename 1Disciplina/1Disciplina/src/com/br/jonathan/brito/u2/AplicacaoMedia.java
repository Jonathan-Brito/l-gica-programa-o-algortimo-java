package com.br.jonathan.brito.u2;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoMedia {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite um valor");
		int valor = sc.nextInt();
		int maior, menor, numeros = 0;
		maior = menor = valor;
		double media = 0, soma = 0;

		while (valor != -1) {
			soma += valor;
			numeros++;

			if (valor > maior) {
				maior = valor;
			} else if (valor < menor)
				menor = valor;
			
			System.out.println("Por favor digite um valor");
			valor = sc.nextInt();
		}

		media = soma / numeros;
		System.out.println("Maior valor= " + maior);
		System.out.println("Menor valor= " + menor);
		System.out.printf("Média = %.2f ", media);

		sc.close();
	}

}
