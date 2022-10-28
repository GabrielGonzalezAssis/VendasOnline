package br.com.cotemig.VendasOnline.models;


import javax.persistence.*;

@Entity
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="carro_id", nullable=false)
    private Carro carro;

    @ManyToOne
    @JoinColumn(name="concessionaria_id",nullable=false)
    private Concessionaria concessionaria;

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
