package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.Game;

import java.util.List;

@Controller
public class GameController {
	private Game game;
	private Integer playerNumber = 1;

	@Autowired
	public GameController(Game game) {
		this.game = game;
	}

	@RequestMapping(value = "/")
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView("index", "message", "Spacegame Model");
		return modelAndView;
	}

	@RequestMapping(value = "/join")
	public ModelAndView join() {
		Integer player = game.newPlayer();
		ModelAndView modelAndView = new ModelAndView("index", "player", player);
		return modelAndView;
	}

	@RequestMapping(value = "/entities", method = RequestMethod.GET)
	public @ResponseBody
	List<String> entities() {
		List<String> entities = game.entities();
		return entities;
	}
}