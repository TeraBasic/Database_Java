
import jus.aoo.sgbdComportements.Identity;
import jus.aoo.sgbdComportements.Predicat;
import jus.aoo.sgbdComportements.Projection;
import jus.aoo.sgbdComportements.Selection;
import jus.aoo.sgbdComportements.Selection2;
import jus.aoo.sgbdComportements.StateFullMemoryRelation;
import jus.aoo.sgbdComportements.StateFullRelation;
import jus.aoo.sgbdComposants.Attribut;
import jus.aoo.sgbdComposants.Tuple;
import jus.aoo.sgbdComposants._Schema;
import jus.aoo.sgbdComposants._Tuple;
import jus.aoo.sgbdTypes.BOOLEAN;
import jus.aoo.sgbdTypes.CHARACTER;
import jus.aoo.sgbdTypes.DATE;
import jus.aoo.sgbdTypes.FLOAT;
import jus.aoo.sgbdTypes.INTEGER;
import jus.aoo.sgbdTypes.STRING;
import jus.aoo.sgbdTypes.TYPE;
import jus.aoo.sgbdComposants.Schema;


public class Test {

	public static void main(String[] args) {
		
		_Schema sc = (_Schema) new Schema(
				new Attribut("C0", (TYPE) INTEGER.type, true),
				new Attribut("C1", (TYPE) STRING.type, false), 
				new Attribut("C2", (TYPE) STRING.type, false),
				new Attribut("C3", (TYPE) BOOLEAN.type, false),
				new Attribut("C4", (TYPE) DATE.type, false),
				new Attribut("C5", (TYPE) FLOAT.type, false),
				new Attribut("C6", (TYPE) CHARACTER.type, false));
		
		StateFullRelation r = new StateFullMemoryRelation("RELATION", sc);
		
		r.add(new Tuple(1, "MORAT", "PHILIPPE",false,"01/01/1995",17.5,'A'));
		r.add(new Tuple(2, "CUEDARI", "IMELDA",true,"02/02/1995",10.5,'B'));
		r.add(new Tuple(3, "BRUNET", "ROMAIN",false,"03/03/1995",11.5,'C'));
		r.add(new Tuple(4, "AIDARA", "SIDI MOHAMED",false,"04/04/1995",12.5,'D'));
		r.add(new Tuple(5, "LAKHYARI", "MOHAMMED SAID",false,"05/05/1995",13.5,'E'));
		r.add(new Tuple(6, "YI", "LI",false,"06/06/1995",14.5,'F'));
		
		Identity id = new Identity(r);
		_Schema sc2 = new Schema(new Attribut("C0", (TYPE) INTEGER.type, true),new Attribut("C1", (TYPE) STRING.type, false));
		Projection pr = new Projection(r,sc2);
		Predicat p = new Predicat() {
			
			@Override
			public boolean test(_Tuple t) {
				
				if((Integer) t.get(0) == 5)
				return true;
				
				return false;
			}
		};
		
		Selection2 sl = new Selection2(r,sc2, p);
		
		for (_Tuple t : sl) {
			for (Object o : t) {
				System.out.print(o + " ");
			}
			System.out.println();
		}
	}
}
