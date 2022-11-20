package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> getClienteById(Integer id);
    List<Cliente> getAllCliente();
    void deleteAllCliente();
    void deleteClienteById(Integer id);
    void uptadeClienteById(Integer id, Cliente cliente);
    void uptadeCliente (Cliente cliente);
    void insertCliente (Cliente cliente);
}
