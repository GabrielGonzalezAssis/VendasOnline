package br.com.cotemig.VendasOnline.models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int chassi;
    private String marca;
    private String cor;
    private int ano;
    private int placa;


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
