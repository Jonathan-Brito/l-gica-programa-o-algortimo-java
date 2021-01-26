package unidade3.alugar;

public class AlugarApp {
	public static void main(String[] args) {
		
		Carro car1 = new Carro(); // Object car 1
		Carro car2 = new Carro(); // Object car 2
		
		car1.idCarro = 1;
		car1.placa = "jdk 0000";
		car1.fabricante = "Ferrari";
		car1.modelo = "F1";
		car1.ano = 2020;
		car1.cor = "Azul";
		car1.valorDiaria = 90f;
		
		Cliente cliente1 = new Cliente();
		
		cliente1.idClient = 1;
		cliente1.cpf = "12345678990";
		cliente1.nome = "Junior";
		cliente1.cnh = "12345678912";
	
		
		System.out.println(car1);
		System.out.println(car2);
		
	}
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Locacao locacao = new Locacao();
		
		locacao.idCarrro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocacao = 1;
	}

}
