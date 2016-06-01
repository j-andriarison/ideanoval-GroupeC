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
	 * param�tre : un Commentaire
	 * retourne : true si le commentaire a �t� ajout�
	 */
	@Override
	@Transactional
	public boolean createCommentaire(Commentaire commentaire) {
		return commentaireDao.addCommentaire(commentaire);
	}

	/**
	 * Cette m�thode met � jour l'�tat estDesactive d'un commentaire
	 * param�tres : un Commentaire, l'�tat du commentaire
	 * retourne true si le commentaire a �t� mis � jour
	 */
	@Override
	@Transactional
	public boolean updateCommentaireEtat(Commentaire commentaire, boolean etat) {
		commentaire.setEstDesactive(etat);
		return commentaireDao.updateCommentaire(commentaire);
	}

}
