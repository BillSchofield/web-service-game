package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PositionController {
	private double radians = 0;

	@RequestMapping(value = "/")
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView("index", "message", "Spacegame Model");
		return modelAndView;
	}

	@RequestMapping(value = "/position", method = RequestMethod.GET)
	public @ResponseBody
	String position() {
		Double x = 200 + 200 * Math.cos(radians);
		Double y = 200 + 200 * Math.sin(radians);
		radians += Math.PI/60;
        return x + " " + y;
	}
}