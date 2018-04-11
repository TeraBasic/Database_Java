package jus.aoo.sgbdComportements;

import java.util.ArrayList;
import java.util.Iterator;

import jus.aoo.sgbdComposants._Schema;
import jus.aoo.sgbdComposants._Tuple;

public class StateFullMemoryRelation extends StateFullRelation {
	private final ArrayList <_Tuple> tuples;

	public StateFullMemoryRelation(String nom, _Schema schema) {
		super(nom, schema);
		tuples = new ArrayList<>();
	}

	public Iterator <_Tuple> iterator() {
		 return new Iterator<_Tuple>() {
			private int index = 0;	
			public _Tuple next() {
				_Tuple t = tuples.get(index);
				index++;
				return t;
			}	
			public boolean hasNext() {			
				return index < tuples.size();
			}
		};
	}
	@Override public long cardinalite() {return tuples.size();}
	@Override public void add(_Tuple t) {tuples.add(t);}
}
