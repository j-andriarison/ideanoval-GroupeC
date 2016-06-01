package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.AlerteCommentaire;

public interface AlerteCommentaireDao {
	// INSERT
	public boolean addAlerteCommentaire(AlerteCommentaire alerteCommentaire);

	// UPDATE
	public boolean updateAlerteCommentaire(AlerteCommentaire alerteCommentaire);

	// SELECT
	public AlerteCommentaire findAlerteCommentaire(int idAlerteCommentaire);

	public List<AlerteCommentaire> findAlerteCommentaireAll();

}
