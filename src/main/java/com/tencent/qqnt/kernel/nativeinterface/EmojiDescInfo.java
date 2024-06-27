package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiDescInfo.class */
public final class EmojiDescInfo {
    public String desc;
    public int emojiId;
    public String md5;
    public String resId;

    public EmojiDescInfo() {
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getEmojiId() {
        return this.emojiId;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getResId() {
        return this.resId;
    }

    public String toString() {
        return "EmojiDescInfo{emojiId=" + this.emojiId + ",resId=" + this.resId + ",md5=" + this.md5 + ",desc=" + this.desc + ",}";
    }

    public EmojiDescInfo(int i, String str, String str2, String str3) {
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.emojiId = i;
        this.resId = str;
        this.md5 = str2;
        this.desc = str3;
    }
}
