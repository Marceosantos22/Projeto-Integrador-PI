package View;

import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author Marcelo Oliveira
 */
public class Home extends javax.swing.JFrame {

	private Dimension maximizedSize;
	private int screenWidth;
	private int screenHeight;

	
	 
	public Home() {

		initComponents();
		setIcon();
		setTitle("App VendaPro");
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		pack();
		
		jmbarPrincipal.setVisible(false);
		jblNome.setVisible(false);
		jblPermissao.setVisible(false);
		bntLogoff.setVisible(false);
		

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		System.out.println("Tamanho atual: " + screenWidth + "x" + screenHeight);

		maximizedSize = getContentPane().getSize();
		ViewLogin login = new ViewLogin(this);
		abrirFormulario(login, screenWidth, screenHeight);

		System.out.println("Tamanho atual: " + screenWidth + "x" + screenHeight);

	}

	private void abrirFormulario(JInternalFrame janela, int width, int height) {
		jDesktopP.add(janela);
		Dimension jInternalFrameSize = janela.getSize();
		int x = (width - jInternalFrameSize.width) / 2;
		int y = (height - jInternalFrameSize.height) / 2;
		janela.setLocation(x, y);
		janela.setVisible(true);
	}
	public void confirmalogin(String nome,String permissao){
		
		
		JOptionPane.showMessageDialog
		  (this, "Olá "+ nome +" Seja bem vindo!","Boas Vindas!", JOptionPane.INFORMATION_MESSAGE);
		
		
		jblNome.setText(nome);
		jblPermissao.setText(permissao);
		
		jmbarPrincipal.setVisible(true);
		jblNome.setVisible(true);
		jblPermissao.setVisible(true);
		bntLogoff.setVisible(true);
		
		
	}

	
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      ImageIcon icon = new ImageIcon(getClass().getResource("/Image/Background_FULL_ HD.png"));
      Image image = icon.getImage();
      jDesktopP = new javax.swing.JDesktopPane(){

         public void paintComponent(Graphics g){

            g.drawImage(image,0,0,getWidth(),getHeight(),this);

         }

      };
      bntSair = new javax.swing.JButton();
      bntLogoff = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jblNome = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jblPermissao = new javax.swing.JLabel();
      jmbarPrincipal = new javax.swing.JMenuBar();
      jmenuSistema = new javax.swing.JMenu();
      jmiUsuario = new javax.swing.JMenuItem();
      jmenuCadastro = new javax.swing.JMenu();
      jmiCategoria = new javax.swing.JMenuItem();
      jmiCliente = new javax.swing.JMenuItem();
      jmiFornecedor = new javax.swing.JMenuItem();
      jmiProduto = new javax.swing.JMenuItem();
      jmiVendedor = new javax.swing.JMenuItem();
      jmenuEstoque = new javax.swing.JMenu();
      jmenuRelatorio = new javax.swing.JMenu();
      jmenuGerarVenda = new javax.swing.JMenu();
      jmenuFinanceiro = new javax.swing.JMenu();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      bntSair.setBackground(new java.awt.Color(255, 0, 0));
      bntSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      bntSair.setForeground(new java.awt.Color(255, 255, 255));
      bntSair.setText("SAIR");
      bntSair.setBorder(javax.swing.BorderFactory.createCompoundBorder());
      bntSair.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntSairActionPerformed(evt);
         }
      });

      bntLogoff.setBackground(new java.awt.Color(255, 255, 153));
      bntLogoff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      bntLogoff.setText("LOGOFF");
      bntLogoff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
      bntLogoff.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntLogoffActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("Nome:");

      jblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jblNome.setForeground(new java.awt.Color(255, 255, 255));

      jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Permissão:");

      jblPermissao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jblPermissao.setForeground(new java.awt.Color(255, 255, 255));

      jDesktopP.setLayer(bntSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
      jDesktopP.setLayer(bntLogoff, javax.swing.JLayeredPane.DEFAULT_LAYER);
      jDesktopP.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
      jDesktopP.setLayer(jblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
      jDesktopP.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
      jDesktopP.setLayer(jblPermissao, javax.swing.JLayeredPane.DEFAULT_LAYER);

      javax.swing.GroupLayout jDesktopPLayout = new javax.swing.GroupLayout(jDesktopP);
      jDesktopP.setLayout(jDesktopPLayout);
      jDesktopPLayout.setHorizontalGroup(
         jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jDesktopPLayout.createSequentialGroup()
            .addContainerGap(526, Short.MAX_VALUE)
            .addGroup(jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPLayout.createSequentialGroup()
                  .addComponent(bntLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(bntSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPLayout.createSequentialGroup()
                     .addComponent(jLabel1)
                     .addGap(18, 18, 18)
                     .addComponent(jblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(19, 19, 19))
                  .addGroup(jDesktopPLayout.createSequentialGroup()
                     .addComponent(jLabel3)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jblPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
      );
      jDesktopPLayout.setVerticalGroup(
         jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jDesktopPLayout.createSequentialGroup()
            .addGroup(jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5)
            .addGroup(jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel3)
               .addComponent(jblPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
            .addGroup(jDesktopPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(bntSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      jmbarPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

      jmenuSistema.setText("Sistema");
      jmenuSistema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuSistema.setIconTextGap(1);

      jmiUsuario.setText("Usuários");
      jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiUsuarioActionPerformed(evt);
         }
      });
      jmenuSistema.add(jmiUsuario);

      jmbarPrincipal.add(jmenuSistema);

      jmenuCadastro.setText("Cadastro");
      jmenuCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuCadastro.setIconTextGap(1);

      jmiCategoria.setText("Categoria");
      jmiCategoria.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiCategoriaActionPerformed(evt);
         }
      });
      jmenuCadastro.add(jmiCategoria);

      jmiCliente.setText("Cliente");
      jmiCliente.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiClienteActionPerformed(evt);
         }
      });
      jmenuCadastro.add(jmiCliente);

      jmiFornecedor.setText("Fornecedor");
      jmiFornecedor.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiFornecedorActionPerformed(evt);
         }
      });
      jmenuCadastro.add(jmiFornecedor);

      jmiProduto.setText("Produto");
      jmiProduto.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiProdutoActionPerformed(evt);
         }
      });
      jmenuCadastro.add(jmiProduto);

      jmiVendedor.setText("Vendedor");
      jmiVendedor.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiVendedorActionPerformed(evt);
         }
      });
      jmenuCadastro.add(jmiVendedor);

      jmbarPrincipal.add(jmenuCadastro);

      jmenuEstoque.setText("Estoque");
      jmenuEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuEstoque.setIconTextGap(1);
      jmbarPrincipal.add(jmenuEstoque);

      jmenuRelatorio.setText("Relatórios");
      jmenuRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuRelatorio.setIconTextGap(1);
      jmbarPrincipal.add(jmenuRelatorio);

      jmenuGerarVenda.setText("Gerar Venda");
      jmenuGerarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuGerarVenda.setIconTextGap(1);
      jmbarPrincipal.add(jmenuGerarVenda);

      jmenuFinanceiro.setText("Financeiro");
      jmenuFinanceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jmenuFinanceiro.setIconTextGap(1);
      jmbarPrincipal.add(jmenuFinanceiro);

      setJMenuBar(jmbarPrincipal);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jDesktopP)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jDesktopP)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed

		ViewUsuario usuario = new ViewUsuario();
		abrirFormulario(usuario, getContentPane().getWidth(), getContentPane().getHeight());

   }//GEN-LAST:event_jmiUsuarioActionPerformed

   private void bntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSairActionPerformed
     
		dispose();
		
   }//GEN-LAST:event_bntSairActionPerformed

   private void bntLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLogoffActionPerformed
      
		dispose();
		Home home = new Home();
		home.setVisible(true);
		
   }//GEN-LAST:event_bntLogoffActionPerformed

   private void jmiCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriaActionPerformed
		ViewCategoria categoria = new ViewCategoria();
		abrirFormulario(categoria,getContentPane().getWidth(),
				  getContentPane().getHeight());
		
		
   }//GEN-LAST:event_jmiCategoriaActionPerformed

   private void jmiVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendedorActionPerformed
  
		ViewVendendor vendedor = new ViewVendendor();
		abrirFormulario(vendedor, getContentPane().getWidth(), getContentPane().getHeight());
		
		
   }//GEN-LAST:event_jmiVendedorActionPerformed

   private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
   
		ViewCliente cliente = new ViewCliente();
		abrirFormulario(cliente,getContentPane().getWidth(), getContentPane().getHeight());
		
   }//GEN-LAST:event_jmiClienteActionPerformed

   private void jmiFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedorActionPerformed
     
		ViewFornecedor fornecedor = new ViewFornecedor();
		abrirFormulario(fornecedor,getContentPane().getWidth(), getContentPane().getHeight());
		
   }//GEN-LAST:event_jmiFornecedorActionPerformed

   private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
     
		ViewProduto produto = new ViewProduto();
		abrirFormulario(produto, getContentPane().getWidth(), getContentPane().getHeight());
		
   }//GEN-LAST:event_jmiProdutoActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntLogoff;
   private javax.swing.JButton bntSair;
   private javax.swing.JDesktopPane jDesktopP;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jblNome;
   private javax.swing.JLabel jblPermissao;
   private javax.swing.JMenuBar jmbarPrincipal;
   private javax.swing.JMenu jmenuCadastro;
   private javax.swing.JMenu jmenuEstoque;
   private javax.swing.JMenu jmenuFinanceiro;
   private javax.swing.JMenu jmenuGerarVenda;
   private javax.swing.JMenu jmenuRelatorio;
   private javax.swing.JMenu jmenuSistema;
   private javax.swing.JMenuItem jmiCategoria;
   private javax.swing.JMenuItem jmiCliente;
   private javax.swing.JMenuItem jmiFornecedor;
   private javax.swing.JMenuItem jmiProduto;
   private javax.swing.JMenuItem jmiUsuario;
   private javax.swing.JMenuItem jmiVendedor;
   // End of variables declaration//GEN-END:variables

	public void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/Simbolo.png")));
	}

}
