package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextTencentDocsContent.class */
public final class GProStRichTextTencentDocsContent {
    static IPatchRedirector $redirector_;
    public int docType;
    public String icon;
    public String permission;
    public String platformName;
    public String title;
    public String url;

    public GProStRichTextTencentDocsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.url = "";
        this.title = "";
        this.icon = "";
        this.platformName = "";
        this.permission = "";
    }

    public int getDocType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.docType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.icon : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.permission : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getPlatformName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.platformName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.url : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStRichTextTencentDocsContent{url=" + this.url + ",title=" + this.title + ",icon=" + this.icon + ",platformName=" + this.platformName + ",permission=" + this.permission + ",docType=" + this.docType + ",}";
    }
}
