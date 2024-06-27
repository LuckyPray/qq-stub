package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchMsgWithKeywordsParams.class */
public final class SearchMsgWithKeywordsParams {
    public int chatType;
    public int pageLimit;
    public String peerUid;
    public int searchFields;

    public SearchMsgWithKeywordsParams() {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public int getPageLimit() {
        return this.pageLimit;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getSearchFields() {
        return this.searchFields;
    }

    public String toString() {
        return "SearchMsgWithKeywordsParams{chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",searchFields=" + this.searchFields + ",pageLimit=" + this.pageLimit + ",}";
    }

    public SearchMsgWithKeywordsParams(int i, String str, int i2, int i3) {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.peerUid = str;
        this.searchFields = i2;
        this.pageLimit = i3;
    }
}
