package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class ProdutoDAO implements GenericoDAO<Produto> {

	private ConexaoBD conexao;

	public ProdutoDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	@Override
	public int insert(Produto obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Produto obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Produto select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
