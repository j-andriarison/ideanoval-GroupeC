package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe qui représente un classement des idées les mieux votées.
 * Une idée est considérée meilleure selon les critères suivants :
 * 1. Pourcentage de «Top » le plus important parmi les votes
 * 2. (si égalité sur le premier critère): Nombre de votes total le plus important
 * 3. (si égalité sur les 2 premiers critères): Date de l’idée (la plus récente l’emporte)
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
