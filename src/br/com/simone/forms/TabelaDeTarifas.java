package br.com.simone.forms;

import br.com.simone.controller.ValorTarifasController;
import br.com.simone.model.ValorTarifas;
import br.com.simone.table.ValorTarifasCellRenderer;
import br.com.simone.table.ValorTarifasTableModel;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

public class TabelaDeTarifas extends javax.swing.JDialog {

    private List<ValorTarifas> listaTarifa;
    private int idConsumo;
    private ValorTarifas tarifa;

    public TabelaDeTarifas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //this.setIconImage(new ImageIcon(getClass().getResource("/br/com/simone/img/raio.jpg")).getImage()); 
        URL url = this.getClass().getResource("/br/com/simone/img/raio.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);

        initComponents();
        redefinindoBackground();
        dicaDeTextoParaBotoes();
        redefinindoLayout();
        refreshTable();

        enableFields(false);

    }

    private void redefinindoBackground() {
        java.awt.Color c = new java.awt.Color(220, 220, 220);
        jp_Principal.setBackground(c);
        jp_ListaRegistro.setBackground(c);
        jp_RegTarifas.setBackground(c);
        jp_Buttons.setBackground(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Principal = new javax.swing.JPanel();
        jp_RegTarifas = new javax.swing.JPanel();
        jp_Buttons = new javax.swing.JPanel();
        jbt_Excluir = new javax.swing.JButton();
        jbt_Atualizar = new javax.swing.JButton();
        jbt_Salvar = new javax.swing.JButton();
        jbt_Novo = new javax.swing.JButton();
        jbt_Cancelar = new javax.swing.JButton();
        jl_TarifaPrincipal = new javax.swing.JLabel();
        jl_TarifaBVermelha = new javax.swing.JLabel();
        jtf_Principal = new javax.swing.JTextField();
        jtf_TarifaBVermelha = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jl_TaxaIluminacao = new javax.swing.JLabel();
        jtf_TaxaIluminacao = new javax.swing.JTextField();
        jp_ListaRegistro = new javax.swing.JPanel();
        jSrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jb_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de Tarifas");

        jp_RegTarifas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro das Tarifas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jp_Buttons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_Buttons.setPreferredSize(new java.awt.Dimension(477, 59));

        jbt_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simone/img/trash.png"))); // NOI18N
        jbt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_ExcluirActionPerformed(evt);
            }
        });

        jbt_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simone/img/edit.png"))); // NOI18N
        jbt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_AtualizarActionPerformed(evt);
            }
        });

        jbt_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simone/img/save.png"))); // NOI18N
        jbt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_SalvarActionPerformed(evt);
            }
        });

        jbt_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simone/img/add.png"))); // NOI18N
        jbt_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_NovoActionPerformed(evt);
            }
        });

        jbt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simone/img/cancel.png"))); // NOI18N
        jbt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_ButtonsLayout = new javax.swing.GroupLayout(jp_Buttons);
        jp_Buttons.setLayout(jp_ButtonsLayout);
        jp_ButtonsLayout.setHorizontalGroup(
            jp_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ButtonsLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jbt_Novo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbt_Cancelar)
                .addGap(18, 18, 18)
                .addComponent(jbt_Salvar)
                .addGap(18, 18, 18)
                .addComponent(jbt_Atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbt_Excluir)
                .addGap(110, 110, 110))
        );
        jp_ButtonsLayout.setVerticalGroup(
            jp_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ButtonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jp_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_Cancelar)
                    .addComponent(jbt_Novo)
                    .addComponent(jbt_Salvar)
                    .addComponent(jbt_Atualizar)
                    .addComponent(jbt_Excluir))
                .addGap(18, 18, 18))
        );

        jl_TarifaPrincipal.setText("Tarifa Principal:");

        jl_TarifaBVermelha.setText("Tarifa BVermelha");

        jl_TaxaIluminacao.setText("Taxa Iluminação:");

        javax.swing.GroupLayout jp_RegTarifasLayout = new javax.swing.GroupLayout(jp_RegTarifas);
        jp_RegTarifas.setLayout(jp_RegTarifasLayout);
        jp_RegTarifasLayout.setHorizontalGroup(
            jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_RegTarifasLayout.createSequentialGroup()
                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jp_RegTarifasLayout.createSequentialGroup()
                        .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_RegTarifasLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_TarifaBVermelha)
                                    .addComponent(jl_TarifaPrincipal)
                                    .addComponent(jl_TaxaIluminacao))
                                .addGap(66, 66, 66)
                                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_TaxaIluminacao, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_TarifaBVermelha, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jp_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_RegTarifasLayout.setVerticalGroup(
            jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_RegTarifasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_TarifaPrincipal)
                    .addComponent(jtf_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_TarifaBVermelha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_TarifaBVermelha))
                .addGap(18, 18, 18)
                .addGroup(jp_RegTarifasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_TaxaIluminacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_TaxaIluminacao))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jp_ListaRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Registro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        table.setGridColor(new java.awt.Color(153, 153, 153));
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jSrollPane.setViewportView(table);

        javax.swing.GroupLayout jp_ListaRegistroLayout = new javax.swing.GroupLayout(jp_ListaRegistro);
        jp_ListaRegistro.setLayout(jp_ListaRegistroLayout);
        jp_ListaRegistroLayout.setHorizontalGroup(
            jp_ListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ListaRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSrollPane)
                .addContainerGap())
        );
        jp_ListaRegistroLayout.setVerticalGroup(
            jp_ListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ListaRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jb_Fechar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Fechar.setText("Fechar");
        jb_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PrincipalLayout = new javax.swing.GroupLayout(jp_Principal);
        jp_Principal.setLayout(jp_PrincipalLayout);
        jp_PrincipalLayout.setHorizontalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_RegTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_ListaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Fechar)
                .addContainerGap())
        );
        jp_PrincipalLayout.setVerticalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jp_RegTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_ListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jb_Fechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ExcluirActionPerformed
        removerRegistro();

    }//GEN-LAST:event_jbt_ExcluirActionPerformed

    private void jbt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_AtualizarActionPerformed
        atualizarRegistro();
    }//GEN-LAST:event_jbt_AtualizarActionPerformed

    private void jbt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_SalvarActionPerformed
        salvarRegistro();
    }//GEN-LAST:event_jbt_SalvarActionPerformed

    private void jbt_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_NovoActionPerformed
        novoRegistro();
    }//GEN-LAST:event_jbt_NovoActionPerformed

    private void jbt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CancelarActionPerformed
        cancelarRegistro();
    }//GEN-LAST:event_jbt_CancelarActionPerformed

    private void jb_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_FecharActionPerformed
         this.setVisible( false );
        new JanelaPrincipal();
        
    }//GEN-LAST:event_jb_FecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jSrollPane;
    private javax.swing.JButton jb_Fechar;
    private javax.swing.JButton jbt_Atualizar;
    private javax.swing.JButton jbt_Cancelar;
    private javax.swing.JButton jbt_Excluir;
    private javax.swing.JButton jbt_Novo;
    private javax.swing.JButton jbt_Salvar;
    private javax.swing.JLabel jl_TarifaBVermelha;
    private javax.swing.JLabel jl_TarifaPrincipal;
    private javax.swing.JLabel jl_TaxaIluminacao;
    private javax.swing.JPanel jp_Buttons;
    private javax.swing.JPanel jp_ListaRegistro;
    private javax.swing.JPanel jp_Principal;
    private javax.swing.JPanel jp_RegTarifas;
    private javax.swing.JTextField jtf_Principal;
    private javax.swing.JTextField jtf_TarifaBVermelha;
    private javax.swing.JTextField jtf_TaxaIluminacao;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public void onClickMouse() {

        duploClick();
    }

    private void novoRegistro() {
        enableFields(true);
        tarifa = new ValorTarifas();
    }

    private void cancelarRegistro() {
        jtf_Principal.setText("");
        jtf_TarifaBVermelha.setText("");
        jtf_TaxaIluminacao.setText("");
        ;
    }

    private void salvarRegistro() {
        // Criando uma variável do tipo int que receberá o resultado retornado do banco de dados.
        int result = 0;

        /* Teste para verificar se existe id preenchido.*/
        if (tarifa.getId() == 0) {
            /* Se não a variavel result receberá a instancia da class ConsumoMesController acessando o 
             o metodo da class que adicionará um novo registro.*/
            /* Teste para saber se o campo está ou não preenchido. 
             O método length permite descobrir o número de caráteres contidos numa String.*/
            if (jtf_Principal.getText().length() > 0 && jtf_TarifaBVermelha.getText().length() > 0 && jtf_TaxaIluminacao.getText().length() > 0) {

                // Todos os campos devem ser preenchidos.
                tarifa.setTarifa(Double.parseDouble(jtf_Principal.getText()));
                tarifa.setTarifa_bVermelha(Double.parseDouble(jtf_TarifaBVermelha.getText()));
                tarifa.setTarifa_Iluminacao(Double.parseDouble(jtf_TaxaIluminacao.getText()));

                result = new ValorTarifasController().adicionarNovaTarifa(tarifa);
            } else {
                /* Caso contrario uma mensagem é disparada informando a obrigatoriedade de preenchimento total dos campos.
                 Retornando para o campo de preenchimento.*/
                JOptionPane.showMessageDialog(this, "Todos os registros são obrigatórios.");
                return;
            }

        } else {
            /* Caso contrário será setado o id recuperado e result receberá a 
             * instancia da class ConsumoMesController acessando o metodo da class que
             * alterará registro.*/

            if (jtf_Principal.getText().length() > 0 && jtf_TarifaBVermelha.getText().length() > 0 && jtf_TaxaIluminacao.getText().length() > 0) {

                // Todos os campos devem ser preenchidos.
                tarifa.setTarifa(Double.parseDouble(jtf_Principal.getText()));
                tarifa.setTarifa_bVermelha(Double.parseDouble(jtf_TarifaBVermelha.getText()));
                tarifa.setTarifa_Iluminacao(Double.parseDouble(jtf_TaxaIluminacao.getText()));
                result = new ValorTarifasController().atualizaValorDaTarifa(tarifa);

            } else {
                /* Caso contrario uma mensagem é disparada informando a obrigatoriedade de preenchimento total dos campos.
                 Retornando para o campo de preenchimento.*/
                JOptionPane.showMessageDialog(this, "Todos os registros são obrigatórios.");
                return;
            }

        }

        /* Teste para saber qual operação foi feita no banco de dados.*/
        if (result == 1) {
            // Se result receber 1, sera disparada uma mensagem informando que um novo registro foi inserido.
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!.");
            enableFields(false); // O metodo é chamado para desabilitar os campos.
            cancelarRegistro(); // O metodo é chamado para limpar os campos.
            refreshTable(); // O metodo é chamdo para fazer um refresh na tabela e atualizar as informações nela contidas.
        } else {
            // Caso contrario uma mensagem é disparada informando que nao houve insersao na tabela.
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }

    private void atualizarRegistro() {
        //Captura a linha selecionada.
        int indiceDaLinha = table.getSelectedRow();

        // Teste para verificar se houve seleção de linha na tabela.
        if (indiceDaLinha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um registro a ser alterado.");
            return;
        }

        //Recupera o objeto que será alterado.
        tarifa = new ValorTarifasTableModel(listaTarifa).getLinhaUtilizada(indiceDaLinha);

        jtf_Principal.setText(Double.toString(tarifa.getTarifa()));
        jtf_TarifaBVermelha.setText(Double.toString(tarifa.getTarifa_bVermelha()));
        jtf_TaxaIluminacao.setText(Double.toString(tarifa.getTarifa_Iluminacao()));

        enableFields(true);
    }

    private void removerRegistro() {
        /* Captura linha selecionada.*/
        int rowIndex = table.getSelectedRow();

        /* Teste feito para saber se houve linha selecionada.
         a seleção de linha indica a sua posição.
         portanto se for -1 é porque nenhuma linha foi selecionada e
         se for 0 ou mais é porque uma posição foi selecionada.*/
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione o livro a ser removido");
            return;
        }
        /* Criando um objeto do tipo ConsumoMes que receberá a instancia da class ConsumoMesTableModel
         onde será possivel acessar o Metodo "getLinhaUtilizada" que retorna o valor da linha utilizada*/
        tarifa = new ValorTarifasTableModel(listaTarifa).getLinhaUtilizada(rowIndex);

        /* Será aberta uma janela de dialogo para confirmação ou não da operação de exclusão.*/
        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?", "Excluir Livro", JOptionPane.YES_NO_OPTION);

        /* Teste para saber se a resposta foi sim ou não.
         * Se houver retorno '0', não foi confirmada a exclusão do registro
         Se houver retorno '1', houve uma confirmação e ocorre o retorno para a janela principal.*/
        if (confirm != 0) {
            return;
        }

        /* Cria-se uma variável inteira que receberá o retorno da execução no Banco de dados.*/
        int result = new ValorTarifasController().deletaValorDeTarifa(tarifa.getId());

        /* Teste para saber o tipo de resultado retornado.*/
        if (result == 1) {
            // Se o retorno for '1' é dispara uma mensagem que o registro foi removido.
            JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
            refreshTable();
        } else {
            // Se o retorno for '0' não houve exclusão no banco.
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }

    private void dicaDeTextoParaBotoes() {
        jbt_Novo.setToolTipText("Novo Registro");
        jbt_Cancelar.setToolTipText("Cancelar");
        jbt_Salvar.setToolTipText("Salvar");
        jbt_Atualizar.setToolTipText("Atualizar Registro");
        jbt_Excluir.setToolTipText("Excluir Registro");
    }

    private void redefinindoLayout() {
        jp_RegTarifas = new JPanel(new MigLayout());
        jp_ListaRegistro = new JPanel(new MigLayout());
    }

    private void refreshTable() {
        listaTarifa = new ValorTarifasController().listaTodasAsTarifas();
        if (listaTarifa != null) {
            table.setModel(new ValorTarifasTableModel(listaTarifa)); // Subscreve a edição padrão da tabela.
            table.setDefaultRenderer(Object.class, new ValorTarifasCellRenderer());

            table.setShowGrid(true); // Exibe as linhas internas da tabela.
            table.setBorder(new LineBorder(Color.black)); // Exibe as linhas de limite da tabela com a cor de preferencia
            table.setGridColor(Color.black); // Altera a cor das linhas internas da tabela.

        }
    }

    private void duploClick() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int indiceDaLinha = table.getSelectedRow();
                    tarifa = new ValorTarifasTableModel(listaTarifa).getLinhaUtilizada(indiceDaLinha);                   
                    System.out.println(tarifa);
                }
            }
        });
    }

    private void enableFields(boolean b) {
        jtf_Principal.setEditable(b);
        jtf_TarifaBVermelha.setEditable(b);
        jtf_TaxaIluminacao.setEditable(b);
    }
}
