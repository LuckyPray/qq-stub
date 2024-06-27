package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CompleteRecentContactInfo.class */
public final class CompleteRecentContactInfo {
    public ArrayList<RecentContactInfo> changedList;
    public byte[] dataBuffer;
    public int errCode;
    public String errMsg;
    public ArrayList<Long> sortedContactList;

    public CompleteRecentContactInfo() {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sortedContactList = new ArrayList<>();
        this.changedList = new ArrayList<>();
    }

    public ArrayList<RecentContactInfo> getChangedList() {
        return this.changedList;
    }

    public byte[] getDataBuffer() {
        return this.dataBuffer;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public ArrayList<Long> getSortedContactList() {
        return this.sortedContactList;
    }

    public String toString() {
        return "CompleteRecentContactInfo{errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",sortedContactList=" + this.sortedContactList + ",changedList=" + this.changedList + ",dataBuffer=" + this.dataBuffer + ",}";
    }

    public CompleteRecentContactInfo(int i, String str, ArrayList<Long> arrayList, ArrayList<RecentContactInfo> arrayList2, byte[] bArr) {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sortedContactList = new ArrayList<>();
        this.changedList = new ArrayList<>();
        this.errCode = i;
        this.errMsg = str;
        this.sortedContactList = arrayList;
        this.changedList = arrayList2;
        this.dataBuffer = bArr;
    }
}
