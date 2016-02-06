package br.com.simone.dao;

import br.com.simone.model.ConsumoMes;
import br.com.simone.model.ValorTarifas;
import br.com.simone.util.UtilGen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ValorTarifasDao implements IValorTarifasDao {

    private static final String SQL_INSERT
            = "insert into VALOR_TARIFAS(TARIFA, TARIFA_BVERMELHA, TAXA_ILUMINACAO) values(?, ?, ?)";
    private static final String SQL_UPDATE
            = "update VALOR_TARIFAS set TARIFA = ?, TARIFA_BVERMELHA = ?, TAXA_ILUMINACAO = ? where ID = ?";
    private static final String SQL_REMOVE
            = "delete from VALOR_TARIFAS where ID = ?";
    private static final String SQL_FIND_ALL
            = "SELECT * FROM VALOR_TARIFAS";
    private static final String SQL_FIND_LAST_TARIFA
            = "select top 1 * from VALOR_TARIFAS order by id desc";
    
   
    @Override
    public ValorTarifas findLastTarifa( ) {
        ValorTarifas tarifas = new ValorTarifas();
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        

        try {

            pstm = conn.prepareStatement(SQL_FIND_LAST_TARIFA);
            rs = pstm.executeQuery();

            if (rs.next()) {

                tarifas.setId(rs.getInt("ID"));
                tarifas.setTarifa(rs.getDouble("TARIFA"));
                tarifas.setTarifa_bVermelha(rs.getDouble("TARIFA_BVERMELHA"));
                tarifas.setTarifa_Iluminacao(rs.getDouble("TAXA_ILUMINACAO"));
            }

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            DBConnection.close(conn, pstm, rs);
        }

        return tarifas;
    }

    @Override
    public List<ValorTarifas> findRecord() {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<ValorTarifas> tarifas = new ArrayList<ValorTarifas>();

        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                ValorTarifas tarifa = new ValorTarifas();
                tarifa.setId( rs.getInt("Id"));
                tarifa.setTarifa( rs.getDouble("Tarifa"));
                tarifa.setTarifa_bVermelha(rs.getDouble("TARIFA_BVERMELHA"));
                tarifa.setTarifa_Iluminacao(rs.getDouble("TAXA_ILUMINACAO"));
                

                tarifas.add(tarifa);
            }

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            DBConnection.close(conn, pstm, rs);
        }

        return tarifas;
    }

    @Override
    public int updateRecord(ValorTarifas valor) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);

            pstm.setDouble(1, valor.getTarifa());
            pstm.setDouble(2, valor.getTarifa_bVermelha());
            pstm.setDouble(3, valor.getTarifa_Iluminacao());
            pstm.setInt(4, valor.getId());

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            DBConnection.close(conn, pstm, null);
        }

        return result;
    }

    @Override
    public int removeRecord(int id_tarifa) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_REMOVE);
            pstm.setInt(1, id_tarifa);

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            DBConnection.close(conn, pstm, null);
        }

        return result;
    }

    @Override
    public int saveRecord(ValorTarifas tarifa) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_INSERT);
            pstm.setDouble(1, tarifa.getTarifa());
            pstm.setDouble(2, tarifa.getTarifa_bVermelha());
            pstm.setDouble(3, tarifa.getTarifa_Iluminacao());

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        } finally {
            DBConnection.close(conn, pstm, null);
        }

        return result;
    }
    
   
}
