package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/ChannelStateElement.class */
public final class ChannelStateElement implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<ChannStateItemInfo> channStateList;
    public long channelId;
    public int channelState;
    public long channelStateReq;
    public String firstMemberDisplayName;
    public long firstMemberTinyid;
    public long guildId;
    public int guildState;
    public int memberCount;
    public int memberMax;
    public long roomId;
    public String roomTitle;
    long serialVersionUID;
    public long updateTime;

    public ChannelStateElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.firstMemberDisplayName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roomTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channStateList = new ArrayList<>();
    }

    public ArrayList<ChannStateItemInfo> getChannStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.channStateList : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.channelState : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getChannelStateReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.channelStateReq : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public String getFirstMemberDisplayName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.firstMemberDisplayName : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getFirstMemberTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.firstMemberTinyid : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getGuildState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildState : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getMemberCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.memberCount : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getMemberMax() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberMax : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String getRoomTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.roomTitle : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "ChannelStateElement{guildId=" + this.guildId + ",channelId=" + this.channelId + ",memberCount=" + this.memberCount + ",memberMax=" + this.memberMax + ",firstMemberTinyid=" + this.firstMemberTinyid + ",firstMemberDisplayName=" + this.firstMemberDisplayName + ",guildState=" + this.guildState + ",channelState=" + this.channelState + ",channelStateReq=" + this.channelStateReq + ",updateTime=" + this.updateTime + ",roomId=" + this.roomId + ",roomTitle=" + this.roomTitle + ",channStateList=" + this.channStateList + ",}";
    }

    public ChannelStateElement(long j, long j2, int i, int i2, long j3, String str, int i3, int i4, long j4, long j5, long j6, String str2, ArrayList<ChannStateItemInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j3), str, Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), str2, arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.firstMemberDisplayName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roomTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channStateList = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.memberCount = i;
        this.memberMax = i2;
        this.firstMemberTinyid = j3;
        this.firstMemberDisplayName = str;
        this.guildState = i3;
        this.channelState = i4;
        this.channelStateReq = j4;
        this.updateTime = j5;
        this.roomId = j6;
        this.roomTitle = str2;
        this.channStateList = arrayList;
    }
}
