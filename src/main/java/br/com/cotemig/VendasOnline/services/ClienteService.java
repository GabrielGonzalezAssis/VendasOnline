package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> getCarroById(Integer id);
    List<Cliente> getAllCarro();
    void deleteAllCarro();
    void deleteCarroById(Integer id);
    void uptadeCarroById(Integer id, Cliente anuncio);
    void uptadeCarro (Cliente anuncio);
    void insertCarro (Cliente anuncio);
}
