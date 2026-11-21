
package com.husbylabs.vecna;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static com.husbylabs.vecna.psi.DbcTypes.*;

%%

%class DbcLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

%eof{
    return;
%eof}

/* ---------- Lexical definitions ---------- */

WHITE_SPACE = [ \t\r\n\f]+

IDENTIFIER = [a-zA-Z_][a-zA-Z_0-9]*

NUMBER = [0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?

STRING = \"([^\"\\\r\n]|\\.)*\"

/* ---------- Token matching rules ---------- */

%%

<YYINITIAL> {

    /* Whitespace */
    {WHITE_SPACE}    { return TokenType.WHITE_SPACE; }

    /* DBC section and declaration keywords */
    "VERSION"        { return VERSION_KW; }
    "NS_"            { return NS_KW; }
    "BS_"            { return BS_KW; }
    "BU_"            { return BU_KW; }

    "BO_"            { return BO_KW; }
    "SG_"            { return SG_KW; }

    "CM_"            { return CM_KW; }

    "BA_DEF_DEF_"    { return BA_DEF_DEF_KW; }
    "BA_DEF_"        { return BA_DEF_KW; }
    "BA_"            { return BA_KW; }

    "VAL_TABLE_"     { return VAL_TABLE_KW; }
    "VAL_"           { return VAL_KW; }

    "SIG_VALTYPE_"   { return SIG_VALTYPE_KW; }
    "SG_MUL_VAL_"    { return SG_MUL_VAL_KW; }
    "BO_TX_BU_"      { return BO_TX_BU_KW; }

    /* Data types used in attribute definitions */
    "INT"            { return INT_KW; }
    "HEX"            { return HEX_KW; }
    "FLOAT"          { return FLOAT_KW; }
    "STRING"         { return STRING_KW; }
    "ENUM"           { return ENUM_KW; }

    /* Values */
    {STRING}         { return STRING_LITERAL; }
    {NUMBER}         { return NUMBER_LITERAL; }

    /* Punctuation and operators */
    ":"              { return COLON; }
    ";"              { return SEMICOLON; }
    ","              { return COMMA; }

    "("              { return LPAREN; }
    ")"              { return RPAREN; }
    "["              { return LBRACKET; }
    "]"              { return RBRACKET; }

    "|"              { return PIPE; }
    "@"              { return AT; }
    "+"              { return PLUS; }
    "-"              { return MINUS; }

    /* Identifiers */
    {IDENTIFIER}     { return IDENTIFIER_TOKEN; }
}

/* Unrecognized characters */
[^]                  { return TokenType.BAD_CHARACTER; }
