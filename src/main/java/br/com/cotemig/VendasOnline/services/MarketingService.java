package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Marketing;

import java.util.List;
import java.util.Optional;

public interface MarketingService {

    Optional<Marketing> getCarroById(Integer id);
    List<Marketing> getAllCarro();
    void deleteAllCarro();
    void deleteCarroById(Integer id);
    void uptadeCarroById(Integer id, Marketing anuncio);
    void uptadeCarro (Marketing anuncio);
    void insertCarro (Marketing anuncio);
}
