
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.practica1.analizador;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\043\000\002\002\004\000\002\015\004\000\002\015" +
    "\003\000\002\002\004\000\002\002\004\000\002\002\003" +
    "\000\002\002\003\000\002\003\017\000\002\003\021\000" +
    "\002\003\023\000\002\004\016\000\002\005\003\000\002" +
    "\005\003\000\002\006\003\000\002\006\003\000\002\010" +
    "\003\000\002\010\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\011\004\000\002\011\003\000\002\012" +
    "\004\000\002\013\003\000\002\013\003\000\002\013\003" +
    "\000\002\013\003\000\002\014\003\000\002\014\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\010\003\006\004\012\005\007\001\002\000" +
    "\010\002\ufffb\004\ufffb\005\ufffb\001\002\000\010\002\ufffc" +
    "\004\ufffc\005\ufffc\001\002\000\006\004\012\005\007\001" +
    "\002\000\004\014\117\001\002\000\004\002\116\001\002" +
    "\000\010\002\uffff\004\012\005\007\001\002\000\014\006" +
    "\014\007\015\010\021\011\013\012\016\001\002\000\004" +
    "\032\075\001\002\000\004\032\ufff4\001\002\000\004\032" +
    "\ufff3\001\002\000\004\032\ufff2\001\002\000\004\032\062" +
    "\001\002\000\004\032\022\001\002\000\004\032\ufff1\001" +
    "\002\000\004\027\023\001\002\000\004\040\024\001\002" +
    "\000\006\030\025\031\030\001\002\000\016\033\uffe0\034" +
    "\uffe0\035\uffe0\036\uffe0\037\uffe0\040\uffe0\001\002\000\014" +
    "\034\033\035\035\036\032\037\034\040\031\001\002\000" +
    "\016\033\uffe6\034\uffe6\035\uffe6\036\uffe6\037\uffe6\040\uffe6" +
    "\001\002\000\016\033\uffdf\034\uffdf\035\uffdf\036\uffdf\037" +
    "\uffdf\040\uffdf\001\002\000\006\030\025\031\030\001\002" +
    "\000\006\030\uffe1\031\uffe1\001\002\000\006\030\uffe3\031" +
    "\uffe3\001\002\000\006\030\uffe2\031\uffe2\001\002\000\006" +
    "\030\uffe4\031\uffe4\001\002\000\006\030\025\031\030\001" +
    "\002\000\016\033\uffe7\034\uffe7\035\uffe7\036\uffe7\037\uffe7" +
    "\040\uffe7\001\002\000\016\033\uffe5\034\uffe5\035\uffe5\036" +
    "\uffe5\037\uffe5\040\uffe5\001\002\000\014\034\033\035\035" +
    "\036\032\037\034\040\042\001\002\000\006\030\025\031" +
    "\030\001\002\000\014\034\033\035\035\036\032\037\034" +
    "\040\044\001\002\000\006\030\025\031\030\001\002\000" +
    "\014\034\033\035\035\036\032\037\034\040\046\001\002" +
    "\000\024\016\057\017\054\020\055\021\047\022\052\023" +
    "\060\024\051\025\053\026\056\001\002\000\004\033\uffed" +
    "\001\002\000\004\033\061\001\002\000\004\033\uffe9\001" +
    "\002\000\004\033\uffee\001\002\000\004\033\uffec\001\002" +
    "\000\004\033\uffef\001\002\000\004\033\uffe8\001\002\000" +
    "\004\033\uffeb\001\002\000\004\033\uffea\001\002\000\004" +
    "\033\ufff0\001\002\000\010\002\ufff9\004\ufff9\005\ufff9\001" +
    "\002\000\004\027\063\001\002\000\004\040\064\001\002" +
    "\000\006\030\025\031\030\001\002\000\014\034\033\035" +
    "\035\036\032\037\034\040\066\001\002\000\006\030\025" +
    "\031\030\001\002\000\014\034\033\035\035\036\032\037" +
    "\034\040\070\001\002\000\006\030\025\031\030\001\002" +
    "\000\014\034\033\035\035\036\032\037\034\040\072\001" +
    "\002\000\024\016\057\017\054\020\055\021\047\022\052" +
    "\023\060\024\051\025\053\026\056\001\002\000\004\033" +
    "\074\001\002\000\010\002\ufffa\004\ufffa\005\ufffa\001\002" +
    "\000\004\027\076\001\002\000\004\040\077\001\002\000" +
    "\006\030\025\031\030\001\002\000\014\034\033\035\035" +
    "\036\032\037\034\040\101\001\002\000\006\030\025\031" +
    "\030\001\002\000\014\034\033\035\035\036\032\037\034" +
    "\040\103\001\002\000\006\030\025\031\030\001\002\000" +
    "\014\034\033\035\035\036\032\037\034\040\105\001\002" +
    "\000\006\030\025\031\030\001\002\000\014\034\033\035" +
    "\035\036\032\037\034\040\107\001\002\000\006\030\025" +
    "\031\030\001\002\000\014\034\033\035\035\036\032\037" +
    "\034\040\111\001\002\000\024\016\057\017\054\020\055" +
    "\021\047\022\052\023\060\024\051\025\053\026\056\001" +
    "\002\000\004\033\113\001\002\000\010\002\ufff8\004\ufff8" +
    "\005\ufff8\001\002\000\010\002\ufffd\004\ufffd\005\ufffd\001" +
    "\002\000\010\002\ufffe\004\ufffe\005\ufffe\001\002\000\004" +
    "\002\001\001\002\000\004\015\120\001\002\000\004\032" +
    "\121\001\002\000\006\012\123\013\124\001\002\000\004" +
    "\040\125\001\002\000\004\040\ufff6\001\002\000\004\040" +
    "\ufff5\001\002\000\006\030\025\031\030\001\002\000\014" +
    "\034\033\035\035\036\032\037\034\040\127\001\002\000" +
    "\006\030\025\031\030\001\002\000\014\034\033\035\035" +
    "\036\032\037\034\040\131\001\002\000\006\030\025\031" +
    "\030\001\002\000\014\033\133\034\033\035\035\036\032" +
    "\037\034\001\002\000\010\002\ufff7\004\ufff7\005\ufff7\001" +
    "\002\000\010\002\000\004\012\005\007\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\012\002\010\003\004\004\003\015\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\002\133" +
    "\003\004\004\003\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\003\114\004\113\001\001\000\006\006\016" +
    "\010\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\011\025\014\026\001\001\000\002\001\001" +
    "\000\006\012\036\013\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\011\040\014\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\037\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\012\036\013\035\001\001\000\006\011" +
    "\042\014\026\001\001\000\006\012\036\013\035\001\001" +
    "\000\006\011\044\014\026\001\001\000\006\012\036\013" +
    "\035\001\001\000\004\007\047\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\011\064" +
    "\014\026\001\001\000\006\012\036\013\035\001\001\000" +
    "\006\011\066\014\026\001\001\000\006\012\036\013\035" +
    "\001\001\000\006\011\070\014\026\001\001\000\006\012" +
    "\036\013\035\001\001\000\004\007\072\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\011\077\014\026\001\001\000\006\012\036" +
    "\013\035\001\001\000\006\011\101\014\026\001\001\000" +
    "\006\012\036\013\035\001\001\000\006\011\103\014\026" +
    "\001\001\000\006\012\036\013\035\001\001\000\006\011" +
    "\105\014\026\001\001\000\006\012\036\013\035\001\001" +
    "\000\006\011\107\014\026\001\001\000\006\012\036\013" +
    "\035\001\001\000\004\007\111\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\121\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\011\125\014\026\001\001\000\006" +
    "\012\036\013\035\001\001\000\006\011\127\014\026\001" +
    "\001\000\006\012\036\013\035\001\001\000\006\011\131" +
    "\014\026\001\001\000\006\012\036\013\035\001\001\000" +
    "\002\001\001\000\006\003\114\004\113\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private double resultado;
    private String datos;

    public void syntax_error(Symbol s){
        System.out.println("Error Sintáctico en la Línea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+".");
    }
    /**\
    * Método al que se llama cuando se identifica un error sintáctico en el que
    * ya no es posible una recuperación de errores.
    **/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error síntactico irrecuperable en la Línea " +
        (s.left)+ " Columna "+s.right+". Componente " + s.value + " no reconocido.");
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= i EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // i ::= error s 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("i",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // i ::= s 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("i",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // s ::= s gs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // s ::= s as 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // s ::= gs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // s ::= as 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // gs ::= GRAPH fig OPPAR ID COMMA int COMMA int COMMA int COMMA col CLPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gs",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // gs ::= GRAPH rec OPPAR ID COMMA int COMMA int COMMA int COMMA int COMMA col CLPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gs",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // gs ::= GRAPH POLY OPPAR ID COMMA int COMMA int COMMA int COMMA int COMMA int COMMA col CLPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gs",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // as ::= ANIME OBJECT BEFORE OPPAR ta COMMA int COMMA int COMMA int CLPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("as",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ta ::= LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ta",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ta ::= CURVE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ta",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // fig ::= CIRCLE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("fig",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // fig ::= SQUARE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("fig",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // rec ::= LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("rec",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // rec ::= RECTA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("rec",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // col ::= BLACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // col ::= BLUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // col ::= BROWN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // col ::= GREEN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // col ::= PINK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // col ::= PURPLE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // col ::= RED 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // col ::= WHITE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // col ::= YELLOW 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("col",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // int ::= int op 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("int",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // int ::= num 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("int",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // op ::= sig num 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // sig ::= PLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // sig ::= DASH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // sig ::= SLASH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // sig ::= ASTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sig",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // num ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("num",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // num ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("num",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
