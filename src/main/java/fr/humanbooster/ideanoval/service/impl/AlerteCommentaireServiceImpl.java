package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.AlerteCommentaire;
import fr.humanbooster.ideanoval.dao.AlerteCommentaireDao;
import fr.humanbooster.ideanoval.service.AlerteCommentaireService;

@Service
public class AlerteCommentaireServiceImpl implements AlerteCommentaireService {
	@Autowired
	private AlerteCommentaireDao alerteCommentaireDao;
	
	@Override
	public boolean createAlerteCommentaire(AlerteCommentaire alerteCommentaire) {
		
		return alerteCommentaireDao.addAlerteCommentaire(alerteCommentaire);
	}

	@Override
	public boolean updateAlerteCommentaire(AlerteCommentaire alerteCommentaire) {
		
		return alerteCommentaireDao.updateAlerteCommentaire(alerteCommentaire);
	}

	@Override
	public AlerteCommentaire getAlerteCommentaire(int idAlerteCommentaire) {
		AlerteCommentaire alerteCommentaire = alerteCommentaireDao.findAlerteCommentaire(idAlerteCommentaire);
		return alerteCommentaire;
	}

	@Override
	public List<AlerteCommentaire> getAllAlerteCommentaire() {
		List<AlerteCommentaire> alerteCommentaires = (List<AlerteCommentaire>) alerteCommentaireDao.findAlerteCommentaireAll();
		return alerteCommentaires;
	}

}
