package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupLinkReq.class */
public final class GroupLinkReq {
    public String additionalParam;
    public long groupCode;
    public boolean needShortUrl;
    public int srcId;

    public GroupLinkReq() {
        this.additionalParam = "";
    }

    public String getAdditionalParam() {
        return this.additionalParam;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getNeedShortUrl() {
        return this.needShortUrl;
    }

    public int getSrcId() {
        return this.srcId;
    }

    public String toString() {
        return "GroupLinkReq{groupCode=" + this.groupCode + ",srcId=" + this.srcId + ",additionalParam=" + this.additionalParam + ",needShortUrl=" + this.needShortUrl + ",}";
    }

    public GroupLinkReq(long j, int i, String str, boolean z) {
        this.additionalParam = "";
        this.groupCode = j;
        this.srcId = i;
        this.additionalParam = str;
        this.needShortUrl = z;
    }
}
