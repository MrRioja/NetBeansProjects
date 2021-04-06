package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Profissao;

public class ProfissaoDAO {
    
    public ArrayList<Profissao> readCombo() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT DISTINCT profissao FROM gafanhotos ORDER BY profissao ASC;");
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProfissaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Profissao> profissoes = new ArrayList<>();

        try {
            while (rs.next()) {
                Profissao prof = new Profissao();

                prof.setProfissao(rs.getString("profissao"));

                profissoes.add(prof);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return profissoes;

    }
}
