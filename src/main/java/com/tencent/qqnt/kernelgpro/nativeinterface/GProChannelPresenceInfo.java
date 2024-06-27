package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelPresenceInfo.class */
public final class GProChannelPresenceInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProChannelPresenceItemInfo> itemList;
    public long playSpeed;
    public int templateId;

    public GProChannelPresenceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.itemList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProChannelPresenceItemInfo> getItemList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.itemList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public long getPlaySpeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.playSpeed : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getTemplateId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.templateId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProChannelPresenceInfo{templateId=" + this.templateId + ",itemList=" + this.itemList + ",playSpeed=" + this.playSpeed + ",}";
    }
}
