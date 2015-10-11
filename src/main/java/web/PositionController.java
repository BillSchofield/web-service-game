package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.Game;

@Controller
public class PositionController {
	private Game game;

	@Autowired
	public PositionController(Game game) {
		this.game = game;
	}

	@RequestMapping(value = "/")
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView("index", "message", "Spacegame Model");
		return modelAndView;
	}

	@RequestMapping(value = "/position", method = RequestMethod.GET)
	public @ResponseBody
	String position() {
		return game.entity().position();
	}

	@RequestMapping(value = "/accelerate", method = RequestMethod.POST)
	public void accelerate() {
		game.entity().accelerate();
	}

	@RequestMapping(value = "/stop", method = RequestMethod.POST)
	public void stop() {
		game.entity().reset();
	}

	@RequestMapping(value = "/rotate", method = RequestMethod.POST)
	public void rotate(String delta) {
		game.entity().rotate(Double.parseDouble(delta));
	}
}