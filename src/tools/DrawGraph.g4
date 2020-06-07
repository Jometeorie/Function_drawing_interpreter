grammar DrawGraph;

options {
    language = Java;
}

@header {
package  tools;
import java.util.*;
import java.lang.Math;
}

program : statement+
    ;
// program :  EOF    /* ε */ 
// 	| program statement SEMICO  EOF
// 	;
statement :  originStatement | scaleStatement
          |  rotStatement | forStatement | colorStatement
          | dotSizeStatement | styleStatement
   ;
originStatement : ORIGIN IS L_BRACKET expr
      COMMA expr R_BRACKET
    ;
scaleStatement : SCALE IS  L_BRACKET expr
      COMMA expr R_BRACKET
    ;
rotStatement  : ROT IS expr
    ;
forStatement : FOR T1 FROM expr TO expr STEP expr DRAW
        L_BRACKET expr COMMA expr R_BRACKET
    ;
  colorStatement : COLOR IS L_BRACKET expr COMMA expr 
        COMMA expr R_BRACKET
    ;
    dotSizeStatement : DOTSIZE IS expr
    ;
    styleStatement : STYLE IS styleType = ID
    ;
expr :
         <assoc=right>   op = expr POWER expr    #PowerExpr
      |  op = (PLUS | MINUS)  expr   #UnaryExpr
      |  expr op = (MUL  | DIV)   expr   #MulDivExpr
      |  expr op = (PLUS | MINUS) expr   #PlusMinusExpr
  // 以下结构的优先级：高低不影响分析
      |  CONST_ID   #Const
      |  T1 #VarT
      |  func = ID   L_BRACKET  expr  R_BRACKET    #FuncExpr
      |  L_BRACKET       expr  R_BRACKET    #NestedExpr
      ;

PLUS   :	'+'  ;
MINUS  :	'-'  ;
DIV    :	'/'  ;
MUL    :	'*'  ;
POWER  :	'**' ;

SEMICO   :	';' ;
L_BRACKET:	'(' ;
R_BRACKET:	')' ;
COMMA    :	',' ;

CONST_ID :
     Integer    
  |  Real
  |  NamedConst 
  ;
fragment Integer : Digits;
fragment 
Digits : [0-9]+ ;
fragment Real :
      Fraction Exponent?  // 12.3, 4E-10
  |   Digits   Exponent   // 123E2
  ; 
fragment Fraction :
    // 12.34,  .9(OK)
    Digits? '.' Digits
 |  Digits  '.'  // 3. is OK
 ;
fragment Exponent :
   [eE] [+-]? Digits
  ;
fragment NamedConst : 'pi' | 'PI' | 'Pi' | 'pI' | 'e' | 'E' ;
fragment A : [aA] ;
fragment B : [Bb] ;
fragment C : [cC] ;
fragment D : [Dd] ;
fragment E : [Ee] ;
fragment F : [Ff] ;
fragment G : [Gg] ;
fragment H : [Hh] ;
fragment I : [Ii] ;
fragment J : [Jj] ;
fragment K : [Kk] ;
fragment L : [Ll] ;
fragment M : [Mm] ;
fragment N : [Nn] ;
fragment O : [Oo] ;
fragment P : [Pp] ;
fragment Q : [Qq] ;
fragment R : [Rr] ;
fragment S : [Ss] ;
fragment T : [Tt] ;
fragment U : [Uu] ;
fragment V : [Vv] ;
fragment W : [Ww] ;
fragment X : [Xx] ;
fragment Y : [Yy] ;
fragment Z : [zZ] ;
ORIGIN:  O R I G I N            ;
SCALE :  S C A L E            ;
ROT   :   R O T           ;
IS    :   I S           ;
TO    :    T O          ;
STEP  :   S T E P           ;
DRAW  :   D R A W           ;
FOR   :    F O R          ;
FROM  :  F R O M             ;
COLOR : C O L O R     ;
DOTSIZE : D O T S I Z E       ;
STYLE : S T Y L E       ;
// 参数
// T     :    T          ;
// 提示：T 是辅助定义了，故
// 文法中的参数 T 需重命名.
T1    :  T;
// 这个规则必须定义在 // 关键字的后面!!!
// 用于：
//   识别 函数名（正确的、错误的）、
//   扩展语言时，你添加的自定义的各种名字等!

ID : [a-zA-Z_][a-zA-Z_0-9]*
   ;
WS  :  [ \t\f\r\n]+  -> skip  // skip all blank
    ;

COMMENT:	
	(   '//' ~[\r\n]*
	|  '--' ~[\r\n]* 
	|  '/*' .*? '*/'    /* '?' for non-greedy */ 
      )  -> skip
	;

ErrText : . ;