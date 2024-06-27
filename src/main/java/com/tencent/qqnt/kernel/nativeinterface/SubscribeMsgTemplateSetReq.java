package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SubscribeMsgTemplateSetReq.class */
public final class SubscribeMsgTemplateSetReq {
    public long groupId;
    public long guildId;
    public long robotUin;
    public ArrayList<SubscribeMsgTemplateOp> setOp;

    public SubscribeMsgTemplateSetReq() {
        this.setOp = new ArrayList<>();
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public ArrayList<SubscribeMsgTemplateOp> getSetOp() {
        return this.setOp;
    }

    public String toString() {
        return "SubscribeMsgTemplateSetReq{groupId=" + this.groupId + ",guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",setOp=" + this.setOp + ",}";
    }

    public SubscribeMsgTemplateSetReq(long j, long j2, long j3, ArrayList<SubscribeMsgTemplateOp> arrayList) {
        this.setOp = new ArrayList<>();
        this.groupId = j;
        this.guildId = j2;
        this.robotUin = j3;
        this.setOp = arrayList;
    }
}
