grammar ExprLR;

// Define operator precedence and associativity
expr
    : expr '^' expr
    | MULT
    | ADD
    | INT
    ;

MULT: '*' ;
ADD: '+' ;
INT: '0'..'9'+ ;
WS: [ \n]+ -> skip ;
