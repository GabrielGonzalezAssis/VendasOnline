package br.com.cotemig.VendasOnline.models;

public class Marketing {

    private String plataforma;
    private String cnpj;
    private Anuncio anuncio;

    public Marketing(String plataforma, String cnpj, Anuncio anuncio) {
        this.plataforma = plataforma;
        this.cnpj = cnpj;
        this.anuncio = anuncio;
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
