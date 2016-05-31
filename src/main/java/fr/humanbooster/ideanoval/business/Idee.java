package fr.humanbooster.ideanoval.business;
// Generated 13 avr. 2016 14:47:43 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Idee generated by hbm2java
 */
@Entity
@Table(name = "idee")
public class Idee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4681883234380565087L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIdee;
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private IdeeCategorie categorie;

	@Column(name = "titre", nullable = false, length = 120)
	private String titre;
	
	@Column(name = "description", nullable = false, length = 16777215)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name = "dateCreation", nullable = false, length = 19)
	private Date dateCreation;

	@Column(name = "estDesactivee", nullable = false)
	private Boolean estDesactivee;

	@Column(name = "nombreTops")
	private int nombreTops;
	@Column(name = "nombreFlops")
	private int nombreFlops;

	@Column(name = "urlImage")
	private String urlImage;

	@Column(name = "alerteidees")
	private boolean estIdeeAlerte;
	
	// Une idee genere un ensemble d'alertes
	@OneToMany
	List<AlerteIdee> alerteIdees;
	
	@OneToMany(mappedBy ="idee")
	private List<Vote> votes;

	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;


	public Idee(IdeeCategorie categorie, String titre, String description, Date dateCreation, Boolean estDesactivee,
			int nombreTops, int nombreFlops, String urlImage, boolean estIdeeAlerte, List<AlerteIdee> alerteIdees,
			List<Vote> votes, List<Commentaire> commentaires) {
		super();
		this.categorie = categorie;
		this.titre = titre;
		this.description = description;
		this.dateCreation = dateCreation;
		this.estDesactivee = estDesactivee;
		this.nombreTops = nombreTops;
		this.nombreFlops = nombreFlops;
		this.urlImage = urlImage;
		this.estIdeeAlerte = estIdeeAlerte;
		this.alerteIdees = alerteIdees;
		this.votes = votes;
		this.commentaires = commentaires;
	}



	public boolean isEstIdeeAlerte() {
		return estIdeeAlerte;
	}



	public void setEstIdeeAlerte(boolean estIdeeAlerte) {
		this.estIdeeAlerte = estIdeeAlerte;
	}



	public List<AlerteIdee> getAlerteIdees() {
		return alerteIdees;
	}



	public void setAlerteIdees(List<AlerteIdee> alerteIdees) {
		this.alerteIdees = alerteIdees;
	}



	public List<Commentaire> getCommentaires() {
		return commentaires;
	}



	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@OneToMany(mappedBy ="idee")
	private List<Commentaire> commentaires;
	
	public Idee() {
	}



	public int getIdIdee() {
		return idIdee;
	}

	public void setIdIdee(int idIdee) {
		this.idIdee = idIdee;
	}

	public IdeeCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(IdeeCategorie categorie) {
		this.categorie = categorie;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Boolean getEstDesactivee() {
		return estDesactivee;
	}

	public void setEstDesactivee(Boolean estDesactivee) {
		this.estDesactivee = estDesactivee;
	}

	public int getNombreTops() {
		return nombreTops;
	}

	public void setNombreTops(int nombreTops) {
		this.nombreTops = nombreTops;
	}

	public int getNombreFlops() {
		return nombreFlops;
	}

	public void setNombreFlops(int nombreFlops) {
		this.nombreFlops = nombreFlops;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}


	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

}
