package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe qui repr�sente un classement des id�es les mieux vot�es.
 * Une id�e est consid�r�e meilleure selon les crit�res suivants :
 * 1. Pourcentage de��Top ��le�plus important parmi les votes
 * 2. (si��galit�sur le premier�crit�re): Nombre�de votes total�le�plus�important
 * 3. (si �galit�sur les 2�premiers crit�res):�Date�de�l�id�e�(la�plus�r�cente l�emporte)
 * 
 * @author Frederic Moussiegt
 *
 */
@Entity
@Table(name = "classementtops")
@DiscriminatorValue("T")
public class ClassementTops extends ClassementIdee implements Serializable {

	private static final long serialVersionUID = 1L;

	//	Constructeurs
	public ClassementTops() {
		super();
	}

	public ClassementTops(Date dateHeureCreation, List<LigneClassementIdee> ligneClassementIdee) {
		super(dateHeureCreation, ligneClassementIdee);
	}

}
