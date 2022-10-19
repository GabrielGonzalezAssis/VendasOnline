package br.com.cotemig.VendasOnline.models;

public class Carro {

    private int chassi;
    private String marca;
    private String cor;
    private int ano;
    private int placa;

    public Carro(int chassi, String marca, String cor, int ano, int placa) {
        this.chassi = chassi;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }


    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
