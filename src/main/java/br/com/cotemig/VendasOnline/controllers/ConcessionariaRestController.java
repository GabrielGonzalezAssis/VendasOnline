package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Concessionaria;
import br.com.cotemig.VendasOnline.services.ConcessionariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ConcessionariaRestController {

    @Autowired
    private ConcessionariaService concessionariaService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Concessionaria> getConcessionaria() {
        return concessionariaService.getAllConcessionaria();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Concessionaria> getConcessionaria(@PathVariable("id") Integer id) {
        return concessionariaService.getConcessionariaById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteConcessionaria() {
        concessionariaService.deleteAllConcessionaria();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteConcessionaria(@PathVariable("id") Integer id) {
        concessionariaService.deleteAllConcessionaria();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateConcessionaria(@RequestBody Concessionaria concessionaria, @PathVariable("id") Integer id) {
        concessionariaService.uptadeConcessionariaById(id, concessionaria);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateConcessionaria(@RequestBody Concessionaria concessionaria) {
        concessionariaService.insertConcessionaria(concessionaria);
    }


}
