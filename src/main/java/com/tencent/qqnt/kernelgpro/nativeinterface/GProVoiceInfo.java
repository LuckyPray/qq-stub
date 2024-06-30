package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceInfo.class */
public final class GProVoiceInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String screenPic;
    public long screenShareTinyId;
    public int screenState;
    public long screenUpdateTime;
    long serialVersionUID;
    public int voiceState;

    public GProVoiceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.screenPic = "";
        }
    }

    public String getScreenPic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.screenPic : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getScreenShareTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.screenShareTinyId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public int getScreenState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.screenState : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getScreenUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.screenUpdateTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getVoiceState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.voiceState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProVoiceInfo{voiceState=" + this.voiceState + ",screenState=" + this.screenState + ",screenPic=" + this.screenPic + ",screenUpdateTime=" + this.screenUpdateTime + ",screenShareTinyId=" + this.screenShareTinyId + ",}";
    }

    public GProVoiceInfo(int i, int i2, String str, long j, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(j), Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.screenPic = "";
        this.voiceState = i;
        this.screenState = i2;
        this.screenPic = str;
        this.screenUpdateTime = j;
        this.screenShareTinyId = j2;
    }
}
