package fr.humanbooster.ideanoval.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.UtilisateurEtat;
import fr.humanbooster.ideanoval.dao.impl.UtilisateurEtatDaoImpl;

/**
 * Classe qui g�re les diff�rents �tats d'utilisateur et pr�sente les objets UtilisateurEtat pour chaque
 * possibilit�: NON_VERIFIE, ACTIVE, DESACTIVE, SUPPRIME
 * @author Frederic Moussiegt
 *
 */
@Service
public class UtilisateurEtatService {
	// NON_VERIFIE, ACTIVE, DESACTIVE, SUPPRIME

	public static UtilisateurEtat NON_VERIFIE;
	public static UtilisateurEtat ACTIVE;
	public static UtilisateurEtat DESACTIVE;
	public static UtilisateurEtat SUPPRIME;

	@Autowired
	private static UtilisateurEtatDaoImpl utilisateurEtatDaoImpl;

	/**
	 * M�thode permettant de cr�er les �tats d'utilisateur possibles
	 */
	public static void initialize() {
		for(UtilisateurEtat utilisateurEtat : utilisateurEtatDaoImpl.getAllEtats()){
			switch(utilisateurEtat.getEtatUtilisateur()) {
			case "non verifi�":
				NON_VERIFIE = utilisateurEtat; 
				break;
			case "valid�":
				ACTIVE = utilisateurEtat;
				break;
			case "desactiv�":
				DESACTIVE = utilisateurEtat;
				break;
			case "supprim�":
				SUPPRIME = utilisateurEtat;
				break;
			}
		}
	}
	
}
