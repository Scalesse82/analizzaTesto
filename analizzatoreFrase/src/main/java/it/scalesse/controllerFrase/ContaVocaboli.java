package it.scalesse.controllerFrase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContaVocaboli {
	
	@RequestMapping(value = "/controlloVocaboli" , method = RequestMethod.POST)
	   public ModelAndView checkVocaboli(@RequestParam("testo") String testo, Model model) {
		
	    String parole[]=testo.split(" ");
	    
	    ModelAndView vista=new ModelAndView();
	    vista.setViewName("risultato");
	    vista.addObject("frase", "Il numero di vocaboli nella frase è :");
	    vista.addObject("numero", parole.length);
	    
	    return vista;
	}
	
	@RequestMapping(value = "/scelta" ,method = RequestMethod.POST)
	   public ModelAndView checkScelta(@RequestParam("testo") String testo, Model model) {
		
		
		
		return new ModelAndView("scelta","testo",testo);
	}
	

}
