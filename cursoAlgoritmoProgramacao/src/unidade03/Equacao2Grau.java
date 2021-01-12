package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class Equacao2Grau {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		double delta;
		double X1;
		double X2;
		
		System.out.println("Por favor digite o valor de A");
		A = teclado.nextInt();
		
		System.out.println("Por favor digite o valor de B");
		B = teclado.nextInt();
		
		System.out.println("Por favor digite o valor de C");
		C = teclado.nextInt();
		
		delta = B * B - 4 * A * C;
		
		if (delta >= 0) {
			X1 = - B - (Math.sqrt(delta)) / 2 * A;
			X2 = - B + (Math.sqrt(delta)) / 2 * A;
			
			System.out.println("O valor de X1= " + X1);
			System.out.println("O valor de X2= " + X2);
		}
		else {
			System.out.println("Não existem raízes reais!!");
		}
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
