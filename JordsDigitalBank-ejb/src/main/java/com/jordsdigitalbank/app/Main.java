/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordsdigitalbank.app;

import com.jordsdigitalbank.model.Cliente;
import com.jordsdigitalbank.model.Conta;
import com.jordsdigitalbank.model.ContaCorrente;
import com.jordsdigitalbank.model.ContaPoupanca;

/**
 *
 * @author matheus.azevedo
 */
public class Main {
    public static void main(String[] args){
        
        Cliente cliente = new Cliente();
        cliente.setNome("Matheus Jordan");  
        
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        
        cc.adicionaJuros(10);
        cc.depositar(100.00);
        cc.transferir(50.00, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
