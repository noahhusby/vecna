package com.husbylabs.vecna

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

@Suppress("KotlinObjectRegisteredAsExtension")
object DbcFileType : LanguageFileType(DbcLanguage){

    override fun getName() = "DBC"

    override fun getDescription() = "CAN Database File"

    override fun getDefaultExtension() = "dbc"

    override fun getIcon(): Icon? = null
}