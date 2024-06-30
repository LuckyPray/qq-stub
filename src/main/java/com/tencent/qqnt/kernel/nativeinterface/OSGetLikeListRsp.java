package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSGetLikeListRsp.class */
public final class OSGetLikeListRsp {
    public int errCode;
    public String errMsg;
    public int interval;
    public ArrayList<OSLikeNotifyItem> notifyItems;
    public int timeout;
    public int unreadNum;

    public OSGetLikeListRsp() {
        this.notifyItems = new ArrayList<>();
        this.errMsg = "";
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getInterval() {
        return this.interval;
    }

    public ArrayList<OSLikeNotifyItem> getNotifyItems() {
        return this.notifyItems;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public int getUnreadNum() {
        return this.unreadNum;
    }

    public String toString() {
        return "OSGetLikeListRsp{unreadNum=" + this.unreadNum + ",notifyItems=" + this.notifyItems + ",interval=" + this.interval + ",timeout=" + this.timeout + ",errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",}";
    }

    public OSGetLikeListRsp(int i, ArrayList<OSLikeNotifyItem> arrayList, int i2, int i3, int i4, String str) {
        this.notifyItems = new ArrayList<>();
        this.errMsg = "";
        this.unreadNum = i;
        this.notifyItems = arrayList;
        this.interval = i2;
        this.timeout = i3;
        this.errCode = i4;
        this.errMsg = str;
    }
}
