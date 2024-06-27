package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNetSugWordsReq.class */
public final class SearchNetSugWordsReq {
    public int sugWordScene;
    public String keyWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public SearchTabInfo tab = new SearchTabInfo();
    public byte[] bytesExtension = new byte[0];

    public byte[] getBytesExtension() {
        return this.bytesExtension;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public int getSugWordScene() {
        return this.sugWordScene;
    }

    public SearchTabInfo getTab() {
        return this.tab;
    }

    public String toString() {
        return "SearchNetSugWordsReq{keyWord=" + this.keyWord + ",sugWordScene=" + this.sugWordScene + ",tab=" + this.tab + ",bytesExtension=" + this.bytesExtension + ",}";
    }
}
