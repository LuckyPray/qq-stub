package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ReqToGroup.class */
public final class ReqToGroup {
    public long groupCode;
    public int sourceId;
    public int sourceSubId;
    public String applyMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String auth = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String token = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getApplyMsg() {
        return this.applyMsg;
    }

    public String getAuth() {
        return this.auth;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getSourceId() {
        return this.sourceId;
    }

    public int getSourceSubId() {
        return this.sourceSubId;
    }

    public String getToken() {
        return this.token;
    }

    public String toString() {
        return "ReqToGroup{groupCode=" + this.groupCode + ",sourceId=" + this.sourceId + ",sourceSubId=" + this.sourceSubId + ",applyMsg=" + this.applyMsg + ",auth=" + this.auth + ",token=" + this.token + ",}";
    }
}
