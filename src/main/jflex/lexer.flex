package com.practica1.analizador;
import java_cup.runtime.*

%%

%public
%class lexerPractica1
%line
%column


DIGITO = [0-9]
LETRAS = [a-zA-Z]

%type token
%eofval{
    return new token(constante.EOF, null, yyline, yycolumn, null)
%eofval}


%%
<YYINITIAL> {}//aqui se generan la expresiones regulares
/n {}// para los saltos de linea
.{}// para el manejo de todos lo errores



