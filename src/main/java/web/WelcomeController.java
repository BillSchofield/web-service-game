package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Random;

@Controller
public class WelcomeController {
	private int positionX = 10;

	@RequestMapping(value = "/")
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@RequestMapping(value = "/position", method = RequestMethod.POST)
	public String position(Model model) {
		positionX += 10;
        if (model.containsAttribute("position")){
            model.asMap().put("position", positionX);
        }
        return "index";
	}



//	@RequestMapping("/ajax")
//	public ModelAndView helloAjaxTest() {
//		return new ModelAndView("example", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
//	}
//
//	@RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
//	public @ResponseBody
//	String getTime() {
//
//		Random rand = new Random();
//		float r = rand.nextFloat() * 100;
//		String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
//		System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());
//		return result;
//	}

}