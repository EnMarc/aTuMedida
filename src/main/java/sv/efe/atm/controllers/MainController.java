package sv.efe.atm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("title","Sistema de Facturacion");
		return "index";
	}
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("title","Sistema de Facturacion");
		return "index";
	}
}
