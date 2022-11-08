package br.com.cotemig.VendasOnline.services;


import br.com.cotemig.VendasOnline.models.Transacao;

import java.util.List;
import java.util.Optional;

public interface TransacaoService {

    Optional<Transacao> getCarroById(Integer id);
    List<Transacao> getAllCarro();
    void deleteAllCarro();
    void deleteCarroById(Integer id);
    void uptadeCarroById(Integer id, Transacao anuncio);
    void uptadeCarro (Transacao anuncio);
    void insertCarro (Transacao anuncio);
    


}
