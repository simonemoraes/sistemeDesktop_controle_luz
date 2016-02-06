/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simone.forms;

import br.com.simone.controller.ConsumoMesController;
import br.com.simone.controller.ValorTarifasController;
import br.com.simone.model.ConsumoMes;
import br.com.simone.model.ValorTarifas;
import br.com.simone.util.UtilGen;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class PesquisaDeRegistros extends javax.swing.JDialog {

    public PesquisaDeRegistros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
      
        initComponents();
        redefinindoBackground();
    }

    private void redefinindoBackground() {
        java.awt.Color c = new java.awt.Color(220,220,220);
        jtf_tarifaNormal.setBackground(c);
        jtf_TarifaBVermelha.setBackground(c);
        jtf_TaxaIluminacao.setBackground(c);
        jtf_Media.setBackground(c);
        jtf_Total.setBackground(c);
        jtf_ValorConta.setBackground(c);
        jp_Resultado.setBackground(c);
        jp_Data.setBackground(c);
        jp_Principal.setBackground(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jp_Principal = new javax.swing.JPanel();
        jp_Data = new javax.swing.JPanel();
        jl_DataInicial = new javax.swing.JLabel();
        jtf_DataInicial = new javax.swing.JTextField();
        jl_DataFinal = new javax.swing.JLabel();
        jtf_DataFinal = new javax.swing.JTextField();
        jb_Calcular = new javax.swing.JButton();
        jb_Limpar = new javax.swing.JButton();
        jp_Resultado = new javax.swing.JPanel();
        jl_Media = new javax.swing.JLabel();
        jtf_Total = new javax.swing.JTextField();
        jl_Total = new javax.swing.JLabel();
        jtf_Media = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jl_TarifaNormal = new javax.swing.JLabel();
        jl_TarifaBVermelha = new javax.swing.JLabel();
        jl_TaxaIluminacao = new javax.swing.JLabel();
        jtf_tarifaNormal = new javax.swing.JTextField();
        jtf_TarifaBVermelha = new javax.swing.JTextField();
        jtf_TaxaIluminacao = new javax.swing.JTextField();
        jl_ValorTotalConta = new javax.swing.JLabel();
        jtf_ValorConta = new javax.swing.JTextField();
        jb_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calcula a Média e o Total de Kwh por Período");
        setBackground(new java.awt.Color(211, 211, 211));

        jp_Data.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_DataInicial.setText("Data Inicial: ");

        jl_DataFinal.setText("Data Final:");

        jb_Calcular.setText("Calcular");
        jb_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CalcularActionPerformed(evt);
            }
        });

        jb_Limpar.setText("Limpar");
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_DataLayout = new javax.swing.GroupLayout(jp_Data);
        jp_Data.setLayout(jp_DataLayout);
        jp_DataLayout.setHorizontalGroup(
            jp_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_DataLayout.createSequentialGroup()
                        .addComponent(jl_DataInicial)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_DataFinal)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DataLayout.createSequentialGroup()
                        .addComponent(jb_Limpar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Calcular)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jp_DataLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtf_DataFinal, jtf_DataInicial});

        jp_DataLayout.setVerticalGroup(
            jp_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DataLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_DataInicial)
                    .addComponent(jtf_DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_DataFinal)
                    .addComponent(jtf_DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Calcular)
                    .addComponent(jb_Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_Resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jl_Media.setText("Média em Kwh:");

        jtf_Total.setEditable(false);
        jtf_Total.setBorder(null);

        jl_Total.setText("Total em Kwh:");

        jtf_Media.setEditable(false);
        jtf_Media.setBorder(null);

        jl_TarifaNormal.setText("Tarifa Normal:");

        jl_TarifaBVermelha.setText("Tarifa BVermelha:");

        jl_TaxaIluminacao.setText("Taxa de Iluminação:");

        jtf_tarifaNormal.setEditable(false);
        jtf_tarifaNormal.setBorder(null);
        jtf_tarifaNormal.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtf_TarifaBVermelha.setEditable(false);
        jtf_TarifaBVermelha.setBorder(null);

        jtf_TaxaIluminacao.setEditable(false);
        jtf_TaxaIluminacao.setBorder(null);

        jl_ValorTotalConta.setText("Valor Total da Conta:");

        jtf_ValorConta.setEditable(false);
        jtf_ValorConta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtf_ValorConta.setBorder(null);

        javax.swing.GroupLayout jp_ResultadoLayout = new javax.swing.GroupLayout(jp_Resultado);
        jp_Resultado.setLayout(jp_ResultadoLayout);
        jp_ResultadoLayout.setHorizontalGroup(
            jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Total)
                    .addComponent(jl_TarifaNormal)
                    .addComponent(jl_TarifaBVermelha)
                    .addComponent(jl_TaxaIluminacao)
                    .addComponent(jl_Media)
                    .addComponent(jl_ValorTotalConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_ValorConta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_ResultadoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_TarifaBVermelha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_TaxaIluminacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_tarifaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(134, 134, 134))
            .addComponent(jSeparator1)
        );

        jp_ResultadoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtf_Media, jtf_TarifaBVermelha, jtf_TaxaIluminacao, jtf_Total, jtf_tarifaNormal});

        jp_ResultadoLayout.setVerticalGroup(
            jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ResultadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ResultadoLayout.createSequentialGroup()
                        .addComponent(jtf_tarifaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_TarifaBVermelha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_TaxaIluminacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_ResultadoLayout.createSequentialGroup()
                        .addComponent(jl_TarifaNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_TarifaBVermelha)
                        .addGap(18, 18, 18)
                        .addComponent(jl_TaxaIluminacao)
                        .addGap(18, 18, 18)
                        .addComponent(jl_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_Total)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_ValorConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_ValorTotalConta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_Voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Voltar.setText("Fechar");
        jb_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PrincipalLayout = new javax.swing.GroupLayout(jp_Principal);
        jp_Principal.setLayout(jp_PrincipalLayout);
        jp_PrincipalLayout.setHorizontalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_PrincipalLayout.setVerticalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jb_Voltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VoltarActionPerformed
        this.setVisible(false);
        new JanelaPrincipal().setVisible(false);
    }//GEN-LAST:event_jb_VoltarActionPerformed

    private void jb_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CalcularActionPerformed
        
        calcularContaDeLuz();
        
    }//GEN-LAST:event_jb_CalcularActionPerformed

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jb_LimparActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Calcular;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JButton jb_Voltar;
    private javax.swing.JLabel jl_DataFinal;
    private javax.swing.JLabel jl_DataInicial;
    private javax.swing.JLabel jl_Media;
    private javax.swing.JLabel jl_TarifaBVermelha;
    private javax.swing.JLabel jl_TarifaNormal;
    private javax.swing.JLabel jl_TaxaIluminacao;
    private javax.swing.JLabel jl_Total;
    private javax.swing.JLabel jl_ValorTotalConta;
    private javax.swing.JPanel jp_Data;
    private javax.swing.JPanel jp_Principal;
    private javax.swing.JPanel jp_Resultado;
    private javax.swing.JTextField jtf_DataFinal;
    private javax.swing.JTextField jtf_DataInicial;
    private javax.swing.JTextField jtf_Media;
    private javax.swing.JTextField jtf_TarifaBVermelha;
    private javax.swing.JTextField jtf_TaxaIluminacao;
    private javax.swing.JTextField jtf_Total;
    private javax.swing.JTextField jtf_ValorConta;
    private javax.swing.JTextField jtf_tarifaNormal;
    // End of variables declaration//GEN-END:variables

    private void calcularContaDeLuz()  {
        
        try {
            ConsumoMes dataInicial = new ConsumoMes();
            ConsumoMes dataFinal = new ConsumoMes();
            
            Date dtinicial = (Date) UtilGen.convertStringToDate(jtf_DataInicial.getText());
            Date dtfinal = (Date) UtilGen.convertStringToDate(jtf_DataFinal.getText());
            
            if(!dtinicial.after(dtfinal)){
                efetuaCalculo(dataInicial, dataFinal);
            }else{
                JOptionPane.showMessageDialog(null,"Data inicial deve ser posterior a data final!");
            }
        } catch (ParseException ex) {
            Logger.getLogger(PesquisaDeRegistros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Data no formato invalido! "+ex.getMessage());
        }              
    }

    private void efetuaCalculo(ConsumoMes dataInicial, ConsumoMes dataFinal) {
        dataInicial.setData( jtf_DataInicial.getText() );
        dataFinal.setData( jtf_DataFinal.getText() );
       
        double media = new ConsumoMesController().calculaMediaKwhPorPeriodo(dataInicial, dataFinal );
        int total_kwh = new ConsumoMesController().calculaTotalKwhPorPeriodo(dataInicial, dataFinal );
        double valorContaLuz = new ConsumoMesController().calculaValorContaLuz(dataInicial, dataFinal);
        ValorTarifas tarifa = new ValorTarifasController().selecionandoUltimoRegistro();
        
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        
        jtf_tarifaNormal.setText( Double.toString( tarifa.getTarifa()));
        jtf_TarifaBVermelha.setText( Double.toString( tarifa.getTarifa_bVermelha()));
        jtf_TaxaIluminacao.setText( Double.toString( tarifa.getTarifa_Iluminacao()));
        jtf_Media.setText( formatter.format(media));
        jtf_Total.setText( Integer.toString( total_kwh));
        jtf_ValorConta.setText( "R$ " + formatter.format(valorContaLuz ));
    }

    private void limparCampos() {
        jtf_DataInicial.setText("");
        jtf_DataFinal.setText("");
    }
}
