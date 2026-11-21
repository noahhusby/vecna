package com.husbylabs.vecna

import com.intellij.lang.Language

object DbcLanguage : Language("DBC") {
    private fun readResolve(): Any = DbcLanguage
}