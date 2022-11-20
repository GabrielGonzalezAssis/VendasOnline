package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Anuncio;
import br.com.cotemig.VendasOnline.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("anuncioService")
public class AnuncioServiceImpl implements AnuncioService {

    @Autowired
    AnuncioRepository anuncioRepository;

    @Override
    public Optional<Anuncio> getAnuncioById(Integer id){
        return anuncioRepository.findById(id);
    }

    @Override
    public List<Anuncio> getAllAnuncio(){
        return anuncioRepository.findAll();
    }

    @Override
    public void deleteAllAnuncio(){
        anuncioRepository.deleteAll();
    }

    @Override
    public void deleteAnuncioById(Integer id){
        anuncioRepository.deleteById(id);
    }

    @Override
    public void uptadeAnuncioById(Integer id, Anuncio anuncio){
        Optional<Anuncio> getAnuncio = getAnuncioById(id);
        getAnuncio.get().setCarro(anuncio.getCarro());
        getAnuncio.get().setConcessionaria(anuncio.getConcessionaria());

        anuncioRepository.save(anuncio);
    }

    @Override
    public void uptadeAnuncio(Anuncio anuncio){
        anuncioRepository.save(anuncio);
    }

    @Override
    public void insertAnuncio(Anuncio anuncio){
        anuncioRepository.save(anuncio);
    }

}
