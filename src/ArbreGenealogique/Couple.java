package ArbreGenealogique;

import java.util.Scanner;

public class Couple {
	private String relation;
	private String nom;
	private String prenom;
	private Date dateUnion;
	private Date dateSeparation;

	/**
	 * Constructeur vide
	 * 
	 */
	public Couple() {
		System.out.println("Nom");
		Scanner sc = new Scanner(System.in);
		this.nom = sc.nextLine();
		System.out.println("Prénom");
		this.prenom = sc.nextLine();
		System.out.println("Relation ? pacse, separe, marie, divorce?");
		this.relation = sc.nextLine();
		System.out.println("Date union ?");
		if (this.relation == "separe" || this.relation == "divorce") {
			System.out.println("Date séparation?");
			this.dateSeparation = new Date();
		} else
			this.dateUnion = new Date();
	}

	/**
	 * Constructeur couple
	 * 
	 */
	public Couple(String relation, String nom, String prenom, int jour, int mois, int annee, int j, int m, int a) {
		this.relation = relation;
		this.nom = nom;
		this.prenom = prenom;
		this.dateUnion = new Date(jour, mois, annee);
		this.dateSeparation = new Date(j, m, a);
	}

	/*
	 * toString
	 */
	public String toString() {
		if (this.relation == "separe" || this.relation == "divorce") {
			return relation + " avec " + nom + " " + prenom + " le " + dateSeparation;
		} else
			return relation + " avec " + nom + " " + prenom + " le " + dateUnion;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateUnion
	 */
	public Date getDateUnion() {
		return dateUnion;
	}

	/**
	 * @param dateUnion the dateUnion to set
	 */
	public void setDateUnion(Date dateUnion) {
		this.dateUnion = dateUnion;
	}

	/**
	 * @return the dateSeparation
	 */
	public Date getDateSeparation() {
		return dateSeparation;
	}

	/**
	 * @param dateSeparation the dateSeparation to set
	 */
	public void setDateSeparation(Date dateSeparation) {
		this.dateSeparation = dateSeparation;
	}

}
