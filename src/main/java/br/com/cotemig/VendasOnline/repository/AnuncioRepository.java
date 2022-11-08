package br.com.cotemig.VendasOnline.repository;


import br.com.cotemig.VendasOnline.models.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("anuncioRepository")
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {



}

