package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchChatMsgsParams.class */
public final class SearchChatMsgsParams {
    public ChatInfo chatInfo;
    public long filterMsgFromTime;
    public long filterMsgToTime;
    public ArrayList<MsgTypeFilter> filterMsgType;
    public ArrayList<String> filterSendersUid;
    public int pageLimit;
    public int searchFields;

    public SearchChatMsgsParams() {
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

    public int getPageLimit() {
        return this.pageLimit;
    }

    public int getSearchFields() {
        return this.searchFields;
    }

    public String toString() {
        return "SearchChatMsgsParams{chatInfo=" + this.chatInfo + ",searchFields=" + this.searchFields + ",filterMsgType=" + this.filterMsgType + ",filterSendersUid=" + this.filterSendersUid + ",filterMsgFromTime=" + this.filterMsgFromTime + ",filterMsgToTime=" + this.filterMsgToTime + ",pageLimit=" + this.pageLimit + ",}";
    }

    public SearchChatMsgsParams(ChatInfo chatInfo, int i, ArrayList<MsgTypeFilter> arrayList, ArrayList<String> arrayList2, long j, long j2, int i2) {
        this.chatInfo = new ChatInfo();
        this.filterMsgType = new ArrayList<>();
        this.filterSendersUid = new ArrayList<>();
        this.chatInfo = chatInfo;
        this.searchFields = i;
        this.filterMsgType = arrayList;
        this.filterSendersUid = arrayList2;
        this.filterMsgFromTime = j;
        this.filterMsgToTime = j2;
        this.pageLimit = i2;
    }
}
