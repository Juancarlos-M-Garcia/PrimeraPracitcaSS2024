//package com.practica1.analizador;
//
//import java.io;
//import java_cup.runtime.*;

%%

%public
%class lexerPractica1
//%unicode
%standalone
%line
%column
//%cup

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
RECT=rectagunlo
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
//---espacios y saltos de linea
SALTOLINEA=\n
ESPA=\s
TAB=\t

//objetos para el analizador sintactico
//%{
//    StrignBuffer string = new StringBuffer();
//
//    private Symbol symbol (int type){
//        return new Symbol (type, yyline, yycolumn);
//    }
//    private Symbol symbol (int type, Object value){
//        return new Symbol (type, yyline, yycolumn, value);
//    }
//%}
//
//%eofval{
//    return symbol(ParserSym.EOF);
//%eofval}

%%
// @formatter:off
<YYINITIAL> {
    {GFKR}      {System.out.println("token Graficar: "+yytext());}//aqui se generan la expresiones regular
    {ANMR}      {System.out.println("token animar:"+ yytext() );}
    {CIR}       {System.out.println("token CIRCULO:"+ yytext() );}
    {CUAD}      {System.out.println("token CUADRADO:"+ yytext() );}
    {LINE}      {System.out.println("token LINEA:"+ yytext() );}
    {RECT}      {System.out.println("token RECTANGULO:"+ yytext() );}
    {POLI}      {System.out.println("token POLIGONO:"+ yytext() );}
    {CURVE}     {System.out.println("token CURVA:"+ yytext() );}
    {OBJECT}    {System.out.println("token OBJECTO:"+ yytext() );}
    {BEFORE}    {System.out.println("token ANTERIOR:"+ yytext() );}

    {RED}       {System.out.println("token ROJO:"+ yytext() );}
    {BLUE}      {System.out.println("token AZUL:"+ yytext() );}
    {YELLOW}    {System.out.println("token AMARILLO:"+ yytext() );}
    {GREEN}     {System.out.println("token VERDE:"+ yytext() );}
    {BROWN}     {System.out.println("token CAFE:"+ yytext() );}
    {PINK}      {System.out.println("token ROSA:"+ yytext() );}
    {PURPLE}    {System.out.println("token MORADO:"+ yytext() );}
    {BLACK}     {System.out.println("token NEGRO:"+ yytext() );}
    {WHITE}     {System.out.println("token BLANCO:"+ yytext() );}

    {DIGITO}+{DOT}{DIGITO}+   {System.out.println("token DECIMAL:"+ yytext() );}
    {DIGITO}+   {System.out.println("token NUMERO:"+ yytext() );}
    {LETRAS}({LETRAS}|{DIGITO}|{UNDERSCORE})*  {System.out.println("token ID:"+ yytext() );}

    {OPAR}     {System.out.println("token OPEN PAR"+yytext());}
    {CPAR}     {System.out.println("token CLOSE PAR"+yytext());}
    {DASH}     {System.out.println("token RESTA"+yytext());}
    {PLUS}     {System.out.println("token SUMA"+yytext());}
    {COMMA}    {System.out.println("token SUMA"+yytext());}
    {ASTERISK} {System.out.println("token Multiplica"+yytext());}
    {SLASH}    {System.out.println("token divide"+yytext());}
}
// @formatter:on
// para los saltos de linea. Estos se supone que se van a ignorar
    {SALTOLINEA}      {System.out.println("SALTO DE LINEA");}
    {ESPA}      {System.out.println("Espacio");}
    {TAB}       {System.out.println("Tabulacion");}

// PARA CUALQUIER OTRO SIMBOLO QUE NO ESTE CONTEMPALDO DENTRO DE LA GRAMATICA
    .       {System.out.println("ERROR!" + yytext());}



