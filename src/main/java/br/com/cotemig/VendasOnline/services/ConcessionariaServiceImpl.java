package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Cliente;
import br.com.cotemig.VendasOnline.models.Concessionaria;
import br.com.cotemig.VendasOnline.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("concessionariaService")
public class ConcessionariaServiceImpl implements ConcessionariaService {

    @Autowired
    ConcessionariaRepository concessionariaRepository;

    @Override
    public Optional<Concessionaria> getConcessionariaById(Integer id){
        return concessionariaRepository.findById(id);
    }

    @Override
    public List<Concessionaria> getAllConcessionaria(){
        return concessionariaRepository.findAll();
    }

    @Override
    public void deleteAllConcessionaria(){
        concessionariaRepository.deleteAll();
    }

    @Override
    public void deleteConcessionariaById(Integer id){
        concessionariaRepository.deleteById(id);
    }

    @Override
    public void uptadeConcessionariaById(Integer id, Concessionaria concessionaria){
        Optional<Concessionaria> getConcessionaria = getConcessionariaById(id);
        getConcessionaria.get().setNome(concessionaria.getNome());
        getConcessionaria.get().setCnpj(concessionaria.getCnpj());
        getConcessionaria.get().setCarro(concessionaria.getCarro());
        getConcessionaria.get().setConta(concessionaria.getConta());
        getConcessionaria.get().setEndereco(concessionaria.getEndereco());

        concessionariaRepository.save(concessionaria);
    }

    @Override
    public void uptadeConcessionaria(Concessionaria concessionaria){
        concessionariaRepository.save(concessionaria);
    }

    @Override
    public void insertConcessionaria(Concessionaria concessionaria){
        concessionariaRepository.save(concessionaria);
    }




}
