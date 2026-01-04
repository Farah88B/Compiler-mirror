parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

<<<<<<< HEAD
/*  Program  */
=======
/* ========= Program ========= */
>>>>>>> oldrepo/finalPython
program
    : stmt* EOF                          #programRoot
    ;

<<<<<<< HEAD
/*  Statements */
=======
/* ========= Statements ========= */
>>>>>>> oldrepo/finalPython
stmt
    : importStmt                         #importStmtNode
    | assignmentStmt                     #assignStmtNode
    | augAssignStmt                      #augAssignStmtNode
    | globalStmt                         #globalStmtNode
    | returnStmt                         #returnStmtNode
    | ifStmt                             #ifStmtNode
    | whileStmt                          #whileStmtNode
    | forStmt                            #forStmtNode
    | functionDef                        #functionDefNode
    | classDef                           #classDefNode
    | routeDef                           #routeDefNode
    | controlStmt                        #controlStmtNode
    | exprStmt                           #exprStmtNode
    | emptyStmt                          #emptyStmtNode
    ;

<<<<<<< HEAD
/*  Empty */
=======
/* ========= Empty ========= */
>>>>>>> oldrepo/finalPython
emptyStmt
    : NEWLINE                            #emptyLine
    ;

<<<<<<< HEAD
/*  Import  */
=======
/* ========= Import ========= */
>>>>>>> oldrepo/finalPython
importStmt
    : FROM IDENTIFIER IMPORT IDENTIFIER (COMMA IDENTIFIER)* NEWLINE
                                        #fromImportNode
    ;

<<<<<<< HEAD
/* Assignment  */
=======
/* ========= Assignment ========= */
>>>>>>> oldrepo/finalPython
assignmentStmt
    : IDENTIFIER ASSIGN expression NEWLINE
                                        #simpleAssignNode
    ;

augAssignStmt
    : IDENTIFIER (PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN)
      expression NEWLINE
                                        #augAssignNode
    ;

<<<<<<< HEAD
/*  Global  */
=======
/* ========= Global ========= */
>>>>>>> oldrepo/finalPython
globalStmt
    : GLOBAL IDENTIFIER NEWLINE          #globalDeclNode
    ;

<<<<<<< HEAD
/* Decorator */
=======
/* ========= Decorator ========= */
>>>>>>> oldrepo/finalPython
routeDef
    : decorator functionDef              #decoratedFunctionNode
    ;

decorator
    : AT IDENTIFIER (DOT IDENTIFIER)* LPAREN argList? RPAREN NEWLINE
                                        #decoratorNode
    ;

<<<<<<< HEAD
/*  Function  */
=======
/* ========= Function ========= */
>>>>>>> oldrepo/finalPython
functionDef
    : DEF IDENTIFIER LPAREN paramList? RPAREN COLON block
                                        #functionNode
    ;

paramList
    : IDENTIFIER (COMMA IDENTIFIER)*     #paramListNode
    ;

<<<<<<< HEAD
/*  Class  */
=======
/* ========= Class ========= */
>>>>>>> oldrepo/finalPython
classDef
    : CLASS IDENTIFIER COLON block       #classNode
    ;

<<<<<<< HEAD
/*  Block */
=======
/* ========= Block ========= */
>>>>>>> oldrepo/finalPython
block
    : NEWLINE INDENT stmt+ DEDENT        #blockNode
    ;

<<<<<<< HEAD
/*  Control  */
=======
/* ========= Control ========= */
>>>>>>> oldrepo/finalPython
ifStmt
    : IF expression COLON block
      (ELIF expression COLON block)*
      (ELSE COLON block)?
                                        #ifElseNode
    ;

whileStmt
    : WHILE expression COLON block       #whileNode
    ;

forStmt
    : FOR IDENTIFIER IN expression COLON block
                                        #forNode
    ;

controlStmt
    : PASS NEWLINE                       #passNode
    | BREAK NEWLINE                      #breakNode
    | CONTINUE NEWLINE                   #continueNode
    ;

<<<<<<< HEAD
/*  Return  */
=======
/* ========= Return ========= */
>>>>>>> oldrepo/finalPython
returnStmt
    : RETURN expression? NEWLINE         #returnNode
    ;

<<<<<<< HEAD
/*  Expression Statement  */
=======
/* ========= Expression Statement ========= */
>>>>>>> oldrepo/finalPython
exprStmt
    : expression NEWLINE                 #expressionStmtNode
    ;

<<<<<<< HEAD
/*  Expressions  */
=======
/* ========= Expressions ========= */
>>>>>>> oldrepo/finalPython
expression
    : logicalExpr                        #expressionRoot
    ;

logicalExpr
    : comparisonExpr ((AND | OR) comparisonExpr)*
                                        #logicalExprNode
    ;

comparisonExpr
    : arithmeticExpr ((EQ | NEQ | LT | GT | LE | GE) arithmeticExpr)*
                                        #comparisonExprNode
    ;

arithmeticExpr
    : term ((PLUS | MINUS) term)*
                                        #arithmeticExprNode
    ;

term
    : factor ((MULT | DIV | MOD) factor)*
                                        #termNode
    ;

factor
    : NOT factor                         #notExpr
    | primary                            #factorPrimary
    ;

<<<<<<< HEAD
/*  Primary  */
=======
/* ========= Primary ========= */
>>>>>>> oldrepo/finalPython
primary
    : IDENTIFIER                         #identifierExpr
    | STRING                             #stringExpr
    | NUMBER                             #numberExpr
    | TRUE                               #trueExpr
    | FALSE                              #falseExpr
    | NONE                               #noneExpr
    | listLiteral                        #listExpr
    | dictLiteral                        #dictExpr
    | primary DOT IDENTIFIER             #attributeExpr
    | primary LBRACK expression RBRACK   #indexExpr
    | primary LPAREN argList? RPAREN     #callExpr
    | LPAREN expression RPAREN           #parenExpr
    ;

<<<<<<< HEAD
/*  List  */
=======
/* ========= List ========= */
>>>>>>> oldrepo/finalPython
listLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK
                                        #listLiteralNode
    ;

<<<<<<< HEAD
/*  Dict  */
=======
/* ========= Dict ========= */
>>>>>>> oldrepo/finalPython
dictLiteral
    : LBRACE (dictEntry (COMMA dictEntry)*)? RBRACE
                                        #dictLiteralNode
    ;

dictEntry
    : expression COLON expression        #dictEntryNode
    ;

<<<<<<< HEAD
/*  Arguments  */
=======
/* ========= Arguments ========= */
>>>>>>> oldrepo/finalPython
argList
    : argument (COMMA argument)*         #argListNode
    ;

argument
    : IDENTIFIER ASSIGN expression       #namedArgNode
    | expression                        #positionalArgNode
    ;
