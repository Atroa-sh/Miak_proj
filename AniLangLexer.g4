lexer grammar AniLangLexer;

fragment Lowercase
    : [a-z]
    ;
fragment Uppercase
    : [A-Z]
    ;
fragment PositiveDigit
    : [1-9]
    ;
fragment Digit
    : [0-9]
    ;

Open_Parenthesis        : '(';
Close_Parenthesis       : ')';

Open_Bracket            : '{';
Close_Bracket           : '}';

Open_Square_Bracket     : '[';
Close_Square_Bracket    : ']';

Dot                     : '.';
Comma                   : ',';
Semicolon               : ';';

TypeSeparator           : '::';
Assign                  : '=';

fragment True           : 'true';
fragment False          : 'false';

fragment Lesser         : '<';
fragment Greater        : '>';
fragment Leq            : '<=';
fragment Geq            : '>=';
fragment Equals         : '==';
ComparationToken        : (Lesser | Greater | Leq | Geq | Equals);

Not                     : '!';

Plus                    : '+';
Minus                   : '-';

fragment Star           : '*';
fragment Slash          : '/';
fragment Mod            : '%';

Star_Slash_Mod          : (Star | Slash | Mod);

Power                    : '**';

And                     : 'and';
Or                      : 'or';

Then                    : 'then';
End                     : 'end';

If                      : 'if';
Else_If                 : 'else if';
Else                    : 'else';

For                     : 'for';
While                   : 'while';

Outer                   : 'outer';

Return                  : 'return';
Break                   : 'break';
Continue                : 'continue';

Print                   : 'print';
Println                 : 'println';

CreateScene             : 'createScene';
CreateBox               : 'createBox';
BuildScene              : 'buildScene';

Type
    : 'int' | 'bool' | 'string' | 'double';

White_Sign
    : (' ' | '\n' | '\r' | '\t')+ -> skip
    ;

Int
    : PositiveDigit(Digit)* | '0'
    ;
Double
    : PositiveDigit(Digit)*'.'(Digit)* | '0.'(Digit)*
    ;
Number
    : (Int | Double)
    ;
Bool
    : (False | True)
    ;
Id : (Lowercase | Uppercase) (Lowercase | Uppercase | Digit)*;

Comment
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> channel(HIDDEN)
    ;