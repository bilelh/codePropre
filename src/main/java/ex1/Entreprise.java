package ex1;

import java.util.Date;

/**
 * Classe qui initialise une entreprise
 * @author DIGINAMIC
 */
public class Entreprise {

	/** siret : numero siret de l'entreprise */
	public int siret;
	
	/** nom : nom de l'entreprise */
	public String nom;
	
	/** adresse : adresse de l'entreprise */
	public String adresse;
	
	/** dateCreation : date de création de l'entreprise */
	public Date dateCreation;
	
	/** capitalMax : capitale max de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Méthode qui affiche les informations de l'entrprise
	 *
	 * @return void 
	 */
	public void afficherInfosEntreprise(){
		System.out.println("Siret: "+ siret + "Nom: "+ nom + "Adresse: " + 
	adresse + "Date de création: "+ dateCreation + "capitaleMax: "+ CAPITAL_MAX );
	}
}
