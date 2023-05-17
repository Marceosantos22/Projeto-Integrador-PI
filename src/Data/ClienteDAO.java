package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Marcelo Oliveira
 */
public class ClienteDAO {
	
	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	
	/**Conecta-se ao banco de dados.
	 * @return true se a conexão for bem sucedida, false caso contrário.
	 */
	public boolean conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vendapro",
					  "root", "");

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
	
	
}
