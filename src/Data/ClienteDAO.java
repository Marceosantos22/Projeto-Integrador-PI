package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class ClienteDAO implements GenericoDAO<Cliente> {

	private ConexaoBD conexao;

	public ClienteDAO(ConexaoBD conexao) {
		this.conexao = conexao;
	}

	@Override
	public int insert(Cliente obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Cliente obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Cliente select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
