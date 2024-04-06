package com.famgz.composicoes;

public record Endereco(
        String rua,
        String numero,
        String cep,
        String bairro,
        String cidade,
        String estado,
        String pais) {

    public Endereco() {
        this("", "", "", "", "", "", "");
    }

    public String formatarEndereco() {
        return String.format(
                "%s, %s - %s, %s, %s, %s, %s",
                rua(),
                numero(),
                cep(),
                bairro(),
                cidade(),
                estado(),
                pais());
    }
}
