package br.com.cotemig.VendasOnline.models;


import javax.persistence.*;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int valor;

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="concessionaria_id", nullable=false)
    private Concessionaria concessionaria;
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
