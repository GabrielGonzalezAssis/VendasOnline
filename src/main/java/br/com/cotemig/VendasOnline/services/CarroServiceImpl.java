package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Anuncio;
import br.com.cotemig.VendasOnline.models.Carro;
import br.com.cotemig.VendasOnline.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("carroService")
public class CarroServiceImpl implements CarroService{

    @Autowired
    CarroRepository carroRepository;

    @Override
    public Optional<Carro> getCarroById(Integer id){
        return carroRepository.findById(id);
    }

    @Override
    public List<Carro> getAllCarro(){
        return carroRepository.findAll();
    }

    @Override
    public void deleteAllCarro(){
        carroRepository.deleteAll();
    }

    @Override
    public void deleteCarroById(Integer id){
        carroRepository.deleteById(id);
    }

    @Override
    public void uptadeCarroById(Integer id, Carro carro){
        Optional<Carro> getCarro = getCarroById(id);
        getCarro.get().setAno(carro.getAno());
        getCarro.get().setChassi(carro.getChassi());
        getCarro.get().setCor(carro.getCor());
        getCarro.get().setImagem(carro.getImagem());
        getCarro.get().setMarca(carro.getMarca());
        getCarro.get().setPlaca(carro.getPlaca());

        carroRepository.save(carro);

    }

    @Override
    public void uptadeCarro(Carro carro){
        carroRepository.save(carro);
    }

    @Override
    public void insertCarro(Carro carro){
        carroRepository.save(carro);
    }




}
