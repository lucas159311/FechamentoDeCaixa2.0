/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Fechamento;
import ModelDao.FechamentoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class FrameThree extends javax.swing.JFrame {

    /**
     * Creates new form FrameThree
     */
    public FrameThree() {
        initComponents();
        readJTable();
        setSize(1150,650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbRelatorio = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 91, 129));
        jPanel1.setForeground(new java.awt.Color(61, 91, 129));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RelatorioIcon.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 440, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1120, 170);

        jtbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DATA", "?? PRAZO", "RECEBIDO", "SA??DA", "CART??O", "CAIXA ATUAL", "CAIXA ANTERIOR", "VENDAS", "SOBRA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbRelatorio);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 210, 1020, 300);

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(860, 530, 180, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background df.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1150, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if(jtbRelatorio.getSelectedRow() != -1){
            Fechamento f = new Fechamento();
            FechamentoDAO dao = new FechamentoDAO();

            f.setId((int) jtbRelatorio.getValueAt(jtbRelatorio.getSelectedRow(), 0));

            dao.delete(f);

            readJTable();
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma data a ser excluida");
        }
        readJTable();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrameThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameThree().setVisible(true);
            }
        });
    }
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jtbRelatorio.getModel();
        modelo.setNumRows(0);
        FechamentoDAO fdao = new FechamentoDAO();
        
        for(Fechamento f : fdao.read()){
            
            modelo.addRow(new Object[]{
                f.getId(),
                f.getData(),
                f.getAprazo(),
                f.getRecebido(),
                f.getSaida(),
                f.getCartao(),
                f.getCaixaAtual(),
                f.getCaixaAnterior(),
                f.getVenda(),
                f.getSobra()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbRelatorio;
    // End of variables declaration//GEN-END:variables
}
