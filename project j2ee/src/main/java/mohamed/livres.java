package mohamed;

public class livres {
	private int id;
	private String titre;
	private String etiteur;
	private String auteur;
	private String Categorie;
	private String qte_stock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getEtiteur() {
		return etiteur;
	}
	public void setEtiteur(String etiteur) {
		this.etiteur = etiteur;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		this.Categorie = categorie;
	}
	public String getQte_stock() {
		return qte_stock;
	}
	public void setQte_stock(String qte_stock) {
		this.qte_stock = qte_stock;
	}
	
	
	public void livers (int id ,String titre ,String etiteur, String auteur, String Categorie, String qte_stock) {
		this.id=id;
		this.titre=titre;
		this.etiteur=etiteur;
		this.Categorie=Categorie;
		this.qte_stock=qte_stock;
	}
	
	
	

}
