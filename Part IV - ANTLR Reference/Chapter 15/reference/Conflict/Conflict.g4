grammar Conflict;

stat: 'return' e ';' # ReturnStat
    | 'break'  ';'  # BreakStat
    ;

e   : e '*' e      # MultExpr
    | e '+' e      # AddExpr
    | INT          # Int
    ;

INT: [0-9]+;
