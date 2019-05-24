package ex2;

/** Repr�sente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un d�couvert est autoris� seulement pour les comptes courants */
	private double decouvert;
	
	/** Ce constructeur est utilis� pour cr�er un compte bancaire
	 * @param solde repr�sente le solde du compte
	 * @param decouvert repr�sente le d�couvert autoris�
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Cette methode ajoute un montant au solde
	 * @param montant repr�sente le montant � ajouter au compte
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Cette methode d�bite un montant au solde d'un compte
	 * @param montant repr�sente le montant � d�biter au compte
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}
	}
	
	/** Getter pour solde
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}
	/** Setter
	 * @param solde le solde � enregistrer
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter pour decouvert
	 * @return decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter pour decouvert
	 * @param decouvert le decouvert autoris� � enregistrer
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
