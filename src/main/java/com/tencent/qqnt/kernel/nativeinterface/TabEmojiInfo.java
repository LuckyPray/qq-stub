package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TabEmojiInfo.class */
public final class TabEmojiInfo {
    public int epId;
    public int expireTime;
    public int flags;
    public String tabName;
    public int tabType;
    public int wordingId;

    public TabEmojiInfo() {
        this.tabName = "";
    }

    public int getEpId() {
        return this.epId;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public int getFlags() {
        return this.flags;
    }

    public String getTabName() {
        return this.tabName;
    }

    public int getTabType() {
        return this.tabType;
    }

    public int getWordingId() {
        return this.wordingId;
    }

    public String toString() {
        return "TabEmojiInfo{epId=" + this.epId + ",expireTime=" + this.expireTime + ",flags=" + this.flags + ",wordingId=" + this.wordingId + ",tabType=" + this.tabType + ",tabName=" + this.tabName + ",}";
    }

    public TabEmojiInfo(int i, int i2, int i3, int i4, int i5, String str) {
        this.tabName = "";
        this.epId = i;
        this.expireTime = i2;
        this.flags = i3;
        this.wordingId = i4;
        this.tabType = i5;
        this.tabName = str;
    }
}
