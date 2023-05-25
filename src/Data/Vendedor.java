package Data;

import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Vendedor extends Pessoa {

	private int IdVendedor;
	private String rgVendedor;
	private String cpfVendedor;
	private Date dataNascVendedor;
	private Double comissaoVendedor;

	public Vendedor() {

	}

	public Vendedor(int IdVendedor, String rgVendedor, String cpfVendedor, Date dataNascVendedor, Double comissaoVendedor, String nome,
			  String email, String endereco, String telefone) {
		super(nome, email, endereco, telefone);
		this.IdVendedor = IdVendedor;
		this.rgVendedor = rgVendedor;
		this.cpfVendedor = cpfVendedor;
		this.dataNascVendedor = dataNascVendedor;
		this.comissaoVendedor = comissaoVendedor;
	}

	public int getIdVendedor() {
		return IdVendedor;
	}

	public void setIdVendedor(int IdVendedor) {
		this.IdVendedor = IdVendedor;
	}

	public String getRgVendedor() {
		return rgVendedor;
	}

	public void setRgVendedor(String rgVendedor) {
		this.rgVendedor = rgVendedor;
	}

	public String getCpfVendedor() {
		return cpfVendedor;
	}

	public void setCpfVendedor(String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}

	public Date getDataNascVendedor() {
		return dataNascVendedor;
	}

	public void setDataNascVendedor(Date dataNascVendedor) {
		this.dataNascVendedor = dataNascVendedor;
	}

	public Double getComissaoVendedor() {
		return comissaoVendedor;
	}

	public void setComissaoVendedor(Double comissaoVendedor) {
		this.comissaoVendedor = comissaoVendedor;
	}

}
