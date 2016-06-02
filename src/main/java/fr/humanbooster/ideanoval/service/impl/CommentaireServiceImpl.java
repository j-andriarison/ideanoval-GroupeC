package fr.humanbooster.ideanoval.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.dao.CommentaireDao;
import fr.humanbooster.ideanoval.service.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService {

	@Autowired
	private CommentaireDao commentaireDao;
	
	/**
	 * paramètre : un Commentaire
	 * retourne : true si le commentaire a été ajouté
	 */
	@Override
	@Transactional
	public boolean createCommentaire(Commentaire commentaire) {
		return commentaireDao.addCommentaire(commentaire);
	}

	/**
	 * Cette méthode met à jour l'état estDesactive d'un commentaire
	 * paramètres : un Commentaire, l'état du commentaire
	 * retourne true si le commentaire a été mis à jour
	 */
	@Override
	@Transactional
	public boolean updateCommentaireEtat(Commentaire commentaire, boolean etat) {
		commentaire.setEstDesactive(etat);
		return commentaireDao.updateCommentaire(commentaire);
	}

}
