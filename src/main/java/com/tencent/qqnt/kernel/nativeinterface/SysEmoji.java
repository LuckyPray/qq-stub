package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SysEmoji.class */
public final class SysEmoji {
    public int aniStickerId;
    public int aniStickerPackId;
    public int animationHeigh;
    public int animationWidth;
    public long endTime;
    public boolean isHide;
    public int qcid;
    public long startTime;
    public String emojiId = "";
    public String describe = "";
    public String qzoneCode = "";
    public BaseEmojiType emojiType = BaseEmojiType.values()[0];
    public DownloadBaseEmojiInfo downloadInfo = new DownloadBaseEmojiInfo();
    public ArrayList<String> associateWords = new ArrayList<>();

    public int getAniStickerId() {
        return this.aniStickerId;
    }

    public int getAniStickerPackId() {
        return this.aniStickerPackId;
    }

    public int getAnimationHeigh() {
        return this.animationHeigh;
    }

    public int getAnimationWidth() {
        return this.animationWidth;
    }

    public ArrayList<String> getAssociateWords() {
        return this.associateWords;
    }

    public String getDescribe() {
        return this.describe;
    }

    public DownloadBaseEmojiInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public BaseEmojiType getEmojiType() {
        return this.emojiType;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public boolean getIsHide() {
        return this.isHide;
    }

    public int getQcid() {
        return this.qcid;
    }

    public String getQzoneCode() {
        return this.qzoneCode;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return "SysEmoji{emojiId=" + this.emojiId + ",describe=" + this.describe + ",qzoneCode=" + this.qzoneCode + ",qcid=" + this.qcid + ",emojiType=" + this.emojiType + ",aniStickerPackId=" + this.aniStickerPackId + ",aniStickerId=" + this.aniStickerId + ",downloadInfo=" + this.downloadInfo + ",associateWords=" + this.associateWords + ",isHide=" + this.isHide + ",startTime=" + this.startTime + ",endTime=" + this.endTime + ",animationWidth=" + this.animationWidth + ",animationHeigh=" + this.animationHeigh + ",}";
    }
}
