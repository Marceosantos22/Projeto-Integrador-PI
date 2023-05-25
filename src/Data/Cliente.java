package Data;

import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Cliente extends Pessoa {

	private int idCliente;
	private String rgcliente;
	private String cpfCliente;
	private String estadoCliente;
	private Date dataNascCliente;
	private String obscliente;

	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String rgcliente, String cpfCliente, String estadoCliente, Date dataNascCliente, String obscliente, String			nome, String email, String endereco, String telefone) {
		super(nome, email, endereco, telefone);
		this.idCliente = idCliente;
		this.rgcliente = rgcliente;
		this.cpfCliente = cpfCliente;
		this.estadoCliente = estadoCliente;
		this.dataNascCliente = dataNascCliente;
		this.obscliente = obscliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRgcliente() {
		return rgcliente;
	}

	public void setRgcliente(String rgcliente) {
		this.rgcliente = rgcliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public Date getDataNascCliente() {
		return dataNascCliente;
	}

	public void setDataNascCliente(Date dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}

	public String getObscliente() {
		return obscliente;
	}

	public void setObscliente(String obscliente) {
		this.obscliente = obscliente;
	}
	
	


	
	
	
}
