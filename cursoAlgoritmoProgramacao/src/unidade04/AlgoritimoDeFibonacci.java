package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritimoDeFibonacci {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s;
		double s1;
		double s2;
		double s9 = 0;
		double s10 = 0;
		double s100 = 0;
		double s10000 = 0;
		int i;
		
		s1 = 1;
		s2 = 1;
		
		for (i = 3; i <= 10000; i = i + 1) 
		{  // Inicio!
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			
			if (i == 9)
				s9 = s;
			
			else if (i == 10)
				s10 = s;
			
			else if (i == 100)
				s100 = s;
			
			else if (i == 10000)
				s10000 = s;
		}
		
		System.out.println("S9 = " + s9);
		System.out.println("S10 = " + s10);
		System.out.println("S100 = " + s100);
		System.out.println("S10000 = " + s10000);
		
		
		
		
		
		sc.close();
	}

}
