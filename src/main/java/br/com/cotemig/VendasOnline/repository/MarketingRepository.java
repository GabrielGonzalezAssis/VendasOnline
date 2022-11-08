package br.com.cotemig.VendasOnline.repository;


import br.com.cotemig.VendasOnline.models.Marketing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("martekingRepository")
public interface MarketingRepository extends JpaRepository<Marketing, Integer> {


}
