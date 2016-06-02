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
	 * paramètre : une Idee
	 * retourne : true si l'idée a été créée
	 */
	@Override
	@Transactional
	public boolean createIdee(Idee idee) {
		return ideeDao.addIdee(idee);
	}

	/**
	 * paramètres : une Idee, l'état de l'idée
	 * retourne : true si l'état de l'idée a été mis à jour
	 */
	@Override
	@Transactional
	public boolean updateIdeeEtat(Idee idee, boolean etat) {
		idee.setEstDesactivee(etat);
		return ideeDao.updateIdee(idee);
	}

}
