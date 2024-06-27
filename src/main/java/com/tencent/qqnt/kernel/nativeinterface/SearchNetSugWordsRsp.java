package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNetSugWordsRsp.class */
public final class SearchNetSugWordsRsp {
    public ArrayList<SearchNetSugInfo> netSugInfos = new ArrayList<>();
    public String stringExtension = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public ArrayList<SearchNetSugInfo> getNetSugInfos() {
        return this.netSugInfos;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public String toString() {
        return "SearchNetSugWordsRsp{netSugInfos=" + this.netSugInfos + ",stringExtension=" + this.stringExtension + ",}";
    }
}
