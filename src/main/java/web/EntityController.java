package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.Game;

@Controller
public class EntityController {
	private Game game;

	@Autowired
	public EntityController(Game game) {
		this.game = game;
	}

	@RequestMapping(value = "/")
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView("index", "message", "Spacegame Model");
		return modelAndView;
	}

	@RequestMapping(value = "/position/{id}", method = RequestMethod.GET)
	public @ResponseBody
	String position(Integer id) {
		return game.entity(id).position();
	}

	@RequestMapping(value = "/accelerate/{id}", method = RequestMethod.POST)
	public void accelerate(Integer id) {
		game.entity(id).accelerate();
	}

	@RequestMapping(value = "/stop/{id}", method = RequestMethod.POST)
	public void stop(Integer id) {
		game.entity(id).reset();
	}

	@RequestMapping(value = "/rotate/{id}", method = RequestMethod.POST)
	public void rotate(Integer id, String delta) {
		game.entity(id).rotate(Double.parseDouble(delta));
	}
}