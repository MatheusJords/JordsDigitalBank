/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordsdigitalbank.interfaces;

import com.jordsdigitalbank.model.Conta;

/**
 *
 * @author matheus.azevedo
 */
public interface IConta {
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor,IConta contaDestino);
    
    void imprimirExtrato();
    
    void adicionaJuros(int mes);
}
