grammar OberonGrammar;


moduleDefinition:
		MODULE Space n=ID ';' Newline
		Tab declarations Newline
		Tab block
		'.'
		;

declarations:
		( procedureDeclaration | localDeclaration ) *
		;

procedureDeclaration:
		PROCEDURE Space name=ID (pps=procedureParameters)? (export=STAR)? ';' Newline
		(Tab (procedureDeclaration|localDeclaration))* Newline
		(Tab endname=block) Newline
		(Tab)*? ';'
		;

//procedureHeader
//	:
//PROCEDURE name=ID (pps=procedureParameters)? (export=STAR)? ';'
//		;

procedureParameters :
		'('(p+=procedureParameter Space ';' Space )* p+=procedureParameter ')'
		;

procedureParameter
		:
		(VAR Space)? (names+=ID ','  Space )* names+=ID Space ':' Space t=typeName
		;

typeName
		: (INTEGER | BOOLEAN | ID)			# simpleTypeName
		| ARRAY Space e=expression Space OF Space t=typeName		# arrayType
		| RECORD Space r=recordTypeNameElements Space END						# recordTypeName
		;

recordTypeNameElements
		: recordElement (';' Newline recordElement)*
		;

recordElement
		: (ids+=ID ',' Space)* ids+=ID Space ':' Space t=typeName
		;

localDeclaration
		: variableDeclaration
		| constDeclaration
		| typeDeclaration
		;

typeDeclaration:
		TYPE Newline
		  singleTypeDeclaration+
		  ;

singleTypeDeclaration:
		  id=ID export=STAR? Space '=' Space t=typeName ';' Newline
		  ;

variableDeclaration:
		VAR Newline
		  singleVariableDeclaration+
		  ;

singleVariableDeclaration:
			(v+=exportableID ',' Space)* v+=exportableID Space ':' Space t=typeName ';' Newline
			;

exportableID:
			ID (export=STAR)?
			;

constDeclaration:
		CONST Newline
		  constDeclarationElement+
		  ;

constDeclarationElement:
		c=ID export=STAR? Space '=' Space e=expression ';' Newline
		;

block
		:(BEGIN Newline statements Newline Tab)?  END Space ID
		;

statements:
		Tab statement
		( ';' Newline Tab statement )*
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
		: id=ID s=selector Space ':=' Space r=expression
		;

while_statement
		: WHILE Space r=expression Space DO Newline
		  statements Newline
		  END
		;

repeat_statement
		: REPEAT Newline
		  statements Newline
		  Tab UNTIL Space r=expression
		;

if_statement
		: IF Space c+=expression Space THEN Newline
			  statements Newline
		  (ELSIF Space c+=expression Space THEN Newline
			  statements Newline
		  )*
		  (ELSE Newline
			  statements Newline
		  )?
		  Tab END
		;

// Expressions
expression
	: op=(NOT | MINUS) e=expression		#exprNotExpression
	| l=expression Space op=(STAR | DIV | MOD | AND) Space r=expression					#exprMultPrecedence
	| l=expression Space  op=('+' | '-' | OR) Space r=expression						#exprFactPrecedence
	| l=expression Space op=('<' | '<=' | '>' | '>=' | '=' | '#') Space r=expression	#exprRelPrecedence
	| id=ID
		s=selector						#exprSingleId
	| id=ID '(' cp=callParameters? ')'										#exprFuncCall
	| '(' e=expression ')'													#exprEmbeddedExpression
	| c=Constant															#exprConstant
	| s=STRING_LITERAL														#exprStringLiteral
	;

callParameters
		: p+=expression ( ',' Space p+=expression)*
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
	;

IntegerConstant: DigitSequence;


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


Tab
		:   '\t'
		;

Space
		:   ' '
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