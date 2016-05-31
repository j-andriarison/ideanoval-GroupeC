package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.AlerteIdee;

public interface AlerteIdeeDao {
	//INSERT
		public boolean addAlerteIdee(AlerteIdee alerteIdee); 
		//UPDATE
		public boolean updateAlerteIdee(AlerteIdee alerteIdee);
		//SELECT
		public AlerteIdee findAlerteIdee(int idAlerteIdee);
		public List<AlerteIdee> findAlerteIdeeAll();
}
