package jus.aoo.sgbdComposants;


public interface _Schema extends Iterable<Attribut>{

    int getDegree();
    public Object getNomAttribut(int t);
	Attribut get(int i);
	int get(Attribut att);

}

