package fr.humanbooster.ideanoval.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.UtilisateurEtat;
import fr.humanbooster.ideanoval.dao.impl.UtilisateurEtatDaoImpl;

/**
 * Classe qui gère les différents états d'utilisateur et présente les objets UtilisateurEtat pour chaque
 * possibilité: NON_VERIFIE, ACTIVE, DESACTIVE, SUPPRIME
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
	 * Méthode permettant de créer les états d'utilisateur possibles
	 */
	public static void initialize() {
		for(UtilisateurEtat utilisateurEtat : utilisateurEtatDaoImpl.getAllEtats()){
			switch(utilisateurEtat.getEtatUtilisateur()) {
			case "non verifié":
				NON_VERIFIE = utilisateurEtat; 
				break;
			case "validé":
				ACTIVE = utilisateurEtat;
				break;
			case "desactivé":
				DESACTIVE = utilisateurEtat;
				break;
			case "supprimé":
				SUPPRIME = utilisateurEtat;
				break;
			}
		}
	}
	
}
