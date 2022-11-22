package br.com.cotemig.VendasOnline.controllers;


import br.com.cotemig.VendasOnline.models.Marketing;
import br.com.cotemig.VendasOnline.services.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarketingController {

    @Autowired
    private MarketingService marketingService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "marketing", new Marketing());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert( @ModelAttribute("marketing") Marketing marketing, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        marketingService.insertMarketing(marketing);
        return "redirect:";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "marketing", marketingService.getMarketingById(id).get());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete( @ModelAttribute("marketing") Marketing marketing, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        marketingService.deleteMarketingById(marketing.getId());
        return "redirect:";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "marketing", marketingService.getMarketingById(id).get());
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate( @ModelAttribute("marketing")Marketing marketing, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        marketingService.uptadeMarketing(marketing);
        return "redirect:";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("marketings", marketingService.getAllMarketing());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("marketings", marketingService.getAllMarketing());
        return mav;
    }
}
