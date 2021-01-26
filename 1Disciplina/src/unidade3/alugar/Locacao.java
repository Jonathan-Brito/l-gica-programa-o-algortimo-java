package unidade3.alugar;

import java.time.LocalDate;

public class Locacao {

	public long idLocacao;
	public long idCliente;
	public long idCarrro;
	public float valorLocado;
	public LocalDate dataInicial;
	public LocalDate dataFinal;

	public Locacao() {

	}

	public Locacao(long idLocacao, long idCliente, long idCarrro, float valorLocado, LocalDate dataInicial,
			LocalDate dataFinal) {

		this.idLocacao = idLocacao;
		this.idCliente = idCliente;
		this.idCarrro = idCarrro;
		this.valorLocado = valorLocado;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		return "Locacao [idLocacao=" + idLocacao + ", " + "idCliente=" + idCliente + ", idCarrro=" + idCarrro
				+ ", valorLocado=" + valorLocado + ", " + "dataInicial=" + dataInicial + ", " + "dataFinal=" + dataFinal
				+ "]";
	}

}
