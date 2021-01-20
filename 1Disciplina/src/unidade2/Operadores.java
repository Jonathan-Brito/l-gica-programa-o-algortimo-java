package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite o primeiro valor: ");
		int num1 = sc.nextInt();
		
		System.out.println("Por favor digite o segundo valor: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		float divisao = (float) num1 / num2;
		int resto = num1 % num2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.printf("Divis�o:%.3f \n", divisao);
		System.out.println("Resto: " + resto);
		
		System.out.println("N�mero 1 � maior que n�mero 2 ? " + (num1 > num2));
		System.out.println("N�mero 1 � menor que n�mero 2 ? " + (num1 < num2));
		System.out.println("N�mero 1 � igul a n�mero 2 ? " + (num1 == num2));
		System.out.println("N�mero 1 � diferente que n�mero 2 ? " + (num1 != num2));
		
		sc.close();
	}

}
