/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.model.Pessoa;

/**
 *
 * @author liks
 */
public interface LoginCaracteristicas {

    public Pessoa findByNomeUsuario(String nomeUsuario);
}
