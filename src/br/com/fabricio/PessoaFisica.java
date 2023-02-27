package br.com.fabricio;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
