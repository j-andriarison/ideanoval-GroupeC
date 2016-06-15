package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe qui représente un classement des idées les plus commentées.
 * 13 juin 2016 18:31:21
 * @author Frederic Moussiegt
 */
@Entity
@Table(name = "classementbuzzs")
@DiscriminatorValue("B")

public class ClassementBuzzs extends ClassementIdee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//	Constructeurs
	public ClassementBuzzs() {
		super();
	}
	public ClassementBuzzs(Date dateHeureCreation, List<LigneClassementIdee> ligneClassementIdee) {
		super(dateHeureCreation, ligneClassementIdee);
	}

	
	
}
