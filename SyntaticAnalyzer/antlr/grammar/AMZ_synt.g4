grammar AMZ_synt;

import AMZ_lex;

/*
 * ROOT:
 */
eval : import_file* function_block* EOF ;
import_file: IMPORT STRING_LITERAL SEMICO ;

/*
 * COMMON:
 */

declaration : type ID array_position? ;
type : (INT | BOOLEAN | STRING | DOUBLE | VOID | OBJECT) ;
array_position : LSQUARE INTEGER RSQUARE ;

/*
 * EXPRESSION:
 */

// Operator precedence based on c++
unary_arithm_operator : ADD | MINUS ;
unary_bool_operator : NOT ;
arithmetic_binary_op_higher_prec : STAR | SLASH | MOD ;
arithmetic_binary_op_lower_prec : ADD | MINUS ;
comparison_op_higher_prec : GREATER | GREATEREQUAL | LESS | LESSEQUAL ;
comparison_op_lower_prec : EQUAL | NOTEQUAL ;
logic_binary_op_higher_prec : AND ;
logic_binary_op_lower_prec : OR ;

// higher precedence rules come first
expression
  : LPAREN expression RPAREN #ExpParen
  | (value | ID | function_call) array_position? object_id? #ExpExit
  | unary_arithm_operator expression #ExpUnaryArithm
  | unary_bool_operator expression #ExpUnaryBool
  | expression  arithmetic_binary_op_higher_prec   expression #ExpBinArithmH
  | expression  arithmetic_binary_op_lower_prec    expression #ExpBinArithmL
  | expression  comparison_op_higher_prec          expression #ExpBinCompH
  | expression  comparison_op_lower_prec           expression #ExpBinCompL
  | expression  logic_binary_op_higher_prec        expression #ExpBinLogicH
  | expression  logic_binary_op_lower_prec         expression #ExpBinLogicL
  ;


value : DOUBLE_LITERAL | INTEGER | STRING_LITERAL | object_literal | array_literal | boolean_value ;
boolean_value : TRUE | FALSE;
object_id : DOT ID array_position? object_id? ;

function_call : ID (LPAREN arguments RPAREN) ;
arguments : (expression (COMMA expression)*)? ;

object_literal : LCURLY (object_element (COMMA object_element)*)? RCURLY ;
object_element : declaration COLON expression ;

array_literal : LSQUARE (expression (COMMA expression)*)? RSQUARE;

/*
 * COMMANDS:
 */

command : simple_command SEMICO | block_command ;
simple_command :
  expression |
  declaration EQUALS expression |
  declaration |
  ID array_position? object_id? EQUALS expression |
  BREAK |
  RETURN expression? ;
block_command : while_block | if_block | for_block | switch_block;
command_block : LCURLY command* RCURLY;

while_block : WHILE LPAREN expression RPAREN command_block ;

for_block : FOR LPAREN simple_command? SEMICO expression? SEMICO simple_command? RPAREN command_block ;

if_block : IF LPAREN expression RPAREN command_block
  (ELSE IF LPAREN expression RPAREN command_block)*
  (ELSE command_block)? ;

switch_block : SWITCH LPAREN expression RPAREN
  LCURLY case_block* default_block case_block* RCURLY;
case_block : CASE LPAREN expression RPAREN command_block;
default_block : DEFAULT command_block;

function_block : declaration LPAREN parameters RPAREN command_block ;
parameters : (declaration (COMMA declaration)*)? ;
