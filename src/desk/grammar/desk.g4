grammar desk;

desk: 'print' e (c)? EOF;
e : f | e '+' f;
c : 'where' ds;
f : ID | NUM;
ds : d | ds ';' d;
d : ID '=' NUM;
ID : [a-z]+;
NUM :[0-9]+;

Whitespace
		:   [ \t]+
		-> skip
		;