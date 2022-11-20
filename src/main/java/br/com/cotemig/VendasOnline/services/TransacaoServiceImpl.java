package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Marketing;
import br.com.cotemig.VendasOnline.models.Transacao;
import br.com.cotemig.VendasOnline.repository.MarketingRepository;
import br.com.cotemig.VendasOnline.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TransacaoServiceImpl implements TransacaoService{

    @Autowired
    TransacaoRepository transacaoRepository;

    @Override
    public Optional<Transacao> getTransacaoById(Integer id){
        return transacaoRepository.findById(id);
    }

    @Override
    public List<Transacao> getAllTransacao(){
        return transacaoRepository.findAll();
    }

    @Override
    public void deleteAllTransacao(){
        transacaoRepository.deleteAll();
    }

    @Override
    public void deleteTransacaoById(Integer id){
        transacaoRepository.deleteById(id);
    }

    @Override
    public void uptadeTransacaoById(Integer id, Transacao transacao){
        Optional<Transacao> getTransacao = getTransacaoById(id);
        getTransacao.get().setCliente(transacao.getCliente());
        getTransacao.get().setConcessionaria(transacao.getConcessionaria());
        getTransacao.get().setData(transacao.getData());
        getTransacao.get().setValor(transacao.getValor());

        transacaoRepository.save(transacao);
    }

    @Override
    public void uptadeTransacao(Transacao transacao){
        transacaoRepository.save(transacao);
    }

    @Override
    public void insertTransacao(Transacao transacao){
        transacaoRepository.save(transacao);
    }




}
