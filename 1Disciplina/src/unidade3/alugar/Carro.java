package unidade3.alugar;

public class Carro {
	
	public long idCarro;
	public String placa;
	public String fabricante;
	public String modelo;
	public int ano;
	public String cor;
	public float valorDiaria;
	

	public Carro() {

	}

	public Carro(String cor, String fabricante) {

		this.cor = cor;
		this.fabricante = fabricante;
	}
	
	
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", fabricante=" + fabricante + "]";
	}

}
