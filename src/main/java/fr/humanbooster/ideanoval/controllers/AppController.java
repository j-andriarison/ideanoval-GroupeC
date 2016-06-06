package fr.humanbooster.ideanoval.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Jean ANDRIANARISON
 *
 */

@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "accueil";
	}

	@RequestMapping(value = { "/idees"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "idees";
	}

	@RequestMapping(value = { "/contact"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contact";
	}
}