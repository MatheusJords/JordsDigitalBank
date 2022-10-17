/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordsdigitalbank.model;

import com.jordsdigitalbank.interfaces.IConta;

/**
 *
 * @author matheus.azevedo
 */
public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0;
    private static final double JUROS_PADRAO = 0.1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double juros;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
        this.juros = JUROS_PADRAO;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void adicionaJuros(int mes){
        saldo -= (this.juros * mes);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    protected void imprimirInfosComuns() {
        System.out.println("Titular: " +  this.cliente.getNome());
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println("Saldo:" + this.saldo);
    }
}
