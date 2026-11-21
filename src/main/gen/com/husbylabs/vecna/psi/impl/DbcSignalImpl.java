// This is a generated file. Not intended for manual editing.
package com.husbylabs.vecna.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.husbylabs.vecna.psi.DbcTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.husbylabs.vecna.psi.*;

public class DbcSignalImpl extends ASTWrapperPsiElement implements DbcSignal {

  public DbcSignalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DbcVisitor visitor) {
    visitor.visitSignal(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DbcVisitor) accept((DbcVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getStringLiteral() {
    return findNotNullChildByType(STRING_LITERAL);
  }

}
