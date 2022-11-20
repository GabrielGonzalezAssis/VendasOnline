package br.com.cotemig.VendasOnline.services;

import br.com.cotemig.VendasOnline.models.Marketing;

import java.util.List;
import java.util.Optional;

public interface MarketingService {

    Optional<Marketing> getMarketingById(Integer id);
    List<Marketing> getAllMarketing();
    void deleteAllMarketing();
    void deleteMarketingById(Integer id);
    void uptadeMarketingById(Integer id, Marketing marketing);
    void uptadeMarketing (Marketing marketing);
    void insertMarketing (Marketing marketing);
}
