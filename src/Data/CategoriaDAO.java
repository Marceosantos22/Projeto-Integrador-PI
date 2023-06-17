package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Data.ConexaoBD;

/**
 * @author Marcelo Oliveira
 */
public class CategoriaDAO implements GenericoDAO<Categoria> {

	private ConexaoBD conexao;

	public CategoriaDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	@Override
	public boolean insert(Categoria obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int update(Categoria obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Categoria select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
