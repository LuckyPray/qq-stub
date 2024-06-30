package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AddFavEmojiReq.class */
public final class AddFavEmojiReq {
    public String emojiId;
    public String emojiPath;
    public String fileName;
    public long fileSize;
    public boolean isMarkFace;
    public boolean isOrigin;
    public String md5;
    public int packageId;

    public AddFavEmojiReq() {
        this.emojiId = "";
        this.emojiPath = "";
        this.fileName = "";
        this.md5 = "";
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public String getEmojiPath() {
        return this.emojiPath;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public boolean getIsMarkFace() {
        return this.isMarkFace;
    }

    public boolean getIsOrigin() {
        return this.isOrigin;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getPackageId() {
        return this.packageId;
    }

    public String toString() {
        return "AddFavEmojiReq{emojiId=" + this.emojiId + ",packageId=" + this.packageId + ",emojiPath=" + this.emojiPath + ",fileSize=" + this.fileSize + ",fileName=" + this.fileName + ",md5=" + this.md5 + ",isMarkFace=" + this.isMarkFace + ",isOrigin=" + this.isOrigin + ",}";
    }

    public AddFavEmojiReq(String str, int i, String str2, long j, String str3, String str4, boolean z, boolean z2) {
        this.emojiId = "";
        this.emojiPath = "";
        this.fileName = "";
        this.md5 = "";
        this.emojiId = str;
        this.packageId = i;
        this.emojiPath = str2;
        this.fileSize = j;
        this.fileName = str3;
        this.md5 = str4;
        this.isMarkFace = z;
        this.isOrigin = z2;
    }
}
