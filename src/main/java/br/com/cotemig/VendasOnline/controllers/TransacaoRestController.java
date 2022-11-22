package br.com.cotemig.VendasOnline.controllers;



import br.com.cotemig.VendasOnline.models.Transacao;
import br.com.cotemig.VendasOnline.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransacaoRestController {

    @Autowired
    private TransacaoService transacaoService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Transacao> getTransacao() {
        return transacaoService.getAllTransacao();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Transacao> getTransacao(@PathVariable("id") Integer id) {
        return transacaoService.getTransacaoById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteTransacao() {
        transacaoService.deleteAllTransacao();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTransacao(@PathVariable("id") Integer id) {
        transacaoService.deleteAllTransacao();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateTransacao(@RequestBody Transacao transacao, @PathVariable("id") Integer id) {
        transacaoService.uptadeTransacaoById(id, transacao);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateTransacao(@RequestBody Transacao transacao) {
        transacaoService.insertTransacao(transacao);
    }
}
