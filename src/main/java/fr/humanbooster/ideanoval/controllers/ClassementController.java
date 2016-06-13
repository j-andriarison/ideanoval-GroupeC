package fr.humanbooster.ideanoval.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.humanbooster.ideanoval.service.ClassementService;

/**
 * Controller qui g�re les classements.
 * Permet de pr�parer et retourner un ou les trois classements
 *
 */
@Controller
public class ClassementController {


	@Autowired
	private ClassementService classementService;

	/**
	 * M�thode GET qui pr�pare et renvoie la page du classement des id�es les mieux not�es
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementTops
	 */
	@RequestMapping(value = "/classementTops", method = RequestMethod.GET)
	public String showClassementTops(Map<String, Object> map) {
		// D�but de mesure de chargement de la page?

		addClassementTops(map);

		// Arr�t de mesure de chargement de la page?
		return "classementTops";
//		return new ModelAndView("classementTops", map);
	}

	/**
	 * M�thode GET qui pr�pare et renvoie la page du classement des id�es les comment�es
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementBuzzs
	 */
	@RequestMapping(value = "/classementBuzzs", method = RequestMethod.GET)
	public String showClassementBuzzs(Map<String, Object> map) {
		// D�but de mesure de chargement de la page?

		addClassementBuzzs(map);

		// Arr�t de mesure de chargement de la page?
		return "classementBuzzs";
//		return new ModelAndView("classementBuzzs", map);
	}

	/**
	 * M�thode GET qui pr�pare et renvoie la page du classement des utilisateurs ayant propos� le plus d'id�es
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementBrains
	 */
	@RequestMapping(value = "/classementBrains", method = RequestMethod.GET)
	public String showClassementBrains(Map<String, Object> map) {
		// D�but de mesure de chargement de la page?

		addClassementBrains(map);

		// Arr�t de mesure de chargement de la page?
		return "classementBrains";
//		return new ModelAndView("classementBrains", map);
	}

	/**
	 * M�thode GET qui pr�pare et renvoie la page des trois classements
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classements
	 */
	@RequestMapping(value = "/classements", method = RequestMethod.GET)
	public String showClassments(Map<String, Object> map) {
		// D�but de mesure de chargement de la page?

		addClassementTops(map);
		addClassementBuzzs(map);
		addClassementBrains(map);

		// Arr�t de mesure de chargement de la page?
		return "classements";
	}

	/**
	 * M�thode qui passe le classement Tops � la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementTops(Map<String, Object> map) {
		map.put("classementTops", classementService.getClassementTops());
	}

	/**
	 * M�thode qui passe le classement Buzzs � la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementBuzzs(Map<String, Object> map) {
		map.put("classementBuzzs", classementService.getClassementBuzzs());
	}

	/**
	 * M�thode qui passe le classement Brains � la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementBrains(Map<String, Object> map) {
		map.put("classementBrains", classementService.getClassementBrains());
	}
	
}
