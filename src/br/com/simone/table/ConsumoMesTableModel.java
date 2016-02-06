
package br.com.simone.table;

import br.com.simone.model.ConsumoMes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ConsumoMesTableModel extends AbstractTableModel {
    
    /* Criando as colunas da tabela */ 
    private static final int COL_ID = 0;
    private static final int COL_DATA = 1;
    private static final int COL_MEDIDA = 2;
    private static final int COL_MEDIDA_ANTERIOR = 3;
    private static final int COL_KWH_MES = 4;
    
    private List<ConsumoMes> valores;

    public ConsumoMesTableModel(List<ConsumoMes> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        /* Metodo que retorna a quantidade de linhas que a tabela irá possuir */
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        /* Metodo que retorna a quantidade de colunas que a tabela irá possuir */
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        /* Metodo retorna o valor da linha que está sendo acessada 
           - rowIndex = indice da linha.
           - columnIndex = indice da coluna.*/
        ConsumoMes consumo = valores.get( rowIndex );
        
        //Teste para saber se a coluna possui o mesmo valor que foi setado
        if ( columnIndex == COL_ID ) {
            return consumo.getId();
        } else if ( columnIndex == COL_DATA ) {
            return consumo.getData();
        } else if ( columnIndex == COL_MEDIDA ) {
            return consumo.getMedida();
        }else if ( columnIndex == COL_MEDIDA_ANTERIOR ) {
            return consumo.getMedida_anterior();
        }else if ( columnIndex == COL_KWH_MES ) {
            return consumo.getKwh_Dia();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName ( int column ) {
        /* Metodo que nomeia as colunas */
        
        String coluna = "";
        
        switch ( column ) {
            case COL_ID:
                coluna = "Código";
                break;
            case COL_DATA:
                coluna = "Data";
                break;
            case COL_MEDIDA:
                coluna = "Medida";
                break;
                
            case COL_MEDIDA_ANTERIOR:
                coluna = "Medida Anterior";
                break;
                
            case COL_KWH_MES:
                coluna = "Kwh mes";
                break;
                
            default:
                throw new IllegalArgumentException( "Coluna inválida!" );
        }
        return coluna;      
    }
    
    @Override
    public Class<?> getColumnClass ( int columnIndex ) {
        /* Metodo qpara saber qual o tipo de dado da coluna */
        
        if ( columnIndex == COL_ID ) {
            return Long.class; 
        } else if ( columnIndex == COL_DATA ) {
            return String.class;
        } else if ( columnIndex == COL_MEDIDA ) {
            return String.class;
        } else if ( columnIndex == COL_MEDIDA_ANTERIOR ) {
            return String.class;
        } else if ( columnIndex == COL_KWH_MES ) {
            return String.class;
        } 
            
        return null;
    }
    
    
    
    public ConsumoMes getLinhaUtilizada ( int row ) {
        /* Metodo que retorna o valor da linha utilizada */      
        return valores.get(row);
    }
}
