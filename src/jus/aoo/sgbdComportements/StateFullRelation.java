package jus.aoo.sgbdComportements;

import jus.aoo.sgbdComposants.Relation;
import jus.aoo.sgbdComposants._Schema;
import jus.aoo.sgbdComposants._Tuple;

public abstract class StateFullRelation extends Relation{
	public StateFullRelation(String nom, _Schema schema) {super(nom, schema);}
	/**
	 * Ajoute un tuple dans la relation (attention pas de doublon)
	 * @require !contains(t)
	 * @param t le tuple à ajouter
	 */
	public abstract void add(_Tuple t);

	
}
