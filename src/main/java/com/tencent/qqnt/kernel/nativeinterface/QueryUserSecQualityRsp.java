package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryUserSecQualityRsp.class */
public final class QueryUserSecQualityRsp {
    public UserSecQuality userSecQuality;

    public QueryUserSecQualityRsp() {
        this.userSecQuality = new UserSecQuality();
    }

    public UserSecQuality getUserSecQuality() {
        return this.userSecQuality;
    }

    public String toString() {
        return "QueryUserSecQualityRsp{userSecQuality=" + this.userSecQuality + ",}";
    }

    public QueryUserSecQualityRsp(UserSecQuality userSecQuality) {
        this.userSecQuality = new UserSecQuality();
        this.userSecQuality = userSecQuality;
    }
}
