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
import model.bean.Alunos;

public class AlunosDAO {

    public void create(Alunos a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO gafanhotos "
                    + "(nome, sexo, profissao, nascimento, nacionalidade, altura, peso,cursopreferido)"
                    + " VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSexo());
            stmt.setString(3, a.getProfissao());
            stmt.setString(4, a.getNascimento());
            stmt.setString(5, a.getNacionalidade());
            stmt.setDouble(6, a.getAltura());
            stmt.setDouble(7, a.getPeso());
            stmt.setInt(8, a.getCursopreferido());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Alunos> read() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM gafanhotos");
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Alunos> alunos = new ArrayList<>();

        try {
            while (rs.next()) {
                Alunos aluno = new Alunos();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setProfissao(rs.getString("profissao"));
                aluno.setNascimento(rs.getString("nascimento"));
                aluno.setNacionalidade(rs.getString("nacionalidade"));
                aluno.setAltura(rs.getDouble("altura"));
                aluno.setPeso(rs.getDouble("peso"));
                aluno.setCursopreferido(rs.getInt("cursopreferido"));

                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alunos;

    }

    public void update(Alunos a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE gafanhotos SET nome = ? , sexo = ? , "
                    + "profissao = ? , nascimento = ? , nacionalidade = ? , altura = ? , peso = ? ,cursopreferido = ? "
                    + "WHERE id = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSexo());
            stmt.setString(3, a.getProfissao());
            stmt.setString(4, a.getNascimento());
            stmt.setString(5, a.getNacionalidade());
            stmt.setDouble(6, a.getAltura());
            stmt.setDouble(7, a.getPeso());
            stmt.setInt(8, a.getCursopreferido());
            stmt.setInt(9, a.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Alunos a) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM gafanhotos WHERE id = ?");
            stmt.setInt(1, a.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Alunos> readPesquisa(String pesquisa) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM gafanhotos WHERE id LIKE ? \n" +
"	or nome LIKE ? \n" +
"	or sexo LIKE ? \n" +
"	or profissao LIKE ? \n" +
"	or nascimento LIKE ? \n" +
"	or nacionalidade LIKE ? \n" +
"	or altura LIKE ? \n" +
"	or cursopreferido LIKE ? \n" +
"	or peso LIKE ? ");
            stmt.setString(1, "%"+pesquisa+"%");
            stmt.setString(2, "%"+pesquisa+"%");
            stmt.setString(3, "%"+pesquisa+"%");
            stmt.setString(4, "%"+pesquisa+"%");
            stmt.setString(5, "%"+pesquisa+"%");
            stmt.setString(6, "%"+pesquisa+"%");
            stmt.setString(7, "%"+pesquisa+"%");
            stmt.setString(8, "%"+pesquisa+"%");
            stmt.setString(9, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Alunos> alunos = new ArrayList<>();

        try {
            while (rs.next()) {
                Alunos aluno = new Alunos();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setProfissao(rs.getString("profissao"));
                aluno.setNascimento(rs.getString("nascimento"));
                aluno.setNacionalidade(rs.getString("nacionalidade"));
                aluno.setAltura(rs.getDouble("altura"));
                aluno.setPeso(rs.getDouble("peso"));
                aluno.setCursopreferido(rs.getInt("cursopreferido"));

                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alunos;

    }
    
}
