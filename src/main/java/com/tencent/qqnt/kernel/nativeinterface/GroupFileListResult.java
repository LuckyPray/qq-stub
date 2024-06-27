package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupFileListResult.class */
public final class GroupFileListResult {
    public int allFileCount;
    public String clientWording;
    public boolean isEnd;
    public ArrayList<GroupItem> item;
    public int nextIndex;
    public int reqId;
    public int retCode;
    public String retMsg;

    public GroupFileListResult() {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.item = new ArrayList<>();
    }

    public int getAllFileCount() {
        return this.allFileCount;
    }

    public String getClientWording() {
        return this.clientWording;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<GroupItem> getItem() {
        return this.item;
    }

    public int getNextIndex() {
        return this.nextIndex;
    }

    public int getReqId() {
        return this.reqId;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public String toString() {
        return "GroupFileListResult{retCode=" + this.retCode + ",retMsg=" + this.retMsg + ",clientWording=" + this.clientWording + ",isEnd=" + this.isEnd + ",item=" + this.item + ",allFileCount=" + this.allFileCount + ",nextIndex=" + this.nextIndex + ",reqId=" + this.reqId + ",}";
    }

    public GroupFileListResult(int i, String str, String str2, boolean z, ArrayList<GroupItem> arrayList, int i2, int i3, int i4) {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.item = new ArrayList<>();
        this.retCode = i;
        this.retMsg = str;
        this.clientWording = str2;
        this.isEnd = z;
        this.item = arrayList;
        this.allFileCount = i2;
        this.nextIndex = i3;
        this.reqId = i4;
    }
}
