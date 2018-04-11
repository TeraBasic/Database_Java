package jus.aoo.sgbdComportements;

import jus.aoo.sgbdComposants._Schema;
import jus.aoo.sgbdComposants._Tuple;

public interface _Relation extends Iterable<_Tuple>{
	/**
	 *  le degre de la relation 
	 * @return le degre de la relation 
	 */
	public int degre();
	/**
	 * la cardinalité de la relation (un majorant)
	 * @return a cardinalité de la relation
	 */
	public long cardinalite();
	/**
	 * le nom de la relation
	 * @return le nom de la relation
	 */
	public String name();
	/**
	 * le schéma de la relation 
	 * @return le schéma de la relation 
	 */
	public _Schema schema();

}
