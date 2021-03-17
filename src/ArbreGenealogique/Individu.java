package ArbreGenealogique;

import java.util.Arrays;
import java.util.Scanner;

public class Individu {
	private String prenom;
	private String nom;
	private String communeNaissance;
	private String communeEnterrement;
	private String profession;
	private boolean sexe;
	private boolean deces;
	private Couple[] couple;
	private Date dateNaissance;

	
	/**
	 * Cloner un individu
	 * 
	 * @param i 
	 */
	public void clonerI(Individu i) {
		this.prenom = i.prenom;
		this.nom = i.nom;
		this.communeNaissance = i.communeNaissance;
		this.communeEnterrement = i.communeEnterrement;
		this.profession = i.profession;
		this.sexe = i.sexe;
		this.deces = i.deces;
		this.couple = i.getCouple();
		this.dateNaissance = new Date(i.getDateNaissance().getJour(), i.getDateNaissance().getMois(), i.getDateNaissance().getAnnee());
	}
	/**
	 * Constructeur vide
	 * 
	 */
	public Individu() {
		System.out.println("Nom");
		Scanner sc = new Scanner(System.in);
		this.nom = sc.nextLine();
		System.out.println("Prénom");
		this.prenom = sc.nextLine();
		System.out.println("Commune de Naissance");
		this.communeNaissance = sc.nextLine();
		System.out.println("Date de Naissance");
		this.dateNaissance = new Date();
		System.out.println("Décédé ? pour oui ecrire 1 ou non ecrire 0");
		int rep = sc.nextInt();
		if (rep == 1) {
			this.deces = true;
			System.out.println("Commune de l'enterrement");
			this.communeEnterrement = sc.nextLine();
		} else
			this.deces = false;
		System.out.println("Profession");
		this.profession = sc.nextLine();
		System.out.println("Sexe ? 1 pour femme et 0 pour Homme");
		rep = sc.nextInt();
		if (rep == 1) {
			this.sexe = true;
		} else
			this.sexe = false;
		this.couple = new Couple[0];
		System.out.println("Combien de relation ");
		int nb = sc.nextInt();
		if (nb != 0) {
			for (int i = 0; i < nb; i++) {
				addCouple(new Couple());
			}
		}

	}

	/**
	 * Constructeur de chaque individu
	 * 
	 */
	public Individu(String prenom, String nom, String com1, String com2, String profession, boolean sexe, boolean deces,int jour, int mois, int annee) {
		this.prenom = prenom;
		this.nom = nom;
		this.communeNaissance = com1;
		this.communeEnterrement = com2;
		this.profession = profession;
		this.sexe = sexe;
		this.deces = deces;
		this.couple = new Couple[0];
		this.dateNaissance = new Date(jour, mois, annee);
	}

	/**
	 * Ajouter un couple à un individu
	 * 
	 */
	public void addCouple(Couple c) {
		int oldSize=this.couple.length;
		Couple[] newCouple = new Couple[oldSize + 1];
		for(int i =0; i< oldSize; i++) {
			newCouple[i] = this.couple[i];
		}
		newCouple[oldSize] = c;
		this.couple = newCouple;
	}
	
	/*
	 * toString
	 */
	public String toString() {
		String sexe1, deces1;
		if (sexe) {
			sexe1 = "Elle";
		} else
			sexe1 = "Il";
		if (deces) {
			deces1 = " Cependant cette personne est decedee. ";
		} else
			deces1 = " ";
		return sexe1 + " s'appelle " + prenom + " " + nom + ", né(e) à " + communeNaissance + " le " + dateNaissance
				+ ". " + sexe1 + " exerce la profession de " + profession + "." + deces1;
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
	 * @return the communeNaissance
	 */
	public String getCommuneNaissance() {
		return communeNaissance;
	}

	/**
	 * @param communeNaissance the communeNaissance to set
	 */
	public void setCommuneNaissance(String communeNaissance) {
		this.communeNaissance = communeNaissance;
	}

	/**
	 * @return the communeEnterrement
	 */
	public String getCommuneEnterrement() {
		return communeEnterrement;
	}

	/**
	 * @param communeEnterrement the communeEnterrement to set
	 */
	public void setCommuneEnterrement(String communeEnterrement) {
		this.communeEnterrement = communeEnterrement;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the sexe
	 */
	public boolean isSexe() {
		return sexe;
	}

	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	/**
	 * @return the deces
	 */
	public boolean isDeces() {
		return deces;
	}

	/**
	 * @param deces the deces to set
	 */
	public void setDeces(boolean deces) {
		this.deces = deces;
	}

	/**
	 * @return the couple
	 */
	public Couple[] getCouple() {
		return couple;
	}

	/**
	 * @param couple the couple to set
	 */
	public void setCouple(Couple[] couple) {
		this.couple = couple;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	/**
	 * 10) Affichage des cousins d'une personne
	 * @param arbreGene
	 */
	public void affichageCousins(Arbre2 arbreGene) {
		Arbre2 arbreE = new Arbre2();
		if(!arbreGene.personneExiste(this).VIDE()) {
			System.out.print("Ses cousins sont : ");
			arbreGene=arbreParents(arbreGene);
			while(!arbreGene.VIDE()) {
				if(arbreGene.FG().personneExiste(this).VIDE()) {
					arbreE = arbreGene.FG();
					while(!arbreE.VIDE()) {
						System.out.print(arbreE.RACINE().prenom + " "+ arbreE.RACINE().nom+", ");
						arbreE = arbreE.FD();
					}
				}
				arbreGene = arbreGene.FD();
			}
		}else {
			System.out.println("Cette personne n'existe pas !");
		}
	}
	
	/**
	 * 10 bis) Rend l'arbre des parents (et de tous ses frères) d'une personne donnée
	 * @param arbreGene
	 * @return Arbre2
	 */
	protected Arbre2 arbreParents(Arbre2 arbreGene) {
		Arbre2 aRetour = new Arbre2();
		boolean trouve=false;
		
		if(!arbreGene.personneExiste(this).VIDE()) {
			Arbre2 a2 = new Arbre2();
			Arbre2 a3 = new Arbre2();
			a3 = arbreGene;
			while(!a3.VIDE() && !trouve){
				a2 = a3.FG();
				if(!a2.personneExiste(this).VIDE()) { //l'individu recherché est dans cette partie de l'arbre !
					while(!trouve && !a2.VIDE()) {
						if(this.equals(a2.RACINE())) {
							aRetour = arbreGene;
							trouve = true;
						}else {
							a2 = a2.FD();
						}
					}
					if(!trouve) {
						aRetour = arbreParents(a3.FG());
						trouve = true;
					}
				}else {
					a2 = a2.FD();
				}
				a3 = a3.FD();
			}	
		}
		
		return aRetour;
	}
	/**
	 * 15) Affichage du plus vieux cousin de degré n
	 * @param a arbre dans lequel chercher
	 * @param n
	 */
	public void affichageCousinN(Arbre2 a, int n){
		Individu cousinVieux = new Individu(null,null,null,null,null, false, false,0, 0,0);
		//Individu indiv = new Individu(null,null,null,null,null, false, false,0, 0,0);
		//indiv.clonerI(this);
		//arbreParents(a).affichage();
		//System.out.println("Indiv est "+indiv.getPrenom());
		/*for(int i = 0; i < n; i++){
			a.cloner(arbreParents(a));
			System.out.println("voici l'arbre a : ");
			a.affichage();
			this.clonerI(a.RACINE());
			System.out.println("Indiv est "+getPrenom());
		}*/
		
		
		/*System.out.println("Indiv est "+a.RACINE().getPrenom());
		a=arbreParents(a);
		System.out.println("Indiv est "+a.RACINE().getPrenom());
		a.cloner(arbreParents(a));
		System.out.println("Indiv est "+a.RACINE().getPrenom());
		a.cloner(arbreParents(a));
		System.out.println("Indiv est "+a.RACINE().getPrenom());
		System.out.println("SALUTUTUTUU");*/
		
		cousinVieux = plusVieuxCousinsN(a, n);
		
		if(cousinVieux.getNom() != null){
			System.out.println("Le cousin le plus vieux est " + cousinVieux.getPrenom() + " " + cousinVieux.getNom());
		}
		else{
			System.out.println(getPrenom() + " " + getNom() + " n'as pas de cousins");
		}
	}

	
	/**
	 * 15 bis) rend le plus vieux cousin de degré n
	 * @param a
	 * @param n
	 * @return Individu
	 */
	public Individu plusVieuxCousinsN(Arbre2 a, int n){
		Arbre2 a2 = new Arbre2();
		Individu cousinVieux = new Individu(null,null,null,null,null, false, false,0, 0,0);
		if(n == 1){
			System.out.println("entrez dans le if ");
			while(cousinVieux != null) {
				//a = a.FG();
				if(!a.personneExiste(this).VIDE()){
					a2 = a.FD();
					while(!a2.VIDE()){
						if(cousinVieux.getDateNaissance() == null){
							cousinVieux = a2.RACINE();
						}else if(cousinVieux.getDateNaissance().comparateurDate(a2.RACINE().getDateNaissance())){
							cousinVieux = a2.RACINE();
						}
						a2 = a2.FG();
					}
				}
				a = a.FD();
			}
		} else if(n > 1){
			System.out.println("n>1");
			while(!a.VIDE()){
				System.out.println("WHILE n>1");
				if(cousinVieux.getPrenom() == null || cousinVieux.getDateNaissance().comparateurDate(plusVieuxCousinsN(a.FG(),(n - 1)).getDateNaissance())){
					cousinVieux = plusVieuxCousinsN(a.FG(), (n - 1));
				}
				a = a.FD();
			}
		}
		return cousinVieux;
	}
	
	/**
	* A placer dans Individu
	 * 6) Affichage des enfants d’une personne donnée dans un arbre donné
	 * @param arbreGene
	 */
	public void affichageEnfant(Arbre2 arbreGene) {
		arbreGene = arbreGene.personneExiste(this);
		
		if(!arbreGene.VIDE() && !arbreGene.personneExiste(this).FG().VIDE()) {
			arbreGene = arbreGene.personneExiste(this).FG();
			System.out.print(arbreGene.RACINE().prenom+" ");
			while(!arbreGene.FD().VIDE()) {
				System.out.print(arbreGene.FD().RACINE().prenom+"  ");
				arbreGene = arbreGene.FD();
			}
		}
	}


	/** Dans individu
	 * 7) Nécessite un arbre avec pour Racine l'individu
	 * @param a arbre avec pour racine l'individu duquel on veut afficher les enfants
	 * @param n rang auquel on veut aller
	 */
	public void afficherEnfantsNiveauN(Arbre2 a, int n){
		if(n == 1 && !a.VIDE()){
			while(!a.VIDE()){
				a.RACINE().affichageEnfant(a);
				a = a.FD();
			}
		}
		else if(n > 1){
			while(!a.VIDE()){
				afficherEnfantsNiveauN(a.FG(), (n - 1));
				if(this != a.RACINE()){
					a = a.FD();
				}
				else{
					a = new Arbre2();
				}
			}
		}
	}

	
}
