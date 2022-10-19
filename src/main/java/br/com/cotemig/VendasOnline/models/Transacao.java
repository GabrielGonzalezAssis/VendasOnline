package br.com.cotemig.VendasOnline.models;

public class Transacao {

    private int id;
    private int valor;
    private Cliente cliente;
    private Concessionaria concessionaria;
    private String data;

    public Transacao(int id, int valor, Cliente cliente, Concessionaria concessionaria, String data) {
        this.id = id;
        this.valor = valor;
        this.cliente = cliente;
        this.concessionaria = concessionaria;
        this.data = data;
    }

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
