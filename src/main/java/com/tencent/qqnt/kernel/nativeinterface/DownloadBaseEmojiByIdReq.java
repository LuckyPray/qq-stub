package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadBaseEmojiByIdReq.class */
public final class DownloadBaseEmojiByIdReq {
    public String groupName;
    public EmojiPanelCategory panelCategory;
    public String emojiId = "";
    public String qzoneCode = "";

    public String getEmojiId() {
        return this.emojiId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public EmojiPanelCategory getPanelCategory() {
        return this.panelCategory;
    }

    public String getQzoneCode() {
        return this.qzoneCode;
    }

    public String toString() {
        return "DownloadBaseEmojiByIdReq{emojiId=" + this.emojiId + ",qzoneCode=" + this.qzoneCode + ",groupName=" + this.groupName + ",panelCategory=" + this.panelCategory + ",}";
    }
}
