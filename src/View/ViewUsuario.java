package View;

import Data.ConexaoBD;
import Data.Usuario;
import Data.UsuarioDAO;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Marcelo Oliveira
 */
public class ViewUsuario extends javax.swing.JInternalFrame {

	private DefaultTableModel tabelaUsuario;

	ConexaoBD conexao = new ConexaoBD();
	UsuarioDAO userDAO = new UsuarioDAO(conexao);

	/**
	 * Creates new form ViewUsuario
	 */
	public ViewUsuario() {
		initComponents();
		setTitle("Cadastro de Usuários");

		this.addTable("");

		jtableUsuario.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()) {
					selecaoTable();
				}
			}
		});

	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jButton2 = new javax.swing.JButton();
      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      txtfDataNascUser = new javax.swing.JFormattedTextField();
      jcbTipoPermissao = new javax.swing.JComboBox<>();
      jLabel3 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      txtpSenhaUser = new javax.swing.JPasswordField();
      txtLogin = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      txtNomeUser = new javax.swing.JTextField();
      bntSalvar = new javax.swing.JButton();
      bntAlterar = new javax.swing.JButton();
      bntLimpar = new javax.swing.JButton();
      bntDeletar1 = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      txtPesquisa = new javax.swing.JTextField();
      jScrollPane1 = new javax.swing.JScrollPane();
      jtableUsuario = new javax.swing.JTable();

      jButton2.setText("jButton2");

      setClosable(true);
      setIconifiable(true);
      setTitle("Cadastro de Usuários");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel1.setText("Nome:");

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel2.setText("Dt Nasc:");

      try {
         txtfDataNascUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      txtfDataNascUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtfDataNascUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      jcbTipoPermissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jcbTipoPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Permissão", "Administrador", "Gestor", "Vendedor" }));

      jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel3.setText("Acesso:");

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel5.setText("Senha:");

      txtpSenhaUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel6.setText("Login:");

      txtNomeUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntSalvar.setForeground(java.awt.Color.green);
      bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-salvar-24 (1).png"))); // NOI18N
      bntSalvar.setText("SALVAR");
      bntSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.green, java.awt.Color.green, java.awt.Color.green, java.awt.Color.green));
      bntSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntSalvar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntSalvarActionPerformed(evt);
         }
      });

      bntAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntAlterar.setForeground(new java.awt.Color(0, 51, 204));
      bntAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-editar-arquivo-24.png"))); // NOI18N
      bntAlterar.setText("ALTERAR");
      bntAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
      bntAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntAlterar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntAlterarActionPerformed(evt);
         }
      });

      bntLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-vassoura-24.png"))); // NOI18N
      bntLimpar.setText("LIMPAR");
      bntLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51)));
      bntLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntLimpar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntLimparActionPerformed(evt);
         }
      });

      bntDeletar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntDeletar1.setForeground(java.awt.Color.red);
      bntDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-excluir-24.png"))); // NOI18N
      bntDeletar1.setText("DELETAR");
      bntDeletar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
      bntDeletar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntDeletar1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntDeletar1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1)
               .addComponent(jLabel3)
               .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jcbTipoPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfDataNascUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                           .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(42, 42, 42)
                           .addComponent(jLabel5)))
                     .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtpSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(bntDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                  .addComponent(bntLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(92, 92, 92))))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtfDataNascUser)
                     .addComponent(jLabel2))
                  .addGap(1, 1, 1))
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtNomeUser)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jcbTipoPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtpSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtLogin)
               .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(8, 8, 8))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel4.setText("Filtro Nome:");

      txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(77, 77, 77)
            .addComponent(jLabel4)
            .addGap(18, 18, 18)
            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtPesquisa))
            .addContainerGap())
      );

      jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jtableUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jtableUsuario.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null, null}
         },
         new String [] {
            "ID", "Nome", "Tipo Permissão", "Data Nascimento", "Login"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jtableUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jtableUsuario.setShowGrid(false);
      jScrollPane1.setViewportView(jtableUsuario);
      if (jtableUsuario.getColumnModel().getColumnCount() > 0) {
         jtableUsuario.getColumnModel().getColumn(0).setMinWidth(50);
         jtableUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
         jtableUsuario.getColumnModel().getColumn(0).setMaxWidth(50);
         jtableUsuario.getColumnModel().getColumn(1).setMinWidth(290);
         jtableUsuario.getColumnModel().getColumn(1).setPreferredWidth(290);
         jtableUsuario.getColumnModel().getColumn(1).setMaxWidth(290);
         jtableUsuario.getColumnModel().getColumn(2).setMinWidth(150);
         jtableUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
         jtableUsuario.getColumnModel().getColumn(2).setMaxWidth(150);
         jtableUsuario.getColumnModel().getColumn(3).setMinWidth(100);
         jtableUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
         jtableUsuario.getColumnModel().getColumn(3).setMaxWidth(100);
      }

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane1)
               .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed

		if (!empty()) {

			if (emptyValida()) {

				salvar();
				limparDados();

			}

		}

   }//GEN-LAST:event_bntSalvarActionPerformed

   private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed

		if (empty()) {

			JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (!emptyValida()) {
			return;

		}

		updateUsuario();


   }//GEN-LAST:event_bntAlterarActionPerformed

   private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed

		limparDados();

		JOptionPane.showMessageDialog(null, "Campos resetado",
				  "Confirmação", JOptionPane.INFORMATION_MESSAGE);


   }//GEN-LAST:event_bntLimparActionPerformed

   private void bntDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletar1ActionPerformed

		int selectedRow = jtableUsuario.getSelectedRow();

		if (selectedRow != -1) {

			int id = Integer.parseInt(jtableUsuario.getValueAt(selectedRow, 0).toString());
			deletaLinha(id);
		}
		tabelaUsuario.setNumRows(0);
		limparDados();
		txtNomeUser.requestFocus();
		this.addTable("");


   }//GEN-LAST:event_bntDeletar1ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntAlterar;
   private javax.swing.JButton bntDeletar1;
   private javax.swing.JButton bntLimpar;
   private javax.swing.JButton bntSalvar;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JComboBox<String> jcbTipoPermissao;
   private javax.swing.JTable jtableUsuario;
   private javax.swing.JTextField txtLogin;
   private javax.swing.JTextField txtNomeUser;
   private javax.swing.JTextField txtPesquisa;
   private javax.swing.JFormattedTextField txtfDataNascUser;
   private javax.swing.JPasswordField txtpSenhaUser;
   // End of variables declaration//GEN-END:variables

	public boolean empty() {

		boolean empty = true;

		if (txtNomeUser.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Necessário preencher o nome!",
					  "Correção", JOptionPane.ERROR_MESSAGE);

			return empty;
		}

		if (txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Login",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return empty;
		}

		char[] password = txtpSenhaUser.getPassword();

		if (password.length == 0) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Senha",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return empty;
		}

		empty = false;
		return empty;
	}

	public boolean emptyValida() {

		String nome = txtNomeUser.getText();
		boolean nomeValido = nome.matches(".*");

		String login = txtLogin.getText();
		boolean loginValido = login.matches(".*");

		String dataNasc = txtfDataNascUser.getText();
		boolean datavalida = dataNasc.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");

		int selectedIndex = jcbTipoPermissao.getSelectedIndex();
		boolean permissaoValida = selectedIndex != 0;

		if (!nomeValido) {

			JOptionPane.showMessageDialog(null, "Preencha o campo Nome!",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return false;

		} else if (!loginValido) {

			JOptionPane.showMessageDialog(null, "Preencha o campo Login!",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return false;

		} else if (!datavalida) {

			JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento!",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return false;

		} else if (!permissaoValida) {

			JOptionPane.showMessageDialog(null, "Selecione uma Permissão!",
					  "Correção", JOptionPane.ERROR_MESSAGE);
			return false;

		}

		return true;
	}

	public void salvar() {

		int resposta;

		String tipoPermissao = (String) jcbTipoPermissao.getSelectedItem();

		conexao.conectar();

		Usuario usuario = new Usuario();

		usuario.setNomeUsuario(txtNomeUser.getText());
		usuario.setLoginUsuario(txtLogin.getText());
		usuario.setSenhaUsuario(new String(txtpSenhaUser.getPassword()));
		usuario.setTipoPermissao(tipoPermissao);

		String dataNasc = txtfDataNascUser.getText();

		SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;

		try {
			dataFormatada = formatEntrada.parse(dataNasc);

		} catch (ParseException ex) {

			System.out.println("Erro na conversão da Data" + ex.getMessage());
			return;

		}

		usuario.setDataNasc(dataFormatada);

		boolean status = userDAO.insert(usuario);

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de Dados",
					  "Erro BD", JOptionPane.ERROR_MESSAGE);

		} else {

			JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
			limparDados();
			txtNomeUser.requestFocus();
			this.addTable("");
		}
	}

	public void limparDados() {

		txtNomeUser.setText("");
		txtPesquisa.setText("");
		txtfDataNascUser.setText("");
		txtpSenhaUser.setText("");
		txtLogin.setText("");
		jcbTipoPermissao.setSelectedIndex(0);

	}

	private void addTable(String Nome) {

		boolean status = conexao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Não foi possível Adicionar, Erro de conexão",
					  "Banco de Dados", JOptionPane.ERROR_MESSAGE);

		} else {

			List<Usuario> listUser = userDAO.listaTableUser(Nome);

			tabelaUsuario = (DefaultTableModel) jtableUsuario.getModel();

			jtableUsuario.setRowSorter(new TableRowSorter(tabelaUsuario));
			tabelaUsuario.setNumRows(0);

			SimpleDateFormat formatSaida = new SimpleDateFormat("dd/MM/yyyy");

			for (Usuario user : listUser) {

				Object[] obj = new Object[]{user.getIdUsuario(), user.getNomeUsuario(), user.getTipoPermissao(),
					formatSaida.format(user.getDataNasc()), user.getLoginUsuario()};

				tabelaUsuario.addRow(obj);

			}
			conexao.desconectar();

		}

	}

	public void selecaoTable() {

		int selecteRow = jtableUsuario.getSelectedRow();

		if (selecteRow != -1) {

			int id = Integer.parseInt(jtableUsuario.getValueAt(selecteRow, 0).toString());
			String nome = jtableUsuario.getValueAt(selecteRow, 1).toString();
			String tipoPermissao = jtableUsuario.getValueAt(selecteRow, 2).toString();
			String dataNasc = jtableUsuario.getValueAt(selecteRow, 3).toString();
			String login = jtableUsuario.getValueAt(selecteRow, 4).toString();

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date data = null;

			try {

				data = dateFormat.parse(dataNasc);

			} catch (ParseException ex) {

				System.out.println("Erro dados seleção" + ex.getMessage());

			}

			txtNomeUser.setText(nome);
			txtLogin.setText(login);
			txtfDataNascUser.setText(dateFormat.format(data));
			jcbTipoPermissao.setSelectedItem(tipoPermissao);

		}

	}

	public void deletaLinha(int id) {

		boolean status = conexao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Erro de Conexão!", "Banco de Dados", JOptionPane.ERROR_MESSAGE);

		} else {

			status = userDAO.delete(id);

			if (status == true) {

				JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!", "Confirmação",
						  JOptionPane.INFORMATION_MESSAGE);

				this.addTable("");

			} else {

				JOptionPane.showMessageDialog(null, "Erro ao excluir", "ERRO",
						  JOptionPane.ERROR_MESSAGE);

			}

			conexao.desconectar();

		}

	}

	public void updateUsuario() {

		String tipoPermissao = (String) jcbTipoPermissao.getSelectedItem();

		int resposta;

		Usuario usuario = new Usuario();

		int selectedRow = jtableUsuario.getSelectedRow();

		if (selectedRow != -1) {

			int id = Integer.parseInt(jtableUsuario.getValueAt(selectedRow, 0).toString());
			usuario.setIdUsuario(id);

			usuario.setNomeUsuario(txtNomeUser.getText());
			usuario.setLoginUsuario(txtLogin.getText());
			usuario.setSenhaUsuario(new String(txtpSenhaUser.getPassword()));
			usuario.setTipoPermissao(tipoPermissao);

			String dataNasc = txtfDataNascUser.getText();

			SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFormatada = null;

			try {

				dataFormatada = formatEntrada.parse(dataNasc);

			} catch (ParseException ex) {

				System.out.println("Erro na conversão da Data" + ex.getMessage());
				return;

			}

			usuario.setDataNasc(dataFormatada);

			boolean status = conexao.conectar();

			if (status == false) {

				JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de Dados",
						  "Erro BD", JOptionPane.ERROR_MESSAGE);

			} else {

				resposta = userDAO.update(usuario);

				if (resposta == 1) {

					JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!",
							  "Confirmação", JOptionPane.INFORMATION_MESSAGE);
					limparDados();
					this.addTable("");
					txtNomeUser.requestFocus();

				} else {

					JOptionPane.showMessageDialog(null, "Erro ao atualizar dados!",
							  "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}

			conexao.desconectar();

		}

	}
}
