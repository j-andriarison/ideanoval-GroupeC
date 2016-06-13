package fr.humanbooster.ideanoval.service;

import fr.humanbooster.ideanoval.business.ClassementBrains;
import fr.humanbooster.ideanoval.business.ClassementBuzzs;
import fr.humanbooster.ideanoval.business.ClassementTops;

public interface ClassementService {

	/**
	 * Méthode pour récupérer le classement tops
	 * @return le classement des idées les plus appréciées
	 */
	public ClassementTops getClassementTops();

	/**
	 * Méthode pour récupérer le classement buzzs
	 * @return le classement des idées les plus commentées
	 */
	public ClassementBuzzs getClassementBuzzs();


	/**
	 * Méthode pour récupérer le classement brains
	 * @return le classement des utilisateurs les plus féconds
	 */
	public ClassementBrains getClassementBrains();

	/**
	 * Méthode pour créer les classements
	 */
	public void refreshClassements();

}
