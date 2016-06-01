package fr.humanbooster.ideanoval.service;

import fr.humanbooster.ideanoval.business.Commentaire;

public interface CommentaireService {
	
	public boolean createCommentaire(Commentaire commentaire);
	public boolean updateCommentaireEtat(Commentaire commentaire, boolean etat);
	
}
