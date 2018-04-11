package jus.aoo.sgbdComportements;


	import java.util.Iterator;
import java.util.NoSuchElementException;

import jus.aoo.sgbdComposants.Attribut;
	import jus.aoo.sgbdComposants.Schema;
	import jus.aoo.sgbdComposants.Tuple;
	import jus.aoo.sgbdComposants._Schema;
	import jus.aoo.sgbdComposants._Tuple;

	public class Selection2 extends StateLessRelationUnaire {

		private final int[] indexes ;
		private final Predicat p ;

		public Selection2(_Relation r, _Schema schema , Predicat p ) {
			super("Selection (" + r.name() + ")",schema, r);
			this.p = p ;
			indexes = new int[schema.getDegree()];
			for(int i =0; i<indexes.length;i++){
				indexes[i]=r.schema().get(schema.get(i));
			}
		}

		@Override
		public long cardinalite() {
			return r.cardinalite();
		}

		@Override
		public Iterator<_Tuple> iterator() {
			return new Iterator<_Tuple>() {
				private Iterator<_Tuple> ct = r.iterator();
				private _Tuple next;

				public boolean hasNext() {
					return ct.hasNext();
				}

				public _Tuple next() {
					Tuple t = (Tuple)ct.next();
					int a =0 ;
					Object[] x = new Object[indexes.length];
					for(int i=0; i<indexes.length;i++) { 
					  if(p.test(t)) 
					   {
						  x[i]=t.get(indexes[i]);
						  
					   }	
					}
					return new Tuple(x);
				}			
				
			};
		}
		
		
	}

