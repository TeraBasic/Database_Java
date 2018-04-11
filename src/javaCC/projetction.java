package javaCC;
//import jus.aoo.sgbdComportements.projection;
import java.util.List;

import jus.aoo.sgbdComportements.Projection;
import jus.aoo.sgbdComportements.StateFullMemoryRelation;
import jus.aoo.sgbdComportements.StateFullRelation;
import jus.aoo.sgbdComportements._Relation;
import jus.aoo.sgbdComposants.Attribut;
import jus.aoo.sgbdComposants.Schema;
import jus.aoo.sgbdComposants._Schema;

public class projetction {
	
	public static _Relation createProjection(String s,List<Attribut> l){
		_Relation r = null;
		_Schema sc ;
		Attribut[] la = new Attribut[l.size()];
		for(int i=0; i<l.size();i++) {
			la[i] = l.get(i);
		}
		if(l.size()==0) { sc = r.schema();
		}
		else {
			sc = new Schema(la);
		}
		r = new StateFullMemoryRelation(s, sc);
		 return new Projection(r,sc);
	//	return 
		
	}

}