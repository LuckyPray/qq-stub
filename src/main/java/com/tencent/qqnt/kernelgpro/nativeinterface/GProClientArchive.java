package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientArchive.class */
public final class GProClientArchive {
    static IPatchRedirector $redirector_;
    public String archiveName;
    public int clientId;
    public GProSmobaArchiveTemplate template1;
    public GProArchiveTemplate2 template2;
    public int templateId;

    public GProClientArchive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.archiveName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.template1 = new GProSmobaArchiveTemplate();
        this.template2 = new GProArchiveTemplate2();
    }

    public String getArchiveName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.archiveName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProSmobaArchiveTemplate getTemplate1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.template1 : (GProSmobaArchiveTemplate) iPatchRedirector.redirect((short) 5, this);
    }

    public GProArchiveTemplate2 getTemplate2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.template2 : (GProArchiveTemplate2) iPatchRedirector.redirect((short) 6, this);
    }

    public int getTemplateId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.templateId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProClientArchive{clientId=" + this.clientId + ",archiveName=" + this.archiveName + ",templateId=" + this.templateId + ",template1=" + this.template1 + ",template2=" + this.template2 + ",}";
    }
}
