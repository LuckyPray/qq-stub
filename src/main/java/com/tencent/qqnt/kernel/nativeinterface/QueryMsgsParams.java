package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryMsgsParams.class */
public final class QueryMsgsParams {
    public ChatInfo chatInfo;
    public long filterMsgFromTime;
    public long filterMsgToTime;
    public ArrayList<MsgTypeFilter> filterMsgType;
    public ArrayList<String> filterSendersUid;
    public boolean isIncludeCurrent;
    public boolean isReverseOrder;
    public int pageLimit;

    public QueryMsgsParams() {
        this.chatInfo = new ChatInfo();
        this.filterMsgType = new ArrayList<>();
        this.filterSendersUid = new ArrayList<>();
    }

    public ChatInfo getChatInfo() {
        return this.chatInfo;
    }

    public long getFilterMsgFromTime() {
        return this.filterMsgFromTime;
    }

    public long getFilterMsgToTime() {
        return this.filterMsgToTime;
    }

    public ArrayList<MsgTypeFilter> getFilterMsgType() {
        return this.filterMsgType;
    }

    public ArrayList<String> getFilterSendersUid() {
        return this.filterSendersUid;
    }

    public boolean getIsIncludeCurrent() {
        return this.isIncludeCurrent;
    }

    public boolean getIsReverseOrder() {
        return this.isReverseOrder;
    }

    public int getPageLimit() {
        return this.pageLimit;
    }

    public String toString() {
        return "QueryMsgsParams{chatInfo=" + this.chatInfo + ",filterMsgType=" + this.filterMsgType + ",filterSendersUid=" + this.filterSendersUid + ",filterMsgFromTime=" + this.filterMsgFromTime + ",filterMsgToTime=" + this.filterMsgToTime + ",pageLimit=" + this.pageLimit + ",isReverseOrder=" + this.isReverseOrder + ",isIncludeCurrent=" + this.isIncludeCurrent + ",}";
    }

    public QueryMsgsParams(ChatInfo chatInfo, ArrayList<MsgTypeFilter> arrayList, ArrayList<String> arrayList2, long j, long j2, int i, boolean z, boolean z2) {
        this.chatInfo = new ChatInfo();
        this.filterMsgType = new ArrayList<>();
        this.filterSendersUid = new ArrayList<>();
        this.chatInfo = chatInfo;
        this.filterMsgType = arrayList;
        this.filterSendersUid = arrayList2;
        this.filterMsgFromTime = j;
        this.filterMsgToTime = j2;
        this.pageLimit = i;
        this.isReverseOrder = z;
        this.isIncludeCurrent = z2;
    }
}
