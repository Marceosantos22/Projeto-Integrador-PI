/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo Oliveira
 */
public class ViewCliente extends javax.swing.JInternalFrame {

	/**
	 * Creates new form ViewCliente
	 */
	public ViewCliente() {
		initComponents();
		setTitle("Cadastro de Cliente");
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      txtnome = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      txtfDataNascUser = new javax.swing.JFormattedTextField();
      txtRg = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
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
      txtaObs = new javax.swing.JTextArea();
      jPanel2 = new javax.swing.JPanel();
      jLabel14 = new javax.swing.JLabel();
      jcbTipoConsulta = new javax.swing.JComboBox<>();
      txtPesquisaFiltro = new javax.swing.JTextField();
      jScrollPane3 = new javax.swing.JScrollPane();
      jTableCliente = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel1.setText("Nome:");

      txtnome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel2.setText("Dt Nasc:");

      try {
         txtfDataNascUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      txtfDataNascUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtfDataNascUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      txtRg.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel3.setText("RG:");

      jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel4.setText("CPF:");

      txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel5.setText("Tel Fixo");

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
      jLabel13.setText("Obs:");

      txtaObs.setColumns(20);
      txtaObs.setRows(5);
      jScrollPane2.setViewportView(txtaObs);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel9)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel13)
                     .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel10))
                  .addGap(9, 9, 9)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(3, 3, 3)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addGap(11, 11, 11)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                           .addGap(384, 384, 384)
                           .addComponent(jLabel7)
                           .addGap(17, 17, 17)
                           .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                           .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(31, 31, 31)
                           .addComponent(jLabel2)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                           .addComponent(txtfDataNascUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(18, 18, 18)
                           .addComponent(jLabel3)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                           .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addComponent(jLabel4)
                     .addGap(42, 42, 42)
                     .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(jLabel5)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(txtFoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jLabel15)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(txtFoneCel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addContainerGap(36, Short.MAX_VALUE)))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel9)
                  .addGap(18, 18, 18))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(96, 96, 96)
                  .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(11, 11, 11)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(13, 13, 13)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(8, 8, 8)
                  .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel11))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(26, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtfDataNascUser)
                     .addComponent(jLabel2)
                     .addComponent(txtnome)
                     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(txtRg))
                  .addComponent(jLabel1))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtCpf)
                  .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtFoneFixo)
                  .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtFoneCel))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(246, 246, 246)))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel14.setText("Filtro:");

      jcbTipoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jcbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Consulta", "Nome", "CPF", "Email", "Telefone", " " }));

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
            .addContainerGap(114, Short.MAX_VALUE))
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

      jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "ID", "Nome", "CPF", "Telefone", "E-mail"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane3.setViewportView(jTableCliente);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
    
		JOptionPane.showMessageDialog
		  (this, "Cliente CADASTRADO com sucesso","Cadastro",
					 JOptionPane.INFORMATION_MESSAGE);
		
		
   }//GEN-LAST:event_bntSalvarActionPerformed

   private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
     
		JOptionPane.showMessageDialog
		  (this, "Cliente ATUALIZADO com sucesso","Atualização",
					 JOptionPane.INFORMATION_MESSAGE);
		
   }//GEN-LAST:event_bntAlterarActionPerformed

   private void bntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletarActionPerformed
    
		int resposta = JOptionPane.showOptionDialog(
						  this,
						  "Deseja excluir este Cliente",
						  "Exclusão",
						  JOptionPane.YES_NO_OPTION,
						  JOptionPane.QUESTION_MESSAGE,
						  null,
						  new String[]{"SIM", "NÃO"},"Não");

				if (resposta == 0) {

				
					JOptionPane.showMessageDialog(null, "Cliente EXCLUÍDO com sucesso",
							  "Confirmação",JOptionPane.INFORMATION_MESSAGE);

					
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
   private javax.swing.JLabel jLabel3;
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
   private javax.swing.JTable jTableCliente;
   private javax.swing.JComboBox<String> jcbTipoConsulta;
   private javax.swing.JTextField txtBairro;
   private javax.swing.JTextField txtCidade;
   private javax.swing.JTextField txtComplemento;
   private javax.swing.JTextField txtCpf;
   private javax.swing.JTextField txtEmail;
   private javax.swing.JTextField txtEndereco;
   private javax.swing.JTextField txtFoneCel;
   private javax.swing.JTextField txtFoneFixo;
   private javax.swing.JTextField txtNumero;
   private javax.swing.JTextField txtPesquisaFiltro;
   private javax.swing.JTextField txtRg;
   private javax.swing.JTextField txtUf;
   private javax.swing.JTextArea txtaObs;
   private javax.swing.JFormattedTextField txtfDataNascUser;
   private javax.swing.JTextField txtnome;
   // End of variables declaration//GEN-END:variables
}
