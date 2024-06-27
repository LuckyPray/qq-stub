package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchReportInfo.class */
public final class SearchReportInfo {
    public String eid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String reportInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getEid() {
        return this.eid;
    }

    public String getReportInfo() {
        return this.reportInfo;
    }

    public String toString() {
        return "SearchReportInfo{eid=" + this.eid + ",reportInfo=" + this.reportInfo + ",}";
    }
}
