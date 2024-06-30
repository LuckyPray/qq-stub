package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicGetJumpInfoReqBody.class */
public final class EmojiHotPicGetJumpInfoReqBody {
    public String emojiMd5;
    public int jumpId;
    public int srcType;

    public EmojiHotPicGetJumpInfoReqBody() {
        this.emojiMd5 = "";
    }

    public String getEmojiMd5() {
        return this.emojiMd5;
    }

    public int getJumpId() {
        return this.jumpId;
    }

    public int getSrcType() {
        return this.srcType;
    }

    public String toString() {
        return "EmojiHotPicGetJumpInfoReqBody{jumpId=" + this.jumpId + ",emojiMd5=" + this.emojiMd5 + ",srcType=" + this.srcType + ",}";
    }

    public EmojiHotPicGetJumpInfoReqBody(int i, String str, int i2) {
        this.emojiMd5 = "";
        this.jumpId = i;
        this.emojiMd5 = str;
        this.srcType = i2;
    }
}
