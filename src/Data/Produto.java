package Data;

/**
 * @author Marcelo Oliveira
 */
public class Produto {

	private int IdProduto;
	private String nomeProduto;
	private String codProduto;
	private Double vlrcusto;
	private Double vlrVenda;
	private String descricao;
	Fornecedor fornecedor;
	Categoria categoria;

	public Produto() {

	}

	public Produto(int IdProduto, String nomeProduto, String codProduto, Double vlrcusto, Double vlrVenda,
			  String descricao, Fornecedor fornecedor, Categoria categoria) {
		this.IdProduto = IdProduto;
		this.nomeProduto = nomeProduto;
		this.codProduto = codProduto;
		this.vlrcusto = vlrcusto;
		this.vlrVenda = vlrVenda;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
	}

	public int getIdProduto() {
		return IdProduto;
	}

	public void setIdProduto(int IdProduto) {
		this.IdProduto = IdProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public Double getVlrcusto() {
		return vlrcusto;
	}

	public void setVlrcusto(Double vlrcusto) {
		this.vlrcusto = vlrcusto;
	}

	public Double getVlrVenda() {
		return vlrVenda;
	}

	public void setVlrVenda(Double vlrVenda) {
		this.vlrVenda = vlrVenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
