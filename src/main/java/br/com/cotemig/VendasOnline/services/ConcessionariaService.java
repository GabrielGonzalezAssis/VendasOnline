package br.com.cotemig.VendasOnline.services;


import br.com.cotemig.VendasOnline.models.Concessionaria;

import java.util.List;
import java.util.Optional;

public interface ConcessionariaService {

    Optional<Concessionaria> getCarroById(Integer id);
    List<Concessionaria> getAllCarro();
    void deleteAllCarro();
    void deleteCarroById(Integer id);
    void uptadeCarroById(Integer id, Concessionaria anuncio);
    void uptadeCarro (Concessionaria anuncio);
    void insertCarro (Concessionaria anuncio);

}
