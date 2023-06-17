package Data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @author Marcelo Oliveira
 */
public class Usuario {

	private int idUsuario;
	private String nomeUsuario;
	private String loginUsuario;
	private String senhaUsuario;
	private String senhaUsuarioCript;
	private Date dataNasc;
	private String tipoPermissao;

	public Usuario() {

	}

	public Usuario(int idUsuario, String nomeUsuario, String loginUsuario, String senhaUsuario, String senhaUsuarioCript, Date dataNasc, String tipoPermissao) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.senhaUsuarioCript = senhaUsuarioCript;
		this.dataNasc = dataNasc;
		this.tipoPermissao = tipoPermissao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public void setSenhaUsuario(String senhaUsuario) {
    this.senhaUsuario = senhaUsuario;
    this.senhaUsuarioCript = gerarHashMD5(senhaUsuario);
}

	public String getSenhaUsuarioCript() {
		return senhaUsuarioCript;
	}

	public void setSenhaUsuarioCript(String senhaUsuarioCript) {
		this.senhaUsuarioCript = senhaUsuarioCript;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTipoPermissao() {
		return tipoPermissao;
	}

	public void setTipoPermissao(String tipoPermissao) {
		this.tipoPermissao = tipoPermissao;
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
