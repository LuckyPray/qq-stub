package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProProgramInfo.class */
public final class GProProgramInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String anchorName;
    public String liveTitle;
    public String programId;
    long serialVersionUID;
    public long tabId;
    public String thirdPartyLogo;

    public GProProgramInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.programId = "";
        this.liveTitle = "";
        this.anchorName = "";
        this.thirdPartyLogo = "";
    }

    public String getAnchorName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.anchorName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getLiveTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.liveTitle : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.programId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getTabId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tabId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getThirdPartyLogo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.thirdPartyLogo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProProgramInfo{programId=" + this.programId + ",liveTitle=" + this.liveTitle + ",anchorName=" + this.anchorName + ",thirdPartyLogo=" + this.thirdPartyLogo + ",tabId=" + this.tabId + ",}";
    }

    public GProProgramInfo(String str, String str2, String str3, String str4, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3, str4, Long.valueOf(j));
            return;
        }
        this.serialVersionUID = 1L;
        this.programId = "";
        this.liveTitle = "";
        this.anchorName = "";
        this.thirdPartyLogo = "";
        this.programId = str;
        this.liveTitle = str2;
        this.anchorName = str3;
        this.thirdPartyLogo = str4;
        this.tabId = j;
    }
}
