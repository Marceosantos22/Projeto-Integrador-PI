package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class UsuarioDAO {

	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	/**
	 * Conecta-se ao banco de dados.
	 *
	 * @return true se a conexão for bem sucedida, false caso contrário.
	 */
	public boolean conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vendapro",
					  "root", "F17101818@");

			return true;

		} catch (ClassNotFoundException | SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return false;

		}

	}

	/**
	 * Desconecta-se do banco de dados.
	 */
	public void desconectar() {
		try {

			conn.close();

		} catch (SQLException e) {

		}

	}

	/**
	 * Método para Inserção de usuários no banco de dados.
	 *
	 * @param usuario, recebe o objeto com os dados.
	 * @return status da operação de salvamente no BD
	 */
	public int inputUser(Usuario usuario) {

		int status;

		try {
			st = conn.prepareStatement("INSERT INTO usuario  (nomeUsuario, loginUsuario, senhaUsuario, senhaUsuarioCript)"
					  + " VALUES(?,?,?,?)");
			st.setString(1, usuario.getLoginUsuario());
			st.setString(2, usuario.getNomeUsuario());
			st.setString(3, usuario.getSenhaUsuario());
			st.setString(4, usuario.getSenhaUsuarioCript());

			status = st.executeUpdate();
			return status;

		} catch (SQLException e) {

			System.out.println("Erro ao conectar: " + e.getMessage());
			return e.getErrorCode();

		}

	}

}
