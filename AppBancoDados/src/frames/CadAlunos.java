package frames;

import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Alunos;
import model.bean.Profissao;
import model.dao.AlunosDAO;
import model.dao.ProfissaoDAO;

public class CadAlunos extends javax.swing.JFrame {

    /**
     * Creates new form CadAlunos
     *
     * @throws java.sql.SQLException
     */
    public CadAlunos() throws SQLException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jtAlunos.getModel();
        readJTable();
        
        ProfissaoDAO dao = new ProfissaoDAO();
        
        for(Profissao p: dao.readCombo()){
            cbProfissao.addItem(p);
        }
        
    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jtAlunos.getModel();
        modelo.setNumRows(0);
        AlunosDAO adao = new AlunosDAO();

        for (Alunos a : adao.read()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getSexo(),
                a.getProfissao(),
                a.getNascimento(),
                a.getNacionalidade(),
                a.getAltura(),
                a.getPeso(),
                a.getCursopreferido()});
        }
    }

    public void readJTablePesquisa(String pesquisa) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jtAlunos.getModel();
        modelo.setNumRows(0);
        AlunosDAO adao = new AlunosDAO();

        for (Alunos a : adao.readPesquisa(pesquisa)) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getSexo(),
                a.getProfissao(),
                a.getNascimento(),
                a.getNacionalidade(),
                a.getAltura(),
                a.getPeso(),
                a.getCursopreferido()});
        }
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
        lblNome = new javax.swing.JLabel();
        lblProfissao = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblNacionalidade = new javax.swing.JLabel();
        lblCuso = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtProfissao = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtNacionalidade = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cbProfissao = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Alunos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 24), new java.awt.Color(37, 65, 178))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(37, 65, 178));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblProfissao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblProfissao.setForeground(new java.awt.Color(37, 65, 178));
        lblProfissao.setText("Profissão");
        jPanel1.add(lblProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblNascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(37, 65, 178));
        lblNascimento.setText("Nascimento");
        jPanel1.add(lblNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 149, -1, -1));

        lblSexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(37, 65, 178));
        lblSexo.setText("Sexo");
        jPanel1.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 190, -1, -1));

        lblPeso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(37, 65, 178));
        lblPeso.setText("Peso");
        jPanel1.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 237, -1, -1));

        lblAltura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(37, 65, 178));
        lblAltura.setText("Altura");
        jPanel1.add(lblAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 278, -1, -1));

        lblNacionalidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNacionalidade.setForeground(new java.awt.Color(37, 65, 178));
        lblNacionalidade.setText("Nacionalidade");
        jPanel1.add(lblNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lblCuso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCuso.setForeground(new java.awt.Color(37, 65, 178));
        lblCuso.setText("Curso preferido");
        jPanel1.add(lblCuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 187, -1));
        jPanel1.add(txtProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 151, -1));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 240, 120, -1));
        jPanel1.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 281, 110, -1));
        jPanel1.add(txtNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 333, 230, -1));
        jPanel1.add(txtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 149, 129, -1));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 155, 52));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 193, 120, -1));

        jtAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sexo", "Profissão  ", "Nascimento ", "Nacionalidade ", "Altura ", "Peso ", "Curso Preferido "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlunosMouseClicked(evt);
            }
        });
        jtAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAlunosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlunos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 520, -1));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 130, 50));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 110, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 65, 178));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, -1));
        jPanel1.add(txtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, -1));

        lblPesquisa.setText("Pesquisar:");
        jPanel1.add(lblPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        jPanel1.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 150, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, 30));

        jPanel1.add(cbProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1040, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(993, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Alunos a = new Alunos();
        AlunosDAO dao = new AlunosDAO();
        a.setNome(txtNome.getText());
        a.setSexo(txtSexo.getText());
        a.setAltura(Double.parseDouble(txtAltura.getText()));
        a.setCursopreferido(Integer.parseInt(txtCurso.getText()));
        a.setNacionalidade(txtNacionalidade.getText());
        a.setNascimento(txtNascimento.getText());
        a.setPeso(Double.parseDouble(txtPeso.getText()));
        a.setProfissao(txtProfissao.getText());
        try {
            dao.create(a);

            txtId.setText("");
            txtNome.setText("");
            txtSexo.setText("");
            txtProfissao.setText("");
            txtNascimento.setText("");
            txtNacionalidade.setText("");
            txtAltura.setText("");
            txtPeso.setText("");
            txtCurso.setToolTipText("");

            readJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar." + ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (jtAlunos.getSelectedRow() != -1) {
            Alunos a = new Alunos();
            AlunosDAO dao = new AlunosDAO();
            a.setNome(txtNome.getText());
            a.setSexo(txtSexo.getText());
            a.setAltura(Double.parseDouble(txtAltura.getText()));
            a.setCursopreferido(Integer.parseInt(txtCurso.getText()));
            a.setNacionalidade(txtNacionalidade.getText());
            a.setNascimento(txtNascimento.getText());
            a.setPeso(Double.parseDouble(txtPeso.getText()));
            a.setProfissao(txtProfissao.getText());
            a.setId((int) jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 0));
            try {
                dao.update(a);
                readJTable();
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao atualizar.\n Erro: " + ex.toString());
            }

        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jtAlunosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlunosKeyReleased

        if (jtAlunos.getSelectedRow() != -1) {
            txtId.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 0).toString());
            txtNome.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 1).toString());
            txtSexo.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 2).toString());
            txtProfissao.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 3).toString());
            txtNascimento.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 4).toString());
            txtNacionalidade.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 5).toString());
            txtAltura.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 6).toString());
            txtPeso.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 7).toString());
            txtCurso.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_jtAlunosKeyReleased

    private void jtAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlunosMouseClicked
         if (jtAlunos.getSelectedRow() != -1) {
            txtId.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 0).toString());
            txtNome.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 1).toString());
            txtSexo.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 2).toString());
            txtProfissao.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 3).toString());
            txtNascimento.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 4).toString());
            txtNacionalidade.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 5).toString());
            txtAltura.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 6).toString());
            txtPeso.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 7).toString());
            txtCurso.setText(jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_jtAlunosMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        int sair = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Sair?",JOptionPane.YES_NO_OPTION);
        System.out.println(sair);
        if(sair == 0){
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jtAlunos.getSelectedRow() != -1) {
            Alunos a = new Alunos();
            AlunosDAO dao = new AlunosDAO();
            a.setId((int) jtAlunos.getValueAt(jtAlunos.getSelectedRow(), 0));
            try {
                dao.delete(a);
                readJTable();
                JOptionPane.showMessageDialog(null,"Excluido com sucesso.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir.\n Erro: " + ex.toString());
            }

        }

        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            readJTablePesquisa(txtPesquisa.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar.\n" + ex);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    /*INSTANCIANDO UM OBJ POINT PARA MOVIMENTACAO DA JANELA*/
    Point point = new Point();
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x , p.y + evt.getY() - point.y);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadAlunos().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar." + ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<Object> cbProfissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlunos;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblCuso;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
