package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class VendaDAO implements GenericoDAO<Venda> {

	private ConexaoBD conexao;

	public VendaDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	@Override
	public int insert(Venda obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Venda obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Venda select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
