package fr.humanbooster.ideanoval.service;

import fr.humanbooster.ideanoval.business.Idee;

public interface IdeeService {
	
	public boolean createIdee(Idee idee);
	public boolean updateIdeeEtat(Idee idee, boolean etat);
	
}
