package br.com.cotemig.VendasOnline.repository;


import br.com.cotemig.VendasOnline.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clienteRepository")

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
