package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAppChnnPreInfo.class */
public final class GProAppChnnPreInfo {
    static IPatchRedirector $redirector_;
    public long appid;
    public long channelId;
    public ArrayList<GProChannelPresenceInfo> chnnPreList;
    public String chnnPreSeq;
    public long guildId;
    public GProJoinCondition joinCondition;
    public int jumpType;
    public String jumpUrl;
    public int nextTimeStamp;
    public int result;
    public String text;

    public GProAppChnnPreInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.jumpUrl = "";
        this.text = "";
        this.chnnPreList = new ArrayList<>();
        this.chnnPreSeq = "";
        this.joinCondition = new GProJoinCondition();
    }

    public long getAppid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appid : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<GProChannelPresenceInfo> getChnnPreList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.chnnPreList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getChnnPreSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.chnnPreSeq : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProJoinCondition getJoinCondition() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.joinCondition : (GProJoinCondition) iPatchRedirector.redirect((short) 12, this);
    }

    public int getJumpType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.jumpType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getNextTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.nextTimeStamp : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.text : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProAppChnnPreInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",appid=" + this.appid + ",result=" + this.result + ",jumpUrl=" + this.jumpUrl + ",jumpType=" + this.jumpType + ",text=" + this.text + ",chnnPreList=" + this.chnnPreList + ",chnnPreSeq=" + this.chnnPreSeq + ",nextTimeStamp=" + this.nextTimeStamp + ",joinCondition=" + this.joinCondition + ",}";
    }
}
