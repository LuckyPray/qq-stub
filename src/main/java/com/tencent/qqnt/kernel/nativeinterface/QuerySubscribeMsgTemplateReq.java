package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QuerySubscribeMsgTemplateReq.class */
public final class QuerySubscribeMsgTemplateReq {
    public long robotUin;
    public ArrayList<SubscribeMsgTemplateID> templateId;

    public QuerySubscribeMsgTemplateReq() {
        this.templateId = new ArrayList<>();
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public ArrayList<SubscribeMsgTemplateID> getTemplateId() {
        return this.templateId;
    }

    public String toString() {
        return "QuerySubscribeMsgTemplateReq{robotUin=" + this.robotUin + ",templateId=" + this.templateId + ",}";
    }

    public QuerySubscribeMsgTemplateReq(long j, ArrayList<SubscribeMsgTemplateID> arrayList) {
        this.templateId = new ArrayList<>();
        this.robotUin = j;
        this.templateId = arrayList;
    }
}
