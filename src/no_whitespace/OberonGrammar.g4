grammar OberonGrammar;

moduleDefinition:
		MODULE n=ID ';'
		declarations
		block
		'.'
		;

declarations:
		( procedureDeclaration | localDeclaration ) *
		;



procedureDeclaration:
		PROCEDURE name=ID (pps=procedureParameters)? (export=STAR)? ';'
		(procedureDeclaration|localDeclaration)*
		endname=block
		';'
		;

//procedureHeader
//	:
//PROCEDURE name=ID (pps=procedureParameters)? (export=STAR)? ';'
//		;

procedureParameters :
		'(' (p+=procedureParameter ';') * p+=procedureParameter ')'
		;

procedureParameter
		:
		VAR? (names+=ID ',' ) * names+=ID   ':' t=typeName
		;

typeName
		: ID															# simpleTypeName
		| ARRAY e=expression OF t=typeName		# arrayType
		| RECORD r=recordTypeNameElements END						# recordTypeName
		;

recordTypeNameElements

		: recordElement (';' recordElement)*
		;

recordElement
		: (ids+=ID ',')* ids+=ID ':' t=typeName
		;

localDeclaration
		: variableDeclaration
		| constDeclaration
		| typeDeclaration
		;

typeDeclaration:
		TYPE
		  singleTypeDeclaration+
		  ;

singleTypeDeclaration:
		  id=ID export=STAR? '=' t=typeName ';'
		  ;

variableDeclaration:
		VAR
		  singleVariableDeclaration+
		  ;

singleVariableDeclaration:
			(v+=exportableID ',')* v+=exportableID  ':' t=typeName ';'
			;

exportableID:
			ID (export=STAR)?
			;

constDeclaration:
		CONST
		  constDeclarationElement+
		  ;

constDeclarationElement:
		c=ID export=STAR? '=' e=expression ';'
		;

block
		: (BEGIN statements)? END ID
		;

statements:
		statement
		( ';' statement )*
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
		: id=ID s=selector ':=' r=expression
		;

while_statement
		: WHILE r=expression DO
		  statements
		  END
		;

repeat_statement
		: REPEAT
		  statements
		  UNTIL r=expression
		;

if_statement
		: IF c+=expression THEN
			  statements
		  ( ELSIF c+=expression THEN
			  statements
		  )*
		  (ELSE
			  statements
		  )?
		  END
		;

// Expressions
expression
	: op=(NOT | MINUS) e=expression		#exprNotExpression
	| l=expression op=(STAR | DIV | MOD | AND) r=expression					#exprMultPrecedence
	| l=expression op=('+' | '-' | OR)  r=expression						#exprFactPrecedence
	| l=expression op=('<' | '<=' | '>' | '>=' | '=' | '#') r=expression	#exprRelPrecedence
	| id=ID
		s=selector						#exprSingleId
	| id=ID '(' cp=callParameters? ')'										#exprFuncCall
	| '(' e=expression ')'													#exprEmbeddedExpression
	| c=Constant															#exprConstant
	| s=STRING_LITERAL														#exprStringLiteral
	;

callParameters
		: p+=expression (',' p+=expression)*
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
		-> skip
		;

Newline
		:   (   '\r' '\n'?
		|   '\n'
		)
		-> skip
		;

BlockComment
		:   '(*' (BlockComment|.)*? '*)'
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
IMPORT:		'IMPORT';
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
DIV:		'DIV';
MOD:		'MOD';

ID:         [a-zA-Z_] [_a-zA-Z0-9]*;

/* move all lexer errors to the parser */
ErrorChar : . ;