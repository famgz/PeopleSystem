package com.famgz.estrutura;

import com.famgz.composicoes.Telefone;

public class ListaDeTelefones {
    private Telefone[] telefones;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 7;

    public ListaDeTelefones() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public boolean isFull() {
        return this.tamanho == CAPACIDADE_PADRAO;
    }

    private int buscarIndex(Telefone telefone) {
        for (int i = 0; i < tamanho; i++) {
            if (telefones[i].equals(telefone)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionar(String ddd, String numero) {
        if (isFull()) {
            System.out.println("Lista de telefones já está cheia");
            return false;
        }
        Telefone tel = new Telefone(ddd, numero);
        telefones[tamanho] = tel;
        tamanho += 1;
        return true;
    }

    public boolean remover(Telefone telefone) {
        if (isEmpty()) {
            System.out.println("A lista está vazia");
            return false;
        }
        int index = buscarIndex(telefone);
        if (index == -1) {
            System.out.println("Elemento não encontrado");
            return false;
        }
        tamanho -= tamanho;
        for (int i = index; i < tamanho; i++) {
            telefones[i] = telefones[i + 1];
        }
        telefones[tamanho] = null;
        return true;
    }

    public void exibirTelefones() {
        System.out.println("Telefones da lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(telefones[i].toString());
        }
    }

}
