package unidade05;

import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int numero) {
		
		int s1 = 1;
		int s2 = 1;
		int s = 0;
		int i;
		for (i=3; i <=numero; i++) {
			s = s1 + s2;
			s1 = s2;
			s2 = s;
		}
		
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor informar um número: ");
		int numero = sc.nextInt();
		fibo(numero);
		
		sc.close();
	}
}
