package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchFileItem.class */
public final class SearchFileItem {
    public int chatType;
    public long elemId;
    public int elemType;
    public long fileSize;
    public long msgId;
    public long msgSeq;
    public long msgTime;
    public ArrayList<SearchBuddyChatInfo> buddyChatInfo = new ArrayList<>();
    public ArrayList<SearchDiscussChatInfo> discussChatInfo = new ArrayList<>();
    public ArrayList<SearchGroupChatInfo> groupChatInfo = new ArrayList<>();
    public ArrayList<SearchDataLineChatInfo> dataLineChatInfo = new ArrayList<>();
    public ArrayList<TempChatGameSession> tmpChatInfo = new ArrayList<>();
    public String senderUid = "";
    public String senderNick = "";
    public String senderRemark = "";
    public String senderCard = "";
    public String filePath = "";
    public String fileName = "";
    public ArrayList<SearchHitInfo> hits = new ArrayList<>();

    public ArrayList<SearchBuddyChatInfo> getBuddyChatInfo() {
        return this.buddyChatInfo;
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

    public long getElemId() {
        return this.elemId;
    }

    public int getElemType() {
        return this.elemType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public ArrayList<SearchGroupChatInfo> getGroupChatInfo() {
        return this.groupChatInfo;
    }

    public ArrayList<SearchHitInfo> getHits() {
        return this.hits;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getSenderCard() {
        return this.senderCard;
    }

    public String getSenderNick() {
        return this.senderNick;
    }

    public String getSenderRemark() {
        return this.senderRemark;
    }

    public String getSenderUid() {
        return this.senderUid;
    }

    public ArrayList<TempChatGameSession> getTmpChatInfo() {
        return this.tmpChatInfo;
    }

    public String toString() {
        return "SearchFileItem{chatType=" + this.chatType + ",buddyChatInfo=" + this.buddyChatInfo + ",discussChatInfo=" + this.discussChatInfo + ",groupChatInfo=" + this.groupChatInfo + ",dataLineChatInfo=" + this.dataLineChatInfo + ",tmpChatInfo=" + this.tmpChatInfo + ",msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",senderUid=" + this.senderUid + ",senderNick=" + this.senderNick + ",senderRemark=" + this.senderRemark + ",senderCard=" + this.senderCard + ",elemId=" + this.elemId + ",elemType=" + this.elemType + ",fileSize=" + this.fileSize + ",filePath=" + this.filePath + ",fileName=" + this.fileName + ",hits=" + this.hits + ",}";
    }
}
