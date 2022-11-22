package br.com.cotemig.VendasOnline.controllers;


import br.com.cotemig.VendasOnline.models.Cliente;
import br.com.cotemig.VendasOnline.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "cliente", new Cliente());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("cliente") Cliente cliente, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        clienteService.insertCliente(cliente);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "cliente", clienteService.getClienteById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("cliente") Cliente cliente, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        clienteService.deleteClienteById(cliente.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "cliente", clienteService.getClienteById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("cliente")Cliente cliente, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        clienteService.uptadeCliente(cliente);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("clientes", clienteService.getAllCliente());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("clientes", clienteService.getAllCliente());
        return mav;
    }

}
