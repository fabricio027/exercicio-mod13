package br.com.fabricio;

public abstract class Pessoa {

    protected String nome;
    protected String endereco;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void imprimir() {
        System.out.println("Dados:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        if (this instanceof PessoaFisica) {
            System.out.println("CPF: " + ((PessoaFisica) this).getCpf());
        } else if (this instanceof PessoaJuridica) {
            System.out.println("CNPJ: " + ((PessoaJuridica) this).getCnpj());
        }
    }
}
