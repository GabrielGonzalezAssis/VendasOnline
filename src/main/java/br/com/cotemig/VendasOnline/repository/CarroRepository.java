package br.com.cotemig.VendasOnline.repository;

import br.com.cotemig.VendasOnline.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("carroRepository")

public interface CarroRepository extends JpaRepository<Carro,Integer> {


}
