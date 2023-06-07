package View;

import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Marcelo Oliveira
 */
public class ViewFornecedor extends javax.swing.JInternalFrame {


	public ViewFornecedor() {
		initComponents();
		setTitle("Cadastro de Fornecedor");
	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      txtnome = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      txtCpf = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      txtFoneFixo = new javax.swing.JTextField();
      jLabel15 = new javax.swing.JLabel();
      txtFoneCel = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      txtEndereco = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      txtNumero = new javax.swing.JTextField();
      jLabel10 = new javax.swing.JLabel();
      txtComplemento = new javax.swing.JTextField();
      txtBairro = new javax.swing.JTextField();
      txtCidade = new javax.swing.JTextField();
      jLabel12 = new javax.swing.JLabel();
      txtUf = new javax.swing.JTextField();
      jLabel11 = new javax.swing.JLabel();
      txtEmail = new javax.swing.JTextField();
      bntSalvar = new javax.swing.JButton();
      bntAlterar = new javax.swing.JButton();
      bntDeletar = new javax.swing.JButton();
      jLabel9 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtaDescricao = new javax.swing.JTextArea();
      jLabel2 = new javax.swing.JLabel();
      txtNomeFantasia = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      jcbTipoConsulta = new javax.swing.JComboBox<>();
      jLabel14 = new javax.swing.JLabel();
      txtPesquisaFiltro = new javax.swing.JTextField();
      jScrollPane3 = new javax.swing.JScrollPane();
      jTableFornecedor = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel1.setText("Nome:");

      txtnome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel4.setText("CNPJ:");

      txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel5.setText("Tel Fixo:");

      txtFoneFixo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel15.setText("Tel Celular:");

      txtFoneCel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel6.setText("Endereço:");

      txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel7.setText("Número:");

      txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel10.setText("Compl:");

      txtComplemento.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel12.setText("UF:");

      txtUf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel11.setText("E-mail:");

      txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntSalvar.setForeground(java.awt.Color.green);
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
      bntAlterar.setText("ALTERAR");
      bntAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
      bntAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntAlterar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntAlterarActionPerformed(evt);
         }
      });

      bntDeletar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
      bntDeletar.setForeground(java.awt.Color.red);
      bntDeletar.setText("DELETAR");
      bntDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
      bntDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      bntDeletar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntDeletarActionPerformed(evt);
         }
      });

      jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel9.setText("Bairro:");

      jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel8.setText("Cidade:");

      jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel13.setText("Descrição:");

      txtaDescricao.setColumns(20);
      txtaDescricao.setRows(5);
      jScrollPane2.setViewportView(txtaDescricao);

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel2.setText("Fantasia:");

      txtNomeFantasia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel13)
                     .addComponent(jLabel10)
                     .addComponent(jLabel2))
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel8)
                              .addGap(11, 11, 11)
                              .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel12)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jLabel7)
                              .addGap(17, 17, 17)
                              .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel9)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jLabel5)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(txtFoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel15)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(txtFoneCel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel4)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE))))
         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addContainerGap(870, Short.MAX_VALUE)))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtnome)
               .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtCpf))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtFoneFixo)
               .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtFoneCel)
               .addComponent(jLabel2)
               .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel9)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(11, 11, 11)
                  .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel11))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jLabel1)
               .addGap(67, 67, 67)
               .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGap(263, 263, 263)))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jcbTipoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jcbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Consulta", "Nome", "Fantasia", "CNPJ", "E-mail", " " }));

      jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel14.setText("Filtro:");

      txtPesquisaFiltro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(77, 77, 77)
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jcbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txtPesquisaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jcbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtPesquisaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "ID", "Nome", "Fantasia", "CNPJ", "E-mail", "UF"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane3.setViewportView(jTableFornecedor);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jScrollPane3))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed

		JOptionPane.showMessageDialog(this, "Dados Cadastrado com sucesso", "Cadastro",
				  JOptionPane.INFORMATION_MESSAGE);

   }//GEN-LAST:event_bntSalvarActionPerformed

   private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed

		JOptionPane.showMessageDialog(this, "Dados Atualizado com sucesso", "Atualização",
				  JOptionPane.INFORMATION_MESSAGE);

   }//GEN-LAST:event_bntAlterarActionPerformed

   private void bntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletarActionPerformed

		int resposta = JOptionPane.showOptionDialog(
				  this,
				  "Deseja excluir este Cadastro?",
				  "Exclusão",
				  JOptionPane.YES_NO_OPTION,
				  JOptionPane.QUESTION_MESSAGE,
				  null,
				  new String[]{"SIM", "NÃO"}, "Não");

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "Cadastro EXCLUÍDO com sucesso",
					  "Confirmação", JOptionPane.INFORMATION_MESSAGE);

		}


   }//GEN-LAST:event_bntDeletarActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntAlterar;
   private javax.swing.JButton bntDeletar;
   private javax.swing.JButton bntSalvar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JTable jTableFornecedor;
   private javax.swing.JComboBox<String> jcbTipoConsulta;
   private javax.swing.JTextField txtBairro;
   private javax.swing.JTextField txtCidade;
   private javax.swing.JTextField txtComplemento;
   private javax.swing.JTextField txtCpf;
   private javax.swing.JTextField txtEmail;
   private javax.swing.JTextField txtEndereco;
   private javax.swing.JTextField txtFoneCel;
   private javax.swing.JTextField txtFoneFixo;
   private javax.swing.JTextField txtNomeFantasia;
   private javax.swing.JTextField txtNumero;
   private javax.swing.JTextField txtPesquisaFiltro;
   private javax.swing.JTextField txtUf;
   private javax.swing.JTextArea txtaDescricao;
   private javax.swing.JTextField txtnome;
   // End of variables declaration//GEN-END:variables
}
