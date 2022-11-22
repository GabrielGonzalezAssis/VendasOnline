package br.com.cotemig.VendasOnline.controllers;


import br.com.cotemig.VendasOnline.models.Carro;
import br.com.cotemig.VendasOnline.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarroRestController {

    @Autowired
    private CarroService carroService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Carro> getCarro() {
        return carroService.getAllCarro();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Carro> getCarro(@PathVariable("id") Integer id) {
        return carroService.getCarroById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteCarro() {
        carroService.deleteAllCarro();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCarro(@PathVariable("id") Integer id) {
        carroService.deleteAllCarro();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateCarro(@RequestBody Carro carro, @PathVariable("id") Integer id) {
        carroService.uptadeCarroById(id, carro);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateCarro(@RequestBody Carro carro) {
        carroService.insertCarro(carro);
    }

}
