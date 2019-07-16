package fr.dawan.projet1.poo.heritage;

import java.io.Serializable;

public class CompteB implements Serializable {

	//variables d'instances : propres à chaque objet
	private String numero;
	private double solde;
	
	//static désigne une variable ou une méthode de classe
	//partagée par toutes les instances
	private static int nbComptes;

	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws Exception {
		if(numero !=null && numero.length()>=14)
			this.numero = numero;
		else
			throw new Exception("Erreur : le numéro doit avoir 14carac min");
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		CompteB.nbComptes = nbComptes;
	}
	
	
	
	
}
