/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.model.Contrato;
import java.sql.SQLException;

/**
 *
 * @author liks
 */
public interface ContratoDAOCaracteristicas {

    public void insert(Contrato contrato) throws SQLException;
    public Contrato findById(int idCategoria) throws SQLException;
    public void update(Contrato contrato) throws SQLException;
    

}
