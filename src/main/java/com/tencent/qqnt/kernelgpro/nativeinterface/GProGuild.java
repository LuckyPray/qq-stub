package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuild.class */
public final class GProGuild implements Serializable {
    static IPatchRedirector $redirector_;
    public GProCmdUinInfo cmdUinInfo;
    public String errMsg;
    public long guildId;
    public GProGuildInfo guildInfo;
    public int privateChannelMemberMaxNum;
    public int result;
    long serialVersionUID;

    public GProGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildInfo = new GProGuildInfo();
        this.cmdUinInfo = new GProCmdUinInfo();
    }

    public GProCmdUinInfo getCmdUinInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cmdUinInfo : (GProCmdUinInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public String getErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.errMsg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProGuildInfo getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildInfo : (GProGuildInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public int getPrivateChannelMemberMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.privateChannelMemberMaxNum : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setCmdUinInfo(GProCmdUinInfo gProCmdUinInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.cmdUinInfo = gProCmdUinInfo;
        } else {
            iPatchRedirector.redirect((short) 13, this, gProCmdUinInfo);
        }
    }

    public void setErrMsg(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.errMsg = str;
        } else {
            iPatchRedirector.redirect((short) 10, this, str);
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

    public void setGuildInfo(GProGuildInfo gProGuildInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.guildInfo = gProGuildInfo;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProGuildInfo);
        }
    }

    public void setPrivateChannelMemberMaxNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.privateChannelMemberMaxNum = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setResult(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.result = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProGuild{result=" + this.result + ",errMsg=" + this.errMsg + ",guildId=" + this.guildId + ",guildInfo=" + this.guildInfo + ",cmdUinInfo=" + this.cmdUinInfo + ",privateChannelMemberMaxNum=" + this.privateChannelMemberMaxNum + ",}";
    }

    public GProGuild(int i, String str, long j, GProGuildInfo gProGuildInfo, GProCmdUinInfo gProCmdUinInfo, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Long.valueOf(j), gProGuildInfo, gProCmdUinInfo, Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildInfo = new GProGuildInfo();
        this.cmdUinInfo = new GProCmdUinInfo();
        this.result = i;
        this.errMsg = str;
        this.guildId = j;
        this.guildInfo = gProGuildInfo;
        this.cmdUinInfo = gProCmdUinInfo;
        this.privateChannelMemberMaxNum = i2;
    }
}
