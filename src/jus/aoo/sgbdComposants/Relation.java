package jus.aoo.sgbdComposants;

import jus.aoo.sgbdComportements._Relation;

public abstract class Relation implements _Relation{

	private final _Schema schema;
	private final String nom_relation;
	
	public Relation(String nom , _Schema schema){
		this.nom_relation = nom;
		this.schema = schema ;
	}
	@Override public int degre() {return schema.getDegree();}
	@Override public String name() {return nom_relation;}
	@Override public _Schema schema() { return schema;}
}
