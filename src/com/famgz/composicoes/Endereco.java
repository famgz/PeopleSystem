package com.famgz.composicoes;

import java.util.Scanner;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String numero, String cep, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite rua: ");
        this.rua = scan.nextLine();

        System.out.println("Digite numero: ");
        this.numero = scan.nextLine();

        System.out.println("Digite cep: ");
        this.cep = scan.nextLine();

        System.out.println("Digite bairro: ");
        this.bairro = scan.nextLine();

        System.out.println("Digite cidade: ");
        this.cidade = scan.nextLine();

        System.out.println("Digite estado: ");
        this.estado = scan.nextLine();

        System.out.println("Digite pais: ");
        this.pais = scan.nextLine();

        scan.close();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
