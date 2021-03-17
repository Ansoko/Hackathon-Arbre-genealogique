package ArbreGenealogique;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// création du tableau d'arbre
		Arbre2[] tabArbre = new Arbre2[3];
		// Arbre pour les tests

		// famille Beirao
		Individu ind = new Individu("Ludovic", "Beirao", "Troyes", " ", "etudiante", false, false, 21, 4, 1983);
		Individu ind1 = new Individu("Candice", "Beirao", "Troyes", "Troyes", "policiere", true, true, 04, 11, 1976);
		Individu ind2 = new Individu("Philippe", "Beirao", "Troyes", "Troyes", "policier", false, true, 29, 01, 1960);
		Individu ind3 = new Individu("Camille", "Beirao", "Troyes", "Nancy", "programmeuse", true, true, 22, 7, 1972);
		Individu ind4 = new Individu("Jérome", "Beirao", "Troyes", " ", "architecte", false, false, 6, 12, 1970);
		Individu ind5 = new Individu("Charles", "Beirao", "Troyes", " ", "facteur", false, false, 30, 05, 1977);
		Individu ind6 = new Individu("Julien", "Beirao", "Troyes", " ", "coiffeur", false, false, 21, 02, 1980);
		Individu ind7 = new Individu("Alain", "Cossin", "gondreville", " ", "gendarme", false, false, 21, 03, 1980);
		Individu ind8 = new Individu("Christophe", "Cossin", "gondreville", " ", "acteur", false, false, 13, 01, 1975);
		Individu ind9 = new Individu("Gerard", "Cossin", "gondreville", " ", "chanteur", false, false, 11, 06, 1985);
		Individu ind10 = new Individu("Kenny", "Melz", "Nancy", " ", "informaticien", false, false, 13, 8, 1987);
		Individu ind12 = new Individu("Camille", "Melz", "Nancy", "Nancy", "professeur", true, true, 30, 8, 1986);
		Individu ind13 = new Individu("Jean", "Melz", "Nancy", " ", "eleve en primaire", false, false, 2, 12, 2000);
		Individu ind14 = new Individu("Pierre", "Melz", "Nancy", " ", "eleve au college", false, false, 7, 03, 1997);
		Individu ind11 = new Individu("Paul", "Cholley", "Paris", " ", "ingénieur", false, false, 9, 02, 1996);

		Couple c = new Couple("marie", "Batkowski", "Karine", 21, 06, 1965, 0, 0, 0);
		ind2.addCouple(c);
		Couple c1 = new Couple("pacse", "Dupont", "Louise", 3, 9, 1980, 0, 0, 0);
		ind5.addCouple(c1);
		Couple c2 = new Couple("divorce", "Cossin", "Henri", 12, 7, 1974, 14, 5, 1981);
		ind1.addCouple(c2);
		Couple c3 = new Couple("marie", "Louth", "Alex", 10, 10, 1975, 0, 0, 0);
		ind3.addCouple(c3);
		Couple c4 = new Couple("marie", "Rabault", "Faustine", 26, 11, 1983, 0, 0, 0);
		ind7.addCouple(c4);
		Couple c5 = new Couple("separe", "Santa", "Elisa", 8, 8, 1988, 1, 11, 2001);
		ind10.addCouple(c5);
		Couple c6 = new Couple("marie", "Cholley", "Jérome", 2, 1, 1990, 0, 0, 0);
		ind12.addCouple(c6);

		Arbre2 aBeirao = new Arbre2();
		Arbre2 a1 = new Arbre2();
		Arbre2 a2 = new Arbre2();
		Arbre2 a3 = new Arbre2();
		Arbre2 a4 = new Arbre2();
		Arbre2 a5 = new Arbre2();
		Arbre2 a6 = new Arbre2();
		Arbre2 a7 = new Arbre2();
		Arbre2 a8 = new Arbre2();
		Arbre2 a9 = new Arbre2();
		Arbre2 a10 = new Arbre2();
		Arbre2 a11 = new Arbre2();
		Arbre2 a12 = new Arbre2();
		Arbre2 a13 = new Arbre2();
		Arbre2 a14 = new Arbre2();

		a9.COMPOSER(ind14, new Arbre2(), new Arbre2());
		a8.COMPOSER(ind13, new Arbre2(), a9);
		a7.COMPOSER(ind11, new Arbre2(), new Arbre2());
		a6.COMPOSER(ind12, a7, new Arbre2());
		a5.COMPOSER(ind10, a8, a6);
		a4.COMPOSER(ind4, new Arbre2(), new Arbre2());
		a3.COMPOSER(ind3, a5, a4);
		a2.COMPOSER(ind9, new Arbre2(), new Arbre2());
		a1.COMPOSER(ind8, new Arbre2(), new Arbre2());
		a10.COMPOSER(ind7, a2, a1);
		a11.COMPOSER(ind1, a10, a3);
		a12.COMPOSER(ind6, new Arbre2(), new Arbre2());
		a13.COMPOSER(ind, new Arbre2(), a12);
		a14.COMPOSER(ind5, a13, a11);
		aBeirao.COMPOSER(ind2, a14, new Arbre2());

		// Famille Bouché
		Individu ind15 = new Individu("Marie", "Bouché", "Saint-die", "Nancy", "Peintre", true, true, 1, 5, 1950);
		Individu ind16 = new Individu("Pierre", "Bouché", "Saint-die", " ", "Géologue", false, false, 25, 2, 1972);
		Individu ind17 = new Individu("Valentine", "Bouché", "Saint-die", " ", "Super-Heroïne", true, false, 30, 9,
				1998);
		Individu ind18 = new Individu("Hugo", "Lignier", "Luneville", " ", "Sportif de Haut Niveau", false, false, 30,
				11, 1973);
		Individu ind19 = new Individu("Tom", "Lignier", "Luneville", " ", "Cascadeur", false, false, 12, 7, 1981);
		Individu ind20 = new Individu("Lois", "Lignier", "Luneville", " ", "Collégien", false, false, 26, 3, 2001);
		Individu ind21 = new Individu("Guillaume", "Barthelemy", "Bar-le-Duc", " ", "Clown", false, false, 21, 8, 2000);

		Couple c15 = new Couple("divorcé", "Bouché", "Joseph", 2, 2, 1952, 26, 2, 1972);
		Couple c151 = new Couple("marié", "Lignier", "Roger", 7, 5, 1972, 0, 0, 0);
		ind15.addCouple(c15);
		ind15.addCouple(c151);
		Couple c16 = new Couple("pacsé", "Bentz", "Florence", 15, 8, 1978, 0, 0, 0);
		ind16.addCouple(c16);
		Couple c17 = new Couple("marié", "Barthelemy", "Hervé", 18, 11, 2005, 0, 0, 0);
		ind17.addCouple(c17);
		Couple c18 = new Couple("marié", "Robert", "Sébastien", 3, 7, 1976, 0, 0, 0);
		ind18.addCouple(c18);

		Arbre2 aBouche = new Arbre2();
		Arbre2 aBouche1 = new Arbre2();
		Arbre2 aBouche2 = new Arbre2();
		Arbre2 aBouche3 = new Arbre2();
		Arbre2 aBouche4 = new Arbre2();
		Arbre2 aBouche5 = new Arbre2();
		Arbre2 aBouche6 = new Arbre2();
		aBouche6.COMPOSER(ind19, new Arbre2(), new Arbre2());
		aBouche5.COMPOSER(ind20, new Arbre2(), new Arbre2());
		aBouche4.COMPOSER(ind18, aBouche5, aBouche6);
		aBouche3.COMPOSER(ind21, new Arbre2(), new Arbre2());
		aBouche2.COMPOSER(ind17, aBouche3, new Arbre2());
		aBouche1.COMPOSER(ind16, aBouche2, aBouche4);
		aBouche.COMPOSER(ind15, aBouche1, new Arbre2());

		// Famille Koch
		Individu ind22 = new Individu("Laurent", "Koch", "Nancy", " ", "Sage-Femme", false, false, 2, 4, 1952);
		Individu ind23 = new Individu("Stéphane", "Koch", "Nancy", " ", "Journaliste", false, false, 5, 12, 1966);
		Individu ind24 = new Individu("Louise", "Koch", "Nancy", " ", "Policière", true, false, 15, 7, 1972);
		Individu ind25 = new Individu("Eloïse", "Koch", "Nancy", " ", "Journaliste", true, false, 23, 9, 1967);
		Individu ind26 = new Individu("Julien", "Cheveau", "Nancy", " ", "Gamer", false, false, 14, 3, 1999);
		Individu ind27 = new Individu("Anne-Sophie", "Koch", "Nancy", "Nancy", "Artiste peintre", true, true, 19, 7,
				1976);

		Couple c22 = new Couple("séparé", "Artois", "Stella", 16, 5, 1956, 17, 5, 1956);
		ind22.addCouple(c22);
		Couple c23 = new Couple("divorcé", "Monteiro", "Kelly", 18, 10, 1968, 20, 2, 1970);
		ind23.addCouple(c23);
		Couple c24 = new Couple("marié", "Cheveau", "Kenny", 29, 12, 1980, 0, 0, 0);
		ind24.addCouple(c24);

		Arbre2 aKoch = new Arbre2();
		Arbre2 aKoch1 = new Arbre2();
		Arbre2 aKoch2 = new Arbre2();
		Arbre2 aKoch3 = new Arbre2();
		Arbre2 aKoch4 = new Arbre2();
		Arbre2 aKoch5 = new Arbre2();
		aKoch5.COMPOSER(ind27, new Arbre2(), new Arbre2());
		aKoch4.COMPOSER(ind26, new Arbre2(), new Arbre2());
		aKoch3.COMPOSER(ind24, aKoch4, aKoch5);
		aKoch2.COMPOSER(ind25, new Arbre2(), new Arbre2());
		aKoch1.COMPOSER(ind23, aKoch3, aKoch2);
		aKoch.COMPOSER(ind22, aKoch1, new Arbre2());

		// initialisation du tableau d'arbre
		tabArbre[0] = aBouche;
		tabArbre[1] = aBeirao;
		tabArbre[2] = aKoch;

		ind2.afficherEnfantsNiveauN(aBeirao.personneExiste(ind2), 2);
		//System.out.println(ind7.plusVieuxCousinsN(aBeirao, 2));
		
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Combien d'arbres voulez vous rentrez ?");
		int nb = sc.nextInt();
		Arbre2[] tabA = new Arbre2[nb];
		int var = afficherMenu();
		
		switch (var) {
		case 0:
			for (int i = 0; i < tabA.length; i++) {
				tabA[i] = new Arbre2();
				System.out.println("Quel est l'ancetre ultime ?");
				Individu ancetre = new Individu();
				tabA[i].COMPOSER(ancetre, new Arbre2(), new Arbre2());
				tabA[i].creation(tabA[i]);
			}
			break;
		case 1:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			int rep = sc.nextInt();
			System.out.println("a qui voulez vous ajouter un conjoint? (son nom, prenom, date de naissane(jour, mois, annee");
			String n = sc.nextLine();
			String p = sc.nextLine();
			int j =sc.nextInt();
			int m =sc.nextInt();
			int a =sc.nextInt();
			Individu individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			tabA[rep].ajoutConjoint(tabA[rep], tabA[rep].personneExiste(individu).RACINE());
			break;
		case 2:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			System.out.println("a qui voulez vous ajouter un enfant? (son nom, prenom, date de naissane(jour, mois, annee");
			n = sc.nextLine();
			p = sc.nextLine();
			j =sc.nextInt();
			m =sc.nextInt();
			a =sc.nextInt();
			individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			System.out.println("Qui est l'enfant");
			Individu individu1 = new Individu ();
			tabA[rep].ajoutEnfant(tabA[rep], tabA[rep].personneExiste(individu).RACINE(), individu1);
			break;
		case 3:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			System.out.println("Qui chezchez vous (son nom, prenom, date de naissane(jour, mois, annee");
			n = sc.nextLine();
			p = sc.nextLine();
			j =sc.nextInt();
			m =sc.nextInt();
			a =sc.nextInt();
			individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			tabA[rep].personneExiste(individu);
			break;
		case 4:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			tabA[rep].vivant(tabA[rep]);
			break;
		case 5:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			System.out.println("De qui voulez vous voir les enfants (son nom, prenom, date de naissane(jour, mois, annee");
			n = sc.nextLine();
			p = sc.nextLine();
			j =sc.nextInt();
			m =sc.nextInt();
			a =sc.nextInt();
			individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			tabA[rep].personneExiste(individu).RACINE().affichageEnfant(tabA[rep]);
			break;
		case 6:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			System.out.println("De quel niveau voulez vous voir les enfants?");
			int n1 = sc.nextInt();
			System.out.println("De qui voulez vous voir les enfants (son nom, prenom, date de naissane(jour, mois, annee)");
			n = sc.nextLine();
			p = sc.nextLine();
			j =sc.nextInt();
			m =sc.nextInt();
			a =sc.nextInt();
			individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			tabA[rep].personneExiste(individu).RACINE().afficherEnfantsNiveauN(tabA[rep], n1);
			break;
		case 7:
			for (int i = 0; i < tabA.length; i++) {
				System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
			}
			System.out.println("Quel arbre voulez vous?");
			rep = sc.nextInt();
			System.out.println("De qui voulez vous savoir le nombre de descendants(son nom, prenom, date de naissane (jour, mois, annee)");
			n = sc.nextLine();
			p = sc.nextLine();
			j =sc.nextInt();
			m =sc.nextInt();
			a =sc.nextInt();
			individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
			tabA[rep].personneExiste(individu).RACINE().afficherEnfantsNiveauN(tabA[rep], n1);
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		
		case 15:for (int i = 0; i < tabA.length; i++) {
			System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
		}
		System.out.println("Quel arbre voulez vous?");
		rep = sc.nextInt();
		tabA[rep].incoherence(tabA[rep].RACINE().getDateNaissance());
			break;
		
		case 16:
			break;
		
		case 17:for (int i = 0; i < tabA.length; i++) {
			System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
		}
		System.out.println("Quel arbre voulez vous?");
		rep = sc.nextInt();
		System.out.println("De qui voulez-vous connaître le(s) conjoint(s) ? (son nom, prenom, date de naissane(jour, mois, annee");
		n = sc.nextLine();
		p = sc.nextLine();
		j =sc.nextInt();
		m =sc.nextInt();
		a =sc.nextInt();
		individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
		individu = tabA[rep].personneExiste(individu).RACINE();
		tabA[rep].affichagePlusJeune(individu);
			
			break;
		
		case 18:
			for (int i = 0; i < tabA.length; i++) {
			System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
		}
		System.out.println("Quel arbre voulez vous?");
		rep = sc.nextInt();
		tabA[rep].sansDescendance(tabA[rep]);
			break;
		
		case 19:for (int i = 0; i < tabA.length; i++) {
			System.out.println("i : " + tabA[i].RACINE().getPrenom() + " "+ tabA[i].RACINE().getPrenom());
		}
		System.out.println("Quel arbre voulez vous?");
		rep = sc.nextInt();
		System.out.println("De qui voulez-vous connaître le(s) conjoint(s) ? (son nom, prenom, date de naissane(jour, mois, annee");
		n = sc.nextLine();
		p = sc.nextLine();
		j =sc.nextInt();
		m =sc.nextInt();
		a =sc.nextInt();
		individu = new Individu (n,p," ", "","" ,false, false, j, m , a);
		individu = tabA[rep].personneExiste(individu).RACINE();
		tabA[rep].affichageConjoint(tabA[rep], individu);
			break;
		
		case 20:
			System.out.println("L'arbre le plus grand est l'arbre de "+ plusGrandArbre(tabA).RACINE().getPrenom()+ " "+plusGrandArbre(tabA).RACINE().getNom());
			break;
		
		default:
			System.out.println("Default");
		}*/
	}


	/*
	 * Afficher Menu
	 * 
	 * @return x le choix de l'utilisateur
	 */
	public static int afficherMenu() {
		System.out.println("100. Quitter");
		System.out.println("0. Initialiser un tableau d'arbre");
		System.out.println("1. Ajouter le conjoint d’une personne donnée dans un arbre");
		System.out.println("2. Ajouter l'enfant	d’une personne donnée dans un arbre");
		System.out.println("3. Rechercher l’existence d’une personne (nom et prénom) donnée dans un arbre donné");
		System.out.println("4. Rechercher les personnes encore vivantes dans un arbre généalogique");
		System.out.println("5. Afficher les enfants d’une personne donnée dans un arbre donné");
		System.out.println(
				"6. Afficher les enfants d’un niveau n d’une personne donnée (ceux de nivea 1 sont les enfants, ceux de niveau 2 sont les	petits-enfants)");
		System.out.println("7. Rechercher le nombre de descendants d’une personne dans un arbre donné");
		System.out.println(
				"8. Rechercher la ou des personnes ayant eu le plus grand nombre d’enfants en considérant tous les arbres généalogiques disponibles");
		System.out.println("9. Afficher les cousins	d’une personne");
		System.out.println("10. Afficher toutes les personnes nées entre deux dates données dans un arbre donné");
		System.out.println("11. Deux personnes sont-elles ancêtre/descendant l’une de l’autre ?");
		System.out.println("12. Afficher le plus vieux cousin de degré 1 (relié par un parent dans l’arbre)");
		System.out.println("13. Afficher le plus vieux cousin de degré 2 (relié par un grand-parent	dans	l’arbre)");
		System.out.println("14. Afficher le plus vieux cousin de degré n");
		System.out.println(
				"15. Rechercher et afficher les incohérences dans l’arbre généalogique : un enfant né avant un de ses parents.");
		System.out.println("16. Afficher les héritiers d'une personne");
		System.out.println("17. Afficher les frères et demi-frères plus jeunes d’une personne donnée.");
		System.out.println("18. Afficher les personnes sans descendance.");
		System.out.println("19. Afficher les conjoints d’une personne donnée.");
		System.out.println(
				"20. Déterminer l'arbre généalogique le plus volumineux en nombre de descendants parmi tous les arbres connus.");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

	/*
	 * Connaitre la personne qui a le plus d'enfants dans le tableau d'arbre
	 * 
	 * @param tab le tableau d'arbre
	 */
	public static void maxEnfantsGeneral(Arbre2[] tab) {
		Arbre2 stock = new Arbre2();
		Arbre2 stock1 = new Arbre2();
		Arbre2 pereUltime = new Arbre2();
		int max = 0;
		for (int i = 0; i < tab.length; i++) {
			int maxStock = 0;
			stock1 = tab[i].maxEnfants(stock, maxStock);
			maxStock = tab[i].max;
			System.out.println(maxStock);
			if (max < maxStock) {
				max = maxStock;
				pereUltime.cloner(stock1);
			}
		}
		while (!pereUltime.VIDE()) {
			System.out.println(pereUltime.RACINE().getNom() + " " + pereUltime.RACINE().getPrenom());
			pereUltime = pereUltime.FD();
		}
		System.out.println(" ont le plus grand nom d'enfants : " + max);
	}

	/**
	 * @param tabArbre tableau des arbres généalogiques
	 * @return l'arbre le plus grand
	 */
	public static Arbre2 plusGrandArbre(Arbre2 tabArbre[]) {
		Arbre2 arbre = new Arbre2();
		int taille, i;

		if (tabArbre.length > 0) {
			taille = tabArbre[0].RACINE().nbDescendants(tabArbre[0]);
			arbre = tabArbre[0];

			for (i = 0; i < tabArbre.length; i++) {
				if (tabArbre[i].RACINE().nbDescendants(tabArbre[i]) > taille) {
					taille = tabArbre[i].RACINE().nbDescendants(tabArbre[i]);
					arbre = tabArbre[i];
				}
			}
		}
		return arbre;
	}

}