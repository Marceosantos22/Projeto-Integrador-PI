package Data;

import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Venda {

	private int idVenda;
	private Date dataVenda;
	Cliente cliente;
	private String telefone;
	Produto produto;
	Categoria categoria;
	private Double valor;
	private Double desconto;
	Vendedor vendedor;
	private String status;

	public Venda() {

	}

	public Venda(int idVenda, Date datavenda, Cliente cliente, String telefone, Produto produto,
			  Categoria categoria, Double valor, Double desconto, Vendedor vendedor, String status) {
		this.idVenda = idVenda;
		this.dataVenda = datavenda;
		this.cliente = cliente;
		this.telefone = telefone;
		this.produto = produto;
		this.categoria = categoria;
		this.valor = valor;
		this.desconto = desconto;
		this.vendedor = vendedor;
		this.status = status;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDatavenda() {
		return dataVenda;
	}

	public void setDatavenda(Date datavenda) {
		this.dataVenda = datavenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
