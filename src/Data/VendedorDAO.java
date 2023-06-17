package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class VendedorDAO implements GenericoDAO<Vendedor> {

	private ConexaoBD conexao;

	public VendedorDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	@Override
	public boolean  insert(Vendedor obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Vendedor obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Vendedor select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
