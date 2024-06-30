package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentUsedFace.class */
public final class RecentUsedFace {
    public String emojiStr;
    public int faceIndex;
    public boolean isEmojiFace;

    public RecentUsedFace() {
        this.emojiStr = "";
    }

    public String getEmojiStr() {
        return this.emojiStr;
    }

    public int getFaceIndex() {
        return this.faceIndex;
    }

    public boolean getIsEmojiFace() {
        return this.isEmojiFace;
    }

    public String toString() {
        return "RecentUsedFace{isEmojiFace=" + this.isEmojiFace + ",faceIndex=" + this.faceIndex + ",emojiStr=" + this.emojiStr + ",}";
    }

    public RecentUsedFace(boolean z, int i, String str) {
        this.emojiStr = "";
        this.isEmojiFace = z;
        this.faceIndex = i;
        this.emojiStr = str;
    }
}
