package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSaveGuildNavigationReq.class */
public final class GProSaveGuildNavigationReq {
    static IPatchRedirector $redirector_;
    public long guildId;
    public String iconSelectorColor;
    public ArrayList<GProSaveNavigationItem> items;
    public long version;

    public GProSaveGuildNavigationReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.iconSelectorColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.items = new ArrayList<>();
        }
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getIconSelectorColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconSelectorColor : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProSaveNavigationItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.version : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setIconSelectorColor(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.iconSelectorColor = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public void setItems(ArrayList<GProSaveNavigationItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.items = arrayList;
        } else {
            iPatchRedirector.redirect((short) 9, this, arrayList);
        }
    }

    public void setVersion(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.version = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProSaveGuildNavigationReq{guildId=" + this.guildId + ",iconSelectorColor=" + this.iconSelectorColor + ",items=" + this.items + ",version=" + this.version + ",}";
    }

    public GProSaveGuildNavigationReq(long j, String str, ArrayList<GProSaveNavigationItem> arrayList, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, arrayList, Long.valueOf(j2)});
            return;
        }
        this.iconSelectorColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.items = new ArrayList<>();
        this.guildId = j;
        this.iconSelectorColor = str;
        this.items = arrayList;
        this.version = j2;
    }
}
