package fr.uvsq.coo.ex3_8;

public class Personnel implements Element{
	private final String nom;
	private final String prenom;
	private final String dateDeNaissance;
	private final String fonction;
	private final String numeroTel; 
	
	public static class Builder {
		private final String nom ;
		private final String prenom;
		
		//parametres optionels
		private String dateDeNaissance = "2015-01-01";
		private String fonction = "chomage";
		private String numeroTel = "00.00.00.00.00";
	
	
		public Builder(String nom, String prenom){
			this.nom = nom;
			this.prenom = prenom;
		}
	
		public Builder dateDeNaissance(String age){
			this.dateDeNaissance  = age;
			return this;
		}
		
		public Builder fonction(String fonction){
			this.fonction = fonction;
			return this;
		}
		
		public Builder numeroTel(String tel){
			this.numeroTel = tel;
			return this;
		}
	
		public Personnel build(){
			return new Personnel(this);
		}
	}
	
	private Personnel (Builder builder){
		nom = builder.nom;
		prenom = builder.prenom;
		
		//parametres optionels
		dateDeNaissance = builder.dateDeNaissance;
		fonction = builder.fonction;
		numeroTel = builder.numeroTel;
	}
	
	public void affichage(){
		System.out.println(" nom: " + this.nom + "\n prenom: " + this.prenom + "\n date de naissance: " + this.dateDeNaissance + "\n fonction: " + this.fonction + "\n tel: " + this.numeroTel + "\n");
	}
}