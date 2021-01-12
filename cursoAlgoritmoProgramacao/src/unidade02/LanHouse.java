package unidade02;

import java.util.Locale;
import java.util.Scanner;

public class LanHouse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final int VALOR_POR_15_MINUTOS = 2;
		
		double horas;
		double minutos;
		double totalMinutos;
		double totalPagar;
		
		System.out.println("Favor informar o numero de horas utilizados");
		horas = teclado.nextDouble();
		
		System.out.println("Favor informar o numero de minutos utilizados");
		minutos = teclado.nextDouble();
		
		totalMinutos = (horas * 60) + minutos;
		totalPagar = (Math.ceil(totalMinutos / 15)) * VALOR_POR_15_MINUTOS; // Arrendoda a conta para cima.
		
		System.out.println("Total a pagar = R$ " + totalPagar);
		
		
		
		
		
		
		teclado.close();
	}

}
