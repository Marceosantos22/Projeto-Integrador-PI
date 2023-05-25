package Principal;

import Data.ConexaoBD;
import Data.Usuario;
import Data.UsuarioDAO;


public class AppVendaPro {

	public static void main(String[] args) {

		// Funcionalidade de adicionar Usuários no sistema e gerar a Criptografia na senha.
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO(new ConexaoBD());
		ConexaoBD conexao = new ConexaoBD();

		conexao.conectar();
		usuario.setLoginUsuario("teste");
		usuario.setNomeUsuario("Administrador");
		usuario.setSenhaUsuario("123456");
		
		usuario.gerarHashMD5(usuario.getSenhaUsuario());		

		usuarioDAO.insert(usuario);
		conexao.desconectar();

	}

}
