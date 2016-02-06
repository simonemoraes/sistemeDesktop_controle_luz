package br.com.simone.forms;

import br.com.simone.controller.ConsumoMesController;
import br.com.simone.model.ConsumoMes;
import br.com.simone.table.ConsumoMesCellRenderer;
import br.com.simone.table.ConsumoMesTableModel;
import br.com.simone.util.UtilGen;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;


public class RegistraConsumoDiario extends javax.swing.JDialog {

    private List<ConsumoMes> consumoLista;
    private int idConsumo;
    private ConsumoMes consumo;

    public RegistraConsumoDiario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        alterarIcone();
        
        initComponents();
        
        redefinindoBackground();
        
        dicaDeTextoParaBotoes();
        redefinindoLayout();
        refreshTable();
        enableFields(false);

    }

    private void alterarIcone() {
        //this.setIconImage(new ImageIcon(getClass().getResource("/br/com/simone/img/raio.jpg")).getImage());
        URL url = this.getClass().getResource("/br/com/simone/img/raio.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    private void redefinindoBackground() {
        java.awt.Color c = new java.awt.Color(220,220,220);
        jPanel1.setBackground(c);
        jp_Buttons.setBackground(c);
        jp_ListaRegistro.setBackground(c);
        jp_RegConsumo.setBackground(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jp_RegConsumo = new javax.swing.JPanel();
        jp_Buttons = new javax.swing.JPanel();
        jbt_Excluir = new javax.swing.JButton();
        jbt_Atualizar = new javax.swing.JButton();
        jbt_Salvar = new javax.swing.JButton();
        jbt_Novo = new javax.swing.JButton();
        jbt_Cancelar = new javax.swing.JButton();
        jl_Data = new javax.swing.JLabel();
        jl_Medida = new javax.swing.JLabel();
        jtf_Data = new javax.swing.JTextField();
        jtf_Medida = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jp_ListaRegistro = new javax.swing.JPanel();
        jSrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jb_Fechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Consumo");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jp_RegConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro de Consumo Diario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

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

        jl_Data.setText("Data:");

        jl_Medida.setText("Medida:");

        javax.swing.GroupLayout jp_RegConsumoLayout = new javax.swing.GroupLayout(jp_RegConsumo);
        jp_RegConsumo.setLayout(jp_RegConsumoLayout);
        jp_RegConsumoLayout.setHorizontalGroup(
            jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                        .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Data)
                                    .addComponent(jl_Medida))
                                .addGap(20, 20, 20)
                                .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_Data, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(jtf_Medida)))
                            .addComponent(jp_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_RegConsumoLayout.setVerticalGroup(
            jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Data)
                    .addComponent(jtf_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_RegConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jl_Medida))
                    .addGroup(jp_RegConsumoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtf_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jp_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jb_Fechar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jb_Fechar.setText("Fechar");
        jb_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_ListaRegistroLayout = new javax.swing.GroupLayout(jp_ListaRegistro);
        jp_ListaRegistro.setLayout(jp_ListaRegistroLayout);
        jp_ListaRegistroLayout.setHorizontalGroup(
            jp_ListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ListaRegistroLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jp_ListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Fechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jp_ListaRegistroLayout.setVerticalGroup(
            jp_ListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ListaRegistroLayout.createSequentialGroup()
                .addComponent(jSrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jb_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_ListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_RegConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jp_ListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_RegConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(407, Short.MAX_VALUE)))
        );

        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenu2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_NovoActionPerformed
        novoRegistro();
    }//GEN-LAST:event_jbt_NovoActionPerformed

    private void jbt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CancelarActionPerformed
        cancelarRegistro();
    }//GEN-LAST:event_jbt_CancelarActionPerformed

    private void jbt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_SalvarActionPerformed
        salvarRegistro();
    }//GEN-LAST:event_jbt_SalvarActionPerformed

    private void jbt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_AtualizarActionPerformed
        atualizarRegistro();
    }//GEN-LAST:event_jbt_AtualizarActionPerformed

    private void jbt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ExcluirActionPerformed
        removerRegistro();
    }//GEN-LAST:event_jbt_ExcluirActionPerformed

    private void jb_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_FecharActionPerformed
        this.setVisible( false );
        new JanelaPrincipal();
    }//GEN-LAST:event_jb_FecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jSrollPane;
    private javax.swing.JButton jb_Fechar;
    private javax.swing.JButton jbt_Atualizar;
    private javax.swing.JButton jbt_Cancelar;
    private javax.swing.JButton jbt_Excluir;
    private javax.swing.JButton jbt_Novo;
    private javax.swing.JButton jbt_Salvar;
    private javax.swing.JLabel jl_Data;
    private javax.swing.JLabel jl_Medida;
    private javax.swing.JPanel jp_Buttons;
    private javax.swing.JPanel jp_ListaRegistro;
    private javax.swing.JPanel jp_RegConsumo;
    private javax.swing.JTextField jtf_Data;
    private javax.swing.JTextField jtf_Medida;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void dicaDeTextoParaBotoes() {
        jbt_Novo.setToolTipText("Novo Registro");
        jbt_Cancelar.setToolTipText("Cancelar");
        jbt_Salvar.setToolTipText("Salvar");
        jbt_Atualizar.setToolTipText("Atualizar Registro");
        jbt_Excluir.setToolTipText("Excluir Registro");
    }

    private void novoRegistro() {
        enableFields(true);
        consumo = new ConsumoMes();
    }

    private void cancelarRegistro() {
        jtf_Data.setText("");
        jtf_Medida.setText("");
        enableFields(false);
    }

    private void salvarRegistro() {

        mostraResultado(validaCampos());
    }

    private void mostraResultado(int result) {
        /* Teste para saber qual operação foi feita no banco de dados.*/
        if (result == 1) {
            // Se result receber 1, sera disparada uma mensagem informando que um novo registro foi inserido.
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!.");
            enableFields(false); // O metodo é chamado para desabilitar os campos.
            cancelarRegistro(); // O metodo é chamado para limpar os campos.
            refreshTable(); // O metodo é chamdo para fazer um refresh na tabela e atualizar as informações nela contidas.
        } else {
            // Caso contrario uma mensagem é disparada informando que nao houve insersao na tabela.
            JOptionPane.showMessageDialog(this, "Entre com um dado válido!");
        }
    }

    private int validaCampos(){
        /* Caso contrário será setado o id recuperado e result receberá a
        * instancia da class ConsumoMesController acessando o metodo da class que
        * alterará registro.*/
        
        int retorno = 0;
        
        if (jtf_Data.getText().length() > 0 && jtf_Medida.getText().length() > 0) {
            
            try {
                Date objt = UtilGen.convertStringToDate(jtf_Data.getText());
                
                // Todos os campos devem ser preenchidos.
                consumo.setData(jtf_Data.getText());
                consumo.setMedida(Integer.parseInt(jtf_Medida.getText()));
                retorno = new ConsumoMesController().merge(consumo);
            } catch (ParseException | NumberFormatException ex) {                
                 JOptionPane.showMessageDialog(this, "Entrada de dados inválida!");
                
            }
            
        } else {
            /* Caso contrario uma mensagem é disparada informando a obrigatoriedade de preenchimento total dos campos.
            Retornando para o campo de preenchimento.*/
            JOptionPane.showMessageDialog(this, "Todos os registros são obrigatórios.");
            
        }
        return retorno;
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
        consumo = new ConsumoMesTableModel(consumoLista).getLinhaUtilizada(indiceDaLinha);

        jtf_Data.setText(consumo.getData());
        jtf_Medida.setText(Integer.toString(consumo.getMedida()));

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
            JOptionPane.showMessageDialog(this, "Selecione o registro a ser removido");
            return;
        }
        /* Criando um objeto do tipo ConsumoMes que receberá a instancia da class ConsumoMesTableModel
         onde será possivel acessar o Metodo "getLinhaUtilizada" que retorna o valor da linha utilizada*/
        consumo = new ConsumoMesTableModel(consumoLista).getLinhaUtilizada(rowIndex);

        /* Será aberta uma janela de dialogo para confirmação ou não da operação de exclusão.*/
        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?", "Excluir Registro", JOptionPane.YES_NO_OPTION);

        /* Teste para saber se a resposta foi sim ou não.
         * Se houver retorno '0', não foi confirmada a exclusão do registro
         Se houver retorno '1', houve uma confirmação e ocorre o retorno para a janela principal.*/
        if (confirm != 0) {
            return;
        }

        /* Cria-se uma variável inteira que receberá o retorno da execução no Banco de dados.*/
        int result = new ConsumoMesController().excluirRegistro(consumo.getId());

        /* Teste para saber o tipo de resultado retornado.*/
        if (result == 1) {
            // Se o retorno for '1' é dispara uma mensagem que o registro foi removido.
            JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
            refreshTable();
        } else {
            // Se o retorno for '0' não houve exclusão no banco.
            JOptionPane.showMessageDialog(this, "TEntre com um dado válido!");
        }
    }

    private void redefinindoLayout() {
        jp_RegConsumo = new JPanel(new MigLayout());
        jp_ListaRegistro = new JPanel(new MigLayout());

    }

    /* Metodo que habilita/desabilita campos de acordo com o que for passado por parametro
     na chamada do método (true ou false) */
    private void enableFields(boolean b) {
        jtf_Data.setEditable(b);
        jtf_Medida.setEditable(b);
    }

    /* Metodo que faz um refresh na tabela retornando a lista atualizada.*/
    private void refreshTable() {

        consumoLista = new ConsumoMesController().listarRegistros();
        if (consumoLista != null) {
            table.setModel(new ConsumoMesTableModel(consumoLista)); // Subscreve a edição padrão da tabela.
            table.setDefaultRenderer(Object.class, new ConsumoMesCellRenderer());

            table.setShowGrid(true); // Exibe as linhas internas da tabela.
            table.setBorder(new LineBorder(Color.black)); // Exibe as linhas de limite da tabela com a cor de preferencia
            table.setGridColor(Color.black); // Altera a cor das linhas internas da tabela.
        }
    }
}
