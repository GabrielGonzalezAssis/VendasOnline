package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Concessionaria;
import br.com.cotemig.VendasOnline.models.Marketing;
import br.com.cotemig.VendasOnline.repository.MarketingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("marketingService")
public class MarketingServiceImpl implements MarketingService{

    @Autowired
    MarketingRepository marketingRepository;

    @Override
    public Optional<Marketing> getMarketingById(Integer id){
        return marketingRepository.findById(id);
    }

    @Override
    public List<Marketing> getAllMarketing(){
        return marketingRepository.findAll();
    }

    @Override
    public void deleteAllMarketing(){
        marketingRepository.deleteAll();
    }

    @Override
    public void deleteMarketingById(Integer id){
        marketingRepository.deleteById(id);
    }

    @Override
    public void uptadeMarketingById(Integer id, Marketing marketing){
        Optional<Marketing> getMarketing = getMarketingById(id);
       getMarketing.get().setCnpj(marketing.getCnpj());
       getMarketing.get().setAnuncio(marketing.getAnuncio());
       getMarketing.get().setPlataforma(marketing.getPlataforma());

        marketingRepository.save(marketing);
    }

    @Override
    public void uptadeMarketing(Marketing marketing){
        marketingRepository.save(marketing);
    }

    @Override
    public void insertMarketing(Marketing marketing){
        marketingRepository.save(marketing);
    }







}
