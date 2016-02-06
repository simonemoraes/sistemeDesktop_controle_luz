
package br.com.simone.table;

import br.com.simone.model.ValorTarifas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ValorTarifasTableModel extends AbstractTableModel{
      /* Criando as colunas da tabela */ 
    private static final int COL_ID = 0;
    private static final int COL_TARIFA = 1;
    private static final int COL_TARIFA_BVERMELHA = 2;
    private static final int COL_TAXA_ILUMINACAO = 3;
    
    private List<ValorTarifas> valores;

    public ValorTarifasTableModel(List<ValorTarifas> valores) {
        this.valores = valores;
    }
    
    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        /* Metodo retorna o valor da linha que está sendo acessada 
           - rowIndex = indice da linha.
           - columnIndex = indice da coluna.*/
        ValorTarifas tarifa = valores.get( rowIndex );
        
        //Teste para saber se a coluna possui o mesmo valor que foi setado
        if ( columnIndex == COL_ID ) {
            return tarifa.getId();
        } else if ( columnIndex == COL_TARIFA ) {
            return tarifa.getTarifa();
        }else if ( columnIndex == COL_TARIFA_BVERMELHA ) {
            return tarifa.getTarifa_bVermelha();
        }else if ( columnIndex == COL_TAXA_ILUMINACAO ) {
            return tarifa.getTarifa_Iluminacao();
        }
        
        return null;
    }
    
    public String getColumnName ( int column ) {
        /* Metodo que nomeia as colunas */
        
        String coluna = "";
        
        switch ( column ) {
            case COL_ID:
                coluna = "Código";
                break;
            case COL_TARIFA:
                coluna = "Tarifa";
                break;
            case COL_TARIFA_BVERMELHA:
                coluna = "Tarifa BVermelha";
                break;
                
            case COL_TAXA_ILUMINACAO:
                coluna = "Taxa de Iluminação";
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
        } else if ( columnIndex == COL_TARIFA ) {
            return String.class;
        } else if ( columnIndex == COL_TARIFA_BVERMELHA ) {
            return String.class;
        } else if ( columnIndex == COL_TAXA_ILUMINACAO ) {
            return String.class;
        } 
            
        return null;
    }
    
    
    
    
    public ValorTarifas getLinhaUtilizada ( int row ) {
        /* Metodo que retorna o valor da linha utilizada */      
        return valores.get(row);
    }
    
    
}
