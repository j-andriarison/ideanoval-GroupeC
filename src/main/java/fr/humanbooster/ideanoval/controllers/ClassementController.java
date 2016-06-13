package fr.humanbooster.ideanoval.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.humanbooster.ideanoval.service.ClassementService;

/**
 * Controller qui gère les classements.
 * Permet de préparer et retourner un ou les trois classements
 *
 */
@Controller
public class ClassementController {


	@Autowired
	private ClassementService classementService;

	/**
	 * Méthode GET qui prépare et renvoie la page du classement des idées les mieux notées
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementTops
	 */
	@RequestMapping(value = "/classementTops", method = RequestMethod.GET)
	public String showClassementTops(Map<String, Object> map) {
		// Début de mesure de chargement de la page?

		addClassementTops(map);

		// Arrêt de mesure de chargement de la page?
		return "classementTops";
//		return new ModelAndView("classementTops", map);
	}

	/**
	 * Méthode GET qui prépare et renvoie la page du classement des idées les commentées
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementBuzzs
	 */
	@RequestMapping(value = "/classementBuzzs", method = RequestMethod.GET)
	public String showClassementBuzzs(Map<String, Object> map) {
		// Début de mesure de chargement de la page?

		addClassementBuzzs(map);

		// Arrêt de mesure de chargement de la page?
		return "classementBuzzs";
//		return new ModelAndView("classementBuzzs", map);
	}

	/**
	 * Méthode GET qui prépare et renvoie la page du classement des utilisateurs ayant proposé le plus d'idées
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classementBrains
	 */
	@RequestMapping(value = "/classementBrains", method = RequestMethod.GET)
	public String showClassementBrains(Map<String, Object> map) {
		// Début de mesure de chargement de la page?

		addClassementBrains(map);

		// Arrêt de mesure de chargement de la page?
		return "classementBrains";
//		return new ModelAndView("classementBrains", map);
	}

	/**
	 * Méthode GET qui prépare et renvoie la page des trois classements
	 * @param map la collection d'attributs contenant le classement pour la vue
	 * @return la page classements
	 */
	@RequestMapping(value = "/classements", method = RequestMethod.GET)
	public String showClassments(Map<String, Object> map) {
		// Début de mesure de chargement de la page?

		addClassementTops(map);
		addClassementBuzzs(map);
		addClassementBrains(map);

		// Arrêt de mesure de chargement de la page?
		return "classements";
	}

	/**
	 * Méthode qui passe le classement Tops à la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementTops(Map<String, Object> map) {
		map.put("classementTops", classementService.getClassementTops());
	}

	/**
	 * Méthode qui passe le classement Buzzs à la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementBuzzs(Map<String, Object> map) {
		map.put("classementBuzzs", classementService.getClassementBuzzs());
	}

	/**
	 * Méthode qui passe le classement Brains à la collection d'attributs
	 * @param map la collection d'attributs
	 */
	private void addClassementBrains(Map<String, Object> map) {
		map.put("classementBrains", classementService.getClassementBrains());
	}
	
}
