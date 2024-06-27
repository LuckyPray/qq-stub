package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPollingData.class */
public final class GProPollingData {
    static IPatchRedirector $redirector_;
    public long channelId;
    public byte[] cookie;
    public byte[] data;
    public ArrayList<MsgAbstract> feedMsgAbstracts;
    public boolean forcePolling;
    public long guildId;
    public ArrayList<GProStickyChannel> guildStickyChannelList;
    public GProLiveResultItem liveResultItem;
    public ArrayList<MsgAbstract> msgAbstracts;
    public int type;
    public long updateTime;
    public long version;
    public GProChannelMemberInfos voiceChannel;

    public GProPollingData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.cookie = new byte[0];
        this.data = new byte[0];
        this.voiceChannel = new GProChannelMemberInfos();
        this.liveResultItem = new GProLiveResultItem();
        this.guildStickyChannelList = new ArrayList<>();
        this.msgAbstracts = new ArrayList<>();
        this.feedMsgAbstracts = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.data : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<MsgAbstract> getFeedMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.feedMsgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public boolean getForcePolling() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.forcePolling : ((Boolean) iPatchRedirector.redirect((short) 14, this)).booleanValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public ArrayList<GProStickyChannel> getGuildStickyChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildStickyChannelList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public GProLiveResultItem getLiveResultItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.liveResultItem : (GProLiveResultItem) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<MsgAbstract> getMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.msgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 15, this)).longValue();
    }

    public long getVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.version : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public GProChannelMemberInfos getVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.voiceChannel : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProPollingData{type=" + this.type + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",version=" + this.version + ",cookie=" + this.cookie + ",data=" + this.data + ",voiceChannel=" + this.voiceChannel + ",liveResultItem=" + this.liveResultItem + ",guildStickyChannelList=" + this.guildStickyChannelList + ",msgAbstracts=" + this.msgAbstracts + ",feedMsgAbstracts=" + this.feedMsgAbstracts + ",forcePolling=" + this.forcePolling + ",updateTime=" + this.updateTime + ",}";
    }

    public GProPollingData(int i, long j, long j2, long j3, byte[] bArr, byte[] bArr2, GProChannelMemberInfos gProChannelMemberInfos, GProLiveResultItem gProLiveResultItem, ArrayList<GProStickyChannel> arrayList, boolean z, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), bArr, bArr2, gProChannelMemberInfos, gProLiveResultItem, arrayList, Boolean.valueOf(z), Long.valueOf(j4)});
            return;
        }
        this.cookie = new byte[0];
        this.data = new byte[0];
        this.voiceChannel = new GProChannelMemberInfos();
        this.liveResultItem = new GProLiveResultItem();
        this.guildStickyChannelList = new ArrayList<>();
        this.msgAbstracts = new ArrayList<>();
        this.feedMsgAbstracts = new ArrayList<>();
        this.type = i;
        this.guildId = j;
        this.channelId = j2;
        this.version = j3;
        this.cookie = bArr;
        this.data = bArr2;
        this.voiceChannel = gProChannelMemberInfos;
        this.liveResultItem = gProLiveResultItem;
        this.guildStickyChannelList = arrayList;
        this.forcePolling = z;
        this.updateTime = j4;
    }
}
