package com.husbylabs.vecna

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey

object DbcHighlightColors {

    val MESSAGE_NAME = TextAttributesKey.createTextAttributesKey(
        "DBC_MESSAGE_NAME",
        DefaultLanguageHighlighterColors.INSTANCE_FIELD
    )

    val SIGNAL_NAME = TextAttributesKey.createTextAttributesKey(
        "DBC_SIGNAL_NAME",
        DefaultLanguageHighlighterColors.INSTANCE_FIELD
    )

    val NODE_NAME = TextAttributesKey.createTextAttributesKey(
        "DBC_NODE_NAME",
        DefaultLanguageHighlighterColors.INSTANCE_FIELD
    )

    val SIGNAL_REFERENCE = TextAttributesKey.createTextAttributesKey(
        "DBC_SIGNAL_REFERENCE",
        DefaultLanguageHighlighterColors.INSTANCE_FIELD
    )
}
