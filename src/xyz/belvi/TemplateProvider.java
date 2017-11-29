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


                "liveTemplates/DroidSnippet_DeviceUtils",
                "liveTemplates/DroidSnippet_FileUtils",
                "liveTemplates/DroidSnippet_ImageUtils",
                "liveTemplates/DroidSnippet_IntentUtils",
                "liveTemplates/DroidSnippet_LocationUtils",
                "liveTemplates/DroidSnippet_NetworkUtils",
                "liveTemplates/DroidSnippet_PermissionUtils",
                "liveTemplates/DroidSnippet_ScreenUtils",
                "liveTemplates/DroidSnippet_ServiceUtils",
                "liveTemplates/DroidSnippet_TimeUtils",
                "liveTemplates/DroidSnippet_Utils"
        };


    }



    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }


}
