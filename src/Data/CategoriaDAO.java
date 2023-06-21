package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Data.ConexaoBD;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcelo Oliveira
 */
public class CategoriaDAO implements GenericoDAO<Categoria> {

	private ConexaoBD conexao;

	public CategoriaDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	@Override
	public boolean insert(Categoria categoria) {

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement("INSERT INTO categoria (nomeCategoria, descricaoCategoria)"
					  + " VALUES (?,?)");
			st.setString(1, categoria.getNomeCategoria());
			st.setString(2, categoria.getDescricao());

			int status = st.executeUpdate();
			st.close();

			conexao.desconectar();
			return status > 0;

		} catch (SQLException e) {

			System.out.println("Erro ao conectar: " + e.getMessage());
			return false;

		}
	}

	@Override
	public int update(Categoria categoria) {

		int status;

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement("UPDATE categoria SET nomeCategoria = ?, descricaoCategoria = ? "
					  + "WHERE IdCategoria = ?");

			st.setString(1, categoria.getNomeCategoria());
			st.setString(2, categoria.getDescricao());
			st.setInt(3, categoria.getIdCategoria());

			status = st.executeUpdate();

			return status;

		} catch (SQLException ex) {

			System.out.println(ex.getErrorCode());
			return ex.getErrorCode();

		}

	}

	@Override
	public boolean delete(int id) {

		conexao.conectar();

		Connection conn = conexao.getConexao();

		try {

			PreparedStatement st = conn.prepareStatement("DELETE FROM categoria WHERE IdCategoria = ?");

			st.setInt(1, id);
			st.executeUpdate();

			return true;

		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public Categoria select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public List<Categoria> listaTableCategoria(String Nome) {

		String sql = "SELECT * FROM categoria";

		if (!Nome.isEmpty()) {

			sql = sql + " WHERE nomeCategoria LIKE ? ";

		}

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement(sql);

			if (!Nome.isEmpty()) {

				st.setString(1, "%" + Nome + "%");

			}

			ResultSet rs = st.executeQuery();

			List<Categoria> lista = new ArrayList<>();

			while (rs.next()) {

				Categoria categoria = new Categoria();

				categoria.setIdCategoria(rs.getInt("IdCategoria"));
				categoria.setNomeCategoria(rs.getString("nomeCategoria"));
				categoria.setDescricao(rs.getString("descricaoCategoria"));

				lista.add(categoria);

			}

			return lista;

		} catch (SQLException ex) {

			System.out.println("Erro ao pesquisar: " + ex.getMessage());

			return null;

		}

	}

}
