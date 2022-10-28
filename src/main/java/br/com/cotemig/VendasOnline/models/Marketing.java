package br.com.cotemig.VendasOnline.models;


import javax.persistence.*;

@Entity
public class Marketing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String plataforma;
    private String cnpj;

    @ManyToOne
    @JoinColumn(name="anuncio_id", nullable=false)
    private Anuncio anuncio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
}
