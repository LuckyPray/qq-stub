package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadBaseEmojiByUrlReq.class */
public final class DownloadBaseEmojiByUrlReq {
    public String emojiId = "";
    public String groupName = "";
    public EmojiPanelCategory panelCategory = EmojiPanelCategory.values()[0];
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

    public EmojiPanelCategory getPanelCategory() {
        return this.panelCategory;
    }

    public String toString() {
        return "DownloadBaseEmojiByUrlReq{emojiId=" + this.emojiId + ",groupName=" + this.groupName + ",panelCategory=" + this.panelCategory + ",downloadInfo=" + this.downloadInfo + ",}";
    }
}
