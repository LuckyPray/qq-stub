package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProRecallReqItem.class */
public final class GProRecallReqItem {
    public String channelId;
    public int directMsgFlag;
    public ArrayList<Long> msgIds;

    public GProRecallReqItem() {
        this.channelId = "";
        this.msgIds = new ArrayList<>();
    }

    public String getChannelId() {
        return this.channelId;
    }

    public int getDirectMsgFlag() {
        return this.directMsgFlag;
    }

    public ArrayList<Long> getMsgIds() {
        return this.msgIds;
    }

    public String toString() {
        return "GProRecallReqItem{channelId=" + this.channelId + ",msgIds=" + this.msgIds + ",directMsgFlag=" + this.directMsgFlag + ",}";
    }

    public GProRecallReqItem(String str, ArrayList<Long> arrayList, int i) {
        this.channelId = "";
        this.msgIds = new ArrayList<>();
        this.channelId = str;
        this.msgIds = arrayList;
        this.directMsgFlag = i;
    }
}
