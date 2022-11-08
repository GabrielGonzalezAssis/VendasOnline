package br.com.cotemig.VendasOnline.repository;

import br.com.cotemig.VendasOnline.models.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("transacaoRepository")

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {


}
