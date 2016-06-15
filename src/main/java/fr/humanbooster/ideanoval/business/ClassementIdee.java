package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Classe abstraite de classement d'idées. Elle hérite de la classe Classement.
 * 
 * @author Frederic Moussiegt
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeclassementidee")
public abstract class ClassementIdee extends Classement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClassementIdee;

	@OneToMany(mappedBy = "classementIdee", fetch = FetchType.EAGER)
	private List<LigneClassementIdee> ligneClassementIdee;

	//	Constructeurs
	public ClassementIdee() {
		super();
	}

	public ClassementIdee(Date dateHeureCreation, List<LigneClassementIdee> ligneClassementIdee) {
		super(dateHeureCreation);
		this.ligneClassementIdee = ligneClassementIdee;
	}

	//	Getters/setters
	public List<LigneClassementIdee> getLigneClassementIdee() {
		return ligneClassementIdee;
	}

	public void setLigneClassementIdee(List<LigneClassementIdee> ligneClassementIdee) {
		this.ligneClassementIdee = ligneClassementIdee;
	}

	public int getIdClassementIdee() {
		return idClassementIdee;
	}

	public void setIdClassementIdee(int idClassementIdee) {
		this.idClassementIdee = idClassementIdee;
	}

}
