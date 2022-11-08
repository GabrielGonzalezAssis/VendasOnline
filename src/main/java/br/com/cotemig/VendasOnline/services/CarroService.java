package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Carro;
import java.util.List;
import java.util.Optional;

public interface CarroService {

    Optional<Carro> getCarroById(Integer id);
    List<Carro> getAllCarro();
    void deleteAllCarro();
    void deleteCarroById(Integer id);
    void uptadeCarroById(Integer id, Carro anuncio);
    void uptadeCarro (Carro anuncio);
    void insertCarro (Carro anuncio);


}
