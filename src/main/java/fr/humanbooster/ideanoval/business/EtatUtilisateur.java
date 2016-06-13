package fr.humanbooster.ideanoval.business;

/**
 * Enumération des différents états possibles d'un utilisateur
 *
 */
public enum EtatUtilisateur {
	// L'utilisateur a été créé mais son email n'a pas été vérifié
	NON_VERIFIE,
	// L'utilisateur est actif, son compte a été vérifié, il a accès aux
	// fonctionnalités normales
	ACTIVE,
	// L'utilisateur a été désactivé
	DESACTIVE,
	// L'utilisateur a été supprimé
	SUPPRIME
}
