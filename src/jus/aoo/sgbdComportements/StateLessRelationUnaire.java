package jus.aoo.sgbdComportements;

import jus.aoo.sgbdComposants._Schema;

public abstract class StateLessRelationUnaire extends StateLessRelation {
	protected final _Relation r;
	/**
	 * @param nom
	 * @param schema
	 * @param r
	 * @require r!=null
	 */
	public StateLessRelationUnaire(String nom, _Schema schema, _Relation r) {
		super(nom, schema);
		this.r=r;
	}
}
