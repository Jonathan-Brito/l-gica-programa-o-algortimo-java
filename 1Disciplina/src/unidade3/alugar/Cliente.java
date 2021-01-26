package unidade3.alugar;

public class Cliente {

	public long idClient;
	public String cpf;
	public String nome;
	public String cnh;

	public Cliente() {

	}

	public Cliente(long idClient, String cpf, String nome, String cnh) {

		this.idClient = idClient;
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Cliente [idClient=" + idClient + ", " + "cpf=" + cpf + ", nome=" + nome + ", cnh=" + cnh + "]";
	}

}
