package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe abstraite à la base de tout classement. Elle contient l'heure et la
 * date de création du classement
 * 
 * @author Frederic Moussiegt
 *
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Classement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateHeureCreation", nullable = false, length = 19)
	private Date dateHeureCreation;

	//	Constructeurs
	public Classement() {
	}

	public Classement(Date dateHeureCreation) {
		super();
		this.dateHeureCreation = dateHeureCreation;
	}

	//	Getters/setters
	public Date getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(Date dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

}
