package jus.aoo.sgbdComposants;

import jus.aoo.sgbdTypes.TYPE;

public class Attribut {

    private final String nom ;
    private final boolean estClePrimaire;
    private final TYPE type;
    // enum pk ,fk ,others
    
    public Attribut(String nomAttribut , TYPE type , boolean cle){
   	 this.nom = nomAttribut ;
   	 this.type = type ;
   	 this.estClePrimaire = cle ;
    }
   	 
    public String getNomAttribut(){
   	 return this.nom;
    }
    public TYPE getTypeAttribut(){
   	 return this.type;
    }
    public boolean estCle(){
   	 return this.estClePrimaire;
    }
    public String to_String(){
   	 return "Attribut [ nom : "+this.nom+", estClePrimaire : "+this.estClePrimaire+ ", Type : "+this.type.toString()+" ]";   		 
    }
    
}

