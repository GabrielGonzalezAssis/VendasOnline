package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Concessionaria;
import br.com.cotemig.VendasOnline.services.ConcessionariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConcessionariaController {

    @Autowired
    private ConcessionariaService concessionariaService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "concessionaria", new Concessionaria());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("concessionaria") Concessionaria concessionaria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        concessionariaService.insertConcessionaria(concessionaria);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "concessionaria", concessionariaService.getConcessionariaById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("concessionaria") Concessionaria concessionaria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        concessionariaService.deleteConcessionariaById(concessionaria.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "concessionaria", concessionariaService.getConcessionariaById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("concessionaria")Concessionaria concessionaria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        concessionariaService.uptadeConcessionaria(concessionaria);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("concessionarias", concessionariaService.getAllConcessionaria());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("concessionarias", concessionariaService.getAllConcessionaria());
        return mav;
    }
}
