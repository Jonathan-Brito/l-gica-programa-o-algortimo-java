package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		System.out.println("Digite o lado A");
		A = sc.nextInt();
		
		System.out.println("Digite o lado B");
		B = sc.nextInt();
		
		System.out.println("Digite o lado C");
		C = sc.nextInt();
		
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
			
			// É TRIÂNGULO !
			// QUAL O TIPO ?
			if ((A == B) && (B == C)) {
				System.out.println("Triângulo equilátero !");
			}
			else if ((A == B) || (B == C) || (C == A)) {
				System.out.println("Triângulo isócelos !");
			}
			else {
				System.out.println("Triângulo escaleno !");
			}
		}
		else {
			System.out.println("Os lados informados não formam um triângulo !");
		}
		
		
		
		
		sc.close();
	}

}
