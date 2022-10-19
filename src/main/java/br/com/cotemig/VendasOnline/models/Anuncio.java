package br.com.cotemig.VendasOnline.models;


public class Anuncio {

    private int id;
    private Carro carro;
    private Concessionaria concessionaria;

    public Anuncio(int id, Carro carro, Concessionaria concessionaria) {
        this.id = id;
        this.carro = carro;
        this.concessionaria = concessionaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }
}
