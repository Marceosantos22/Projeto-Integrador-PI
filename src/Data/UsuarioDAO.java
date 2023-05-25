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
public class UsuarioDAO implements GenericoDAO<Usuario> {

	private ConexaoBD conexao;

	public UsuarioDAO(ConexaoBD conexao) {
		
		this.conexao = conexao;
	}

	@Override
	public int insert(Usuario usuario) {
		int status;
		try {
			conexao.conectar();
			Connection conn = conexao.getConexao();
			PreparedStatement st = conn.prepareStatement("INSERT INTO usuario"
					  + " (nomeUsuario, loginUsuario, senhaUsuario, senhaUsuarioCript) VALUES (?,?,?,?)");
			st.setString(1, usuario.getNomeUsuario());
			st.setString(2, usuario.getLoginUsuario());
			st.setString(3, usuario.getSenhaUsuario());
			st.setString(4, usuario.getSenhaUsuarioCript());
			status = st.executeUpdate();
			st.close();
			conexao.desconectar();
			return status;
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
			return e.getErrorCode();
		}
	}

	@Override
	public int update(Usuario obj) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Usuario select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
