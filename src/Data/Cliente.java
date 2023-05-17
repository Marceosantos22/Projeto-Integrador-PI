package Data;

import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Cliente extends Pessoa {

	private int idCliente;
	private String rg;
	private String cpf;
	private String estado;
	private Date dataNasc;
	private String obs;

	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String rg, String cpf, String estado, Date dataNasc, String obs, String nome, String email, String endereco, String telefone) {
		super(nome, email, endereco, telefone);
		this.idCliente = idCliente;
		this.rg = rg;
		this.cpf = cpf;
		this.estado = estado;
		this.dataNasc = dataNasc;
		this.obs = obs;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRgIE() {
		return rg;
	}

	public void setRgIE(String rgIE) {
		this.rg = rgIE;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	
	
}
