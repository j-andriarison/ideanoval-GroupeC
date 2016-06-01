package fr.humanbooster.ideanoval.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.dao.IdeeDao;
import fr.humanbooster.ideanoval.service.IdeeService;

@Service
public class IdeeServiceImpl implements IdeeService {

	@Autowired
	private IdeeDao ideeDao;
	
	/**
	 * param�tre : une Idee
	 * retourne : true si l'id�e a �t� cr��e
	 */
	@Override
	@Transactional
	public boolean createIdee(Idee idee) {
		return ideeDao.addIdee(idee);
	}

	/**
	 * param�tres : une Idee, l'�tat de l'id�e
	 * retourne : true si l'�tat de l'id�e a �t� mis � jour
	 */
	@Override
	@Transactional
	public boolean updateIdeeEtat(Idee idee, boolean etat) {
		idee.setEstDesactivee(etat);
		return ideeDao.updateIdee(idee);
	}

}
