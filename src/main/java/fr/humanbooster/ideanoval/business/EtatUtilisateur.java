package fr.humanbooster.ideanoval.business;

/**
 * Enum�ration des diff�rents �tats possibles d'un utilisateur
 *
 */
public enum EtatUtilisateur {
	// L'utilisateur a �t� cr�� mais son email n'a pas �t� v�rifi�
	NON_VERIFIE,
	// L'utilisateur est actif, son compte a �t� v�rifi�, il a acc�s aux
	// fonctionnalit�s normales
	ACTIVE,
	// L'utilisateur a �t� d�sactiv�
	DESACTIVE,
	// L'utilisateur a �t� supprim�
	SUPPRIME
}
