package Aplicacao;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.awt.Point;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        iconUsuario = new javax.swing.JLabel();
        iconMenu = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        lblFace = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        jpHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblPendencias = new javax.swing.JLabel();
        lblServicos = new javax.swing.JLabel();
        lblSobre = new javax.swing.JLabel();
        btnPendencias = new javax.swing.JLabel();
        btnServicos = new javax.swing.JLabel();
        btnSobre = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        lblLupa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jpControles = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();

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

        iconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/User.png"))); // NOI18N
        jpIngreso.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 130, 90));

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Menu.png"))); // NOI18N
        iconMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMenuMouseClicked(evt);
            }
        });
        jpIngreso.add(iconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Maps_off.png"))); // NOI18N
        lblLocal.setToolTipText("Nos localize aqui :)");
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

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setForeground(new java.awt.Color(255, 255, 255));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setBackground(new java.awt.Color(255, 255, 255));
        lblHome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblHome.setForeground(new java.awt.Color(37, 65, 178));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Home");
        jpHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, -1));

        lblPendencias.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblPendencias.setForeground(new java.awt.Color(37, 65, 178));
        lblPendencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPendencias.setText("Pendências");
        jpHome.add(lblPendencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 180, -1));

        lblServicos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblServicos.setForeground(new java.awt.Color(37, 65, 178));
        lblServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServicos.setText("Serviços");
        jpHome.add(lblServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, -1));

        lblSobre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblSobre.setForeground(new java.awt.Color(37, 65, 178));
        lblSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSobre.setText("Sobre nós");
        jpHome.add(lblSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 180, -1));

        btnPendencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPendencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Pendências_off.png"))); // NOI18N
        btnPendencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPendencias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPendenciasMouseMoved(evt);
            }
        });
        btnPendencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPendenciasMouseExited(evt);
            }
        });
        jpHome.add(btnPendencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 200, 180));

        btnServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Serviços_off.png"))); // NOI18N
        btnServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnServicos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnServicosMouseMoved(evt);
            }
        });
        btnServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServicosMouseExited(evt);
            }
        });
        jpHome.add(btnServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 200, 180));

        btnSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sobre_off.png"))); // NOI18N
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSobre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSobreMouseMoved(evt);
            }
        });
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSobreMouseExited(evt);
            }
        });
        jpHome.add(btnSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 180));

        btnHome.setBackground(new java.awt.Color(37, 65, 178));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Home.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnHomeMouseMoved(evt);
            }
        });
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        jpHome.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 180));

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Pesquisa.png"))); // NOI18N
        jpHome.add(lblLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 30, 30));

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        txtPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesquisa.setText("Procurar...");
        txtPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 65, 178), 2));
        txtPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpHome.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 170, 30));

        getContentPane().add(jpHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

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
        facebookS.jLabelXLeft(20, -40, 30,5, lblFace);
        AnimationClass contatoS = new AnimationClass();
        contatoS.jLabelXLeft(20, -40, 50, 5, lblContato);
        
    }//GEN-LAST:event_iconMenuMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        /*COMANDO PARA MINIMIZAR JANELA DO PROGRAMA AO CLICAR NA LABEL*/
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        /*COMANDO PARA LANÇAR UMA CAIXA DE CONFIRMAÇÃO DO FECHAMENTO DO PROGRAMA*/
        int sair = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Sair?",JOptionPane.YES_NO_OPTION);
        if(sair == 0){
            /*COMANDO PARA FECHAR JANELA DO PROGRAMA AO CLICAR NA LABEL*/
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairMouseClicked

    private void lblLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLocalMouseClicked
        /* ABRIR LOCAL DA LOJA NO MAPS PELO BOTÃO NO JFRAME */
        try {
            Desktop.getDesktop().browse(URI.create("www.encurtador.com.br/fyLW8"));
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_lblLocalMouseClicked
    private void lblFaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFaceMouseClicked
        /* ABRIR LINK DA PÁGINA NO FACEBOOK PELO BOTÃO NO JFRAME */
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/DuSatRepar/"));
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
        this.setLocation(p.x + evt.getX() - point.x , p.y + evt.getY() - point.y);
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

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        /*COMANDO PARA OCULTAR BORDA DO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnHomeMouseExited
    private void btnHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseMoved
        /*COMANDO PARA INSERIR BORDA NO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37,65,178),3));
    }//GEN-LAST:event_btnHomeMouseMoved

    private void btnSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseExited
        /*COMANDO PARA OCULTAR BORDA DO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnSobre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnSobreMouseExited
    private void btnSobreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseMoved
        /*COMANDO PARA INSERIR BORDA NO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnSobre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37,65,178),3));
    }//GEN-LAST:event_btnSobreMouseMoved

    private void btnServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseExited
        /*COMANDO PARA OCULTAR BORDA DO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnServicosMouseExited
    private void btnServicosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseMoved
        /*COMANDO PARA INSERIR BORDA NO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37,65,178),3));
    }//GEN-LAST:event_btnServicosMouseMoved

    private void btnPendenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendenciasMouseExited
        /*COMANDO PARA OCULTAR BORDA DO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnPendencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnPendenciasMouseExited
    private void btnPendenciasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendenciasMouseMoved
        /*COMANDO PARA INSERIR BORDA NO BOTÃO QUANDO PASSARMOS O MOUSE POR CIMA DELE*/
        btnPendencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37,65,178),3));
    }//GEN-LAST:event_btnPendenciasMouseMoved

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnPendencias;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnServicos;
    private javax.swing.JLabel btnSobre;
    private javax.swing.JLabel iconMenu;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblFace;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JLabel lblPendencias;
    private javax.swing.JLabel lblServicos;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
