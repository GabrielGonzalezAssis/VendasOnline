package br.com.cotemig.VendasOnline.controllers;


import br.com.cotemig.VendasOnline.models.Marketing;
import br.com.cotemig.VendasOnline.services.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MarketingRestController {

    @Autowired
    private MarketingService marketingService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Marketing> getMarketing() {
        return marketingService.getAllMarketing();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Marketing> getMarketing(@PathVariable("id") Integer id) {
        return marketingService.getMarketingById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteMarketing() {
        marketingService.deleteAllMarketing();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteMarketing(@PathVariable("id") Integer id) {
        marketingService.deleteAllMarketing();
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateMarketing(@RequestBody Marketing marketing, @PathVariable("id") Integer id) {
        marketingService.uptadeMarketingById(id, marketing);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateMarketing(@RequestBody Marketing marketing) {
        marketingService.insertMarketing(marketing);
    }
}
