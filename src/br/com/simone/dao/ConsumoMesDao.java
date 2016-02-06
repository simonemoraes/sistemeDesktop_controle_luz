package br.com.simone.dao;

import br.com.simone.model.ConsumoMes;
import br.com.simone.query.ConsumoMesSQL;
import br.com.simone.util.UtilGen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsumoMesDao implements IConsumoMesDao {

    private static final String SQL_INSERT = ConsumoMesSQL.inserirConsumo();
    
    private static final String SQL_UPDATE
            = "update consumo_mes set DATA = ?, MEDIDA = ?, TOTAL_KWH_MES = ?, MEDIDA_ANTERIOR = ? where ID = ?";
    private static final String SQL_REMOVE
            = "delete from consumo_mes where ID = ?";
    private static final String SQL_FIND_ALL
            = "select top 15 * from consumo_mes order by id desc";
    private static final String SQL_FIND_ULTIMA_MEDIDA
            = "select top 1 * from CONSUMO_MES order by id desc";
    private static final String SQL_FIND_ID
            = "select * from consumo_mes where id = ?";
    private static final String SQL_FIND_LAST
            = "select top 1 * from CONSUMO_MES where ID > ?";
    private static final String SQL_FIND_MEDIA
            = "select COUNT(DATA)-1 AS TOTAL_DE_DIAS from CONSUMO_MES where DATA between ? and ?";
    private static final String SQL_FIND_TOTAL_KWH
            = "select * from CONSUMO_MES where DATA between ? and ?";
    private static final String SQL_FIND_MAIOR_MEDIDA
            = "select MAX(medida) as MAIOR from CONSUMO_MES where DATA between ? and ?";
    private static final String SQL_FIND_MENOR_MEDIDA
            = "select MIN(medida) as MENOR from CONSUMO_MES where DATA between ? and ?";
    
    @Override
    public ConsumoMes findId(int idConsumo) {

        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ConsumoMes consumoRetornado = new ConsumoMes();

        try {

            pstm = conn.prepareStatement(SQL_FIND_ID);
            pstm.setInt(1, idConsumo);
            rs = pstm.executeQuery();

            if (rs.next()) {

                consumoRetornado.setId(rs.getInt("Id"));
                consumoRetornado.setData(rs.getString("Data"));
                consumoRetornado.setMedida(rs.getInt("Medida"));
                consumoRetornado.setMedida_anterior(rs.getInt("Medida_Anterior"));
                consumoRetornado.setKwh_Dia(rs.getInt("Total_Kwh_Mes"));
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

        return consumoRetornado;
    }
    
    @Override
    public ConsumoMes findList(ConsumoMes consumo) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ConsumoMes novoConsumo = new ConsumoMes();
        try {
            pstm = conn.prepareStatement(SQL_FIND_LAST);
            pstm.setInt(1, consumo.getId());
            rs = pstm.executeQuery();

            if (rs.next()) {

                novoConsumo.setId(rs.getInt("ID"));
                novoConsumo.setData(rs.getString("DATA"));
                novoConsumo.setMedida(rs.getInt("MEDIDA"));
                novoConsumo.setMedida_anterior(rs.getInt("MEDIDA_ANTERIOR"));
                novoConsumo.setKwh_Dia(rs.getInt("TOTAL_KWH_MES"));

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

        return novoConsumo;
    }

    @Override
    public int findUltimaMedida() {

        int medida = 0;

        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(SQL_FIND_ULTIMA_MEDIDA);
            rs = pstm.executeQuery();
            if (rs.next()) {

                medida = rs.getInt("MEDIDA");

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

        return medida;
    }

    @Override
    public List<ConsumoMes> selectRecord() {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<ConsumoMes> consumos = new ArrayList<ConsumoMes>();

        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ConsumoMes consumo = new ConsumoMes();
                consumo.setId(rs.getInt("ID"));
                consumo.setData(UtilGen.convertDateToString(rs.getDate("DATA")));
                consumo.setMedida(rs.getInt("MEDIDA"));
                consumo.setMedida_anterior(rs.getInt("MEDIDA_ANTERIOR"));
                consumo.setKwh_Dia(rs.getInt("TOTAL_KWH_MES"));

                consumos.add(consumo);
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

        return consumos;
    }

    @Override
    public int updateRecord(ConsumoMes consumo) {
        Connection conn = DBConnection.getConnection();       
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_UPDATE);
            pstm.setString(1, consumo.getData());
            pstm.setInt(2, consumo.getMedida());
            pstm.setInt(3, consumo.getKwh_Dia());
            pstm.setInt(4, consumo.getMedida_anterior());
            pstm.setInt(5, consumo.getId());

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
    public int removeRecord(int id_consumo) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_REMOVE);
            pstm.setInt(1, id_consumo);
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
    public int saveRecord(ConsumoMes consumo) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_INSERT);
            pstm.setString(1, consumo.getData());
            pstm.setInt(2, consumo.getMedida());
            pstm.setInt(3, consumo.getMedida_anterior());
            pstm.setInt(4, consumo.getKwh_Dia());
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
    public int selectMediaKWhPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal ) {
                
        Connection conn = DBConnection.getConnection();       
        PreparedStatement pstm = null;
        ResultSet rs;
        int totalDeDias = 0;

        try {
            pstm = conn.prepareStatement(SQL_FIND_MEDIA);
            pstm.setString(1, dataInicial.getData());
            pstm.setString(2, dataFinal.getData());
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                ConsumoMes total = new ConsumoMes();
                
                total.setMedida(rs.getInt("TOTAL_DE_DIAS"));
                totalDeDias = rs.getInt( "TOTAL_DE_DIAS" );
                
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
            DBConnection.close(conn, pstm, null);
        }

        return totalDeDias;
    }
    
    @Override
    public int selectMaiorMedidaPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal ){
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int medida = 0;
        
        try {

            pstm = conn.prepareStatement(SQL_FIND_MAIOR_MEDIDA);
            pstm.setString(1, dataInicial.getData());
            pstm.setString(2, dataFinal.getData());
            rs = pstm.executeQuery();

            if (rs.next()) {
                ConsumoMes consumoRetornado = new ConsumoMes();
                
                consumoRetornado.setMedida(rs.getInt("MAIOR"));
                medida = rs.getInt( "MAIOR" );
                
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

        return medida;
    }
    
    @Override
    public int selectMenorMedidaPorPeriodo( ConsumoMes dataInicial, ConsumoMes dataFinal ){
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int medida = 0;
        
        try {

            pstm = conn.prepareStatement(SQL_FIND_MENOR_MEDIDA);
            pstm.setString(1, dataInicial.getData());
            pstm.setString(2, dataFinal.getData());
            rs = pstm.executeQuery();

            if (rs.next()) {
                ConsumoMes consumoRetornado = new ConsumoMes();
                
                consumoRetornado.setMedida(rs.getInt("MENOR"));
                medida = rs.getInt( "MENOR" );
                
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

        return medida;
    }

}
