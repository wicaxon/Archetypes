package ${package};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class HelloController {
	
	private static final Logger log = LogManager.getLogger(HelloController.class.getName());
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		log.debug( "printHello() is executed." );
		model.addAttribute("message", "Hello blangkon !");
		return "hello";
	}
   
}