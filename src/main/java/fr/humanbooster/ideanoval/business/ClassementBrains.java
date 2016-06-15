package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe qui représente un classement des utilisateurs qui proposent le plus d'idées.
 * 13 juin 2016 18:31:56
 * 
 * @author Frederic Moussiegt
 */
@Entity
@Table(name = "classementbrains")
public class ClassementBrains extends Classement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClassementBrains;

	@OneToMany(mappedBy = "classementBrains", fetch = FetchType.EAGER)
	private List<LigneClassementUtilisateur> ligneClassementUtilisateurs;

	//	Constructeurs
	public ClassementBrains() {
	}

	public ClassementBrains(Date dateHeureCreation, List<LigneClassementUtilisateur> ligneClassementUtilisateurs) {
		super(dateHeureCreation);
		this.ligneClassementUtilisateurs = ligneClassementUtilisateurs;
	}

	//	Getters/setters
	public int getIdClassementBrains() {
		return idClassementBrains;
	}

	public void setIdClassementBrains(int idClassementBrains) {
		this.idClassementBrains = idClassementBrains;
	}

	public List<LigneClassementUtilisateur> getLigneClassementUtilisateurs() {
		return ligneClassementUtilisateurs;
	}

	public void setLigneClassementUtilisateurs(List<LigneClassementUtilisateur> ligneClassementUtilisateurs) {
		this.ligneClassementUtilisateurs = ligneClassementUtilisateurs;
	}

}
