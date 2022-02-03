parser grammar AniLangParser;

options
{
    tokenVocab=AniLangLexer;
}

program
    : (block_stat | stat_with_semicolon)*
    ;

id : Id ;

atom : id | Int | Double | Bool;

escape_statement
    : Break         #BreakStat
    | Return        #ReturnStat
    | Return expr   #ReturnValueStat
    | Continue      #ContinueStat
    ;

function_declaration
    : Type TypeSeparator Id Open_Parenthesis (|(Type TypeSeparator Id)|(Type TypeSeparator Id Comma)*(Type TypeSeparator Id)) Close_Parenthesis block
    ;

function_call
    : Id Open_Parenthesis (|(expr)|(expr Comma)*(expr)) Close_Parenthesis
    ;

expr
    : expr_1 ( Or expr_1 )*
    ;

expr_1
    : expr_2 ( And expr_2 )*
    ;

expr_2
    : expr_3 ( ComparationToken expr_3 )?
    ;

expr_3
    : expr_4 ( Minus expr_4 )*
    ;

expr_4
    : expr_5 ( Plus expr_5 )*
    ;

expr_5
    : expr_6 ( Star_Slash_Mod expr_6 )*
    ;

expr_6
    : unary_operator? expr_7
    ;

expr_7
    : expr_8 ( Power expr_8 )*
    ;

expr_8
    : atom
    | Outer id
    | function_call
    | Open_Parenthesis expr Close_Parenthesis
    ;

unary_operator
    : Not
    | Minus
    ;

declaration_stat
    : Type TypeSeparator Id (Assign expr)?
    ;

assignment_stat: (Outer)? Id Assign expr;

else_stat
    : Else block
    ;

else_if_stat
    : Else_If Open_Parenthesis expr Close_Parenthesis block
    ;

if_stat
    : If Open_Parenthesis expr Close_Parenthesis block else_if_stat* else_stat?
    ;

for_stat
    : For Open_Parenthesis ( assignment_stat | declaration_stat )? Semicolon
      expr Semicolon
      blockless_stat? Close_Parenthesis
      block;

while_stat
    : While Open_Parenthesis expr Close_Parenthesis block;

print : Print expr;
println : Println expr;

// sprawdzić, czy expr to int
// createScene(width, height)
createScene : CreateScene Open_Parenthesis expr Comma expr Close_Parenthesis;

// createCube(x_pos, y_pos, z_pos, x_size, y_size, z_size, r, g, b)
createBox : CreateBox Open_Parenthesis expr Comma expr Comma expr Comma expr Comma expr Comma expr Comma expr Comma expr Comma expr Close_Parenthesis;

buildScene : BuildScene Open_Parenthesis Close_Parenthesis;

block_stat
    : function_declaration
    | if_stat
    | for_stat
    | while_stat
    ;

blockless_stat
    : assignment_stat
    | declaration_stat
    | function_call
    | escape_statement
    | print
    | println
    | createScene
    | createBox
    | buildScene
    ;

stat_with_semicolon : blockless_stat Semicolon;

then    : Then  ;
end     : End   ;

block : then (|( block_stat | stat_with_semicolon )*) end;