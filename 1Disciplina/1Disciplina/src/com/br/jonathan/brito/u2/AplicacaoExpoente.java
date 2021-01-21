package com.br.jonathan.brito.u2;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoExpoente {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double e = 0;

		System.out.println("Por favor digite o valor de x: ");
		double x = sc.nextDouble();

		for (int y = 1; y <= 50; y++) {
			e += Math.pow(x, y) / y;
			System.out.printf("O valor de e(x)= %.2f", e);
		}

		sc.close();
	}

}
