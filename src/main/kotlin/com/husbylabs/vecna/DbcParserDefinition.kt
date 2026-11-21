package com.husbylabs.vecna

import com.husbylabs.vecna.parser.DbcParser
import com.husbylabs.vecna.psi.DbcTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class DbcParserDefinition : ParserDefinition {

    companion object {
        @JvmField
        val FILE = IFileElementType(DbcLanguage)
    }

    override fun createLexer(project: Project): Lexer =
        DbcLexerAdapter()

    override fun createParser(project: Project): PsiParser =
        DbcParser()

    override fun getFileNodeType(): IFileElementType =
        FILE

    override fun getCommentTokens(): TokenSet =
        TokenSet.EMPTY

    override fun getStringLiteralElements(): TokenSet =
        TokenSet.create(DbcTypes.STRING_LITERAL)

    override fun createElement(node: ASTNode): PsiElement =
        DbcTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        DbcFile(viewProvider)
}