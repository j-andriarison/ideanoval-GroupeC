package fr.humanbooster.ideanoval.service;

import fr.humanbooster.ideanoval.business.ClassementBrains;
import fr.humanbooster.ideanoval.business.ClassementBuzzs;
import fr.humanbooster.ideanoval.business.ClassementTops;

public interface ClassementService {

	/**
	 * M�thode pour r�cup�rer le classement tops
	 * @return le classement des id�es les plus appr�ci�es
	 */
	public ClassementTops getClassementTops();

	/**
	 * M�thode pour r�cup�rer le classement buzzs
	 * @return le classement des id�es les plus comment�es
	 */
	public ClassementBuzzs getClassementBuzzs();


	/**
	 * M�thode pour r�cup�rer le classement brains
	 * @return le classement des utilisateurs les plus f�conds
	 */
	public ClassementBrains getClassementBrains();

	/**
	 * M�thode pour cr�er les classements
	 */
	public void refreshClassements();

}
