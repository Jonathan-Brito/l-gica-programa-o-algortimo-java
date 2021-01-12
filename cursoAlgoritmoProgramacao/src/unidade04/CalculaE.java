package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class CalculaE {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double e = 0;
		int i;
		
		System.out.println("Favor informar o valor de X: ");
		x = sc.nextDouble();
		
		for (i = 1; i <= 50; i = i + 1)
			e = e + Math.pow(x, i) / i;
		
		System.out.println("O valor de E^ = " + x + " = " + e);
		
		
		sc.close();
	}

}
