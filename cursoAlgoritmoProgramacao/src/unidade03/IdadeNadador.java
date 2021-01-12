package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class IdadeNadador {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do atleta de nata��o");
		idade = sc.nextInt();
		
		if (idade >= 0 && idade <= 100)
		{
			if (idade <= 5) {
				System.out.println("A sua � de " + idade + " anos, Infantil A");
			}
			else if (idade <= 8) {
				System.out.println("A sua � de " + idade + " anos, Infantil B");
			}
			else if (idade <= 11) {
				System.out.println("A sua � de " + idade + " anos, Infantil C");
			}
			else if (idade <= 13) {
				System.out.println("A sua � de " + idade + " anos, Juvenil A");
			}
			else if (idade <= 17) {
				System.out.println("A sua � de " + idade + " anos, Juvenil B");
			}
			else {
				System.out.println("A sua � de " + idade + " anos, Adulto");
			}
		}
		else {
			System.out.println("A sua � de " + idade + " anos, � inv�lida ");
			IdadeNadador.main(null);
		}
		
		
		
		
		
		sc.close();
		}

}
