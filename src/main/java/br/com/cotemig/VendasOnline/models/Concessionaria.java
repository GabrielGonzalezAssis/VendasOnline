package br.com.cotemig.VendasOnline.models;

public class Concessionaria {

    private String nome;
    private String cnpj;
    private Carro carro;
    private String endereco;
    private int conta;

    public Concessionaria(String nome, String cnpj, Carro carro, String endereco, int conta) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.carro = carro;
        this.endereco = endereco;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
