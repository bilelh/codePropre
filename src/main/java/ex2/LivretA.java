package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Ce constructeur est utilis� pour cr�er un compte de type Livret A
	 * @param solde repr�sente le solde du compte
	 * @param decouvert  repr�sente le d�couvert autoris�
	 * @param tauxRemuneration  repr�sente le taux de r�mun�ration du livret A
	 */
	public LivretA( double solde,double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		decouvert = 0;
	  	this.tauxRemuneration = getTauxRemuneration();
	}
	
	/** Cette methode applique la r�mun�ration annuelle du livret A
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
