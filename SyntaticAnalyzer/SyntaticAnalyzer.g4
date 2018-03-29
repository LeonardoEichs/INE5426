grammar SyntaticAnalyzer;

import AMZ_lex;

type : ( INT | BOOLEAN | STRING | DOUBLE | VOID | OBJECT ) ;

declaration : type ID (LSQUARE NUMBER RSQUARE)*;

