package com.br.jonathan.brito.u2;

import java.util.Locale;

public class AplicacaoFibonacci {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int anterior1 = 1;
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		int soma = anterior1 + anterior2 + calculado;
		System.out.println(anterior1 + " , " + anterior2 + " , " + calculado);

		for (int i = 4; i <= 20; i++) {
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1 + anterior2;
			soma += calculado;
			System.out.println(calculado + " , ");
		}

		double media = soma / 20;
		System.out.println("Media= " + media);

	}

}
