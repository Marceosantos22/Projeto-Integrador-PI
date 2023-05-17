package Data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Marcelo Oliveira
 */
public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private String loginUsuario;
    private String senhaUsuario;
    private String senhaUsuarioCript;

	public Usuario() {
		
	} 
	 
    
    public Usuario(int idUsuario, String nomeUsuario, String loginUsuario, String senhaUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
        setSenhaUsuario(senhaUsuario);
    }
    
    public int getId() {
        return idUsuario;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getLoginUsuario() {
        return loginUsuario;
    }
    
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    
    public String getSenhaUsuarioCript() {
        return senhaUsuarioCript;
    }
    
    public void setSenhaUsuario(String senha) {
        this.senhaUsuario = senha;
        this.senhaUsuarioCript = gerarHashMD5(senha);
    }
    
    public String gerarHashMD5(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(senha.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash MD5: " + e.getMessage());
        }
    }
}