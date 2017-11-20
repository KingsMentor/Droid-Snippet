package xyz.belvi;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;

public class TemplateContext extends TemplateContextType {
    protected TemplateContext() {
        super("JAVA", "Java");
    }

    @Override
    public boolean isInContext(PsiFile file, int offset) {

        return file.getName().endsWith(".java");
    }

}