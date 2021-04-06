package Aplicacao;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.awt.Point;
import java.io.IOException;
import java.net.URI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dao.UsuarioDAO;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        sepSenha = new javax.swing.JSeparator();
        txtSenha = new javax.swing.JPasswordField();
        sepUser = new javax.swing.JSeparator();
        iconUser = new javax.swing.JLabel();
        iconSenha = new javax.swing.JLabel();
        iconMenu = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        lblFace = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        jpControles = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        pnlApresentacao = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(153, 153, 153));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setBackground(new java.awt.Color(37, 65, 178));
        lblUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(37, 65, 178));
        lblUsuario.setText("USUÁRIO:");
        jpIngreso.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 30));

        lblSenha.setBackground(new java.awt.Color(37, 65, 178));
        lblSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(37, 65, 178));
        lblSenha.setText("SENHA:");
        jpIngreso.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 30));

        iconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/User.png"))); // NOI18N
        jpIngreso.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 130, 90));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Insira seu usuário");
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpIngreso.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 30));

        sepSenha.setBackground(new java.awt.Color(60, 63, 65));
        sepSenha.setForeground(new java.awt.Color(45, 45, 45));
        sepSenha.setFocusable(true);
        jpIngreso.add(sepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 30));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setForeground(new java.awt.Color(153, 153, 153));
        txtSenha.setText("Insira sua senha");
        txtSenha.setBorder(null);
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpIngreso.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 30));

        sepUser.setBackground(new java.awt.Color(60, 63, 65));
        sepUser.setForeground(new java.awt.Color(45, 45, 45));
        sepUser.setFocusable(true);
        jpIngreso.add(sepUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 10));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Usuario.png"))); // NOI18N
        jpIngreso.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, -1));

        iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Senha.png"))); // NOI18N
        jpIngreso.add(iconSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 30, -1));

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Menu.png"))); // NOI18N
        iconMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMenuMouseClicked(evt);
            }
        });
        jpIngreso.add(iconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(37, 65, 178));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(37, 65, 178));
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Entrar.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        jpIngreso.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, 50));

        lblLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Maps_off.png"))); // NOI18N
        lblLocal.setToolTipText("Nos localize :)");
        lblLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLocalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLocalMouseExited(evt);
            }
        });
        jpIngreso.add(lblLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 30, 30));

        lblFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Facebook_off.png"))); // NOI18N
        lblFace.setToolTipText("Curta nossa página :)");
        lblFace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFaceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFaceMouseExited(evt);
            }
        });
        jpIngreso.add(lblFace, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 30, -1));

        lblContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Contato_off.png"))); // NOI18N
        lblContato.setToolTipText("Entre em contato conosco :)");
        lblContato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContatoMouseExited(evt);
            }
        });
        jpIngreso.add(lblContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, 30, -1));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jpControles.setBackground(new java.awt.Color(255, 255, 255));
        jpControles.setForeground(new java.awt.Color(255, 255, 255));
        jpControles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sair_off.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        jpControles.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 11, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Minimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        jpControles.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 11, -1, -1));

        getContentPane().add(jpControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pnlApresentacao.setBackground(new java.awt.Color(255, 255, 255));
        pnlApresentacao.setMaximumSize(new java.awt.Dimension(760, 530));
        pnlApresentacao.setMinimumSize(new java.awt.Dimension(760, 530));
        pnlApresentacao.setPreferredSize(new java.awt.Dimension(760, 530));
        pnlApresentacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlApresentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMenuMouseClicked
        /*MOVENDO OS BOTOES DA ESQUERDA PARA A DIREITA UTILIZANDO A BIBLIOTECA ANIMATON*/
        AnimationClass local = new AnimationClass();
        local.jLabelXRight(-40, 20, 10, 5, lblLocal);
        AnimationClass facebook = new AnimationClass();
        facebook.jLabelXRight(-40, 20, 30, 5, lblFace);
        AnimationClass contato = new AnimationClass();
        contato.jLabelXRight(-40, 20, 50, 5, lblContato);

        /*MOVENDO OS BOTOES DA ESQUERDA PARA A DIREITA UTILIZANDO A BIBLIOTECA ANIMATON*/
        AnimationClass localS = new AnimationClass();
        localS.jLabelXLeft(20, -40, 10, 5, lblLocal);
        AnimationClass facebookS = new AnimationClass();
        facebookS.jLabelXLeft(20, -40, 30, 5, lblFace);
        AnimationClass contatoS = new AnimationClass();
        contatoS.jLabelXLeft(20, -40, 50, 5, lblContato);

    }//GEN-LAST:event_iconMenuMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        /*COMANDO PARA MINIMIZAR JANELA DO PROGRAMA AO CLICAR NA LABEL*/
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        /*COMANDO PARA LANÇAR UMA CAIXA DE CONFIRMAÇÃO DO FECHAMENTO DO PROGRAMA*/
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair?", JOptionPane.YES_NO_OPTION);
        if (sair == 0) {
            /*COMANDO PARA FECHAR JANELA DO PROGRAMA AO CLICAR NA LABEL*/
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairMouseClicked

    private void lblLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLocalMouseClicked
        /* ABRIR LOCAL DA LOJA NO MAPS PELO BOTÃO NO JFRAME */
        try {
            Desktop.getDesktop().browse(URI.create("encurtador.com.br/fyLW8"));
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lblLocalMouseClicked
    private void lblFaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFaceMouseClicked
        /* ABRIR LINK DA PÁGINA NO FACEBOOK PELO BOTÃO NO JFRAME */
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/DuSatRepar/"));
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblFaceMouseClicked

    /*INSTANCIANDO UM OBJETO 'POINT' PARA MOVIMENTAÇÃO DA JANELA UNDECORATED*/
    Point point = new Point();
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        /* MOVIMENTAR JANELA APÓS CLICAR E MANTER PRESSIONADO O JFRAME */
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        /* SOLTAR JFRAME APÓS SOLTAR O BOTÃO DO MOUSE */
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void lblLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLocalMouseEntered
        /*TROCA A IMAGEM DA LABEL AO PASSAR O MOUSE ENCIMA DELA*/
        lblLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Maps_on.png")));

    }//GEN-LAST:event_lblLocalMouseEntered
    private void lblLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLocalMouseExited
        /*TROCA A IMAGEM DA LABEL AO RETIRAR O MOUSE DE CIMA DELA*/
        lblLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Maps_off.png")));

    }//GEN-LAST:event_lblLocalMouseExited

    private void lblFaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFaceMouseEntered
        /*TROCA A IMAGEM DA LABEL AO PASSAR O MOUSE ENCIMA DELA*/
        lblFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Facebook_on.png")));
    }//GEN-LAST:event_lblFaceMouseEntered
    private void lblFaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFaceMouseExited
        /*TROCA A IMAGEM DA LABEL AO RETIRAR O MOUSE DE CIMA DELA*/
        lblFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Facebook_off.png")));
    }//GEN-LAST:event_lblFaceMouseExited

    private void lblContatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContatoMouseEntered
        /*TROCA A IMAGEM DA LABEL AO PASSAR O MOUSE EM CIMA DELA*/
        lblContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Contato_on.png")));
    }//GEN-LAST:event_lblContatoMouseEntered
    private void lblContatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContatoMouseExited
        /*TROCA A IMAGEM DA LABEL AO RETIRAR O MOUSE DE CIMA DELA*/
        lblContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Contato_off.png")));
    }//GEN-LAST:event_lblContatoMouseExited

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        /*TROCA A IMAGEM DA LABEL AO PASSAR O MOUSE EM CIMA DELA*/
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sair_on.png")));
    }//GEN-LAST:event_btnSairMouseEntered
    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        /*TROCA A IMAGEM DA LABEL AO RETIRAR O MOUSE DE CIMA DELA*/
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sair_off.png")));
    }//GEN-LAST:event_btnSairMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        /*TROCA A IMAGEM DA LABEL AO PASSAR O MOUSE EM CIMA DELA*/
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Minimizar_ON.png")));
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        /*TROCA A IMAGEM DA LABEL AO RETIRAR O MOUSE DE CIMA DELA*/
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Minimizar.png")));
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        UsuarioDAO dao = new UsuarioDAO();

        try {
            if (dao.checkLogin(txtUsuario.getText(), txtSenha.getText())) {
                new Home().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com o banco de dados."
                    + "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEntrarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel iconMenu;
    private javax.swing.JLabel iconSenha;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblFace;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlApresentacao;
    private javax.swing.JSeparator sepSenha;
    private javax.swing.JSeparator sepUser;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
