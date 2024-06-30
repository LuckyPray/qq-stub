package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecordEmojiInfo.class */
public final class RecordEmojiInfo {
    public String eId;
    public int emojiId;
    public int epId;
    public String keyword;
    public String md5;
    public int operateNum;
    public RecommentEmojiType recommentEmojiType;

    public RecordEmojiInfo() {
        this.recommentEmojiType = RecommentEmojiType.values()[0];
        this.eId = "";
        this.keyword = "";
        this.md5 = "";
    }

    public String getEId() {
        return this.eId;
    }

    public int getEmojiId() {
        return this.emojiId;
    }

    public int getEpId() {
        return this.epId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getOperateNum() {
        return this.operateNum;
    }

    public RecommentEmojiType getRecommentEmojiType() {
        return this.recommentEmojiType;
    }

    public String toString() {
        return "RecordEmojiInfo{recommentEmojiType=" + this.recommentEmojiType + ",epId=" + this.epId + ",eId=" + this.eId + ",keyword=" + this.keyword + ",md5=" + this.md5 + ",emojiId=" + this.emojiId + ",operateNum=" + this.operateNum + ",}";
    }

    public RecordEmojiInfo(RecommentEmojiType recommentEmojiType, int i, String str, String str2, String str3, int i2, int i3) {
        this.recommentEmojiType = RecommentEmojiType.values()[0];
        this.eId = "";
        this.keyword = "";
        this.md5 = "";
        this.recommentEmojiType = recommentEmojiType;
        this.epId = i;
        this.eId = str;
        this.keyword = str2;
        this.md5 = str3;
        this.emojiId = i2;
        this.operateNum = i3;
    }
}
