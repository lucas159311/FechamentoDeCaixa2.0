/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Connection.ConnectionFactory;
import Model.Fechamento;
import Model.Usuario;
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
public class UsuarioDAO {
    
        public java.util. List<Usuario> read() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        java.util.List<Usuario> Usuario = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                Usuario.add(usuario);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }
        
        return Usuario;
        
    }
        
        public boolean checkLogin(String login, String senha){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            boolean check = false;
            
            try{
                stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
                stmt.setString(1,login);
                stmt.setString(2, senha);
                
                rs = stmt.executeQuery();
                
                if(rs.next()){
                    check = true;
                }
            }catch(SQLException ex){
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
            }
            
        return check;
        }
       
    public void create(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO usuario (login,senha) VALUES (?,?)");
            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());           
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "USUARIO CADASTRADO COM SUCESSO");
            
        }catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR USUARIO, CHAME O JOAREZ: "+ex);
        } finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
        
    }
    
    public void delete(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        int resultado = JOptionPane.showConfirmDialog(null, "Deseja realmente Deletar esse Usuario?");
        if(resultado == JOptionPane.YES_OPTION){
            try{
                stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
                stmt.setInt(1,u.getId());
            
                stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso!!!");
            
            }catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR: "+ex);
            }finally{
                ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
            }
        
        }
    }    
}

