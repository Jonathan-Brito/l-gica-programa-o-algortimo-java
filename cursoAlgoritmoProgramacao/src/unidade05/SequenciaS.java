package unidade05;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaS {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s;
		double s9 = 0;
		double s10 = 0;
		double s100 = 0;
		double s10000 = 0;
		double i;
		
		s = 1;
		//   Inicio - Condição - Incremento ou Decremento ( i ++ )!

		for (i = 2; i <= 10000; i = i + 1) 
		{
			s = s + 3;
			if (i == 9)
				s9 = s;
			
			else if (i == 10)
				s10 = s;
			
			else if (i == 100)
				s100 = s;
			
			else if (i == 10000)
				s10000 = s;
			
		}
		
		System.out.println("S9 =" + s9);
		System.out.println("S10 =" + s10);
		System.out.println("S100 =" + s100);
		System.out.println("S10000 =" + s10000);
		
		
		
		
		
		
		
		
		sc.close();
	}

}

