package View;

import Data.ConexaoBD;
import javax.swing.ImageIcon;
import Data.Usuario;
import Data.UsuarioDAO;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 * @author Marcelo Oliveira
 */
public class ViewLogin extends javax.swing.JInternalFrame {

	private Home home;

	UsuarioDAO usuarioDAO;
	ConexaoBD conexao;

	/**
	 * Creates new form ViewLogin
	 */
	public ViewLogin(Home home) {

		initComponents();
		setTitle("Login");
		this.home = home;
		conexao = new ConexaoBD();
		usuarioDAO = new UsuarioDAO(conexao);
	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel2 = new javax.swing.JPanel();
      jblLogo = new javax.swing.JLabel();
      txtLoginNome = new javax.swing.JTextField();
      txtLoginSenha = new javax.swing.JPasswordField();
      bntEntrar = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();

      setResizable(true);
      setTitle("Login");

      jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_transparente_resized.png"))); // NOI18N

      txtLoginNome.setBackground(new java.awt.Color(240, 240, 240));
      txtLoginNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
      txtLoginNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

      txtLoginSenha.setBackground(new java.awt.Color(240, 240, 240));
      txtLoginSenha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
      txtLoginSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

      bntEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      bntEntrar.setForeground(new java.awt.Color(0, 204, 51));
      bntEntrar.setText("ENTRAR");
      bntEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntEntrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntEntrarActionPerformed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
      jLabel2.setText("Controle e Gerencie suas Vendas!!!");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGap(27, 27, 27)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(79, 79, 79)
                  .addComponent(bntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(24, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(23, 23, 23)
                  .addComponent(jLabel2)
                  .addGap(26, 26, 26)
                  .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addComponent(bntEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed

		checkLogin();


   }//GEN-LAST:event_bntEntrarActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntEntrar;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JLabel jblLogo;
   private javax.swing.JTextField txtLoginNome;
   private javax.swing.JPasswordField txtLoginSenha;
   // End of variables declaration//GEN-END:variables

	public void checkLogin() {
		
		String login = txtLoginNome.getText();
		String senha = new String(txtLoginSenha.getPassword());

		if (login.isEmpty()) {
			
			JOptionPane.showMessageDialog
		  (null, "Informe seu Nome de Login!", "Login Acesso",
					 JOptionPane.ERROR_MESSAGE);
			
		} else if (senha.isEmpty()) {
			
			JOptionPane.showMessageDialog
		  (null, "Informe sua senha de acesso!", "Senha Acesso",
					  JOptionPane.ERROR_MESSAGE);
			
		} else {
			
			conexao.conectar();
			Usuario usuarioAutenticado = usuarioDAO.autenticaUsuario(login, senha);

			if (usuarioAutenticado != null) {
				
				String permissao = usuarioAutenticado.getTipoPermissao();
				String nome = usuarioAutenticado.getNomeUsuario();
				dispose();
				home.confirmalogin(nome, permissao);
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!",
						  "Erro ao Logar", JOptionPane.WARNING_MESSAGE);
				conexao.desconectar();
				
			}
		}

	}
}
