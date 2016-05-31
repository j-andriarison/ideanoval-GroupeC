package fr.humanbooster.ideanoval.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneclassementutilisateur")
public class LigneClassementUtilisateur extends LigneClassement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLigneClassementUtilisateur;
	
	@ManyToOne
	@JoinColumn(name="classementbrains")
	private ClassementBrains classementBrains;
	
	private Utilisateur utilisateur;

	public LigneClassementUtilisateur() {
		super();
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public int getIdLigneClassementUtilisateur() {
		return idLigneClassementUtilisateur;
	}

	public void setIdLigneClassementUtilisateur(int idLigneClassementUtilisateur) {
		this.idLigneClassementUtilisateur = idLigneClassementUtilisateur;
	}

	public ClassementBrains getClassementBrains() {
		return classementBrains;
	}

	public void setClassementBrains(ClassementBrains classementBrains) {
		this.classementBrains = classementBrains;
	}

	public LigneClassementUtilisateur(int position, ClassementBrains classementBrains, Utilisateur utilisateur) {
		super(position);
		this.classementBrains = classementBrains;
		this.utilisateur = utilisateur;
	}


}
