package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Anuncio;
import br.com.cotemig.VendasOnline.services.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnuncioRestController {

    @Autowired
    private AnuncioService anuncioService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Anuncio> getAnuncio() {
        return anuncioService.getAllAnuncio();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Anuncio> getAnuncio(@PathVariable("id") Integer id) {
        return anuncioService.getAnuncioById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteAlunos() {
        anuncioService.deleteAllAnuncio();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAnuncio(@PathVariable("id") Integer id) {
        anuncioService.deleteAllAnuncio();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateAnuncio(@RequestBody Anuncio anuncio, @PathVariable("id") Integer id) {
        anuncioService.uptadeAnuncioById(id, anuncio);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateAnuncio(@RequestBody Anuncio anuncio) {
        anuncioService.insertAnuncio(anuncio);
    }



}
