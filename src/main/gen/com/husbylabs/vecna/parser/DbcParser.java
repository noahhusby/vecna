// This is a generated file. Not intended for manual editing.
package com.husbylabs.vecna.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.husbylabs.vecna.psi.DbcTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DbcParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return dbcFile(b, l + 1);
  }

  /* ********************************************************** */
  // item_*
  static boolean dbcFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dbcFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dbcFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // message | signal | otherToken_
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = message(b, l + 1);
    if (!r) r = signal(b, l + 1);
    if (!r) r = otherToken_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // BO_KW NUMBER_LITERAL IDENTIFIER_TOKEN
  //             COLON NUMBER_LITERAL IDENTIFIER_TOKEN
  public static boolean message(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message")) return false;
    if (!nextTokenIs(b, BO_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BO_KW, NUMBER_LITERAL, IDENTIFIER_TOKEN, COLON, NUMBER_LITERAL, IDENTIFIER_TOKEN);
    exit_section_(b, m, MESSAGE, r);
    return r;
  }

  /* ********************************************************** */
  // VERSION_KW
  //                       | NS_KW
  //                       | BS_KW
  //                       | BU_KW
  //                       | CM_KW
  //                       | BA_DEF_DEF_KW
  //                       | BA_DEF_KW
  //                       | BA_KW
  //                       | VAL_TABLE_KW
  //                       | VAL_KW
  //                       | SIG_VALTYPE_KW
  //                       | SG_MUL_VAL_KW
  //                       | BO_TX_BU_KW
  //                       | INT_KW
  //                       | HEX_KW
  //                       | FLOAT_KW
  //                       | STRING_KW
  //                       | ENUM_KW
  //                       | IDENTIFIER_TOKEN
  //                       | NUMBER_LITERAL
  //                       | STRING_LITERAL
  //                       | COLON
  //                       | SEMICOLON
  //                       | COMMA
  //                       | LPAREN
  //                       | RPAREN
  //                       | LBRACKET
  //                       | RBRACKET
  //                       | PIPE
  //                       | AT
  //                       | PLUS
  //                       | MINUS
  static boolean otherToken_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "otherToken_")) return false;
    boolean r;
    r = consumeToken(b, VERSION_KW);
    if (!r) r = consumeToken(b, NS_KW);
    if (!r) r = consumeToken(b, BS_KW);
    if (!r) r = consumeToken(b, BU_KW);
    if (!r) r = consumeToken(b, CM_KW);
    if (!r) r = consumeToken(b, BA_DEF_DEF_KW);
    if (!r) r = consumeToken(b, BA_DEF_KW);
    if (!r) r = consumeToken(b, BA_KW);
    if (!r) r = consumeToken(b, VAL_TABLE_KW);
    if (!r) r = consumeToken(b, VAL_KW);
    if (!r) r = consumeToken(b, SIG_VALTYPE_KW);
    if (!r) r = consumeToken(b, SG_MUL_VAL_KW);
    if (!r) r = consumeToken(b, BO_TX_BU_KW);
    if (!r) r = consumeToken(b, INT_KW);
    if (!r) r = consumeToken(b, HEX_KW);
    if (!r) r = consumeToken(b, FLOAT_KW);
    if (!r) r = consumeToken(b, STRING_KW);
    if (!r) r = consumeToken(b, ENUM_KW);
    if (!r) r = consumeToken(b, IDENTIFIER_TOKEN);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // SG_KW IDENTIFIER_TOKEN IDENTIFIER_TOKEN?
  //            COLON NUMBER_LITERAL PIPE NUMBER_LITERAL
  //            AT NUMBER_LITERAL (PLUS | MINUS)
  //            LPAREN signedNumber_ COMMA signedNumber_ RPAREN
  //            LBRACKET signedNumber_ PIPE signedNumber_ RBRACKET
  //            STRING_LITERAL IDENTIFIER_TOKEN
  //            (COMMA IDENTIFIER_TOKEN)*
  public static boolean signal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal")) return false;
    if (!nextTokenIs(b, SG_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SG_KW, IDENTIFIER_TOKEN);
    r = r && signal_2(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, NUMBER_LITERAL, PIPE, NUMBER_LITERAL, AT, NUMBER_LITERAL);
    r = r && signal_9(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && signedNumber_(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && signedNumber_(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACKET);
    r = r && signedNumber_(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && signedNumber_(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACKET, STRING_LITERAL, IDENTIFIER_TOKEN);
    r = r && signal_22(b, l + 1);
    exit_section_(b, m, SIGNAL, r);
    return r;
  }

  // IDENTIFIER_TOKEN?
  private static boolean signal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_2")) return false;
    consumeToken(b, IDENTIFIER_TOKEN);
    return true;
  }

  // PLUS | MINUS
  private static boolean signal_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_9")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  // (COMMA IDENTIFIER_TOKEN)*
  private static boolean signal_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_22")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_22_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_22", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER_TOKEN
  private static boolean signal_22_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_22_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINUS? NUMBER_LITERAL
  static boolean signedNumber_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signedNumber_")) return false;
    if (!nextTokenIs(b, "", MINUS, NUMBER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signedNumber__0(b, l + 1);
    r = r && consumeToken(b, NUMBER_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // MINUS?
  private static boolean signedNumber__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signedNumber__0")) return false;
    consumeToken(b, MINUS);
    return true;
  }

}
