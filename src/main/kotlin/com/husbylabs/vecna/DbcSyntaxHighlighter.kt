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
    }

    override fun getHighlightingLexer(): Lexer =
        DbcLexerAdapter()

    override fun getTokenHighlights(
        tokenType: IElementType
    ): Array<TextAttributesKey> = when (tokenType) {
        DbcTypes.BO_KW,
        DbcTypes.SG_KW,
        DbcTypes.BU_KW,
        DbcTypes.CM_KW -> KEYWORD

        DbcTypes.NUMBER_LITERAL -> NUMBER
        DbcTypes.STRING_LITERAL -> STRING

        else -> emptyArray()
    }
}