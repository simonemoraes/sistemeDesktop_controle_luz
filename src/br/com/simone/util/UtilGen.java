/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simone.util;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Simone
 */
public class UtilGen {
    
    public static String convertDateToString(Date data){
        String retorno = "";
       // Cria um objeto da classe SimpleDateFormat passando o formato no construtor
       SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
       // Formata a data e retorna uma String
       retorno = dt.format(data);
       return retorno;
    }
    
    
    public static Date convertStringToDate(String data) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        return (java.util.Date)formatter.parse(data);
    }
}
