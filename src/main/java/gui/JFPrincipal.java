

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Cephas
 */
public class JFPrincipal extends javax.swing.JFrame {

	
	private static JFPrincipal jfp;
	
    /**
     * Creates new form JFPrincipal
     */
    private JFPrincipal() {
    	
    	initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        pack();
        setVisible(true);
    }

    public static JFPrincipal getInstancia(){
    	if(jfp == null){
    		jfp = new JFPrincipal();
    	}
    	return jfp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdesktopMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMain = new javax.swing.JMenu();
        jMiListarPoliciais = new javax.swing.JMenuItem();
        jMiCadastrarPoliciais = new javax.swing.JMenuItem();
        jMiCadastrarPoliciais.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		JIFCadastrarPolicial jcp = new JIFCadastrarPolicial();
                jdesktopMain.add(jcp);
                jcp.setResizable(true);
                jcp.pack();
                jcp.setVisible(true);
        	}
        });
        jMiCadastrarDocumento = new javax.swing.JMenuItem();
        jMiCadastrarInformacao = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMiBuscarPolicial = new javax.swing.JMenuItem();
        jMiBuscaAvan�ada = new javax.swing.JMenuItem();
        jMiRelatorioGeral = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("App PM");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 830, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        //////////////////////////////////////
        
        
        getContentPane().add(jdesktopMain, BorderLayout.CENTER);

        jMenuMain.setText("Menu");

        jMiListarPoliciais.setText("Listar policiais");
        jMiListarPoliciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiListarPoliciaisActionPerformed(evt);
            }
        });
        jMenuMain.add(jMiListarPoliciais);

        jMiCadastrarPoliciais.setText("Cadastrar policiais");
        jMenuMain.add(jMiCadastrarPoliciais);

        jMiCadastrarDocumento.setText("Cadastrar documento");
        jMiCadastrarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiCadastrarDocumentoActionPerformed(evt);
            }
        });
        jMenuMain.add(jMiCadastrarDocumento);

        jMiCadastrarInformacao.setText("Cadastrar informa��es um policial");
        jMenuMain.add(jMiCadastrarInformacao);

        jMenuBar1.add(jMenuMain);

        jMenuRelatorios.setText("Relatorios");

        jMiBuscarPolicial.setText("Buscar policial");
        jMenuRelatorios.add(jMiBuscarPolicial);

        jMiBuscaAvan�ada.setText("Busca avan�ada");
        jMenuRelatorios.add(jMiBuscaAvan�ada);

        jMiRelatorioGeral.setText("Relat�rio geral");
        jMenuRelatorios.add(jMiRelatorioGeral);

        jMenuBar1.add(jMenuRelatorios);

        jMenuOpcoes.setText("Op��es");

        jMenuSobre.setText("Sobre");
        jMenuOpcoes.add(jMenuSobre);

        jMenuItem1.setText("Sair");
        jMenuOpcoes.add(jMenuItem1);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 822, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jdesktopMain, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jdesktopMain, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        jdesktopMain.setLayout(new BorderLayout(0, 0));

        pack();
    }// </editor-fold>                        

    private void jMiListarPoliciaisActionPerformed(java.awt.event.ActionEvent evt) {                                                   
            // TODO add your handling code here:
    		JIFListarPoliciais jlp = new JIFListarPoliciais();
            jdesktopMain.add(jlp);
            jlp.pack();
            jlp.setVisible(true);
    }                                                  

    private void jMiCadastrarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMain;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jMenuSobre;
    private javax.swing.JMenuItem jMiBuscaAvan�ada;
    private javax.swing.JMenuItem jMiBuscarPolicial;
    private javax.swing.JMenuItem jMiCadastrarDocumento;
    private javax.swing.JMenuItem jMiCadastrarInformacao;
    private javax.swing.JMenuItem jMiCadastrarPoliciais;
    private javax.swing.JMenuItem jMiListarPoliciais;
    private javax.swing.JMenuItem jMiRelatorioGeral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdesktopMain;
    // End of variables declaration                   
}
