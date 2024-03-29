package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public boolean checkLogin(String login, String senha) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE login = ? and senha = ?");
            stmt.setString(1,login);
            stmt.setString(2,senha);
            
            rs = stmt.executeQuery();
        
            if(rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;

    }

    
}
