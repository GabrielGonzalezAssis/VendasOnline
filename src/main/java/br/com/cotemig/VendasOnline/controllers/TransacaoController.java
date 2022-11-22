package br.com.cotemig.VendasOnline.controllers;


import br.com.cotemig.VendasOnline.models.Transacao;
import br.com.cotemig.VendasOnline.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "transacao", new Transacao());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("transacao") Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.insertTransacao(transacao);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "transacao", transacaoService.getTransacaoById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("transacao") Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.deleteTransacaoById(transacao.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "transacao", transacaoService.getTransacaoById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("transacao")Transacao transacao, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        transacaoService.uptadeTransacao(transacao);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("transacoes", transacaoService.getAllTransacao());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("transacoes", transacaoService.getAllTransacao());
        return mav;
    }
}
