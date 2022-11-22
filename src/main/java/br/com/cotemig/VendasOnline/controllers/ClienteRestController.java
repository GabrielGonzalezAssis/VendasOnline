package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Cliente;
import br.com.cotemig.VendasOnline.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Cliente> getCliente() {
        return clienteService.getAllCliente();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Cliente> getCliente(@PathVariable("id") Integer id) {
        return clienteService.getClienteById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteCliente() {
        clienteService.deleteAllCliente();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCliente(@PathVariable("id") Integer id) {
        clienteService.deleteAllCliente();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateCliente(@RequestBody Cliente cliente, @PathVariable("id") Integer id) {
        clienteService.uptadeClienteById(id, cliente);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateCliente(@RequestBody Cliente cliente) {
        clienteService.insertCliente(cliente);
    }

}
