package br.com.fabricio;

public class Programa {

    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica("Fabricio Vieira", "Av. Ponte Alta Qd. 605", "000.111.222.-33");
        Pessoa pj = new PessoaJuridica("Global Hitss", "SCS Quadra 2", "00.222.123/0001-99");

        pf.imprimir();
        pj.imprimir();
    }
}
