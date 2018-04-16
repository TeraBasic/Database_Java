/* Generated By:JavaCC: Do not edit this line. SQLParser.java */
package javaCC;
import jus.aoo.sgbdComportements._Relation;
import jus.aoo.sgbdComportements.Identity;
import jus.aoo.sgbdComportements.Predicat;
import jus.aoo.sgbdComportements.Projection;
import jus.aoo.sgbdComportements.Selection;
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
import java.util.List;

import jus.aoo.sgbdTypes.VOID;
import jus.aoo.sgbdComposants.Schema;

import java.util.ArrayList;
import java.util.List;
public class SQLParser implements SQLParserConstants {
  public static void main(String args []) throws ParseException
  {
    SQLParser parser = new SQLParser(System.in);
    //SimpleNode node = parser.CreateViewStatement();
    //node.dump(" ");
    _Relation r;
    // = new Relation();
     _Schema sc = (_Schema) new Schema(
                        new Attribut("C0", (TYPE) INTEGER.type, true),
                        new Attribut("C1", (TYPE) STRING.type, false),
                        new Attribut("C2", (TYPE) STRING.type, false),
                        new Attribut("C3", (TYPE) BOOLEAN.type, false),
                        new Attribut("C4", (TYPE) DATE.type, false),
                        new Attribut("C5", (TYPE) FLOAT.type, false),
                        new Attribut("C6", (TYPE) CHARACTER.type, false));

        StateFullRelation r1 = new StateFullMemoryRelation("RELATION", sc);

        r1.add(new Tuple(1, "MORAT", "PHILIPPE",false,"01/01/1995",17.5,'A'));
        r1.add(new Tuple(2, "CUEDARI", "IMELDA",true,"02/02/1995",10.5,'B'));
        r1.add(new Tuple(3, "BRUNET", "ROMAIN",false,"03/03/1995",11.5,'C'));
        r1.add(new Tuple(4, "AIDARA", "SIDI MOHAMED",false,"04/04/1995",12.5,'D'));
        r1.add(new Tuple(5, "LAKHYARI", "MOHAMMED SAID",false,"05/05/1995",13.5,'E'));
        r1.add(new Tuple(6, "YI", "LI",false,"06/06/1995",14.5,'F'));
        System.out.println("Card:"+r1.cardinalite());

    while (true)
    {
      System.out.println("Reading from standard input...");
      System.out.print("Enter an expression SQL SELECT;:");
      try
      {
        /*switch (SQLParser.SelectStatment())        {          case 0:           System.out.println("OK.");          break;          //case 1 :           //System.out.println("Goodbye.");          //break;          default :           break;select C1,C2 from r1;        }*/
                r = SQLParser.SelectStatment();
                 for (_Tuple t : r) {
                                for (Object o : t) {
                                        System.out.print(o + " ");
                                }
                                System.out.println("je suis yi");
                        }
                System.out.println("OK.");
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        SQLParser.ReInit(System.in);
      }
      catch (Error e)
      {
    	  System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public int one_line() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
    case CONSTANT:
    case 23:
      sum();
      jj_consume_token(SEMICOLON);
    {if (true) return 0;}
      break;
    case SEMICOLON:
      jj_consume_token(SEMICOLON);
    {if (true) return 1;}
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public void sum() throws ParseException {
    term();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      term();
    }
  }

  static final public void term() throws ParseException {
    unary();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      unary();
    }
  }

  static final public void unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
      jj_consume_token(MINUS);
      element();
      break;
    case CONSTANT:
    case 23:
      element();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CONSTANT:
      jj_consume_token(CONSTANT);
      break;
    case 23:
      jj_consume_token(23);
      sum();
      jj_consume_token(24);
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/*
create view :CREATE VIEW V1 AS SELECT COL1 FROM T1 WITH CASCADED/LOCAL CHECK OPTION;
*/
  static final public int CreateViewStatement() throws ParseException {
    jj_consume_token(CREATE);
    jj_consume_token(VIEW);
    jj_consume_token(Id);
    jj_consume_token(AS);
    SelectStatment();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WITH:
      jj_consume_token(WITH);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CASCADED:
      case LOCAL:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case CASCADED:
          jj_consume_token(CASCADED);
          break;
        case LOCAL:
          jj_consume_token(LOCAL);
          break;
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
      jj_consume_token(CHECK);
      jj_consume_token(OPTION);
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    jj_consume_token(SEMICOLON);
    jj_consume_token(0);
    {if (true) return 0;}
    throw new Error("Missing return statement in function");
  }

  static final public _Relation SelectStatment() throws ParseException {
                             Token t; List<Attribut> l;
    jj_consume_token(SELECT);
    l = SCHEMA();
    jj_consume_token(FROM);
    t = jj_consume_token(Id);
    jj_consume_token(SEMICOLON);
                                                  {if (true) return projetction.createProjection(t.image,l);}
    throw new Error("Missing return statement in function");
  }

  static final public List<Attribut > SCHEMA() throws ParseException {
                          Token t; List<Attribut > l = new ArrayList<Attribut >();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MULTIPLY:
      jj_consume_token(MULTIPLY);
       {if (true) return l;}
      break;
    case Id:
      t = jj_consume_token(Id);
            l.add(new Attribut(t.image,VOID.type,true));
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 25:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_3;
        }
        jj_consume_token(25);
        jj_consume_token(Id);
                                                                      l.add(new Attribut(t.image,VOID.type,false));
      }
                                                                                                                         {if (true) return l;}
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SQLParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xa00240,0x60,0x60,0x180,0x180,0xa00040,0xa00000,0x30000,0x30000,0x8000,0x2000000,0x100080,};
   }

  /** Constructor with InputStream. */
  public SQLParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SQLParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SQLParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SQLParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SQLParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SQLParser(SQLParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SQLParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[26];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 26; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
