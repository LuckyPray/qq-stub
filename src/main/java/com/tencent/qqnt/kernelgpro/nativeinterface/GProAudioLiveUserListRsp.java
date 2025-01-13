package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAudioLiveUserListRsp.class */
public final class GProAudioLiveUserListRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProChannelMemberInfos channelMemberInfo;
    public GProChannelUserNum channelUserNum;
    public GProChannelMemberInfos handUpMemberInfo;
    public boolean isEndPage;
    public long nextReadInterval;
    long serialVersionUID;
    public GProChannelMemberInfos speakOrderMemberInfo;

    public GProAudioLiveUserListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelMemberInfo = new GProChannelMemberInfos();
        this.handUpMemberInfo = new GProChannelMemberInfos();
        this.speakOrderMemberInfo = new GProChannelMemberInfos();
        this.channelUserNum = new GProChannelUserNum();
    }

    public GProChannelMemberInfos getChannelMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelMemberInfo : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 3, this);
    }

    public GProChannelUserNum getChannelUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelUserNum : (GProChannelUserNum) iPatchRedirector.redirect((short) 8, this);
    }

    public GProChannelMemberInfos getHandUpMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.handUpMemberInfo : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsEndPage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isEndPage : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public long getNextReadInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nextReadInterval : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProChannelMemberInfos getSpeakOrderMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.speakOrderMemberInfo : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAudioLiveUserListRsp{channelMemberInfo=" + this.channelMemberInfo + ",handUpMemberInfo=" + this.handUpMemberInfo + ",nextReadInterval=" + this.nextReadInterval + ",isEndPage=" + this.isEndPage + ",speakOrderMemberInfo=" + this.speakOrderMemberInfo + ",channelUserNum=" + this.channelUserNum + ",}";
    }

    public GProAudioLiveUserListRsp(GProChannelMemberInfos gProChannelMemberInfos, GProChannelMemberInfos gProChannelMemberInfos2, long j, boolean z, GProChannelMemberInfos gProChannelMemberInfos3, GProChannelUserNum gProChannelUserNum) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProChannelMemberInfos, gProChannelMemberInfos2, Long.valueOf(j), Boolean.valueOf(z), gProChannelMemberInfos3, gProChannelUserNum);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelMemberInfo = new GProChannelMemberInfos();
        this.handUpMemberInfo = new GProChannelMemberInfos();
        this.speakOrderMemberInfo = new GProChannelMemberInfos();
        this.channelUserNum = new GProChannelUserNum();
        this.channelMemberInfo = gProChannelMemberInfos;
        this.handUpMemberInfo = gProChannelMemberInfos2;
        this.nextReadInterval = j;
        this.isEndPage = z;
        this.speakOrderMemberInfo = gProChannelMemberInfos3;
        this.channelUserNum = gProChannelUserNum;
    }
}
