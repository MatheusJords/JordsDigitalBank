/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordsdigitalbank.model;

/**
 *
 * @author matheus.azevedo
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("** Extrato de Conta Corrente **");
        super.imprimirInfosComuns();
    }
}
