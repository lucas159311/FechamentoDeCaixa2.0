/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Connection.ConnectionFactory;
import Model.Fechamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FechamentoDAO {
    public void create(Fechamento f){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO fechamento (aprazo,recebido,saida,cartao,caixaAtual,caixaAnterior,venda,sobra,data) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setDouble(1,f.getAprazo());
            stmt.setDouble(2,f.getRecebido());
            stmt.setDouble(3,f.getSaida());
            stmt.setDouble(4,f.getCartao());
            stmt.setDouble(5,f.getCaixaAtual());
            stmt.setDouble(6,f.getCaixaAnterior());
            stmt.setDouble(7,f.getVenda());
            stmt.setDouble(8,f.getSobra());
            stmt.setString(9,f.getData());            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!!!");
            
        }catch (SQLException ex) {
            Logger.getLogger(FechamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR, CHAME O JOAREZ: "+ex);
        } finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
        
    }
    
        public java.util. List<Fechamento> read() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        java.util.List<Fechamento> Fechamento = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM fechamento");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Fechamento fechamento = new Fechamento();
                fechamento.setId(rs.getInt("id"));
                fechamento.setAprazo(rs.getFloat("aprazo"));
                fechamento.setRecebido(rs.getFloat("recebido"));
                fechamento.setSaida(rs.getFloat("saida"));
                fechamento.setCartao(rs.getFloat("cartao"));
                fechamento.setCaixaAtual(rs.getFloat("caixaAtual"));
                fechamento.setCaixaAnterior(rs.getFloat("caixaAnterior"));
                fechamento.setVenda(rs.getFloat("venda"));
                fechamento.setSobra(rs.getFloat("sobra"));
                fechamento.setData(rs.getString("data"));
                Fechamento.add(fechamento);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Fechamento.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }
        
        return Fechamento;
        
    }
        
    public void delete(Fechamento f){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja realmente Deletar esses dados?");
        if(resultado == JOptionPane.YES_OPTION){
        try{
            stmt = con.prepareStatement("DELETE FROM fechamento WHERE id = ?");
            stmt.setInt(1,f.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados Excluido com sucesso!!!");
            
        }catch (SQLException ex) {
            Logger.getLogger(FechamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR: "+ex);
        } finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
        
    }
    }
}
