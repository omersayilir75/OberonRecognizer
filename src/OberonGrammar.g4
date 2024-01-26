grammar OberonGrammar;

//TODO: change definitions around so begin and end require the same IDs
moduleDefinition:
		MODULE Whitespace n=ID ';' Newline
		Whitespace declarations Newline
		Whitespace block
		'.'
		;

declarations:
		( procedureDeclaration | localDeclaration ) *
		;

procedureDeclaration:
		PROCEDURE Whitespace name=ID (pps=procedureParameters)? (export=STAR)? ';' Newline
		(Whitespace (procedureDeclaration|localDeclaration))* Newline
		(Whitespace endname=block) Newline
		(Whitespace)*? ';'
		;

//procedureHeader
//	:
//PROCEDURE name=ID (pps=procedureParameters)? (export=STAR)? ';'
//		;

procedureParameters :
		'('(p+=procedureParameter Whitespace ';' Whitespace )* p+=procedureParameter ')'
		;

procedureParameter
		:
		(VAR Whitespace)? (names+=ID Whitespace ','  Whitespace )* names+=ID Whitespace ':' Whitespace t=typeName
		;

typeName
		: (INTEGER | BOOLEAN | ID)			# simpleTypeName
		| ARRAY Whitespace e=expression Whitespace OF Whitespace t=typeName		# arrayType
		| RECORD Whitespace r=recordTypeNameElements Whitespace END						# recordTypeName
		;

recordTypeNameElements
		: recordElement (';' Whitespace recordElement)*
		;

recordElement
		: (ids+=ID ',' Whitespace)* ids+=ID Whitespace ':' Whitespace t=typeName
		;

localDeclaration
		: variableDeclaration
		| constDeclaration
		| typeDeclaration
		;

typeDeclaration:
		TYPE Whitespace
		  singleTypeDeclaration+
		  ;

singleTypeDeclaration:
		  id=ID export=STAR? Whitespace '=' Whitespace t=typeName ';' Newline
		  ;

variableDeclaration:
		VAR Whitespace
		  singleVariableDeclaration+
		  ;

singleVariableDeclaration:
			(v+=exportableID ',' Whitespace)* v+=exportableID Whitespace ':' Whitespace t=typeName ';' Newline
			;

exportableID:
			ID (export=STAR)?
			;

constDeclaration:
		CONST Whitespace
		  constDeclarationElement+
		  ;

constDeclarationElement:
		c=ID export=STAR? Whitespace '=' Whitespace e=expression ';' Newline
		;

block
		:(BEGIN Newline statements Newline Whitespace)?  END Whitespace ID
		;

statements:
		Whitespace statement
		( ';' Newline Whitespace statement )*
		;

statement
		: assign_statement
		| procCall_statement
		| while_statement
		| repeat_statement
		| if_statement
		|
		;

procCall_statement
		: id=ID ('(' cp=callParameters ')')?
		;

assign_statement
		: id=ID s=selector Whitespace ':=' Whitespace r=expression
		;

while_statement
		: WHILE Whitespace r=expression Whitespace DO Newline
		  statements Newline
		  END
		;

repeat_statement
		: REPEAT Whitespace
		  statements Newline
		  Whitespace UNTIL Whitespace r=expression
		;

if_statement
		: IF Whitespace c+=expression Whitespace THEN Newline
			  statements Newline
		  ( Whitespace ELSIF Whitespace c+=expression Whitespace THEN Newline
			  statements Newline
		  )*
		  (Whitespace ELSE Newline
			  statements Newline
		  )?
		  Whitespace END
		;

// Expressions
expression
	: op=(NOT | MINUS) e=expression		#exprNotExpression
	| l=expression Whitespace op=(STAR | DIV | MOD | AND) Whitespace r=expression					#exprMultPrecedence
	| l=expression Whitespace  op=('+' | '-' | OR) Whitespace r=expression						#exprFactPrecedence
	| l=expression Whitespace op=('<' | '<=' | '>' | '>=' | '=' | '#') Whitespace r=expression	#exprRelPrecedence
	| id=ID
		s=selector						#exprSingleId
	| id=ID '(' cp=callParameters? ')'										#exprFuncCall
	| '(' e=expression ')'													#exprEmbeddedExpression
	| c=Constant															#exprConstant
	| s=STRING_LITERAL														#exprStringLiteral
	;

callParameters
		: p+=expression ( ',' Whitespace p+=expression)*
		;

selector
	: i+=arrayOrRecordSelector*
	;

arrayOrRecordSelector
	: '[' e=expression ']'		# arraySelector
	| '.' ID									# recordSelector
	;

// lexer tokens
STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;

Constant
	:   IntegerConstant
	|   FloatingConstant
	;

IntegerConstant: DigitSequence;

fragment
FloatingConstant
	:   FractionalConstant ExponentPart?
	|   DigitSequence ExponentPart
	;

fragment
FractionalConstant
	:   DigitSequence? '.' DigitSequence
	|   DigitSequence '.'
	;

fragment
ExponentPart
	:   'e' Sign? DigitSequence
	|   'E' Sign? DigitSequence
	;

fragment
Sign
	:   '+' | '-'
	;

fragment
DigitSequence
	:   Digit+
	;

fragment
Digit: [0-9];

Whitespace
		:   [ \t]+
		;

Newline
		:   (   '\r' '\n'?
		|   '\n'
		)
		-> skip
		;

BlockComment
		:  (Whitespace)*? '(*' (BlockComment|.)*? '*)' (Whitespace)*?
		-> skip
		;


SEMI:		';';
COLON:		':';
DOT:		'.';
LPAREN:		'(';
RPAREN:		')';
COMMA:		',';
PLUS:		'+';
AND:		'&';
MINUS:		'-';
NOTEQUAL:	'#';
EQUAL:		'=';
STAR:		'*';
NOT:		'~';
LT:			'<';
LE:			'<=';
GT:			'>';
GE:			'>=';
Assign:		':=';

/* keywords */
MODULE:		'MODULE';
VAR:		'VAR';
BEGIN:		'BEGIN';
CONST:		'CONST';
END:		'END';
PROCEDURE:	'PROCEDURE';
TYPE:		'TYPE';
ARRAY:		'ARRAY';
OF:			'OF';
OR:			'OR';
RECORD:		'RECORD';
WHILE:		'WHILE';
DO:			'DO';
IF:			'IF';
THEN:		'THEN';
ELSE:		'ELSE';
ELSIF:		'ELSIF';
REPEAT:		'REPEAT';
UNTIL:		'UNTIL';
DIV:		' DIV ';
MOD:		' MOD ';
INTEGER:    'INTEGER';
BOOLEAN:    'BOOLEAN';

ID:         [a-zA-Z_] [_a-zA-Z0-9]*;

/* move all lexer errors to the parser */
ErrorChar : . ;