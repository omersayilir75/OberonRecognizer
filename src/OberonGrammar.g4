grammar OberonGrammar;

//TODO: change definitions around so begin and end require the same IDs
moduleDefinition:
		MODULE Whitespace n=ID (Whitespace)*? ';'
		declarations
		block
		'.'
		;

declarations:
		( (Whitespace)*? (procedureDeclaration | localDeclaration ) ) *
		;

procedureDeclaration:
		PROCEDURE Whitespace name=ID (pps=procedureParameters)? (export=STAR)?  (Whitespace)*? ';'
		(Whitespace (procedureDeclaration|localDeclaration))*
		(Whitespace endname=block)
		(Whitespace)*? ';'
		;

//procedureHeader
//	:
//PROCEDURE name=ID (pps=procedureParameters)? (export=STAR)? ';'
//		;

procedureParameters :
		'('  (Whitespace)*?  (p+=procedureParameter (Whitespace)*? ';' (Whitespace)*? )* p+=procedureParameter  (Whitespace)*?  ')'
		;

procedureParameter
		:
		(VAR Whitespace)?  (Whitespace)*? (names+=ID  (Whitespace)*? ','  (Whitespace)*?)* names+=ID (Whitespace)*? ':' (Whitespace)*? t=typeName
		;

typeName
		: (INTEGER | BOOLEAN | ID)			# simpleTypeName
		| ARRAY Whitespace e=expression Whitespace OF Whitespace t=typeName		# arrayType
		| RECORD (Whitespace) r=recordTypeNameElements (Whitespace) END						# recordTypeName
		;

recordTypeNameElements
		: recordElement ((Whitespace)? ';' (Whitespace)*? recordElement)*
		;

recordElement
		: (ids+=ID (Whitespace)*? ',' (Whitespace)*?)* ids+=ID (Whitespace)*? ':' (Whitespace)*? t=typeName
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
		  id=ID export=STAR?  (Whitespace)*?  '='  (Whitespace)*?  t=typeName ';' (Whitespace)*?
		  ;

variableDeclaration:
		VAR Whitespace
		  singleVariableDeclaration+
		  ;

singleVariableDeclaration:
			(Whitespace)*? (v+=exportableID  (Whitespace)*?  ',' (Whitespace)*?)* v+=exportableID (Whitespace)*? ':' (Whitespace)*? t=typeName (Whitespace)*?';'
			;

exportableID:
			ID (export=STAR)?
			;

constDeclaration:
		CONST Whitespace
		  constDeclarationElement+
		  ;

constDeclarationElement:
		(Whitespace)*? c=ID Whitespace export=STAR? (Whitespace)*? '=' (Whitespace)*?  e=expression  (Whitespace)*?  ';' (Whitespace)*?
		;

block
		: (Whitespace)*? (BEGIN (Whitespace) statements)? (Whitespace)*? END Whitespace ID
		;

statements:
		(Whitespace)*? statement
		( ';' (Whitespace)*? statement (Whitespace)*? )*
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
		: id=ID s=selector (Whitespace)*? ':=' (Whitespace)*? r=expression
		;

while_statement
		: WHILE Whitespace r=expression Whitespace DO
		  statements
		  (Whitespace) (Whitespace)* END (Whitespace)*?
		;

repeat_statement
		: REPEAT (Whitespace)*
		  statements
		  (Whitespace)* UNTIL Whitespace r=expression
		;

if_statement
		: IF Whitespace c+=expression Whitespace THEN
			  statements
		  ( Whitespace ELSIF Whitespace c+=expression Whitespace THEN Whitespace
			  statements
		  )*
		  (Whitespace ELSE Whitespace
			  statements
		  )?
		  Whitespace END (Whitespace)*?
		;

// Expressions
expression
	: op=(NOT | MINUS) e=expression		#exprNotExpression
	| l=expression (Whitespace)*? op=(STAR | DIV | MOD | AND) (Whitespace)*? r=expression					#exprMultPrecedence
	| l=expression (Whitespace)*?  op=('+' | '-' | OR) (Whitespace)*?  r=expression						#exprFactPrecedence
	| l=expression (Whitespace)*? op=('<' | '<=' | '>' | '>=' | '=' | '#') (Whitespace)*? r=expression	#exprRelPrecedence
	| id=ID
		s=selector						#exprSingleId
	| id=ID '(' cp=callParameters? ')'										#exprFuncCall
	| '(' e=expression ')'													#exprEmbeddedExpression
	| c=Constant															#exprConstant
	| s=STRING_LITERAL														#exprStringLiteral
	;

callParameters
		: p+=expression ( (Whitespace)*? ',' (Whitespace)*? p+=expression)*
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