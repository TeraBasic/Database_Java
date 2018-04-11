package jus.aoo.sgbdComposants;
import java.util.Iterator;

import org.w3c.dom.Attr;

public class Schema implements _Schema {
    private final Attribut[] attributs;
    
    public Schema(Attribut... attr){
   	 this.attributs = attr;
    }
    
    public Attribut getNomAttribut(int index){
   	 return this.attributs[index];
    }
    
     public Iterator<Attribut> iterator() {
   	 return new Iterator<Attribut>() {
   		 private int index = 0;
   		 @Override public boolean hasNext() {return index<attributs.length;}
   		 @Override public Attribut next() {return attributs[index++];}
   	 };
    }
    public int getDegree() {return attributs.length;}

	@Override public Attribut get(int i) {return attributs[i];}

	@Override
	public int get(Attribut att) {
		for(int i= 0 ; i<attributs.length;i++ )
		{
			if(attributs[i].getNomAttribut().equals(att.getNomAttribut()))
			{
				return i;
			}
		}
		return -1;
	}
}

