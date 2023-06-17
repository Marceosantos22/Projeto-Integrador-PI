package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class FornecedorDAO implements GenericoDAO<Fornecedor> {

	private ConexaoBD conexao;

	public FornecedorDAO(ConexaoBD conexao) {
		
		this.conexao = conexao;
	}

	@Override
	public boolean insert(Fornecedor obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Fornecedor obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Fornecedor select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
