package com.husbylabs.vecna

import com.husbylabs.vecna.psi.DbcMessageName
import com.husbylabs.vecna.psi.DbcSignalName
import com.husbylabs.vecna.psi.DbcNodeName
import com.husbylabs.vecna.psi.DbcSignalReference
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

class DbcAnnotator : Annotator {

    override fun annotate(
        element: PsiElement,
        holder: AnnotationHolder
    ) {
        val color = when (element) {
            is DbcMessageName -> DbcHighlightColors.MESSAGE_NAME
            is DbcSignalName -> DbcHighlightColors.SIGNAL_NAME
            is DbcNodeName -> DbcHighlightColors.NODE_NAME
            is DbcSignalReference -> DbcHighlightColors.SIGNAL_REFERENCE
            else -> return
        }

        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element.textRange)
            .textAttributes(color)
            .create()
    }
}
