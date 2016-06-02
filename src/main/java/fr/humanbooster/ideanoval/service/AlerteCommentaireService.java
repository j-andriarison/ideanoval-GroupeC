package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.AlerteCommentaire;
/**
 * Classe permetan d'interfacer l'AlerteCommentaireService
 * @author Jean ANDRIANARISON
 *
 */
public interface AlerteCommentaireService {
	// INSERT
	public boolean createAlerteCommentaire(AlerteCommentaire alerteCommentaire);

	// UPDATE
	public boolean updateAlerteCommentaire(AlerteCommentaire alerteCommentaire);

	// SELECT
	public AlerteCommentaire getAlerteCommentaire(int idAlerteCommentaire);

	public List<AlerteCommentaire> getAllAlerteCommentaire();
}
