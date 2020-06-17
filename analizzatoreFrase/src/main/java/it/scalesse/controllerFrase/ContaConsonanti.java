package it.scalesse.controllerFrase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.scalesse.service.Conta;

@Controller
public class ContaConsonanti {
	
	@RequestMapping(value = "/controlloConsonanti" ,method = RequestMethod.POST)
	   public ModelAndView checkConsonanti(@RequestParam("testo") String testo, Model model) {
		
		ModelAndView vista=new ModelAndView();
	    vista.setViewName("risultato");
	    vista.addObject("frase", "Il numero di Consonanti nella frase è :");
	    vista.addObject("numero", Conta.contaConsonanti(testo));
		
		return vista; 
		
	}

}
