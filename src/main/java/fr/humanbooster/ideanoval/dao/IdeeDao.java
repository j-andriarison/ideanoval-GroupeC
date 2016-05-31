package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.Idee;

public interface IdeeDao {

	public boolean addIdee(Idee idee);
	public boolean updateIdee(Idee idee);
	public boolean deleteIdee(Idee idee);
	public boolean deleteIdee(int idIdee);
	public Idee findIdeeById(int idIdee);
	
}
