package br.com.cotemig.VendasOnline.controllers;

import br.com.cotemig.VendasOnline.models.Carro;
import br.com.cotemig.VendasOnline.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarroController {

    @Autowired
    private CarroService carroService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "carro", new Carro());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("carro") Carro carro, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        carroService.insertCarro(carro);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "carro", carroService.getCarroById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("carro")Carro carro, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        carroService.deleteCarroById(carro.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "carro", carroService.getCarroById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("carro") Carro carro, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        carroService.uptadeCarro(carro);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("carros", carroService.getAllCarro());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("carros", carroService.getAllCarro());
        return mav;
    }
}
