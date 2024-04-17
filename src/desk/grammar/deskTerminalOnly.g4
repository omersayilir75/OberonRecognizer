grammar deskTerminalOnly;

desk: 'print' e (c)? EOF;
e : f | e '+' f;
c : 'where' ds;
f : 'ID' | 'NUM';
ds : d | ds ';' d;
d : 'ID' '=' 'NUM';

Whitespace
		:   [ \t]+
		-> skip
		;