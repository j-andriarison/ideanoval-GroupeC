package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.LigneClassementUtilisateur;

public interface LigneClassementUtilisateurDao {

	// CREATE
	public boolean addLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur);

	// UPDATE
	public boolean updateLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur);

	// DELETE
	public boolean deleteLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur);

}
