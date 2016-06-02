package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.AlerteIdee;
import fr.humanbooster.ideanoval.dao.AlerteIdeeDao;
import fr.humanbooster.ideanoval.service.AlerteIdeeService;
/**
 * Cette Classe est le service qui g�re l'alerte service
 * 
 * @author Jean ANDRIANARISON 
 * Merc. 01/06/2016
 */
@Service
public class AlerteIdeeServiceImpl implements AlerteIdeeService {
	@Autowired
	AlerteIdeeDao alerteIdeeDao;

	/**
	 * La m�thode createAlerteIdee() permet de cr�er une alerte id�e pass� en
	 * param�tre
	 * 
	 * @return true si l'enregistrement se passe bien
	 */
	@Override
	public boolean createAlerteIdee(AlerteIdee alerteIdee) {

		return alerteIdeeDao.addAlerteIdee(alerteIdee);
	}

	/**
	 * La m�thode updateAlerteIdee() permet de mettre � jour une alerte id�e
	 * pass� en param�tre
	 * 
	 * @return true si l'enregistrement se passe bien
	 */
	@Override
	public boolean updateAlerteIdee(AlerteIdee alerteIdee) {
		return alerteIdeeDao.updateAlerteIdee(alerteIdee);
	}

	/**
	 * La m�thode getAlerteIdee() permet de r�cup�rer une alerte id�e pass� en
	 * param�tre
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
	 * La m�thode getAlerteIdeeAll() permet de r�cup�rer une liste d'alerte
	 * d'id�e
	 * 
	 * @return List<AlerteIdee>
	 */
	@Override
	public List<AlerteIdee> getAlerteIdeeAll() {
		List<AlerteIdee> alerteIdees = (List<AlerteIdee>) alerteIdeeDao.findAlerteIdeeAll();
		return alerteIdees;
	}

}
