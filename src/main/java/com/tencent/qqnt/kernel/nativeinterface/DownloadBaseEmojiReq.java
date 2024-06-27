package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadBaseEmojiReq.class */
public final class DownloadBaseEmojiReq {
    public String emojiId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public DownloadBaseEmojiInfo downloadInfo = new DownloadBaseEmojiInfo();

    public DownloadBaseEmojiInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String toString() {
        return "DownloadBaseEmojiReq{emojiId=" + this.emojiId + ",groupName=" + this.groupName + ",downloadInfo=" + this.downloadInfo + ",}";
    }
}
