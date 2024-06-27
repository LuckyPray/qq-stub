package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEnterAudioLiveChannelReq.class */
public final class GProEnterAudioLiveChannelReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public boolean forceTRTCSign;
    public long guildId;
    public String joinSourceType;
    public int sourceType;

    public GProEnterAudioLiveChannelReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.joinSourceType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public boolean getForceTRTCSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.forceTRTCSign : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getJoinSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.joinSourceType : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setChannelType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.channelType = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setForceTRTCSign(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.forceTRTCSign = z;
        } else {
            iPatchRedirector.redirect((short) 12, this, z);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setJoinSourceType(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.joinSourceType = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public void setSourceType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.sourceType = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProEnterAudioLiveChannelReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",sourceType=" + this.sourceType + ",forceTRTCSign=" + this.forceTRTCSign + ",joinSourceType=" + this.joinSourceType + ",channelType=" + this.channelType + ",}";
    }

    public GProEnterAudioLiveChannelReq(long j, long j2, int i, boolean z, String str, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), str, Integer.valueOf(i2)});
            return;
        }
        this.joinSourceType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.sourceType = i;
        this.forceTRTCSign = z;
        this.joinSourceType = str;
        this.channelType = i2;
    }
}
