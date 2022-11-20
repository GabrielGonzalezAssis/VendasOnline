package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Carro;
import br.com.cotemig.VendasOnline.models.Cliente;
import br.com.cotemig.VendasOnline.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Optional<Cliente> getClienteById(Integer id){
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    @Override
    public void deleteAllCliente(){
        clienteRepository.deleteAll();
    }

    @Override
    public void deleteClienteById(Integer id){
        clienteRepository.deleteById(id);
    }

    @Override
    public void uptadeClienteById(Integer id, Cliente cliente){
        Optional<Cliente> getCliente = getClienteById(id);
        getCliente.get().setNome(cliente.getNome());
        getCliente.get().setConta(cliente.getConta());
        getCliente.get().setEndereco(cliente.getEndereco());
        getCliente.get().setCpf(cliente.getCpf());

        clienteRepository.save(cliente);
    }

    @Override
    public void uptadeCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    @Override
    public void insertCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }


}
