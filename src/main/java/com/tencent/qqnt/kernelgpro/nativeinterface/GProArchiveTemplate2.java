package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProArchiveTemplate2.class */
public final class GProArchiveTemplate2 {
    static IPatchRedirector $redirector_;
    public String desc1;
    public String desc2;
    public String desc3;
    public String desc4;
    public String desc5;
    public String desc6;
    public String desc7;
    public String title1;
    public String title2;
    public String title3;
    public String title4;
    public String title5;
    public String title6;
    public String title7;

    public GProArchiveTemplate2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title1 = "";
        this.desc1 = "";
        this.title2 = "";
        this.desc2 = "";
        this.title3 = "";
        this.desc3 = "";
        this.title4 = "";
        this.desc4 = "";
        this.title5 = "";
        this.desc5 = "";
        this.title6 = "";
        this.desc6 = "";
        this.title7 = "";
        this.desc7 = "";
    }

    public String getDesc1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.desc1 : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getDesc2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.desc2 : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getDesc3() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.desc3 : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getDesc4() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.desc4 : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getDesc5() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.desc5 : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getDesc6() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.desc6 : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getDesc7() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.desc7 : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public String getTitle1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.title1 : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getTitle2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title2 : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle3() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.title3 : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getTitle4() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.title4 : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getTitle5() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.title5 : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getTitle6() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.title6 : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getTitle7() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.title7 : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProArchiveTemplate2{title1=" + this.title1 + ",desc1=" + this.desc1 + ",title2=" + this.title2 + ",desc2=" + this.desc2 + ",title3=" + this.title3 + ",desc3=" + this.desc3 + ",title4=" + this.title4 + ",desc4=" + this.desc4 + ",title5=" + this.title5 + ",desc5=" + this.desc5 + ",title6=" + this.title6 + ",desc6=" + this.desc6 + ",title7=" + this.title7 + ",desc7=" + this.desc7 + ",}";
    }
}
