package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QuerySubscribeMsgTemplateStatusRsp.class */
public final class QuerySubscribeMsgTemplateStatusRsp {
    public boolean isEnd;
    public ArrayList<SubscribeMsgTemplateStatus> templateStatus = new ArrayList<>();
    public int total;

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<SubscribeMsgTemplateStatus> getTemplateStatus() {
        return this.templateStatus;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "QuerySubscribeMsgTemplateStatusRsp{templateStatus=" + this.templateStatus + ",total=" + this.total + ",isEnd=" + this.isEnd + ",}";
    }
}
