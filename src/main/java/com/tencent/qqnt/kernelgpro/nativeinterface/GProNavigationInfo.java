package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNavigationInfo.class */
public final class GProNavigationInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String bubbleDesc;
    public String iconUrl;
    public String jumpUrl;
    public int jumpUrlType;
    long serialVersionUID;
    public boolean showBubble;
    public String title;

    public GProNavigationInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = "";
        this.title = "";
        this.jumpUrl = "";
        this.bubbleDesc = "";
    }

    public String getBubbleDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bubbleDesc : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getJumpUrlType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.jumpUrlType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public boolean getShowBubble() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.showBubble : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProNavigationInfo{iconUrl=" + this.iconUrl + ",title=" + this.title + ",jumpUrl=" + this.jumpUrl + ",jumpUrlType=" + this.jumpUrlType + ",showBubble=" + this.showBubble + ",bubbleDesc=" + this.bubbleDesc + ",}";
    }
}
