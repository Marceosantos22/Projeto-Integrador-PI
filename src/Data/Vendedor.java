package Data;

import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Vendedor extends Pessoa {

	private int IdVendedor;
	private String rg;
	private String cpf;
	private Date dataNasc;
	private Double comissao;

	public Vendedor() {

	}

	public Vendedor(int IdVendedor, String rg, String cpf, Date dataNasc, Double comissao, String nome,
			  String email, String endereco, String telefone) {
		super(nome, email, endereco, telefone);
		this.IdVendedor = IdVendedor;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.comissao = comissao;
	}

	public int getIdVendedor() {
		return IdVendedor;
	}

	public void setIdVendedor(int IdVendedor) {
		this.IdVendedor = IdVendedor;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
