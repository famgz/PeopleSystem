package com.famgz.composicoes;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", ddd, numero);
    }

}
