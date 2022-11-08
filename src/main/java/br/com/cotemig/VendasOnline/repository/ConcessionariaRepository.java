package br.com.cotemig.VendasOnline.repository;


import br.com.cotemig.VendasOnline.models.Concessionaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("concessionariaRepository")
public interface ConcessionariaRepository extends JpaRepository<Concessionaria, Integer> {


}
