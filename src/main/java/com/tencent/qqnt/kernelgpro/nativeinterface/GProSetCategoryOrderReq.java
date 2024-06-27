package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSetCategoryOrderReq.class */
public final class GProSetCategoryOrderReq {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> disableList;
    public ArrayList<Long> enableList;
    public long guildId;

    public GProSetCategoryOrderReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.enableList = new ArrayList<>();
            this.disableList = new ArrayList<>();
        }
    }

    public ArrayList<Long> getDisableList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.disableList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<Long> getEnableList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.enableList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProSetCategoryOrderReq{guildId=" + this.guildId + ",enableList=" + this.enableList + ",disableList=" + this.disableList + ",}";
    }
}
