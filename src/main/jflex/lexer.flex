//package com.practica1.analizador;
//import java_cup.runtime.*;

%%

%public
%class lexerPractica1
%standalone
%line
%column


DIGITO = [0-9]
LETRAS = [a-zA-Z]
//Tokens de palabras reserVadas
//funciones:
GFKR=graficar
ANMR=animar
//figuras:
CIR=circulo
CUAD=cuadrado
RECT=rectagunlo
LINE=linea
POLI=poligono
//colores:
RED=rojo
BLUE=azul
GREEN=verde
YELLOW=amarillo
WHITE=blanco
PINK=rosa|rosado
PURPLE=morado|purpura
BROWN=cafe
BLACK=negro

//animacion:
//LINE = linea
CURVE=curva
OBJECT=objeto
BEFORE=anterior

//%type token
//%eofval{
//    System.out.println("error");
//%eofval}


%%

<YYINITIAL> {GFKR}  {System.out.println("token Graficar: "+yytext());}//aqui se generan la expresiones regular
            {ANMR}  {System.out.println("token animar:"+ yytext() );}
            {CIR}   {System.out.println("token CIRCULO:"+ yytext() );}
            {CUAD}  {System.out.println("token CUADRADO:"+ yytext() );}
            {LINE}  {System.out.println("token LINEA:"+ yytext() );}
            {RECT}  {System.out.println("token RECTANGULO:"+ yytext() );}
            {POLI}  {System.out.println("token POLIGONO:"+ yytext() );}
            {CURVE} {System.out.println("token CURVA:"+ yytext() );}
            {OBJECT}{System.out.println("token OBJECTO:"+ yytext() );}
            {BEFORE}{System.out.println("token ANTERIOR:"+ yytext() );}

            {RED}   {System.out.println("token ROJO:"+ yytext() );}
            {BLUE}  {System.out.println("token AZUL:"+ yytext() );}
            {YELLOW}{System.out.println("token AMARILLO:"+ yytext() );}
            {GREEN} {System.out.println("token VERDE:"+ yytext() );}
            {BROWN} {System.out.println("token CAFE:"+ yytext() );}
            {PINK}  {System.out.println("token ROSA:"+ yytext() );}
            {PURPLE}{System.out.println("token MORADO:"+ yytext() );}
            {BLACK} {System.out.println("token NEGRO:"+ yytext() );}
            {WHITE} {System.out.println("token BLANCO:"+ yytext() );}


            {DIGITO}+{System.out.println("token NUMERO:"+ yytext() );}
            {LETRAS}({LETRAS}|{DIGITO}|"_")*  {System.out.println("token ID:"+ yytext() );}


            "("     {System.out.println("token OPEN PAR"+yytext());}
            ")"     {System.out.println("token CLOSE PAR"+yytext());}
            "-"     {System.out.println("token RESTA"+yytext());}
            "+"     {System.out.println("token SUMA"+yytext());}
            ","     {System.out.println("token SUMA"+yytext());}
            "*"|{DIGITO}\s"("|")"\s{DIGITO}     {System.out.println("token Multiplica"+yytext());}
            "/"     {System.out.println("token divide"+yytext());}
            \n      {System.out.println("SALTO DE LINEA");}
            \s      {System.out.println("Espacio");}
// para los saltos de linea
            .       {System.out.println("error");}
// PARA CUALQUIER OTRO SIMBOLO QUE NO ESTE CONTEMPALDO DENTRO DE LA GRAMATICA



