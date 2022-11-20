package br.com.cotemig.VendasOnline.services;


import br.com.cotemig.VendasOnline.models.Transacao;

import java.util.List;
import java.util.Optional;

public interface TransacaoService {

    Optional<Transacao> getTransacaoById(Integer id);
    List<Transacao> getAllTransacao();
    void deleteAllTransacao();
    void deleteTransacaoById(Integer id);
    void uptadeTransacaoById(Integer id, Transacao transacao);
    void uptadeTransacao (Transacao transacao);
    void insertTransacao (Transacao transacao);
    


}
