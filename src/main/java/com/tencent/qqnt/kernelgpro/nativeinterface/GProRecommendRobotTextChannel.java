package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendRobotTextChannel.class */
public final class GProRecommendRobotTextChannel {
    static IPatchRedirector $redirector_;
    public ArrayList<String> avatars;
    public GProRecommendChannelInfo channelInfo;
    public ArrayList<MsgAbstract> msgAbstracts;

    public GProRecommendRobotTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.channelInfo = new GProRecommendChannelInfo();
        this.msgAbstracts = new ArrayList<>();
        this.avatars = new ArrayList<>();
    }

    public ArrayList<String> getAvatars() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatars : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelInfo : (GProRecommendChannelInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<MsgAbstract> getMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendRobotTextChannel{channelInfo=" + this.channelInfo + ",msgAbstracts=" + this.msgAbstracts + ",avatars=" + this.avatars + ",}";
    }

    public GProRecommendRobotTextChannel(GProRecommendChannelInfo gProRecommendChannelInfo, ArrayList<MsgAbstract> arrayList, ArrayList<String> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendChannelInfo, arrayList, arrayList2);
            return;
        }
        this.channelInfo = new GProRecommendChannelInfo();
        this.msgAbstracts = new ArrayList<>();
        this.avatars = new ArrayList<>();
        this.channelInfo = gProRecommendChannelInfo;
        this.msgAbstracts = arrayList;
        this.avatars = arrayList2;
    }
}
