package unidade05;

import java.util.Locale;
import java.util.Scanner;

public class CalculaVetor {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A [] = new double [10];
		double B [] = new double [10];
		
		int i;
		
		for (i = 0; i < 10; i = i +1) {
			System.out.println("Favor informar o valor de A [ " + i + " ]");
			A[i] = sc.nextDouble();
			// Alimentar o vetor B []!
			
			if (i % 2 == 0)  // � par?
				B [i] = 2 * A [i];
			
			else
				B [i] = A [i] / 2;
		}
		
		for (double valor : A)
			System.out.println("A" + valor);
		System.out.println("****************");
		for (double valor : B)
			System.out.println("B" + valor);
		
		
		
		
		sc.close();
	}

}
