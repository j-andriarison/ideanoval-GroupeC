package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.LigneClassementIdee;

public interface LigneClassementIdeeDao {

	// CREATE
	public boolean addLigneClassementIdee(LigneClassementIdee ligneClassementIdee);

	// UPDATE
	public boolean updateLigneClassementIdee(LigneClassementIdee ligneClassementIdee);

	// DELETE
	public boolean deleteLigneClassementIdee(LigneClassementIdee ligneClassementIdee);

}
