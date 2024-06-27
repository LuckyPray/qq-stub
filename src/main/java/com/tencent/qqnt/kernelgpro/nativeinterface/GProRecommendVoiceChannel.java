package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendVoiceChannel.class */
public final class GProRecommendVoiceChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendCoverInfo cover;
    long serialVersionUID;
    public GProChannelMemberInfos voiceChannel;

    public GProRecommendVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.voiceChannel = new GProChannelMemberInfos();
        this.cover = new GProRecommendCoverInfo();
    }

    public GProRecommendCoverInfo getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cover : (GProRecommendCoverInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProChannelMemberInfos getVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.voiceChannel : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendVoiceChannel{voiceChannel=" + this.voiceChannel + ",cover=" + this.cover + ",}";
    }

    public GProRecommendVoiceChannel(GProChannelMemberInfos gProChannelMemberInfos, GProRecommendCoverInfo gProRecommendCoverInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProChannelMemberInfos, gProRecommendCoverInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.voiceChannel = new GProChannelMemberInfos();
        this.cover = new GProRecommendCoverInfo();
        this.voiceChannel = gProChannelMemberInfos;
        this.cover = gProRecommendCoverInfo;
    }
}
