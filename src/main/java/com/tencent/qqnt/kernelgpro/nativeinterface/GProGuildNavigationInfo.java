package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildNavigationInfo.class */
public final class GProGuildNavigationInfo {
    static IPatchRedirector $redirector_;
    public int auditStatus;
    public int compatibleFlag;
    public long guildId;
    public String guildName;
    public String iconSelectorColor;
    public String iconSelectorUrl;
    public ArrayList<GProNavigationV2Info> navigationList;
    public long version;

    public GProGuildNavigationInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.iconSelectorColor = "";
        this.navigationList = new ArrayList<>();
        this.guildName = "";
        this.iconSelectorUrl = "";
    }

    public int getAuditStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.auditStatus : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getCompatibleFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.compatibleFlag : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildName : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getIconSelectorColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconSelectorColor : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getIconSelectorUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.iconSelectorUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<GProNavigationV2Info> getNavigationList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.navigationList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.version : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGuildNavigationInfo{guildId=" + this.guildId + ",iconSelectorColor=" + this.iconSelectorColor + ",navigationList=" + this.navigationList + ",auditStatus=" + this.auditStatus + ",version=" + this.version + ",compatibleFlag=" + this.compatibleFlag + ",guildName=" + this.guildName + ",iconSelectorUrl=" + this.iconSelectorUrl + ",}";
    }

    public GProGuildNavigationInfo(long j, String str, ArrayList<GProNavigationV2Info> arrayList, int i, long j2, int i2, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, arrayList, Integer.valueOf(i), Long.valueOf(j2), Integer.valueOf(i2), str2, str3});
            return;
        }
        this.iconSelectorColor = "";
        this.navigationList = new ArrayList<>();
        this.guildName = "";
        this.iconSelectorUrl = "";
        this.guildId = j;
        this.iconSelectorColor = str;
        this.navigationList = arrayList;
        this.auditStatus = i;
        this.version = j2;
        this.compatibleFlag = i2;
        this.guildName = str2;
        this.iconSelectorUrl = str3;
    }
}
