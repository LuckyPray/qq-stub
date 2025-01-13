package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProInitSessionConfig.class */
public final class GProInitSessionConfig {
    static IPatchRedirector $redirector_;

    /* renamed from: a2 */
    public String f60a2;
    public String clientVer;

    /* renamed from: d2 */
    public String f61d2;
    public String d2Key;
    public String gproDBName;
    public String selfUid;
    public long selfUin;

    public GProInitSessionConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.selfUid = "";
        this.clientVer = "";
        this.f60a2 = "";
        this.f61d2 = "";
        this.d2Key = "";
    }

    public String getA2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.f60a2 : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getClientVer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.clientVer : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getD2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.f61d2 : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getD2Key() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.d2Key : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getGproDBName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.gproDBName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSelfUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.selfUid : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getSelfUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.selfUin : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProInitSessionConfig{selfUin=" + this.selfUin + ",selfUid=" + this.selfUid + ",gproDBName=" + this.gproDBName + ",clientVer=" + this.clientVer + ",a2=" + this.f60a2 + ",d2=" + this.f61d2 + ",d2Key=" + this.d2Key + ",}";
    }

    public GProInitSessionConfig(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, str4, str5, str6);
            return;
        }
        this.selfUid = "";
        this.clientVer = "";
        this.f60a2 = "";
        this.f61d2 = "";
        this.d2Key = "";
        this.selfUin = j;
        this.selfUid = str;
        this.gproDBName = str2;
        this.clientVer = str3;
        this.f60a2 = str4;
        this.f61d2 = str5;
        this.d2Key = str6;
    }
}
