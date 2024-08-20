package com.practica1.analizador;

//import java.io;
import java_cup.runtime.*;
import com.practica1.utilities.ReportData;
import com.practica1.emuns.token.ErrorType;
%%

%public
%class lexerPractica1
%unicode
//%standalone
%line
%column
%cup

//---simbolos:
UNDERSCORE="_"
PLUS="+"
DASH="-"
ASTERISK="*"
SLASH="/"
OPAR="("
CPAR=")"
COMMA=","
DOT="."
//conjuntos
DIGITO = [0-9]
LETRAS = [a-zA-Z]

//Tokens de palabras reservadas
//---funciones:
GFKR=graficar
ANMR=animar
//figuras:
CIR=circulo
CUAD=cuadrado
RECT=rectangulo
LINE=linea
POLI=poligono
//---colores:
RED=rojo
BLUE=azul
GREEN=verde
YELLOW=amarillo
WHITE=blanco
PINK=rosa|rosado
PURPLE=morado|purpura
BROWN=cafe
BLACK=negro
//---animacion:
//LINE = linea
CURVE=curva
OBJECT=objeto
BEFORE=anterior

//---espacios y saltos de linea
//SALTOLINEA=\n
//ESPA=\s
//TAB=\t
WHITESPACE=[\t\f\s]|{LINETERMIANTOR}
LINETERMIANTOR=\r|\n|\r\n
//objetos para el analizador sintactico
%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol (int type){
        return new Symbol (type, yyline, yycolumn);
    }
    private Symbol symbol (int type, Object value){
        return new Symbol (type, yyline, yycolumn, value);
    }
%}

%eofval{
    return symbol(sym.EOF);
%eofval}

%%
// @formatter:off
<YYINITIAL> {

    {OPAR}     {return symbol(sym.OPPAR, yytext());}
    {CPAR}     {return symbol(sym.CLPAR, yytext());}
    {DASH}     {return symbol(sym.DASH, yytext());}
    {PLUS}     {return symbol(sym.PLUS, yytext());}
    {COMMA}    {return symbol(sym.COMMA, yytext());}
    {ASTERISK} {return symbol(sym.ASTER, yytext());}
    {SLASH}    {return symbol(sym.SLASH, yytext());}

    {GFKR}      {return symbol(sym.GRAPH, yytext());}//aqui se generan la expresiones regular
    {ANMR}      {return symbol(sym.ANIME, yytext());}
    {CIR}       {return symbol(sym.CIRCLE, yytext());}
    {CUAD}      {return symbol(sym.SQUARE, yytext());}
    {LINE}      {return symbol(sym.LINE, yytext());}
    {RECT}      {return symbol(sym.RECTA, yytext());}
    {POLI}      {return symbol(sym.POLY, yytext());}
    {CURVE}     {return symbol(sym.CURVE, yytext());}
    {OBJECT}    {return symbol(sym.OBJECT, yytext());}
    {BEFORE}    {return symbol(sym.BEFORE, yytext());}

    {RED}       {return symbol(sym.RED, yytext());}
    {BLUE}      {return symbol(sym.BLUE, yytext());}
    {YELLOW}    {return symbol(sym.YELLOW, yytext());}
    {GREEN}     {return symbol(sym.GREEN, yytext());}
    {BROWN}     {return symbol(sym.BROWN, yytext());}
    {PINK}      {return symbol(sym.PINK, yytext());}
    {PURPLE}    {return symbol(sym.PURPLE, yytext());}
    {BLACK}     {return symbol(sym.BLACK, yytext());}
    {WHITE}     {return symbol(sym.WHITE, yytext());}

    {DIGITO}+{DOT}{DIGITO}+   {return symbol(sym.DECIMAL, yytext());}
    {DIGITO}+   {return symbol(sym.NUM, yytext());}
    {LETRAS}({LETRAS}|{DIGITO}|{UNDERSCORE})*  {return symbol(sym.ID, yytext());}

}
// @formatter:on
// para los saltos de linea. Estos se supone que se van a ignorar
//    {SALTOLINEA}      {}
//    {ESPA}      {}
//    {TAB}       {}
    {WHITESPACE}    {}
// PARA CUALQUIER OTRO SIMBOLO QUE NO ESTE CONTEMPALDO DENTRO DE LA GRAMATICA
    .       {   System.err.println("warning: Unreconized character: '" + yytext()+"'  --ignored at line: "+(yyline+1));
                ReportData.addError(ErrorType.LEXICO, (yyline+1),(yycolumn+1), yytext(), "El simbolo no pertenece al lenguaje"  );}



