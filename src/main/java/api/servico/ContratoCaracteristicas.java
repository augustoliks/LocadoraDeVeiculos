/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.model.Contrato;

/**
 *
 * @author visita
 */
public interface ContratoCaracteristicas {

    public boolean abrirContrato(Contrato contrato);
    public boolean fecharContrato(
            Contrato contrato, 
            int kilometragemPercorrida, 
            int estadoConservacao);
    
}