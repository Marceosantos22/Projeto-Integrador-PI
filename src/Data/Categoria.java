package Data;

/**
 * @author Marcelo Oliveira
 */
public class Categoria {

	private int idCategoria;
	private String nomeCategoria;
	private String descricaoCategoria;

	public Categoria() {

	}

	public Categoria(int idCategoria, String nomeCategoria, String descricao) {
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricao;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricao() {
		return descricaoCategoria;
	}

	public void setDescricao(String descricao) {
		this.descricaoCategoria = descricao;
	}

}
