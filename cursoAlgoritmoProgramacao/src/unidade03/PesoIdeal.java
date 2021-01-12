package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double altura;
		double peso;
		double imc;
		String sexo;
		
		System.out.println("Por favor digite o seu sexo:");
		sexo = teclado.next();
		
		System.out.println("Por favor digite a sua altura:");
		altura = teclado.nextDouble();
		
		System.out.println("Por favor digite o seu peso:");
		peso = teclado.nextDouble();
		
		imc = peso / (altura * 2);
		
		
		if (imc <= 16) {
			System.out.println("Seu imc = " + imc + " subpeso severo !!");
		}
		else if (imc <= 19.9) {
			System.out.println("Seu imc = " + imc + " subpeso !!");
		}
		else if (imc <= 24.9) {
			System.out.println("Seu imc = " + imc + " normal !!");
		}
		else if  (imc <= 29.9) {
			System.out.println("Seu imc = " + imc + " sobrepeso !!");
		}
		else if (imc <=39.9) {
			System.out.println("Seu imc = " + imc + " obeso !!");
		}
		else {
			System.out.println("Seu imc = " + imc + " obeso mórbido !!");
		}
		
		System.out.println("O seu sexo é: " + sexo);
		
		teclado.close();
	}

}
