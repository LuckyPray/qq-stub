package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiUseInfo.class */
public final class EmojiUseInfo {
    public String emojiId;
    public int emojiType;
    public long updateTime;
    public int usedCount;

    public EmojiUseInfo() {
        this.emojiId = "";
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public int getEmojiType() {
        return this.emojiType;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public int getUsedCount() {
        return this.usedCount;
    }

    public String toString() {
        return "EmojiUseInfo{updateTime=" + this.updateTime + ",usedCount=" + this.usedCount + ",emojiType=" + this.emojiType + ",emojiId=" + this.emojiId + ",}";
    }

    public EmojiUseInfo(long j, int i, int i2, String str) {
        this.emojiId = "";
        this.updateTime = j;
        this.usedCount = i;
        this.emojiType = i2;
        this.emojiId = str;
    }
}
