package ppt;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Juego extends javax.swing.JFrame {

    String Selec = "", bot_S = "";
    int p = 3;
    public static int sB, sJ;
    boolean x = true, s1 = false, s2 = false, s3 = false, btn = true;

    ImageIcon papelM = new ImageIcon("src/img/papel.gif");
    ImageIcon piedraM = new ImageIcon("src/img/piedra.gif");
    ImageIcon tijeraM = new ImageIcon("src/img/tijera.gif");

    ImageIcon papel = new ImageIcon("src/img/papel.png");
    ImageIcon tijera = new ImageIcon("src/img/tijera.png");
    ImageIcon piedra = new ImageIcon("src/img/piedra.png");

    ImageIcon Score = new ImageIcon("src/img/Score.png");
    ImageIcon ScoreWin = new ImageIcon("src/img/ScoreWin.png");
    ImageIcon ScoreLose = new ImageIcon("src/img/ScoreLose.png");
    ImageIcon ScoreTie = new ImageIcon("src/img/ScoreTie.png");

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();

        setLocationRelativeTo(null);
        setSize(600, 500);
        setTitle("Piedra, Papel o Tijera.");
        setResizable(false);

        jLabel_Score1.setIcon(Score);
        jLabel_Score2.setIcon(Score);
        jLabel_Score3.setIcon(Score);

    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/tijera.png"));
        return retValue;
    }

    private void bot() {
        int bot = (int) (Math.random() * 3);
        switch (bot) {
            case 0:
                bot_S = "Tijera";
                break;
            case 1:
                bot_S = "Papel";
                break;
            case 2:
                bot_S = "Piedra";
                break;
            default:
                break;
        }
    }

    public void cambiaPng(String select) {

        String marca = select;

        if (marca.equals("Papel")) {
            jButton_Papel.setIcon(papelM);
            jButton_Tijera.setIcon(tijera);
            jButton_Piedra.setIcon(piedra);
            this.repaint();

        } else if (marca.equals("Piedra")) {
            jButton_Piedra.setIcon(piedraM);
            jButton_Papel.setIcon(papel);
            jButton_Tijera.setIcon(tijera);
            this.repaint();

        } else if (marca.equals("Tijera")) {
            jButton_Tijera.setIcon(tijeraM);
            jButton_Papel.setIcon(papel);
            jButton_Piedra.setIcon(piedra);
            this.repaint();
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

        jButton_Piedra = new javax.swing.JButton();
        jButton_Papel = new javax.swing.JButton();
        jButton_Tijera = new javax.swing.JButton();
        jLabel_Time = new javax.swing.JLabel();
        jButton_bot_Piedra = new javax.swing.JButton();
        jButton_bot_Papel = new javax.swing.JButton();
        jButton_bot_Tijera = new javax.swing.JButton();
        jButton_Empezar = new javax.swing.JButton();
        jLabel_Score1 = new javax.swing.JLabel();
        jLabel_Score2 = new javax.swing.JLabel();
        jLabel_Score3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N
        jButton_Piedra.setContentAreaFilled(false);
        jButton_Piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PiedraActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 120));

        jButton_Papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        jButton_Papel.setContentAreaFilled(false);
        jButton_Papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PapelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 120));
        jButton_Papel.getAccessibleContext().setAccessibleName("Papel");

        jButton_Tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tijera.png"))); // NOI18N
        jButton_Tijera.setContentAreaFilled(false);
        jButton_Tijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TijeraActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Tijera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 120));

        jLabel_Time.setFont(new java.awt.Font("Arial", 0, 96)); // NOI18N
        getContentPane().add(jLabel_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, 100));

        jButton_bot_Piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N
        jButton_bot_Piedra.setContentAreaFilled(false);
        getContentPane().add(jButton_bot_Piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 80, 120));

        jButton_bot_Papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        jButton_bot_Papel.setContentAreaFilled(false);
        getContentPane().add(jButton_bot_Papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 80, 120));

        jButton_bot_Tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tijera.png"))); // NOI18N
        jButton_bot_Tijera.setContentAreaFilled(false);
        getContentPane().add(jButton_bot_Tijera, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 80, 120));

        jButton_Empezar.setText("Empezar");
        jButton_Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 80, 40));

        jLabel_Score1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Score.png"))); // NOI18N
        getContentPane().add(jLabel_Score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 64, 64));

        jLabel_Score2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Score.png"))); // NOI18N
        getContentPane().add(jLabel_Score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 64, 64));

        jLabel_Score3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Score.png"))); // NOI18N
        getContentPane().add(jLabel_Score3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 64, 64));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PiedraActionPerformed
        if (btn) {
            jButton_Empezar.doClick();
            btn = false;
            Selec = "Piedra";
            cambiaPng(Selec);
        }
    }//GEN-LAST:event_jButton_PiedraActionPerformed

    private void jButton_PapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PapelActionPerformed
        if (btn) {
            jButton_Empezar.doClick();
            btn = false;
            Selec = "Papel";
            cambiaPng(Selec);
        }
    }//GEN-LAST:event_jButton_PapelActionPerformed

    private void jButton_TijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TijeraActionPerformed
        if (btn) {
            jButton_Empezar.doClick();
            btn = false;
            Selec = "Tijera";
            cambiaPng(Selec);
        }
    }//GEN-LAST:event_jButton_TijeraActionPerformed

    private void jButton_EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EmpezarActionPerformed

        jButton_Papel.setIcon(papel);
        jButton_bot_Papel.setIcon(papel);
        jButton_Tijera.setIcon(tijera);
        jButton_bot_Tijera.setIcon(tijera);
        jButton_Piedra.setIcon(piedra);
        jButton_bot_Piedra.setIcon(piedra);

        if (p > 0) {
            if (x) {
                x = false;
                Timer timer = new Timer();

                timer.scheduleAtFixedRate(new TimerTask() {
                    int i = 3;

                    public void run() {

                        jLabel_Time.setText(String.valueOf(i));
                        i--;

                        if (i < 0) {
                            timer.cancel();

                            bot();

                            switch (bot_S) {
                                case "Papel":
                                    jButton_bot_Papel.setIcon(papelM);
                                    break;
                                case "Tijera":
                                    jButton_bot_Tijera.setIcon(tijeraM);
                                    break;
                                case "Piedra":
                                    jButton_bot_Piedra.setIcon(piedraM);
                                    break;
                                default:
                                    break;
                            }

                            // Ganar.
                            if (Selec.equals("Piedra") && bot_S.equals("Tijera")
                                    || Selec.equals("Papel") && bot_S.equals("Piedra")
                                    || Selec.equals("Tijera") && bot_S.equals("Papel")) {

                                if (!s1) {
                                    s1 = true;
                                    jLabel_Score1.setIcon(ScoreWin);
                                } else if (!s2) {
                                    s2 = true;
                                    jLabel_Score2.setIcon(ScoreWin);
                                } else if (!s3) {
                                    s3 = true;
                                    jLabel_Score3.setIcon(ScoreWin);
                                }

                                sJ++;

                                // Perder.
                            } else if (Selec.equals("Piedra") && bot_S.equals("Papel")
                                    || Selec.equals("Papel") && bot_S.equals("Tijera")
                                    || Selec.equals("Tijera") && bot_S.equals("Piedra")) {

                                if (!s1) {
                                    s1 = true;
                                    jLabel_Score1.setIcon(ScoreLose);
                                } else if (!s2) {
                                    s2 = true;
                                    jLabel_Score2.setIcon(ScoreLose);
                                } else if (!s3) {
                                    s3 = true;
                                    jLabel_Score3.setIcon(ScoreLose);
                                }

                                sB++;

                                // Empate
                            } else if (Selec.equals(bot_S)) {
                                if (!s1) {
                                    s1 = true;
                                    jLabel_Score1.setIcon(ScoreTie);
                                } else if (!s2) {
                                    s2 = true;
                                    jLabel_Score2.setIcon(ScoreTie);
                                } else if (!s3) {
                                    s3 = true;
                                    jLabel_Score3.setIcon(ScoreTie);
                                }
                                sB++;
                                sJ++;
                            }
                            jLabel_Time.setText("");
                            x = true;
                            p--;
                            btn = true;
                            if (p == 0) {

                                new Final().setVisible(true);
                                dispose();
                            }
                        }
                    }
                }, 0, 1000);
            }
        }
    }//GEN-LAST:event_jButton_EmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Empezar;
    private javax.swing.JButton jButton_Papel;
    private javax.swing.JButton jButton_Piedra;
    private javax.swing.JButton jButton_Tijera;
    private javax.swing.JButton jButton_bot_Papel;
    private javax.swing.JButton jButton_bot_Piedra;
    private javax.swing.JButton jButton_bot_Tijera;
    private javax.swing.JLabel jLabel_Score1;
    private javax.swing.JLabel jLabel_Score2;
    private javax.swing.JLabel jLabel_Score3;
    private javax.swing.JLabel jLabel_Time;
    // End of variables declaration//GEN-END:variables
}
