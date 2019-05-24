package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA( double solde,double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		decouvert = 0;
	  	this.tauxRemuneration = getTauxRemuneration();
	}
	
	/** Cette methode applique la rémunération annuelle du livret A
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(getSolde() + getSolde()*tauxRemuneration/100) ;
	}
	
	/** Getter pour tauxRemuneration
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter pour tauxRemuneration
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
