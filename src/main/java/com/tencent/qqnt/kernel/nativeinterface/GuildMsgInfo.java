package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildMsgInfo.class */
public final class GuildMsgInfo {
    public Long msgSeq;

    public GuildMsgInfo() {
    }

    public Long getMsgSeq() {
        return this.msgSeq;
    }

    public String toString() {
        return "GuildMsgInfo{msgSeq=" + this.msgSeq + ",}";
    }

    public GuildMsgInfo(Long l) {
        this.msgSeq = l;
    }
}
