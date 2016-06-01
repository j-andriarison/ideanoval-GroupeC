package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;

public interface CommentaireDao {

	// CREATE
	public boolean addCommentaire(Commentaire commentaire);

	// UPDATE
	public boolean updateCommentaire(Commentaire commentaire);

	// DELETE
	public boolean deleteCommentaire(Commentaire commentaire);

	public boolean deleteCommentaire(int idCommentaire);

	// SELECT
	public Commentaire findCommentaireById(int idCommentaire);

	public List<Commentaire> findCommentairesIdee(Idee idee);

}
