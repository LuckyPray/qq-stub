package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchChatSummaryItem.class */
public final class SearchChatSummaryItem {
    public int chatType;
    public int msgCount;
    public long msgTime;
    public String peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public SearchChatInfo chatInfo = new SearchChatInfo();
    public ArrayList<SearchBuddyChatInfo> buddyChatInfo = new ArrayList<>();
    public ArrayList<SearchDiscussChatInfo> discussChatInfo = new ArrayList<>();
    public ArrayList<SearchGroupChatInfo> groupChatInfo = new ArrayList<>();
    public ArrayList<SearchDataLineChatInfo> dataLineChatInfo = new ArrayList<>();
    public ArrayList<TempChatGameSession> tmpChatInfo = new ArrayList<>();
    public ArrayList<SearchMsgItem> msgItem = new ArrayList<>();

    public ArrayList<SearchBuddyChatInfo> getBuddyChatInfo() {
        return this.buddyChatInfo;
    }

    public SearchChatInfo getChatInfo() {
        return this.chatInfo;
    }

    public int getChatType() {
        return this.chatType;
    }

    public ArrayList<SearchDataLineChatInfo> getDataLineChatInfo() {
        return this.dataLineChatInfo;
    }

    public ArrayList<SearchDiscussChatInfo> getDiscussChatInfo() {
        return this.discussChatInfo;
    }

    public ArrayList<SearchGroupChatInfo> getGroupChatInfo() {
        return this.groupChatInfo;
    }

    public int getMsgCount() {
        return this.msgCount;
    }

    public ArrayList<SearchMsgItem> getMsgItem() {
        return this.msgItem;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public ArrayList<TempChatGameSession> getTmpChatInfo() {
        return this.tmpChatInfo;
    }

    public String toString() {
        return "SearchChatSummaryItem{chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",chatInfo=" + this.chatInfo + ",buddyChatInfo=" + this.buddyChatInfo + ",discussChatInfo=" + this.discussChatInfo + ",groupChatInfo=" + this.groupChatInfo + ",dataLineChatInfo=" + this.dataLineChatInfo + ",tmpChatInfo=" + this.tmpChatInfo + ",msgCount=" + this.msgCount + ",msgTime=" + this.msgTime + ",msgItem=" + this.msgItem + ",}";
    }
}
