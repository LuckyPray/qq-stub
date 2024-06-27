package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgFilterParams.class */
public final class MsgFilterParams {
    public ArrayList<MsgTypeFilter> filterMsgType;
    public ArrayList<String> filterSendersUid;

    public MsgFilterParams() {
        this.filterMsgType = new ArrayList<>();
        this.filterSendersUid = new ArrayList<>();
    }

    public ArrayList<MsgTypeFilter> getFilterMsgType() {
        return this.filterMsgType;
    }

    public ArrayList<String> getFilterSendersUid() {
        return this.filterSendersUid;
    }

    public String toString() {
        return "MsgFilterParams{filterMsgType=" + this.filterMsgType + ",filterSendersUid=" + this.filterSendersUid + ",}";
    }

    public MsgFilterParams(ArrayList<MsgTypeFilter> arrayList, ArrayList<String> arrayList2) {
        this.filterMsgType = new ArrayList<>();
        this.filterSendersUid = new ArrayList<>();
        this.filterMsgType = arrayList;
        this.filterSendersUid = arrayList2;
    }
}
