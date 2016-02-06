/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simone.forms;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;



public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {

        redefinindoIcone();
        //this.setUndecorated(true); 
              
        initComponents();
               
        redefinindoBackground();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_AcessoRegistro = new javax.swing.JMenu();
        jmI_RegistroConsumo = new javax.swing.JMenuItem();
        jmI_TabelaTarifas = new javax.swing.JMenuItem();
        jmI_CalcularConta = new javax.swing.JMenuItem();
        jm_Sair = new javax.swing.JMenu();
        jni_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROLE DIÁRIO DE CONSUMO DE LUZ");
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 700));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(72, 27));

        jm_AcessoRegistro.setText("Acesso");
        jm_AcessoRegistro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jmI_RegistroConsumo.setText("Registro de Consumo");
        jmI_RegistroConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmI_RegistroConsumoActionPerformed(evt);
            }
        });
        jm_AcessoRegistro.add(jmI_RegistroConsumo);

        jmI_TabelaTarifas.setText("Tabela de Tarifas");
        jmI_TabelaTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmI_TabelaTarifasActionPerformed(evt);
            }
        });
        jm_AcessoRegistro.add(jmI_TabelaTarifas);

        jmI_CalcularConta.setText("Calcular Conta");
        jmI_CalcularConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmI_CalcularContaActionPerformed(evt);
            }
        });
        jm_AcessoRegistro.add(jmI_CalcularConta);

        jMenuBar1.add(jm_AcessoRegistro);

        jm_Sair.setText("Sair");
        jm_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jni_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jni_Sair.setText("Sair do Sistema");
        jni_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jni_SairActionPerformed(evt);
            }
        });
        jm_Sair.add(jni_Sair);

        jMenuBar1.add(jm_Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jni_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jni_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jni_SairActionPerformed

    private void jmI_CalcularContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmI_CalcularContaActionPerformed
        new PesquisaDeRegistros(this, true).setVisible(true);
    }//GEN-LAST:event_jmI_CalcularContaActionPerformed

    private void jmI_TabelaTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmI_TabelaTarifasActionPerformed
        new TabelaDeTarifas(null, true).setVisible(true);
    }//GEN-LAST:event_jmI_TabelaTarifasActionPerformed

    private void jmI_RegistroConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmI_RegistroConsumoActionPerformed
        new RegistraConsumoDiario(this, true).setVisible(true);
    }//GEN-LAST:event_jmI_RegistroConsumoActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaPrincipal janela = new JanelaPrincipal();
                janela.setVisible(true);
                janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
                janela.setResizable(false);              
            }
        });
    }

    private void redefinindoIcone() {
        //this.setIconImage(new ImageIcon(getClass().getResource("/br/com/simone/img/raio.jpg")).getImage());
        URL url = this.getClass().getResource("/br/com/simone/img/raio.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
       
    }

    private void redefinindoBackground() {
        java.awt.Color c = new java.awt.Color(220, 220, 220);
        jPanel1.setBackground(c);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmI_CalcularConta;
    private javax.swing.JMenuItem jmI_RegistroConsumo;
    private javax.swing.JMenuItem jmI_TabelaTarifas;
    private javax.swing.JMenu jm_AcessoRegistro;
    private javax.swing.JMenu jm_Sair;
    private javax.swing.JMenuItem jni_Sair;
    // End of variables declaration//GEN-END:variables
}
