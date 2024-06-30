package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProRecallRspItem.class */
public final class GProRecallRspItem {
    public long channelCode;
    public String channelId;
    public int directMsgFlag;
    public String msgBytes;
    public ArrayList<Long> msgSeqs;

    public GProRecallRspItem() {
        this.channelId = "";
        this.msgSeqs = new ArrayList<>();
        this.msgBytes = "";
    }

    public long getChannelCode() {
        return this.channelCode;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public int getDirectMsgFlag() {
        return this.directMsgFlag;
    }

    public String getMsgBytes() {
        return this.msgBytes;
    }

    public ArrayList<Long> getMsgSeqs() {
        return this.msgSeqs;
    }

    public String toString() {
        return "GProRecallRspItem{channelId=" + this.channelId + ",msgSeqs=" + this.msgSeqs + ",directMsgFlag=" + this.directMsgFlag + ",channelCode=" + this.channelCode + ",msgBytes=" + this.msgBytes + ",}";
    }

    public GProRecallRspItem(String str, ArrayList<Long> arrayList, int i, long j, String str2) {
        this.channelId = "";
        this.msgSeqs = new ArrayList<>();
        this.msgBytes = "";
        this.channelId = str;
        this.msgSeqs = arrayList;
        this.directMsgFlag = i;
        this.channelCode = j;
        this.msgBytes = str2;
    }
}
