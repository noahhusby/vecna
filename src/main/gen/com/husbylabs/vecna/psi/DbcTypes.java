// This is a generated file. Not intended for manual editing.
package com.husbylabs.vecna.psi;

import com.husbylabs.vecna.DbcElementType;
import com.husbylabs.vecna.DbcTokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.husbylabs.vecna.psi.impl.*;

public interface DbcTypes {

  IElementType MESSAGE = new DbcElementType("MESSAGE");
  IElementType SIGNAL = new DbcElementType("SIGNAL");

  IElementType AT = new DbcTokenType("@");
  IElementType BA_DEF_DEF_KW = new DbcTokenType("BA_DEF_DEF_");
  IElementType BA_DEF_KW = new DbcTokenType("BA_DEF_");
  IElementType BA_KW = new DbcTokenType("BA_");
  IElementType BO_KW = new DbcTokenType("BO_");
  IElementType BO_TX_BU_KW = new DbcTokenType("BO_TX_BU_");
  IElementType BS_KW = new DbcTokenType("BS_");
  IElementType BU_KW = new DbcTokenType("BU_");
  IElementType CM_KW = new DbcTokenType("CM_");
  IElementType COLON = new DbcTokenType(":");
  IElementType COMMA = new DbcTokenType(",");
  IElementType ENUM_KW = new DbcTokenType("ENUM");
  IElementType FLOAT_KW = new DbcTokenType("FLOAT");
  IElementType HEX_KW = new DbcTokenType("HEX");
  IElementType IDENTIFIER_TOKEN = new DbcTokenType("IDENTIFIER_TOKEN");
  IElementType INT_KW = new DbcTokenType("INT");
  IElementType LBRACKET = new DbcTokenType("[");
  IElementType LPAREN = new DbcTokenType("(");
  IElementType MINUS = new DbcTokenType("-");
  IElementType NS_KW = new DbcTokenType("NS_");
  IElementType NUMBER_LITERAL = new DbcTokenType("NUMBER_LITERAL");
  IElementType PIPE = new DbcTokenType("|");
  IElementType PLUS = new DbcTokenType("+");
  IElementType RBRACKET = new DbcTokenType("]");
  IElementType RPAREN = new DbcTokenType(")");
  IElementType SEMICOLON = new DbcTokenType(";");
  IElementType SG_KW = new DbcTokenType("SG_");
  IElementType SG_MUL_VAL_KW = new DbcTokenType("SG_MUL_VAL_");
  IElementType SIG_VALTYPE_KW = new DbcTokenType("SIG_VALTYPE_");
  IElementType STRING_KW = new DbcTokenType("STRING");
  IElementType STRING_LITERAL = new DbcTokenType("STRING_LITERAL");
  IElementType VAL_KW = new DbcTokenType("VAL_");
  IElementType VAL_TABLE_KW = new DbcTokenType("VAL_TABLE_");
  IElementType VERSION_KW = new DbcTokenType("VERSION");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MESSAGE) {
        return new DbcMessageImpl(node);
      }
      else if (type == SIGNAL) {
        return new DbcSignalImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
