package jus.aoo.sgbdComportements;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jus.aoo.sgbdComposants._Schema;
import jus.aoo.sgbdComposants._Tuple;

public class Selection extends StateLessRelationUnaire  {

	private final Predicat p ;
	
	public Selection(_Relation r,_Schema schema,Predicat p) {
		super("Selection(" + r.name() + ")",schema, r);
		this.p=p;
	}

	@Override
	public long cardinalite() {
		return r.cardinalite();
	}

	@Override
	public Iterator<_Tuple> iterator() {
		
		return new Iterator<_Tuple>() {
			Iterator<_Tuple> it = r.iterator();
			private _Tuple next;
			private boolean hasNext=true;
			
			@Override public boolean hasNext() {return hasNext;}
			
			@Override public _Tuple next() {				
				if(!hasNext()) throw new NoSuchElementException();
				_Tuple temp = next;
				hasNext = getNext();
				return temp;
			}
			
			private boolean getNext(){
				if(!it.hasNext()) return false;
				next = (_Tuple) it.next();
				while(it.hasNext() && !p.test(next))
				{ 
					next = (_Tuple) 
					it.next(); 
				}
				
				if(p.test(it.next())) { return true ; }
				return false;
			}
		};
	}
	

}
