package Exercice5;

public class Article {
	private int reference;
	private String nom;
	private float prix;
	private int quantite;

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Article(int reference, String nom, float prix, int quantite) {
		this.reference = reference;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public String toString() {
		return "L'article " + getNom() + " est enrigistr� avec la r�f�rence " + getReference() + " et est vendu � "
				+ getPrix() + ". La quantit� stock� est de " + getQuantite();
	}

}
