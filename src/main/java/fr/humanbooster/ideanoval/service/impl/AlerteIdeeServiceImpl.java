package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.AlerteIdee;
import fr.humanbooster.ideanoval.dao.AlerteIdeeDao;
import fr.humanbooster.ideanoval.service.AlerteIdeeService;
/**
 * Cette Classe est le service qui gère l'alerte service
 * 
 * @author Jean ANDRIANARISON 
 * Merc. 01/06/2016
 */
@Service
public class AlerteIdeeServiceImpl implements AlerteIdeeService {
	@Autowired
	AlerteIdeeDao alerteIdeeDao;

	/**
	 * La méthode createAlerteIdee() permet de créer une alerte idée passé en
	 * paramètre
	 * 
	 * @return true si l'enregistrement se passe bien
	 */
	@Override
	public boolean createAlerteIdee(AlerteIdee alerteIdee) {

		return alerteIdeeDao.addAlerteIdee(alerteIdee);
	}

	/**
	 * La méthode updateAlerteIdee() permet de mettre à jour une alerte idée
	 * passé en paramètre
	 * 
	 * @return true si l'enregistrement se passe bien
	 */
	@Override
	public boolean updateAlerteIdee(AlerteIdee alerteIdee) {
		return alerteIdeeDao.updateAlerteIdee(alerteIdee);
	}

	/**
	 * La méthode getAlerteIdee() permet de récupérer une alerte idée passé en
	 * paramètre
	 * 
	 * @param int
	 *            idAlerteIdee
	 * @return
	 */
	@Override
	public AlerteIdee getAlerteIdee(int idAlerteIdee) {
		AlerteIdee alerteIdee = alerteIdeeDao.findAlerteIdee(idAlerteIdee);
		return alerteIdee;
	}

	/**
	 * La méthode getAlerteIdeeAll() permet de récupérer une liste d'alerte
	 * d'idée
	 * 
	 * @return List<AlerteIdee>
	 */
	@Override
	public List<AlerteIdee> getAlerteIdeeAll() {
		List<AlerteIdee> alerteIdees = (List<AlerteIdee>) alerteIdeeDao.findAlerteIdeeAll();
		return alerteIdees;
	}

}
