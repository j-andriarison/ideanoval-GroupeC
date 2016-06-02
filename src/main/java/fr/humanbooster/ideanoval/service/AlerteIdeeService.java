package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.AlerteIdee;

/**
 * Cette Classe permet d'interfacer le AlerteIdeeServiceImpl
 * 
 * @author Jean ANDRIANARISON 
 * Merc. 01/06/2016
 */
public interface AlerteIdeeService {
	// INSERT
	public boolean createAlerteIdee(AlerteIdee alerteIdee);

	// UPDATE
	public boolean updateAlerteIdee(AlerteIdee alerteIdee);

	// SELECT
	public AlerteIdee getAlerteIdee(int idAlerteIdee);

	public List<AlerteIdee> getAlerteIdeeAll();
}
