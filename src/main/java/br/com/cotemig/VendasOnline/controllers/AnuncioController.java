package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Anuncio;
import br.com.cotemig.VendasOnline.services.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "anuncio", new Anuncio());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("anuncio") Anuncio anuncio, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        anuncioService.insertAnuncio(anuncio);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "anuncio", anuncioService.getAnuncioById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("anuncio")Anuncio anuncio, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        anuncioService.deleteAnuncioById(anuncio.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "anuncio", anuncioService.getAnuncioById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("anuncio")Anuncio anuncio, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        anuncioService.uptadeAnuncio(anuncio);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("anuncios", anuncioService.getAllAnuncio());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("anuncios", anuncioService.getAllAnuncio());
        return mav;
    }
}
