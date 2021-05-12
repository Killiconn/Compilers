grammar cal;

prog:           decl_list function_list main EOF;

decl:           var_decl | const_decl;

decl_list:      decl SEMI decl_list
                |
                ;

var_decl:       Variable ID COLON type;

const_decl:     Constant ID COLON type ASSIGN expr;

function_list:  function function_list
                |
                ;

function:       type ID LBR parameter_list RBR Is decl_list Begin statement_block Return LBR (expr | ) RBR SEMI End;

type: 		    Boolean | Integer | Void;

parameter_list: nemp_parameter_list
                |
                ;

nemp_parameter_list:    ID COLON type
                        | ID COLON type COMMA nemp_parameter_list
                        ;

main:           Main Begin decl_list statement_block End;

statement_block:    (stm statement_block)
                    |
                    ;

stm:            ID stm_choice       
                | Begin statement_block End
                | If condition Begin statement_block End Else Begin statement_block End
                | While condition Begin statement_block End
                | Skip SEMI
                ;

stm_choice:     ASSIGN expr SEMI
                | LBR arg_list RBR SEMI
                ;

expr:	        expr binary_arith_op expr
                |LBR expr RBR
                |ID LBR arg_list RBR
                |frag
                ;

binary_arith_op:    PLUS
                    | NEG
                    ;

frag:	        ID | NEG ID | NUMBER | True | False;

condition:      LOGNEG condition
                | LBR condition RBR
                | expr comp_op expr
                | condition op=(OR | AND) condition
                ;

comp_op:        EQUAL | NOEQ | LESS | LESSEQ | GREAT | GREATEQ;

arg_list:       nemp_arg_list
                |
                ;

nemp_arg_list:   ID | ID COMMA nemp_arg_list;


fragment A:		'a' | 'A';
fragment B:		'b' | 'B';
fragment C:		'c' | 'C';
fragment D:		'd' | 'D';
fragment E:		'e' | 'E';
fragment F:		'f' | 'F';
fragment G:		'g' | 'G';
fragment H:		'h' | 'H';
fragment I:		'i' | 'I';
fragment J:		'j' | 'J';
fragment K:		'k' | 'K';
fragment L:		'l' | 'L';
fragment M:		'm' | 'M';
fragment N:		'n' | 'N';
fragment O:		'o' | 'O';
fragment P:		'p' | 'P';
fragment Q:		'q' | 'Q';
fragment R:		'r' | 'R';
fragment S:		's' | 'S';
fragment T:		't' | 'T';
fragment U:		'u' | 'U';
fragment V:		'v' | 'V';
fragment W:		'w' | 'W';
fragment X:		'x' | 'X';
fragment Y:		'y' | 'Y';
fragment Z:     'z' | 'Z';



fragment Digit:         [0-9];
fragment Letter:	    [a-zA-Z];
fragment Underscore:    '_';
fragment Brackets:      '()';
fragment Comment_open:  '/*';
fragment Comment_close: '*/';

OR:     '|';
AND:    '&';
ASSIGN:	':=';
PLUS:	'+';
NEG:	'-';
LOGNEG: '~';
EQUAL:  '=';
NOEQ:   '!=';
LESS:   '<';
LESSEQ: '<=';
GREAT:  '>';
GREATEQ:'>=';

SEMI:   ';';
LBR:    '(';
RBR:    ')';
COMMA:  ',';
COLON:  ':';

Variable: 	    V A R I A B L E;
Constant:	    C O N S T A N T;
Return:         R E T U R N;
Integer: 	    I N T E G E R;
Boolean: 	    B O O L E A N;
Void: 		    V O I D;
Main:           M A I N;
If:             I F;
Else:           E L S E;
True:           T R U E;
False:          F A L S E;
While:          W H I L E;
Begin:          B E G I N;
End:            E N D;
Is:             I S;
Skip:           S K I P;

WS:         [ \t\n\r]+ -> skip;

COMMENT_1:      '//' ~('\r' | '\n')* -> skip;
COMMENT_2:      Comment_open (COMMENT_2 | .)*? Comment_close -> skip;
            
ID: 	    Letter(Letter | Digit | Underscore)*;
NUMBER:     [1-9] (Digit)* | NEG [1-9] (Digit)* | [0];






