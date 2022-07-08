/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Fechamento;
import Model.Usuario;
import ModelDao.FechamentoDAO;
import ModelDao.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class FrameFour extends javax.swing.JFrame {

    /**
     * Creates new form FrameFour
     */
    public FrameFour() {
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
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtSenha2 = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(61, 91, 129));
        jPanel1.setForeground(new java.awt.Color(61, 91, 129));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconUsuario.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 440, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1120, 170);

        txtLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLogin.setToolTipText("");
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(310, 260, 240, 30);

        lblLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(61, 91, 129));
        lblLogin.setText("LOGIN:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(310, 240, 90, 20);

        lblSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(61, 91, 129));
        lblSenha.setText("SENHA:");
        lblSenha.setToolTipText("");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(310, 310, 90, 20);

        txtSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(txtSenha);
        txtSenha.setBounds(310, 330, 240, 30);

        lblConfirmarSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(61, 91, 129));
        lblConfirmarSenha.setText("CONFIRMAR SENHA:");
        lblConfirmarSenha.setToolTipText("");
        getContentPane().add(lblConfirmarSenha);
        lblConfirmarSenha.setBounds(310, 380, 190, 20);

        txtSenha2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(txtSenha2);
        txtSenha2.setBounds(310, 400, 240, 30);

        btnSalvar.setBackground(new java.awt.Color(61, 91, 129));
        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(340, 440, 180, 50);

        jtbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "LOGIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 260, 230, 280);

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
        btnExcluir.setBounds(340, 510, 180, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background df.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1150, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Usuario u = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        
        if(txtSenha.getText().equals(txtSenha2.getText())){
            u.setLogin(txtLogin.getText());
            u.setSenha(txtSenha.getText());
            udao.create(u);
        }else{
            JOptionPane.showMessageDialog(null,"A confirmação de Senha não confere");
        }
        readJTable();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if(jtbUsuario.getSelectedRow() != -1){
            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            
            u.setId((int) jtbUsuario.getValueAt(jtbUsuario.getSelectedRow(), 0));
            
            dao.delete(u);
            
            readJTable();
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um Usuario para excluir");
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
            java.util.logging.Logger.getLogger(FrameFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFour().setVisible(true);
            }
        });
    }
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jtbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO udao = new UsuarioDAO();
        
        for(Usuario u : udao.read()){
            
            modelo.addRow(new Object[]{
                u.getId(),
                u.getLogin(),
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbUsuario;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha2;
    // End of variables declaration//GEN-END:variables
}