package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DoubtBuddyReqListRsp.class */
public final class DoubtBuddyReqListRsp {
    public String cookie;
    public ArrayList<DoubtBuddyReqInfo> doubtList;
    public String reqId;

    public DoubtBuddyReqListRsp() {
        this.reqId = "";
        this.cookie = "";
        this.doubtList = new ArrayList<>();
    }

    public String getCookie() {
        return this.cookie;
    }

    public ArrayList<DoubtBuddyReqInfo> getDoubtList() {
        return this.doubtList;
    }

    public String getReqId() {
        return this.reqId;
    }

    public String toString() {
        return "DoubtBuddyReqListRsp{reqId=" + this.reqId + ",cookie=" + this.cookie + ",doubtList=" + this.doubtList + ",}";
    }

    public DoubtBuddyReqListRsp(String str, String str2, ArrayList<DoubtBuddyReqInfo> arrayList) {
        this.reqId = "";
        this.cookie = "";
        this.doubtList = new ArrayList<>();
        this.reqId = str;
        this.cookie = str2;
        this.doubtList = arrayList;
    }
}
