package br.com.cotemig.VendasOnline.services;


import br.com.cotemig.VendasOnline.models.Concessionaria;

import java.util.List;
import java.util.Optional;

public interface ConcessionariaService {

    Optional<Concessionaria> getConcessionariaById(Integer id);
    List<Concessionaria> getAllConcessionaria();
    void deleteAllConcessionaria();
    void deleteConcessionariaById(Integer id);
    void uptadeConcessionariaById(Integer id, Concessionaria concessionaria);
    void uptadeConcessionaria (Concessionaria concessionaria);
    void insertConcessionaria (Concessionaria concessionaria);

}
