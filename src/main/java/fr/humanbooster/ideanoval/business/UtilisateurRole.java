package fr.humanbooster.ideanoval.business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UtilisateurRole") //, uniqueConstraints = @UniqueConstraint(columnNames = { "idRole"}))

@NamedQuery(name = "utilisateur_role.findAll", query = "SELECT u FROM UtilisateurRole u")
public class UtilisateurRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5416019124485247961L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRoleUtilisateur", unique = true, nullable = false)
	private int idRoleUtilisateur;
	
    @Column(name = "roleUtilisateur", nullable=false, length=50)
	@OneToMany(mappedBy = "roleUtilisateur")
	private List<Utilisateur> utilisateurs;

	public int getIdRoleUtilisateur() {
		return idRoleUtilisateur;
	}

	public void setIdRoleUtilisateur(int idRoleUtilisateur) {
		this.idRoleUtilisateur = idRoleUtilisateur;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}


	public UtilisateurRole() {
	}
    
	public UtilisateurRole(int idRoleUtilisateur, List<Utilisateur> utilisateurs) {
		super();
		this.idRoleUtilisateur = idRoleUtilisateur;
		this.utilisateurs = utilisateurs;
	}
	@Override
	public String toString() {
		return "RoleUtilisateur [idRoleUtilisateur=" + idRoleUtilisateur + ", utilisateurs=" + utilisateurs + "]";
	}

}
