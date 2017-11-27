package xyz.belvi;


import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import com.intellij.ide.structureView.*;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.*;

public class TemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {


        return new String[]{

                "liveTemplates/DroidSnippet_Utils",
                "liveTemplates/DroidSnippet_NetworkUtils",
                "liveTemplates/DroidSnippet_DeviceUtils",
                "liveTemplates/DroidSnippet_LocationUtils",
                "liveTemplates/DroidSnippet_ScreenUtils",
                "liveTemplates/DroidSnippet_PermissionUtils",
                "liveTemplates/DroidSnippet_IntentUtils",
                "liveTemplates/DroidSnippet_ServiceUtils"
        };

    }


    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }


}
