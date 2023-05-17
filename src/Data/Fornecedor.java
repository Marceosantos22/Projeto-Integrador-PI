package Data;

/**
 * @author Marcelo Oliveira
 */
public class Fornecedor extends Pessoa {

	private int IdFornecedor;
	private String nomefantasia;
	private String cnpjCpf;
	private String descricao;

	public Fornecedor() {

		super();

	}

	public Fornecedor(int IdFornecedor, String nomefantasia, String cnpjCpf, String descricao, String nome, String email, String endereco, String telefone) {
		super(nome, email, endereco, telefone);
		this.IdFornecedor = IdFornecedor;
		this.nomefantasia = nomefantasia;
		this.cnpjCpf = cnpjCpf;
		this.descricao = descricao;
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

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
