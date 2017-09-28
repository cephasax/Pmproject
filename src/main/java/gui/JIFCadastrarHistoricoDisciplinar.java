/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import controler.Service;
import dao.PolicialDao;
import model.Curso;
import model.HistoricoDisciplinar;

import javax.swing.JTextArea;

/**
 *
 * @author Cephas
 */
public class JIFCadastrarHistoricoDisciplinar extends javax.swing.JInternalFrame {

	private int linhaSelecionada = -1;
	private static TmListaPoliciais modelo;
	public PolicialDao pdao = new PolicialDao();
	
    /**
     * Creates new form JIFCadastrarAlteracao
     */
    public JIFCadastrarHistoricoDisciplinar() {
        initComponents();
        refreshPopulate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDadosPms = new javax.swing.JTable();
        
        modelo = new TmListaPoliciais(/*pdao.listar()*/);
        tbDadosPms.setModel(modelo);
        
        
        tbDadosPms.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		linhaSelecionada = tbDadosPms.getSelectedRow();
        	}
        });

        setClosable(true);
        setResizable(true);

        btnConfirmar.setText("Confirmar cadastro");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero do BG:");

        jLabel2.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Clique na linha do policial que receber\u00E1 cadastramento de hist\u00F3rico disciplinar");

       
        jScrollPane4.setViewportView(tbDadosPms);
        if (tbDadosPms.getColumnModel().getColumnCount() > 0) {
        	tbDadosPms.getColumnModel().getColumn(0).setMinWidth(0);
        	tbDadosPms.getColumnModel().getColumn(0).setPreferredWidth(0);
        	tbDadosPms.getColumnModel().getColumn(0).setMaxWidth(0);
        }
        tbDadosPms.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane4, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);
        tpData = new javax.swing.JTextPane();
        tpNumeroBg = new javax.swing.JTextPane();
        
        lblNota = new JLabel();
        lblNota.setText("Nota:");
        
        tpNota = new JTextPane();
        
        lblNomeDoCurso = new JLabel();
        lblNomeDoCurso.setText("Descri\u00E7\u00E3o:");
        
        lblComportamento = new JLabel();
        lblComportamento.setText("Comportamento:");
        
        tpComportamento = new JTextPane();
        
        tpDescricao = new JTextArea();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(179, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnConfirmar)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel2)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tpData, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(jLabel1)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tpNumeroBg, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        						.addGap(18)
        						.addComponent(lblNota, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tpNota, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        						.addGap(18)
        						.addComponent(lblComportamento)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tpComportamento, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(lblNomeDoCurso)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tpDescricao))))
        			.addGap(191))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2)
        				.addComponent(tpData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1)
        				.addComponent(tpNumeroBg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNota)
        				.addComponent(tpNota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblComportamento)
        				.addComponent(tpComportamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(17)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNomeDoCurso)
        				.addComponent(tpDescricao, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnConfirmar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	HistoricoDisciplinar hd = new HistoricoDisciplinar();
    	hd.setData(tpData.getText());
    	hd.setNumeroBg(Integer.valueOf(tpNumeroBg.getText()));
    	hd.setNota(Float.valueOf(tpNota.getText()));
    	hd.setComportamento(tpComportamento.getText());
    	hd.setDescricao(tpDescricao.getText());
		if(linhaSelecionada != -1){
			Service sv = new Service();
			sv.cadastrarHistoricoDisciplinar(hd, modelo.getPolicial(linhaSelecionada));
		}
    	
    }        
    
    public void refreshPopulate(){
    	modelo.getLinhas().clear();
    	modelo.setLinhas(pdao.listar());
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbDadosPms;
    private javax.swing.JTextPane tpData;
    private javax.swing.JTextPane tpNumeroBg;
    private JLabel lblNota;
    private JTextPane tpNota;
    private JLabel lblNomeDoCurso;
    private JLabel lblComportamento;
    private JTextPane tpComportamento;
    private JTextArea tpDescricao;
}
