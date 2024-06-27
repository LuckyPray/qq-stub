package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendLiveChannel.class */
public final class GProRecommendLiveChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendCoverInfo cover;
    public GProLiveRoomInfo liveChannel;
    public ArrayList<GProRecommendMsg> msgList;
    long serialVersionUID;

    public GProRecommendLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.liveChannel = new GProLiveRoomInfo();
        this.msgList = new ArrayList<>();
        this.cover = new GProRecommendCoverInfo();
    }

    public GProRecommendCoverInfo getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cover : (GProRecommendCoverInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProLiveRoomInfo getLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.liveChannel : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProRecommendMsg> getMsgList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendLiveChannel{liveChannel=" + this.liveChannel + ",msgList=" + this.msgList + ",cover=" + this.cover + ",}";
    }

    public GProRecommendLiveChannel(GProLiveRoomInfo gProLiveRoomInfo, ArrayList<GProRecommendMsg> arrayList, GProRecommendCoverInfo gProRecommendCoverInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLiveRoomInfo, arrayList, gProRecommendCoverInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.liveChannel = new GProLiveRoomInfo();
        this.msgList = new ArrayList<>();
        this.cover = new GProRecommendCoverInfo();
        this.liveChannel = gProLiveRoomInfo;
        this.msgList = arrayList;
        this.cover = gProRecommendCoverInfo;
    }
}
