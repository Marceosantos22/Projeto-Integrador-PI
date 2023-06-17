package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Data.ConexaoBD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Marcelo Oliveira
 */
public class UsuarioDAO implements GenericoDAO<Usuario> {

	private ConexaoBD conexao;

	public UsuarioDAO(ConexaoBD conexao) {

		this.conexao = conexao;
	}

	public UsuarioDAO() {

	}

	@Override
	public boolean insert(Usuario usuario) {

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement("INSERT INTO usuario (nomeUsuario,dataNasc, loginUsuario, senhaUsuario, senhaUsuarioCript,"
					  + " tipoPermissao) VALUES (?,?,?,?,?,?)");
			st.setString(1, usuario.getNomeUsuario());
			st.setDate(2, new java.sql.Date(usuario.getDataNasc().getTime()));
			st.setString(3, usuario.getLoginUsuario());
			st.setString(4, usuario.getSenhaUsuario());
			st.setString(5, usuario.getSenhaUsuarioCript());
			st.setString(6, usuario.getTipoPermissao());

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
	public int update(Usuario usuario) {

		int status;

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement("UPDATE usuario SET nomeUsuario = ?, dataNasc = ?,"
					  + " loginUsuario = ?, senhaUsuario = ?,senhaUsuarioCript = ?, tipoPermissao = ?  WHERE id = ?");

			st.setString(1, usuario.getNomeUsuario());
			st.setDate(2, new java.sql.Date(usuario.getDataNasc().getTime()));
			st.setString(3, usuario.getLoginUsuario());
			st.setString(4, usuario.getSenhaUsuario());
			st.setString(5, usuario.getSenhaUsuarioCript());
			st.setString(6, usuario.getTipoPermissao());
			st.setInt(7, usuario.getIdUsuario());

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

			PreparedStatement st = conn.prepareStatement("DELETE FROM usuario WHERE id = ?");
			st.setInt(1, id);
			st.executeUpdate();

			return true;

		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public Usuario select(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public List<Usuario> listaTableUser(String Nome) {

		String sql = "SELECT * FROM usuario";

		if (!Nome.isEmpty()) {

			sql = sql + " WHERE nomeUsuario LIKE ? ";

		}

		try {

			conexao.conectar();
			Connection conn = conexao.getConexao();

			PreparedStatement st = conn.prepareStatement(sql);

			if (!Nome.isEmpty()) {

				st.setString(1, "%" + Nome + "%");

			}

			ResultSet rs = st.executeQuery();

			List<Usuario> lista = new ArrayList<>();

			while (rs.next()) {

				Usuario usuario = new Usuario();

				usuario.setIdUsuario(rs.getInt("id"));
				usuario.setNomeUsuario(rs.getString("nomeUsuario"));
				usuario.setTipoPermissao(rs.getString("tipoPermissao"));

				SimpleDateFormat formatEntrada = new SimpleDateFormat("yyyy-MM-dd");
				Date dataNasc = formatEntrada.parse(rs.getString("dataNasc"));
				usuario.setDataNasc(dataNasc);
				usuario.setLoginUsuario(rs.getString("loginUsuario"));

				lista.add(usuario);

			}

			return lista;

		} catch (SQLException | ParseException ex) {

			System.out.println("Erro ao pesquisar: " + ex.getMessage());

			return null;
		}

	}

	public Usuario autenticaUsuario(String login, String senha) {
		
		Usuario usuario = new Usuario();
		String senhaCriptografada = usuario.gerarHashMD5(senha);

		try {
			
			Connection conn = conexao.getConexao();
			String sql = "SELECT * FROM usuario WHERE loginUsuario = ? AND senhaUsuarioCript = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, login);
			st.setString(2, senhaCriptografada);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				
				Usuario usuarioConfirmado = new Usuario();
				usuarioConfirmado.setIdUsuario(rs.getInt("id"));
				usuarioConfirmado.setNomeUsuario(rs.getString("nomeUsuario"));
				usuarioConfirmado.setTipoPermissao(rs.getString("tipoPermissao"));

				return usuarioConfirmado;
				
			}

			return null;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}
	}

}
