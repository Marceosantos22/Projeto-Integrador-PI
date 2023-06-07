package Data;

/**
 * @author Marcelo Oliveira
 */
public class Fornecedor extends Pessoa {

	private int IdFornecedor;
	private String nomefantasia;
	private String cnpjCpfFornecedor;
	private String descricaoFornecedor;

	public Fornecedor() {

		super();

	}

	public Fornecedor(int IdFornecedor, String nomefantasia, String cnpjCpfFornecedor, String descricaoFornecedor, String nome, String email, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String telefone, String celular) {
		super(nome, email, endereco, numero, complemento, bairro, cidade, uf, telefone, celular);
		this.IdFornecedor = IdFornecedor;
		this.nomefantasia = nomefantasia;
		this.cnpjCpfFornecedor = cnpjCpfFornecedor;
		this.descricaoFornecedor = descricaoFornecedor;
	}

	public int getIdFornecedor() {
		return IdFornecedor;
	}

	public void setIdFornecedor(int IdFornecedor) {
		this.IdFornecedor = IdFornecedor;
	}

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getCnpjCpfFornecedor() {
		return cnpjCpfFornecedor;
	}

	public void setCnpjCpfFornecedor(String cnpjCpfFornecedor) {
		this.cnpjCpfFornecedor = cnpjCpfFornecedor;
	}

	public String getDescricaoFornecedor() {
		return descricaoFornecedor;
	}

	public void setDescricaoFornecedor(String descricaoFornecedor) {
		this.descricaoFornecedor = descricaoFornecedor;
	}



	
	
}
