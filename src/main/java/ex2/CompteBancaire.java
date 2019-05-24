package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** Ce constructeur est utilisé pour créer un compte bancaire
	 * @param solde représente le solde du compte
	 * @param decouvert représente le découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Cette methode ajoute un montant au solde
	 * @param montant représente le montant à ajouter au compte
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Cette methode débite un montant au solde d'un compte
	 * @param montant représente le montant à débiter au compte
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
	 * @param solde le solde à enregistrer
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
	 * @param decouvert le decouvert autorisé à enregistrer
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
