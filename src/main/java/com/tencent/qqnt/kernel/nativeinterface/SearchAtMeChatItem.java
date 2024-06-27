package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchAtMeChatItem.class */
public final class SearchAtMeChatItem {
    public ArrayList<SearchGroupChatInfo> groupChatInfo;
    public int msgCount;
    public MsgRecord msgRecord;
    public String selfGroupCardName;

    public SearchAtMeChatItem() {
        this.groupChatInfo = new ArrayList<>();
        this.selfGroupCardName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<SearchGroupChatInfo> getGroupChatInfo() {
        return this.groupChatInfo;
    }

    public int getMsgCount() {
        return this.msgCount;
    }

    public MsgRecord getMsgRecord() {
        return this.msgRecord;
    }

    public String getSelfGroupCardName() {
        return this.selfGroupCardName;
    }

    public String toString() {
        return "SearchAtMeChatItem{groupChatInfo=" + this.groupChatInfo + ",msgCount=" + this.msgCount + ",selfGroupCardName=" + this.selfGroupCardName + ",msgRecord=" + this.msgRecord + ",}";
    }

    public SearchAtMeChatItem(ArrayList<SearchGroupChatInfo> arrayList, int i, String str, MsgRecord msgRecord) {
        this.groupChatInfo = new ArrayList<>();
        this.selfGroupCardName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupChatInfo = arrayList;
        this.msgCount = i;
        this.selfGroupCardName = str;
        this.msgRecord = msgRecord;
    }
}
