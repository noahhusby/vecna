package com.husbylabs.vecna

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class DbcFile(
    viewProvider: FileViewProvider
) : PsiFileBase(viewProvider, DbcLanguage) {

    override fun getFileType(): FileType = DbcFileType

    override fun toString(): String = "DBC File"
}