package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProItemIdInfo.class */
public final class GProItemIdInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public long itemIdI64;
    public String itemIdStr;
    public int itemType;
    public String originId;
    long serialVersionUID;

    public GProItemIdInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.itemIdStr = "";
        this.originId = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getItemIdI64() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.itemIdI64 : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getItemIdStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.itemIdStr : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getItemType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.itemType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getOriginId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.originId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 12, this, j);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setItemIdI64(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.itemIdI64 = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setItemIdStr(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.itemIdStr = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setItemType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.itemType = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setOriginId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.originId = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProItemIdInfo{itemIdStr=" + this.itemIdStr + ",itemIdI64=" + this.itemIdI64 + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",itemType=" + this.itemType + ",originId=" + this.originId + ",}";
    }

    public GProItemIdInfo(String str, long j, long j2, long j3, int i, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.itemIdStr = "";
        this.originId = "";
        this.itemIdStr = str;
        this.itemIdI64 = j;
        this.guildId = j2;
        this.channelId = j3;
        this.itemType = i;
        this.originId = str2;
    }
}
