package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public Zone() {
		types = new ArrayList<>();
		noms = new ArrayList<>();
		comportements = new ArrayList<>();
}
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getNoms() {
		return noms;
	}

	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	public List<String> getComportements() {
		return comportements;
	}

	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}
	
	
}
