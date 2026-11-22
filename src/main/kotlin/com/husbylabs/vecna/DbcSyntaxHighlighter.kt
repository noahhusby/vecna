package com.husbylabs.vecna

import com.husbylabs.vecna.psi.DbcTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class DbcSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val KEYWORD = arrayOf(
            DefaultLanguageHighlighterColors.KEYWORD
        )

        private val NUMBER = arrayOf(
            DefaultLanguageHighlighterColors.NUMBER
        )

        private val STRING = arrayOf(
            DefaultLanguageHighlighterColors.STRING
        )

        private val SEMICOLON = arrayOf(
            DefaultLanguageHighlighterColors.SEMICOLON
        )
    }

    override fun getHighlightingLexer(): Lexer =
        DbcLexerAdapter()

    override fun getTokenHighlights(
        tokenType: IElementType
    ): Array<TextAttributesKey> = when (tokenType) {
        DbcTypes.VERSION_KW,
        DbcTypes.NS_KW,
        DbcTypes.BS_KW,
        DbcTypes.BU_KW,
        DbcTypes.BO_KW,
        DbcTypes.SG_KW,
        DbcTypes.CM_KW,
        DbcTypes.BA_KW,
        DbcTypes.BA_DEF_KW,
        DbcTypes.BA_DEF_DEF_KW,
        DbcTypes.VAL_KW,
        DbcTypes.VAL_TABLE_KW,
        DbcTypes.BO_TX_BU_KW,
        DbcTypes.SIG_VALTYPE_KW,
        DbcTypes.SG_MUL_VAL_KW -> KEYWORD

        DbcTypes.NUMBER_LITERAL -> NUMBER
        DbcTypes.STRING_LITERAL -> STRING
        DbcTypes.SEMICOLON -> SEMICOLON

        else -> emptyArray()
    }
}