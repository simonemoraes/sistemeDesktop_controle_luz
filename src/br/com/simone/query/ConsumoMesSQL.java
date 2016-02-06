/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simone.query;

/**
 *
 * @author Simone
 */
public class ConsumoMesSQL {
    
    public static final String SQL_INSERT
            = "insert into consumo_mes( DATA, MEDIDA, MEDIDA_ANTERIOR, TOTAL_KWH_MES ) VALUES (?,?,?,?)";
    
    public static String inserirConsumo(){
        return "insert into consumo_mes( DATA, MEDIDA, MEDIDA_ANTERIOR, TOTAL_KWH_MES ) VALUES (?,?,?,?)";
    }
    
    
}
