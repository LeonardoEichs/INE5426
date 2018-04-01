grammar AMZ_synt;

import AMZ_lex;

/*
 * ROOT:
 */
 /* TODO import file */
eval : /* import_file* */ function_block* ;

/*
 * COMMON:
 */

declaration : type id_optional_array ;
type : (INT | BOOLEAN | STRING | DOUBLE | VOID | OBJECT) ;
id_optional_array : ID array_position* ;
array_position : LSQUARE NUMBER RSQUARE ;

/*
 * EXPRESSION:
 */

// Operator precedence based on c++
unary_operator : NOT | ADD | MINUS ;
arithmetic_binary_op_higher_prec : STAR | SLASH | MOD ;
arithmetic_binary_op_lower_prec : ADD | MINUS ;
comparison_op_higher_prec : GREATER | GREATEREQUAL | LESS | LESSEQUAL ;
comparison_op_lower_prec : EQUAL | NOTEQUAL ;
logic_binary_op_higher_prec : AND ;
logic_binary_op_lower_prec : OR ;

expression :  // higher precedence rules come first
  LPAREN expression RPAREN |
  (value | ID | function_call) array_position* (DOT id_optional_array)* |
  unary_operator expression |
  expression  arithmetic_binary_op_higher_prec   expression |
  expression  arithmetic_binary_op_lower_prec    expression |
  expression  comparison_op_higher_prec          expression |
  expression  comparison_op_lower_prec           expression |
  expression  logic_binary_op_higher_prec        expression |
  expression  logic_binary_op_lower_prec         expression ;


value : NUMBER | STRING_LITERAL | object_literal | array_literal | TRUE | FALSE ;

function_call : ID (LPAREN arguments RPAREN) ;
arguments : (expression (COMMA expression)*)? ;

object_literal : LCURLY (object_element (COMMA object_element)*)? RCURLY ;
object_element : declaration COLON expression ;

array_literal : LSQUARE (expression (COMMA expression)*)? RSQUARE;

/*
 * COMMANDS:
 */

command : simple_command SEMICO | block_command ;
/*
 * TODO QUESTION
 * can we set a value inside an object? E.g.: obj.val = 1
 * if so, then change "id_optional_array" by "id_optional_array (DOT id_optional_array)*" in simple_command
 */
simple_command :
  expression |
  declaration EQUALS expression |
  declaration |
  id_optional_array EQUALS expression |
  BREAK |
  RETURN expression? ;
block_command : while_block | if_block | for_block | switch_block;
command_block : LCURLY command* RCURLY;

while_block : WHILE LPAREN expression RPAREN command_block ;

for_block : FOR LPAREN simple_command? SEMICO expression? SEMICO simple_command? RPAREN command_block ;

if_block : IF LPAREN expression RPAREN command_block
  (ELSE IF LPAREN expression RPAREN command_block)*
  (ELSE command_block)? ;

/* TODO switch, case and default*/
/* QUESTION can parameter be an expression? */
switch_block : SWITCH ;

function_block : declaration LPAREN parameters RPAREN command_block ;
parameters : (declaration (COMMA declaration)*)? ;
