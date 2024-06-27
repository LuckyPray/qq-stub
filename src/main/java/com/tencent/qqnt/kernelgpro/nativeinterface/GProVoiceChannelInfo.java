package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceChannelInfo.class */
public final class GProVoiceChannelInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int actualMaxNum;
    public int allowOtherRaiseHand;
    public int inviteSpeakState;
    public int memberMaxNum;
    public int noMemberMaxLimit;
    long serialVersionUID;
    public int speakMode;
    public int speakSecond;
    public int voiceQueueState;
    public int voicingControlMode;

    public GProVoiceChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getActualMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.actualMaxNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getAllowOtherRaiseHand() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.allowOtherRaiseHand : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getInviteSpeakState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.inviteSpeakState : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getMemberMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.memberMaxNum : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getNoMemberMaxLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.noMemberMaxLimit : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getSpeakMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.speakMode : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getSpeakSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.speakSecond : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getVoiceQueueState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.voiceQueueState : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getVoicingControlMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.voicingControlMode : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProVoiceChannelInfo{memberMaxNum=" + this.memberMaxNum + ",voicingControlMode=" + this.voicingControlMode + ",allowOtherRaiseHand=" + this.allowOtherRaiseHand + ",noMemberMaxLimit=" + this.noMemberMaxLimit + ",actualMaxNum=" + this.actualMaxNum + ",speakMode=" + this.speakMode + ",speakSecond=" + this.speakSecond + ",voiceQueueState=" + this.voiceQueueState + ",inviteSpeakState=" + this.inviteSpeakState + ",}";
    }
}
