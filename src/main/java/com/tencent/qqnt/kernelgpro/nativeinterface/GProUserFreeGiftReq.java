package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserFreeGiftReq.class */
public final class GProUserFreeGiftReq implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String checkContext;
    public long guildId;
    long serialVersionUID;
    public ArrayList<Integer> themeTypes;

    public GProUserFreeGiftReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.checkContext = "";
        this.themeTypes = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getCheckContext() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.checkContext : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<Integer> getThemeTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.themeTypes : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setCheckContext(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.checkContext = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setThemeTypes(ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.themeTypes = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProUserFreeGiftReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",checkContext=" + this.checkContext + ",themeTypes=" + this.themeTypes + ",}";
    }

    public GProUserFreeGiftReq(long j, long j2, String str, ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.checkContext = "";
        this.themeTypes = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.checkContext = str;
        this.themeTypes = arrayList;
    }
}
