package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBotFeatureInfo.class */
public final class GProBotFeatureInfo {
    static IPatchRedirector $redirector_;
    public String availableRangeDesc;
    public String desc;

    /* renamed from: id */
    public int f56id;
    public long mark;
    public String name;
    public int status;
    public int type;
    public String url;

    public GProBotFeatureInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvailableRangeDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.availableRangeDesc : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.desc : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f56id : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getMark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.mark : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.status : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.url : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProBotFeatureInfo{id=" + this.f56id + ",name=" + this.name + ",desc=" + this.desc + ",status=" + this.status + ",url=" + this.url + ",type=" + this.type + ",availableRangeDesc=" + this.availableRangeDesc + ",mark=" + this.mark + ",}";
    }

    public GProBotFeatureInfo(int i, String str, String str2, int i2, String str3, int i3, String str4, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2, Integer.valueOf(i2), str3, Integer.valueOf(i3), str4, Long.valueOf(j)});
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f56id = i;
        this.name = str;
        this.desc = str2;
        this.status = i2;
        this.url = str3;
        this.type = i3;
        this.availableRangeDesc = str4;
        this.mark = j;
    }
}
