package Principal;

import Data.Usuario;
import Data.UsuarioDAO;


public class AppVendaPro {

	public static void main(String[] args) {

		//Funcionalida de adionar Usuários nos sistema, e gerando a Criptografia na senha.
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		usuarioDAO.conectar();
		usuario.setLoginUsuario("teste");
		usuario.setNomeUsuario("Administrador");
		usuario.setSenhaUsuario("123456");
		
		usuario.gerarHashMD5(usuario.getSenhaUsuario());		

		usuarioDAO.inputUser(usuario);
		usuarioDAO.desconectar();

	}

}
