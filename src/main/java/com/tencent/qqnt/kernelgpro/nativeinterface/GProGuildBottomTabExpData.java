package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildBottomTabExpData.class */
public final class GProGuildBottomTabExpData implements Serializable {
    static IPatchRedirector $redirector_;
    public GProDiscoveryData discoveryData;
    public long expId;
    public String expIndex;
    public boolean isHit;
    long serialVersionUID;
    public int tabType;
    public GProNewUserGuideData userGuideData;

    public GProGuildBottomTabExpData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.expIndex = "";
        this.userGuideData = new GProNewUserGuideData();
        this.discoveryData = new GProDiscoveryData();
    }

    public GProDiscoveryData getDiscoveryData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.discoveryData : (GProDiscoveryData) iPatchRedirector.redirect((short) 8, this);
    }

    public long getExpId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.expId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getExpIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.expIndex : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getIsHit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isHit : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public int getTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.tabType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProNewUserGuideData getUserGuideData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.userGuideData : (GProNewUserGuideData) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildBottomTabExpData{isHit=" + this.isHit + ",expId=" + this.expId + ",expIndex=" + this.expIndex + ",tabType=" + this.tabType + ",userGuideData=" + this.userGuideData + ",discoveryData=" + this.discoveryData + ",}";
    }

    public GProGuildBottomTabExpData(boolean z, long j, String str, int i, GProNewUserGuideData gProNewUserGuideData, GProDiscoveryData gProDiscoveryData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), Long.valueOf(j), str, Integer.valueOf(i), gProNewUserGuideData, gProDiscoveryData});
            return;
        }
        this.serialVersionUID = 1L;
        this.expIndex = "";
        this.userGuideData = new GProNewUserGuideData();
        this.discoveryData = new GProDiscoveryData();
        this.isHit = z;
        this.expId = j;
        this.expIndex = str;
        this.tabType = i;
        this.userGuideData = gProNewUserGuideData;
        this.discoveryData = gProDiscoveryData;
    }
}
