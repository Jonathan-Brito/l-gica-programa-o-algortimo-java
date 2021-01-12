package unidade02;

//import java.util.Locale;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaHoras {
	
	public static void main(String[] args) {
		/*Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int dias;
		int horas;
		int total_horas;
		
		System.out.println("Favor informar o número de dias da viagem: ");
		dias = teclado.nextInt();
		
		System.out.println("Favor informar o número de horas da viagem: ");
		horas = teclado.nextInt();
		
		total_horas = dias * 24 + horas;
		
		System.out.println("O valor toral da viagem em horas foi de " + total_horas);
		
		
		
		
		
		
		teclado.close();*/
		
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Informar o número de dias de viagem"));
		//JOptionPane.showMessageDialog(null, dias);
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Informar o número de horas da viagem"));
		//JOptionPane.showMessageDialog(null, horas);
		int total_horas = (dias * 24) + horas;
		JOptionPane.showMessageDialog(null, "O valor total da viagem a ser pago é de " + total_horas + " horas");
		
	}

}
