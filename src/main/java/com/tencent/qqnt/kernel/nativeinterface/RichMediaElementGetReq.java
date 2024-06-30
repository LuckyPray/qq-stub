package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RichMediaElementGetReq.class */
public final class RichMediaElementGetReq implements IKernelModel {
    public int chatType;
    public int downSourceType;
    public int downloadType;
    public long elementId;
    public long fileModelId;
    public String filePath;
    public long msgId;
    public String peerUid;
    public int thumbSize;
    public int triggerType;

    public RichMediaElementGetReq() {
        this.peerUid = "";
        this.filePath = "";
    }

    public int getChatType() {
        return this.chatType;
    }

    public int getDownSourceType() {
        return this.downSourceType;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getElementId() {
        return this.elementId;
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getThumbSize() {
        return this.thumbSize;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public void setChatType(int i) {
        this.chatType = i;
    }

    public void setDownSourceType(int i) {
        this.downSourceType = i;
    }

    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    public void setElementId(long j) {
        this.elementId = j;
    }

    public void setFileModelId(long j) {
        this.fileModelId = j;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setPeerUid(String str) {
        this.peerUid = str;
    }

    public void setThumbSize(int i) {
        this.thumbSize = i;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }

    public String toString() {
        return "RichMediaElementGetReq{msgId=" + this.msgId + ",peerUid=" + this.peerUid + ",chatType=" + this.chatType + ",elementId=" + this.elementId + ",downloadType=" + this.downloadType + ",thumbSize=" + this.thumbSize + ",filePath=" + this.filePath + ",fileModelId=" + this.fileModelId + ",downSourceType=" + this.downSourceType + ",triggerType=" + this.triggerType + ",}";
    }

    public RichMediaElementGetReq(long j, String str, int i, long j2, int i2, int i3, String str2, long j3, int i4, int i5) {
        this.peerUid = "";
        this.filePath = "";
        this.msgId = j;
        this.peerUid = str;
        this.chatType = i;
        this.elementId = j2;
        this.downloadType = i2;
        this.thumbSize = i3;
        this.filePath = str2;
        this.fileModelId = j3;
        this.downSourceType = i4;
        this.triggerType = i5;
    }
}
