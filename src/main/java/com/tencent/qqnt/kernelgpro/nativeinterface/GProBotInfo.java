package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBotInfo.class */
public final class GProBotInfo {
    static IPatchRedirector $redirector_;
    public long appid;
    public int inlineSearch;
    public long mark;
    public String name;
    public long tinyid;
    public long uin;

    public GProBotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.name = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getAppid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.appid : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public int getInlineSearch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.inlineSearch : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getMark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.mark : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.name : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uin : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProBotInfo{tinyid=" + this.tinyid + ",uin=" + this.uin + ",name=" + this.name + ",inlineSearch=" + this.inlineSearch + ",appid=" + this.appid + ",mark=" + this.mark + ",}";
    }

    public GProBotInfo(long j, long j2, String str, int i, long j3, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, Integer.valueOf(i), Long.valueOf(j3), Long.valueOf(j4));
            return;
        }
        this.name = "";
        this.tinyid = j;
        this.uin = j2;
        this.name = str;
        this.inlineSearch = i;
        this.appid = j3;
        this.mark = j4;
    }
}
