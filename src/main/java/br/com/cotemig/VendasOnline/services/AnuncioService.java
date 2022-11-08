package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Anuncio;
import java.util.List;
import java.util.Optional;

public interface AnuncioService {

    Optional<Anuncio> getAnuncioById(Integer id);
    List<Anuncio> getAllAnuncio();
    void deleteAllAnuncio();
    void deleteAnuncioById(Integer id);
    void uptadeAnuncioById(Integer id, Anuncio anuncio);
    void uptadeAnuncio (Anuncio anuncio);
    void insertAnuncio (Anuncio anuncio);

}



