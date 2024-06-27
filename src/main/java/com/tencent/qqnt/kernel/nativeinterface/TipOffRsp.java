package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TipOffRsp.class */
public final class TipOffRsp {
    public ArrayList<C2cMsgInfo> c2cMsgs;
    public Integer c2cType;
    public Long channelId;
    public String destUid;
    public Long destUin;
    public Long groupCode;
    public ArrayList<GroupMsgInfo> groupMsgs;
    public Long guildId;
    public ArrayList<GuildMsgInfo> guildMsgs;
    public LocalMsgInfo localMsg;
    public String resId;
    public Integer serviceType;
    public Integer type;

    public TipOffRsp() {
    }

    public ArrayList<C2cMsgInfo> getC2cMsgs() {
        return this.c2cMsgs;
    }

    public Integer getC2cType() {
        return this.c2cType;
    }

    public Long getChannelId() {
        return this.channelId;
    }

    public String getDestUid() {
        return this.destUid;
    }

    public Long getDestUin() {
        return this.destUin;
    }

    public Long getGroupCode() {
        return this.groupCode;
    }

    public ArrayList<GroupMsgInfo> getGroupMsgs() {
        return this.groupMsgs;
    }

    public Long getGuildId() {
        return this.guildId;
    }

    public ArrayList<GuildMsgInfo> getGuildMsgs() {
        return this.guildMsgs;
    }

    public LocalMsgInfo getLocalMsg() {
        return this.localMsg;
    }

    public String getResId() {
        return this.resId;
    }

    public Integer getServiceType() {
        return this.serviceType;
    }

    public Integer getType() {
        return this.type;
    }

    public String toString() {
        return "TipOffRsp{type=" + this.type + ",destUin=" + this.destUin + ",destUid=" + this.destUid + ",groupCode=" + this.groupCode + ",c2cMsgs=" + this.c2cMsgs + ",groupMsgs=" + this.groupMsgs + ",resId=" + this.resId + ",c2cType=" + this.c2cType + ",serviceType=" + this.serviceType + ",localMsg=" + this.localMsg + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",guildMsgs=" + this.guildMsgs + ",}";
    }

    public TipOffRsp(Integer num, Long l, String str, Long l2, ArrayList<C2cMsgInfo> arrayList, ArrayList<GroupMsgInfo> arrayList2, String str2, Integer num2, Integer num3, LocalMsgInfo localMsgInfo, Long l3, Long l4, ArrayList<GuildMsgInfo> arrayList3) {
        this.type = num;
        this.destUin = l;
        this.destUid = str;
        this.groupCode = l2;
        this.c2cMsgs = arrayList;
        this.groupMsgs = arrayList2;
        this.resId = str2;
        this.c2cType = num2;
        this.serviceType = num3;
        this.localMsg = localMsgInfo;
        this.guildId = l3;
        this.channelId = l4;
        this.guildMsgs = arrayList3;
    }
}
