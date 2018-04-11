package jus.aoo.sgbdComportements;

import java.util.Iterator;

import jus.aoo.sgbdComposants._Tuple;

public class Identity extends StateLessRelationUnaire{
	public Identity(_Relation r) {
		super("Identity("+r.name()+")", r.schema(), r);
	}

	public Iterator <_Tuple> iterator () {
		return new Iterator <_Tuple> (){
			private Iterator<_Tuple> ct = r.iterator();
			
			public boolean hasNext(){ return ct.hasNext();}		
			public _Tuple next() { return ct.next(); }
		};
	}

	@Override public long cardinalite() {return r.cardinalite();}

}
