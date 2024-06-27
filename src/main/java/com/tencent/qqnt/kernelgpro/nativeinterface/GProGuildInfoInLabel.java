package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildInfoInLabel.class */
public final class GProGuildInfoInLabel implements Serializable {
    static IPatchRedirector $redirector_;
    public String guildIcon;
    public long guildId;
    public ArrayList<String> guildLabels;
    public String guildName;
    public int guildStatus;
    public String joinGuildSig;
    long serialVersionUID;

    public GProGuildInfoInLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildLabels = new ArrayList<>();
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<String> getGuildLabels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildLabels : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getGuildStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildStatus : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildInfoInLabel{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildIcon=" + this.guildIcon + ",guildLabels=" + this.guildLabels + ",guildStatus=" + this.guildStatus + ",joinGuildSig=" + this.joinGuildSig + ",}";
    }

    public GProGuildInfoInLabel(long j, String str, String str2, ArrayList<String> arrayList, int i, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, arrayList, Integer.valueOf(i), str3});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildLabels = new ArrayList<>();
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.guildName = str;
        this.guildIcon = str2;
        this.guildLabels = arrayList;
        this.guildStatus = i;
        this.joinGuildSig = str3;
    }
}
