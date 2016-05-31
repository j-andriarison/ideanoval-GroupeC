package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UtilisateurEtat") //, uniqueConstraints = @UniqueConstraint(columnNames = {"idEtat" }))

public class UtilisateurEtat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4032583092796700516L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEtatUtilisateur;
	
	@Column(name = "etatUtilisateur", nullable = false, length = 30)
	private String etatUtilisateur;
	
	@OneToMany(mappedBy = "etatUtilisateur")
	List<Utilisateur> utilisateurs;
	
	
	public UtilisateurEtat() {
	}
	public UtilisateurEtat(int idEtatUtilisateur, String etatUtilisateur) {
		super();
		this.idEtatUtilisateur = idEtatUtilisateur;
		this.etatUtilisateur = etatUtilisateur;
	}
	public String getEtatUtilisateur() {
		return etatUtilisateur;
	}
	public int getIdEtatUtilisateur() {
		return idEtatUtilisateur;
	}
	public void setEtatUtilisateur(String etatUtilisateur) {
		this.etatUtilisateur = etatUtilisateur;
	}
	public void setIdEtatUtilisateur(int idEtatUtilisateur) {
		this.idEtatUtilisateur = idEtatUtilisateur;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	@Override
	public String toString() {
		return "EtatUtilisateur [idEtatUtilisateur=" + idEtatUtilisateur + ", etatUtilisateur=" + etatUtilisateur + "]";
	}
	
	
}
